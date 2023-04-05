package hw04;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task_deque {

    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    // [1,2,3]
    // [5,4,7]
    // result [6,6,0,1]

    public static String dequeToString(Deque<Integer> deq){
        StringBuilder str_deq = new StringBuilder();
        int deq_length = deq.size();
        for (int i = 0; i < deq_length; i++) {
            str_deq.append(deq.pollLast());
        }
        return str_deq.toString();
    }

    public static Deque<Integer> intToDeque(int number){
        Deque<Integer> res = new ArrayDeque<>();
        while (number > 0){
            res.add(number % 10);
            number /= 10;
        }

        return res;
    }

    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        String str_d1 = dequeToString(d1);
        String str_d2 = dequeToString(d2);

        int int_sum = Integer.parseInt(str_d1) + Integer.parseInt(str_d2);

        return intToDeque(int_sum);
    }

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        System.out.println(d1);

        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        System.out.println(d2);

        Deque<Integer> res = sum(d1, d2);

        System.out.println("result " + res);
    }
}