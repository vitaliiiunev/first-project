public class Main {
    public static void main(String[] args) {
        int[] sales = {200,5,299};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
