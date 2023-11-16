package com.musicshop;

import com.musicshop.config.ApplicationContext;

import com.musicshop.ui.MusicShopConsole;


public class MusicShopApplication {

    public static void main(String[] args) {
        ApplicationContext context = ApplicationContext.getInstance();

        MusicShopConsole console = new MusicShopConsole(
                context.getProductController(),
                context.getCartController()
        );
        console.start();
    }
}
