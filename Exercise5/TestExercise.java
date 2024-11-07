package Exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestExercise {

        @Test
        public void add() {
            Exercise5.Calculator calc = new Exercise5.Calculator(3,3);
            int expected = 5;

            int actual = calc.add();

            assertEquals(expected, actual);
        }
    }


