import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerStatisticsTest {

    private Player p1;
    private PlayerStatistics statistics;

    @Before
    public void setup() {
        p1 = new Player("Vivek", 27);
        statistics = new PlayerStatistics(p1, 3, 3);
    }

    @Test
    public void PlayerNameEqual() {
        System.out.println("Test 1");
        Player p2 = new Player("Vivek", 26);

        assertEquals(p1, p2);
    }

    @Test
    public void PlayerNameNotEqual() {
        System.out.println("Test 2");
        Player p2 = new Player("Vivekk", 26);

        assertNotEquals(p1, p2);
    }

    @Test
    public void youngerPlayerSame() {
        System.out.println("Test 3");
        Player p2 = new Player("Vivek", 26);

        assertSame(p1, PlayerStatistics.getYoungerPlayer(p1, p2));
        // assertSame will actually compare the memory location not just values
    }

    @Test
    public void underThirtyTrue() {
        System.out.println("Test 4");
        assertTrue(statistics.underThirty());
    }

    @Test
    public void underThirtyFalse() {
        System.out.println("Test 5");
        Player p2 = new Player("Vivek", 31);
        assertFalse(statistics.underThirty());
        assertEquals(false, statistics.underThirty());
    }

    @Test
    public void csvRecordNull() {
        System.out.println("Test 6");
        PlayerStatistics stats = new PlayerStatistics(p1, 0, 0);
        assertNull(stats.createCsvRecord());
    }

    @Test
    public void csvRecordNotNull() {
        System.out.println("Test 7");
        assertNotNull(statistics.createCsvRecord());
    }

    @Test
    public void getCsvStatsRecord() {
        System.out.println("Test 8");
        PlayerStatistics stats = new PlayerStatistics(p1, 4, 8);
        Double[] expectedArray = {2d, 0.5};
        assertArrayEquals(expectedArray, stats.createCsvRecord());
    }
}
