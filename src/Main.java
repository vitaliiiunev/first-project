public class Main {
    public static void main(String[] args) {

        long[] sales = {5,10,345,256};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.average());

    }
}
