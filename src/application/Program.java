package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = key.nextInt();

        for (int i = 0; i < n; i++){
            int number = key.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B? ");
        n = key.nextInt();

        for (int i = 0; i < n; i++){
            int number = key.nextInt();
            b.add(number);
        }

        System.out.print("How many students for course C? ");
        n = key.nextInt();

        for (int i = 0; i < n; i++){
            int number = key.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>();
        total.addAll(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println();
        System.out.println("Total students: " + total.size());
    }
}
