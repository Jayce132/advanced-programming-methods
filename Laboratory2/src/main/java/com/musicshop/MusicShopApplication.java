package com.musicshop;

import com.musicshop.config.ApplicationContext;

import com.musicshop.ui.AdminConsole;
import com.musicshop.ui.MusicShopConsole;

import java.util.Scanner;


public class MusicShopApplication {
    public static void main(String[] args) {
        ApplicationContext context = ApplicationContext.getInstance();

        while(true) {
            System.out.println("\n\nLog in as Admin?");
            Scanner scanner = new Scanner(System.in);

            if (!scanner.nextLine().isEmpty()) {
                AdminConsole adminConsole = new AdminConsole(context);
                adminConsole.start();
            } else {
                MusicShopConsole console = new MusicShopConsole(context);
                console.start();
            }
        }
    }
}
