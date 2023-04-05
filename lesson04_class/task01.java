package lesson04_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task01 {
    /*Пользователь заносит заносит треки в плейлист.
    push track1
    push track2
    ....
    удаляет из плейлиста командой pop
    удалять надо из начала списка, а не из конца.
    */
    public static Scanner iscanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter how many items: ");
        int n = iscanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input_command = iscanner.next(); //push or pop
            if (input_command.equals("push")){
                String input_str = iscanner.next(); //name of track
                playlist.add(input_str);
            } else if (input_command.equals("pop")) {
                System.out.println("Playing " + playlist.get(0));
                playlist.remove(0);
            }
        }
        System.out.println(playlist);
    }
}