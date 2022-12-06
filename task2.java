import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа.

public class task2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task2() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        Random random = new Random(); 
        for (int i = 0; i < 10; i++)
            list.add(random.nextInt(10));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) { 
            if (list.get(i) % 2 == 0) {
                list.remove(i--);
            }
        }
        System.out.print(list);
    }
}
