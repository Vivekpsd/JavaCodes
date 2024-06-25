import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TrainBarriersTest {

    @Test
    public void passengerEntry() {
        PassengerRepository passengerRepository = mock(PassengerRepository.class);
        EmailService emailService = mock(EmailService.class);
        TrainBarriers trainBarriers = new TrainBarriers(passengerRepository, emailService);

        int PASSENGER_ID = 3;
        trainBarriers.passengerEntry(PASSENGER_ID);

        verify(passengerRepository).registerPassengerOnTrain(PASSENGER_ID);
        verify(emailService).notifyPassenger(PASSENGER_ID);

        /*
        See, here the problem was that passengerEntry method in trainBarriers does not
        return anything so, we cannot check for what it returned was actual output.

        Here, we'll have to check if passengerEntry method did what it was suppossed to do,
        i.e. registerPassengerOnTrain and notify Passenger - so we used verify to check that.
         */

    }
}
