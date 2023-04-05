package lesson04_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task02 {
    /*Пацан вешает вещи на списку стула.
    push джинсы
    push худи
    ....
    забирает со спинки стула командой pop
    удалять надо из конца списка, а не из начала.
    */
    public static Scanner iscanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter how many things: ");
        int n = iscanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input_command = iscanner.next(); //push or pop
            if (input_command.equals("push")){
                String input_str = iscanner.next(); //name of track
                playlist.add(input_str);
            } else if (input_command.equals("pop")) {
                System.out.println("User have taken " + playlist.get(playlist.size() - 1));
                playlist.remove(playlist.size() - 1);
            }
        }
        System.out.println(playlist);
    }
}