import org.junit.jupiter.api.*;

public class SalesManagerTest {

    @Test
    @DisplayName("Поиск максимального значения")
    public void testMax() {
        long[] sales = {10, 14, 22, 18, 30, 26};
        SalesManager month = new SalesManager(sales);
        Assertions.assertEquals(30, month.max());
    }

    @Test
    @DisplayName("Поиск усеченного среднего")
    void average() {
        long[] sales = {10, 14, 22, 18, 30, 26};
        SalesManager month = new SalesManager(sales);
        Assertions.assertEquals(20, month.average());
    }

    @Test
    @DisplayName("Поиск минимального значения")
    void testMin() {
        long[] sales = {10, 14, 22, 18, 30, 26};
        SalesManager month = new SalesManager(sales);
        Assertions.assertEquals(10, month.min());
    }
}