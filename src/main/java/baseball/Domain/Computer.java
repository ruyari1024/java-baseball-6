package baseball.Domain;

import baseball.Vo.ComputerVo;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    //정답 생성
    public List<Integer> createAnswerNumber(){
        List<Integer> computerNumber = new ArrayList<>();
        while (computerNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumber.contains(randomNumber)) {
                computerNumber.add(randomNumber);
            }
        }
        return computerNumber;
    }

    public Boolean compareUserInput(int[] userInput, List<Integer> computerNumber){
        ComputerVo computerVo = new ComputerVo(0, 0);
        for (int i = 0; i<userInput.length; i++) {
            //스트라이크 체크
            if(computerNumber.get(i) == userInput[i]){
                computerVo.ballPlus();
            }else//볼 체크
            if(computerNumber.contains(userInput[i])){
                computerVo.ballPlus();
            }
        }
        //TODO view단 생성 후 뺴낼 예정
//        if(ball == 3){
//            return true;
//        }
//        if(ball!=0){
//            System.out.printf("%s볼", ball);
//        }
//        if(strike!=0){
//            System.out.printf("%s스트라이크", strike);
//        }
        return false;
    }


}
