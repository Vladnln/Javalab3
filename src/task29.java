public class task29 {
    public static void main(String[] args) {
        int number = -16;

        String description;

        if (number == 0) {
            description = "нулевое число";
        } else if (number % 2 == 0) { // Чётное число
            if (number < 0) {
                description = "отрицательное чётное число";
            } else {
                description = "положительное чётное число";
            }
        } else { // Нечётное число
            if (number < 0) {
                description = "отрицательное нечётное число";
            } else {
                description = "положительное нечётное число";
            }
        }

        System.out.println(description);
    }
}
