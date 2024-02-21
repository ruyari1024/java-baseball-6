package baseball.Domain;

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    @Description("초기 정답 숫자 생성(3자리의 중복되는 숫자가 없는 수)")
    void createAnswerNumber() {
    }

    @Test
    @Description("볼, 스트라이크 계산")
    void compareUserInput() {
        Computer computer = new Computer();
        int[] userInput = {4, 2, 3};
        List<Integer> computerNumber = new ArrayList<>();
        computerNumber.add(1);
        computerNumber.add(3);
        computerNumber.add(2);
        computer.compareUserInput(userInput, computerNumber);
    }
}