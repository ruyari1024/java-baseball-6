package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        start();

    }

    //정답 생성
    public static List<Integer> createNumber(){
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }

    // 에러 생성
    public static void userException(){
        throw new IllegalArgumentException();
    }
    public static void intCheck(String userInput){
        try {
            Integer.parseInt(userInput);
        }
        catch (Exception e){
            userException();
        }
    }
    public static Boolean duplicateCheck(String userInput){

        return true;
    }

    public static void ballCeck(int[] userInputIntArray, List<Integer> computerNumber){
        //볼체크
        int ball = 0;
        for (int i:userInputIntArray) {
            if(computerNumber.get(i) == userInputIntArray[i]){
                ball +=1;
            }
        }
        if(ball == 3){
            clear();
        }
        if(ball!=0){
            System.out.printf("%s볼", ball);
        }
    }
    public static void strikeCheck(int[] userInputIntArray, List<Integer> computerNumber) {
        //스트라이크 체크
        int strike = 0;
        for (int i:userInputIntArray) {
            if(computerNumber.contains(userInputIntArray[i])){
                strike += 1;
            }
        }
        if(strike!=0){
            System.out.printf("%s스트라이크", strike);
        }
    }

    //정답 그 이후
    public static void clear(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String userInput = Console.readLine();
        if(userInput.equals("1")){
            start();
        }
        if(userInput.equals("2")){
            return;
        }else{
            clear();
        }
    }
    public static void start(){
        List<Integer> computerNumber = createNumber();

        //사용자 값 입력
        String userInput = Console.readLine();
        System.out.println(userInput);

        //사용자 입력값 비고
        if(userInput.length() != 3){
            userException();
        }
        intCheck(userInput);

        //문자열 int 리스트로 변환
        int[] userInputIntArray = Stream.of(userInput.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println( Arrays.toString(userInputIntArray) );
        //TODO 문자열 중복 확인

        ballCeck(userInputIntArray, computerNumber);
        strikeCheck(userInputIntArray, computerNumber);
    }

}
