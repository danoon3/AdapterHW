public class BinOps {
    public String sum(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);

        int sum = first + second;

        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);

        int multi = first * second;

        return Integer.toBinaryString(multi);
    }
}
