package racingcar;
import camp.nextstep.edu.missionutils.Console;

public class InputController {

    final static String INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    final static String TRY_TIMES_MESSAGE = "시도할 횟수";

    public static String printCarNamesInput() {
        System.out.println(INPUT_MESSAGE);
        return Console.readLine();
    }

    public static String printTryTimesInput() {
        System.out.println(TRY_TIMES_MESSAGE);
        return Console.readLine();
    }

}