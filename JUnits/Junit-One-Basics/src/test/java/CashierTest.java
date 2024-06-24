import org.junit.Test;

public class CashierTest {

    @Test(expected = RuntimeException.class)
    // doing above to expect the exception to be thrown
    public void validateTransactionUnacceptedCurrency(){
        Cashier.validateTransaction("USD", 10);
    }

    @Test(expected = RuntimeException.class)
    public void validateTransactionAmountNegative(){
        Cashier.validateTransaction("EUR", -10);
    }
}