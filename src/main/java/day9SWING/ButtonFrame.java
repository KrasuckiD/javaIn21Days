package day9SWING;

import javax.swing.*;

public class ButtonFrame extends JFrame {
    JButton load = new JButton("Wczytaj");
    JButton save = new JButton("Zapisz");
    JButton unsubscribe = new JButton("Resetuj");

    public ButtonFrame() {
        super("Ramka z przyciskami");
        setSize(340, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(load);
        panel.add(save);
        panel.add(unsubscribe);
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        setLookAndFeel();
        ButtonFrame bf = new ButtonFrame();
    }
}
