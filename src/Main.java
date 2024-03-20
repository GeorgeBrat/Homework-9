public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Задание №1");
        int[] array = {120_000, 130_000, 75_000, 105_000, 195_000};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2
        System.out.println("Задание №2");
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min +" рублей. Максимальная сумма трат за неделю составила " + max +" рублей");

        //Task 3
        System.out.println("Задание №3");
        double avarage = (double) sum / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + avarage + " рублей");

        //Task 4
        System.out.println("Задание №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
        System.out.println();
        //Тут выполняю иначе
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp  = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for ( int i = 0; i < reverseFullName.length; i++){
            System.out.print(reverseFullName[i]);
        }
    }
}