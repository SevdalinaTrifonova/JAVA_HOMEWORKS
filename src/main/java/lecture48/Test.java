package lecture48;

public class Test {
    public static void main(String[] args) {
        FirmET et001= new FirmET("001","01.01.1980","123456ABCD","Ivan Ivanov", 1000,250000,101);
        System.out.printf("Profit of the firm %s is %.2f.%n", et001.getFirmName(),et001.calcProfit());
        FirmOOD ood002= new FirmOOD("002","01.01.1980","123456ABCD", new String[]{"Ivan Ivanov", "Petar Petrov"}, 10000,250000);
        et001.printHeader();
        et001.printProducts();
        et001.printHeader();
    }
}
