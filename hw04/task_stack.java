package hw04;

import java.util.*;

public class task_stack {
    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
    // является ли входная строка логически правильной.
    // Входная строка логически правильная, если:
    // 1) Открытые скобки должны быть закрыты скобками того же типа.
    // 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
    // открытую скобку того же типа.
    // ()[] = true
    // () = true
    // {[()]} = true
    // ()() = true
    // )()( = false
    public static boolean validate(Deque<Character> deque){
        LinkedList<Character> stack = new LinkedList<>();
        Iterator<Character> iterator = deque.iterator();//loop for deque
        char ch;
        char top;
        while (iterator.hasNext()){
            ch = iterator.next();
            switch (ch) {
                case '(' -> stack.push(')');
                case '[' -> stack.push(']');
                case '{' -> stack.push('}');
                case ')', ']', '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    top = stack.pop();
                    if (top != ch) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean areBalanced(String str) {
        LinkedList<Character> stack = new LinkedList<>();
        int n = str.length();
        char ch;
        char top;
        for (int i = 0; i < n; i++) {
            ch = str.charAt(i);
            switch (ch) {
                case '(' -> stack.push(')');
                case '[' -> stack.push(']');
                case '{' -> stack.push('}');
                case ')', ']', '}' -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    top = stack.pop();
                    if (top != ch) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.print("()[] = ");
        System.out.println(areBalanced("()[]"));
        Deque<Character> d1 = new ArrayDeque<>(Arrays.asList('(',')','[', ']'));
        System.out.print(d1);
        System.out.println(validate(( d1)));

        System.out.print("() = ");
        System.out.println(areBalanced("()"));
        Deque<Character> d2 = new ArrayDeque<>(Arrays.asList('(',')'));
        System.out.print(d2);
        System.out.println(validate((d2)));

        System.out.print("{[()]} = ");
        System.out.println(areBalanced("{[()]}"));
        Deque<Character> d3 = new ArrayDeque<>(Arrays.asList('{','[','(',')',']','}'));
        System.out.print(d3);
        System.out.println(validate((d3)));

        System.out.print("()() = ");
        System.out.println(areBalanced("()()"));
        Deque<Character> d4 = new ArrayDeque<>(Arrays.asList('(',')','(',')'));
        System.out.print(d4);
        System.out.println(validate((d4)));

        System.out.print(")()( = ");
        System.out.println(areBalanced(")()("));
        Deque<Character> d5 = new ArrayDeque<>(Arrays.asList(')','(',')','('));
        System.out.print(d5);
        System.out.println(validate((d5)));
    }
}