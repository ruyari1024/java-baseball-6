package baseball.Vo;


public class ComputerVo {
    private int strike, ball;


    public ComputerVo(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public void strikePlus() {
        this.strike++;
    }
    public void ballPlus() {
        this.ball++;
    }
}
