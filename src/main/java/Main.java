public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        BinOps bin = new BinOps();

        System.out.println(bin.sum("1010", "01010"));
        System.out.println(bin.mult("1010", "01010"));

        System.out.println(calc.sum(2, 3));
        System.out.println(calc.pow(2, 4));
    }
}
