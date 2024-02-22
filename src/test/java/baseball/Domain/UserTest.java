package baseball.Domain;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.Console;
import java.io.InputStream;
import java.util.Arrays;


class UserTest {


    @Test
    @DisplayName("사용자 입력값이 제대로 배열화 되어 리턴되는지 확인")
    void testUserAnswerInput() {
        var user = new User();
        //Scanner 입력값
        InputStream in = new ByteArrayInputStream("123".getBytes());
        System.setIn(in);
        Assertions.assertEquals(Arrays.toString(user.userAnswerInput()), "[1, 2, 3]");
    }

    @Test
    @DisplayName("게임 중단여부 확인 입력값 확인")
    void testGameContinueInput() {
        var user = new User();
        //Scanner 입력값
        InputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        Assertions.assertEquals(user.gameContinueInput(), "1");
    }

    @Test
    @DisplayName("사용자 입력값 유효성 체크")
    void testInvalidValue() {
        var user = new User();

        Assertions.assertEquals(user.userInputValidation("1234"), false);
        Assertions.assertEquals(user.userInputValidation("가나다"), false);
        Assertions.assertEquals(user.userInputValidation("112"), false);
        Assertions.assertEquals(user.userInputValidation("123"), true);
    }
}