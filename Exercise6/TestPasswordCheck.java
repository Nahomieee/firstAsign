package Exercise6;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPasswordCheck {
    @Test
    public void firstTestCase() {
    PasswordCheck pass = new PasswordCheck();

    boolean expected = true;

    boolean actual = pass.check("password");

    assertEquals(expected,actual);
    }

}
