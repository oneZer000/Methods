public class Methods {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        int result = sum(5, 3);
        System.out.println("Сумма 5 и 3 равна: " + result);

        printGreeting("Иван");

        int[] numbers = {2, 5, 1, 8, 3};
        int maxNumber = findMax(numbers);
        System.out.println("Максимальное число: " + maxNumber);

        boolean isEvenNumber1 = isEven(4);
        System.out.println("Число 4 четное? " + isEvenNumber1);
        boolean isEvenNumber2 = isEven(9);
        System.out.println("Число 9 четное? " + isEvenNumber2);

        double average1 = calculateAverage(2.5, 3.7, 4.2);
        System.out.println("Среднее арифметическое 1: " + average1);
        double average2 = calculateAverage(3.1, 7.9, 0.3);
        System.out.println("Среднее арифметическое 2: " + average2);

        int result1 = multiply(2, 3);
        int result2 = multiply(2, 3, 4);
        System.out.println("Произведение 2 и 3: " + result1);
        System.out.println("Произведение 2, 3 и 4: " + result2);

    }

}