package yas.dio.designpatterns.strategy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String strategy = scanner.next();
                client.usingStrategy(strategy).execute();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
