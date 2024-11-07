package Exercise8L;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTasklist {
    public static void main(String[] args) {
        testContainsStop();
    }

    public static void testContainsStop() {
        String case1 = "stop";
        boolean result1 = DataScan.containsStop(case1);
        System.out.println("Test Case 1: " + (result1 ? "Passed" : "Failed"));

        String case2 = "STOP";
        boolean result2 = DataScan.containsStop(case2);
        System.out.println("Test Case 2: " + (result2 ? "Passed" : "Failed"));

        String case3 = "Stop";
        boolean result3 = DataScan.containsStop(case3);
        System.out.println("Test Case 3: " + (result3 ? "Passed" : "Failed"));

    }
}

