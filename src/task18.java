public class task18 {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int c = 6;

        if (a == b && a != c) {
            System.out.println("Третье число отличается");
        } else if (b == c && b != a) {
            System.out.println("Первое число отличается");
        } else {
            System.out.println("Второе число отличается");
        }
    }
}
