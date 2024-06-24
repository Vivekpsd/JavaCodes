import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class NewsLetterSenderTest {

    // MOCK
    @Test
    public void constructorAssignsDatabase() {
        // since messagingengine itself does not have its own application, we can just mock it instead of making an object out of it
        // this mock will return the nullified version of the class
        MessagingEngine messagingEngine = mock(MessagingEngine.class);
        SubscribersDatabase subscribersDatabase = new SubscribersDatabase();
        NewsletterSender newsletterSender = new NewsletterSender(subscribersDatabase, messagingEngine);

        assertEquals(subscribersDatabase, newsletterSender.getSubscribersDatabase());
    }

    // STUB
    @Test
    public void numberOfSubscribers() {
        // the testing of numberOfSubscribers method involves testing of not only NewsletterSender class, but also
        // the getSubscribers() mehthod of SubscribersDatabase class.
        // Further more this getSubscribers() method might depend on some external database and data may vary which is not good for our test
        // To target  this we use stub, to control what getSubscribers method will return.

        // STUB = MOCK + Instructions for how to respond to certain method calls

        SubscribersDatabase subscribersDatabaseMock = mock(SubscribersDatabase.class);
        MessagingEngine messagingEngineMock = mock(MessagingEngine.class);

        NewsletterSender sender = new NewsletterSender(subscribersDatabaseMock, messagingEngineMock);

        List<String> subscriberList = Arrays.asList("email1", "email2", "email3");
        when(subscribersDatabaseMock.getSubscribers()).thenReturn(subscriberList);

        assertEquals(3, sender.numberOfSubscribers());

    }

    // TEST SPIES - When you require both the class logic and to stub one or more of it's method behaviour
    @Test(expected=ZeroSubscribersException.class)
    public void zeroSubscrinersThrown() {
        NewsletterSender newsletterSender = new NewsletterSender(new SubscribersDatabase(), new MessagingEngine());

        NewsletterSender newsletterSenderSpy = spy(newsletterSender);

        when(newsletterSenderSpy.numberOfSubscribers()).thenReturn(0);

        newsletterSenderSpy.sendNewsletter("SUBJECT");
    }

}