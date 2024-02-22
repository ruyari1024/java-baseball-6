package baseball.Domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.HashSet;
import java.util.stream.Stream;

import static camp.nextstep.edu.missionutils.Console.*;

public class User {

    public int[] userAnswerInput(){
        System.out.print("숫자를 입력해 주세요 : ");
        String userInput = readLine();
        if(!userInputValidation(userInput)){
            throw new IllegalArgumentException();
        }
        Console.close();
        return Stream.of(userInput.split("")).mapToInt(Integer::parseInt).toArray();
    }
    public String gameContinueInput(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = readLine();
        Console.close();
        return userInput;
    }

    public Boolean userInputValidation(String userInput){
        int numberSize = 3;
        // 숫자 길이 체크
        if (userInput.length() != numberSize) {
            return false;
        }
        //숫자 여부 체크
        try {
            Integer.parseInt(userInput);
        }
        catch (Exception e){
            return false;
        }
        //중복된 숫자 체크
        for (int i = 0; i<userInput.length();i++){
            if(userInput.indexOf(userInput.charAt(i), i+1) != -1){
                return false;
            }
        }

        return true;
    }
}
