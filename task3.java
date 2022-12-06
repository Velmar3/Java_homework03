import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое этого списка.

public class task3 {
    public static void main(String[] args) {
        task3();
    }
    public static void task3() {
    ArrayList<Integer> list = new ArrayList<Integer>();

    Random random = new Random(); 
    for (int i = 0; i < 10; i++)
    list.add(random.nextInt(99));
    System.out.println(list);

    int max = 0;
    int min = 99;
    for (Integer j : list) {
    if (j > max)
    max = j;
    if (j < min)
    min = j;
    }
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);

    double avg = 0;
    for (Integer i : list)
    avg += i;
    System.out.println("Average = " + avg / list.size());
    }
}
