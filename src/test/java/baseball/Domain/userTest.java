package baseball.Domain;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;


class UserTest {


    @Test
    @Description("사용자 입력값이 제대로 배열화 되어 리턴되는지 확인")
    void userAnswerInput() {
        var user = new User();
        //Scanner 입력값
        InputStream in = new ByteArrayInputStream("123".getBytes());
        System.setIn(in);
        System.out.println(Arrays.toString(user.userAnswerInput()));
    }

    @Test
    @Description("게임 중단여부 확인 입력값 확인")
    void gameContinueInput() {
        var user = new User();
        //Scanner 입력값
        InputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        System.out.println(user.gameContinueInput());
    }

    @Test
    @Description("사용자 입력값 유효성 체크")
    void invalidValue() {
        var user = new User();

        if (!user.userInputValidation("1234")) {
            System.out.println("입력값 길이 체크 확인");
        }
        if (!user.userInputValidation("가나다")) {
            System.out.println("숫자 여부 체크 확인");
        }
        if (!user.userInputValidation("112")) {
            System.out.println("값 중복 체크 확인");
        }
        if (user.userInputValidation("123")) {
            System.out.println("정상적인 입력값");
        }
    }
}