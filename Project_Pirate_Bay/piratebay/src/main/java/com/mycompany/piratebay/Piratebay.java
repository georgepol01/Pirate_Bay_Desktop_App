package com.mycompany.piratebay;

import views.WelcomeFrame;

public class Piratebay {

    public static void main(String[] args) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrame().setVisible(true);
            }
        });
    }
}
