package delfinen.application;

import delfinen.presentation.GUI;

/**
 *
 * @author Niklas
 */
public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
}
