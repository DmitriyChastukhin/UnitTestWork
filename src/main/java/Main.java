public class Main {
    public static void main(String[] args) {
        long[] sales = {10, 14, 22, 18, 30, 26};
        SalesManager month = new SalesManager(sales);
        System.out.println(" Среднее количество реализованной продукции за месяц " + month.average());
    }
}
