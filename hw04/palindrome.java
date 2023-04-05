package hw04;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Objects;

public class palindrome {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом

    public static boolean checkOn(Deque<Integer> deque){
        boolean res = true;

        for(int i = 0; i < deque.size() / 2; i++){
            if(!Objects.equals(deque.pollFirst(), deque.pollLast())){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,5,4,3,4,5,6));
        boolean check = checkOn(deque);
        System.out.println(check ? " is palindrome" : "is not palindrome");
    }
}