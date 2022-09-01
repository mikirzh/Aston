import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    private static final int TASK_1_NUMBER = 7;
    private static final String TASK_2_NAME = "Вячеслав";
    private static final int TASK_3_NUMBER = 3;

    public static void main(String[] args) {
        //Task 1
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Введите число: ");
        int number = in.nextInt();
        String result1 = task1(number);
        System.out.println(result1);

        //Task 2
        in = new Scanner(System.in);
        System.out.println("Задание 2");
        System.out.print("Введите Имя (регистр не важен): ");
        String inputName = in.nextLine();
        String result2 = task2(inputName);
        System.out.println(result2);

        //Task 3
        in = new Scanner(System.in);
        System.out.println("Задание 3");
        System.out.print("Введите числовой массив (через пробел): ");
        String inputArray = in.nextLine();
        int[] numArr = Arrays.stream(inputArray.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result3 = task3(numArr);
        System.out.println(Arrays.toString(result3));

        //Task 4
        in = new Scanner(System.in);
        System.out.println("Задание 4");
        System.out.println("Скобочная последовальность [((())()(())]] неверна.");
        System.out.println("В ней необходимо изменить предпоследнюю квадратную скобку на круглую.");

        in.close();
    }

    private static String task1(int number) {
        if (number > TASK_1_NUMBER) {
            return "Привет";
        }
        return "";
    }

    private static String task2(String name) {
        if (TASK_2_NAME.equalsIgnoreCase(name)) {
            return "Привет, " + name;
        }
        return "Нет такого имени";
    }

    private static int[] task3(int[] numArr) {
        List<Integer> integers = new ArrayList<>();
        for (int value : numArr) {
            if (value % TASK_3_NUMBER == 0) {
                integers.add(value);
            }
        }
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }

}
