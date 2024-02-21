package baseball.Controller;

import baseball.Domain.Computer;
import baseball.Domain.User;

public class Controller {
    private User user;
    private Computer computer;

    public void startGame(){
        System.out.println("숫자게임을 시작합니다");
        computer.createAnswerNumber();
        user.userAnswerInput();
    }
}
