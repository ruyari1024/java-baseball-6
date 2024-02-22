package baseball.Domain;

import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    @DisplayName("볼, 스트라이크 계산")
    void testCompareUserInput() {
        Computer computer = new Computer();
        int[] userInput = {4, 2, 3};
        List<Integer> computerNumber = List.of(1, 2, 3);
        computer.compareUserInput(userInput, computerNumber);
    }
}