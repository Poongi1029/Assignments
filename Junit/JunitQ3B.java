package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitQ3B {
    @Test
    void Withdraw() throws InsufficientBalanceException {
        assertThrows(InsufficientBalanceException.class,() -> JunitQ3.withdraw(800));
        assertEquals(500, JunitQ3.withdraw(100));
        System.out.println(JunitQ3.withdraw(100));
    }

}
