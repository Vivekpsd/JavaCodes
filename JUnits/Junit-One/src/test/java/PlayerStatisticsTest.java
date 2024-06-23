import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerStatisticsTest {
    @Test
    public void PlayerNameEqual() {
        Player p1 = new Player("Vivek", 24);
        Player p2 = new Player("Vivek", 26);

        assertEquals(p1, p2);
    }

    @Test
    public void PlayerNameNotEqual() {
        Player p1 = new Player("Vivekk", 24);
        Player p2 = new Player("Vivek", 26);

        assertNotEquals(p1, p2);
    }

    @Test
    public void youngerPlayerSame() {
        Player p1 = new Player("Vivek", 24);
        Player p2 = new Player("Vivek", 26);

        assertSame(p1, PlayerStatistics.getYoungerPlayer(p1, p2));
        // assertSame will actually compare the memory location not just values
    }

    @Test
    public void underThirtyTrue() {
        Player p1 = new Player("Vivek", 27);
        PlayerStatistics statistics = new PlayerStatistics(p1, 3, 3);
        assertTrue(statistics.underThirty());
    }

    @Test
    public void underThirtyFalse() {
        Player p1 = new Player("Vivek", 31);
        PlayerStatistics statistics = new PlayerStatistics(p1, 3, 3);
        assertFalse(statistics.underThirty());
        assertEquals(false, statistics.underThirty());
    }

    @Test
    public void csvRecordNull() {
        Player p1 = new Player("Vivek", 23);
        PlayerStatistics statistics = new PlayerStatistics(p1, 0, 0);
        assertNull(statistics.createCsvRecord());
    }

    @Test
    public void csvRecordNotNull() {
        Player p1 = new Player("Vivek", 23);
        PlayerStatistics statistics = new PlayerStatistics(p1, 3, 2);
        assertNotNull(statistics.createCsvRecord());
    }

    @Test
    public void getCsvStatsRecord() {
        Player p1 = new Player("Vivek", 21);
        PlayerStatistics statistics = new PlayerStatistics(p1, 4, 8);
        Double[] expectedArray = {2d, 0.5};
        assertArrayEquals(expectedArray, statistics.createCsvRecord());
    }
}
