package day9SWING;

import javax.swing.*;

public class Subscriptions extends JFrame {
    String[] subs = {"123", "456", "789", "147", "258", "369", "123", "456", "789", "147", "258", "369"};
    JList<String> subList = new JList<>(subs);

    public Subscriptions() {
        super("subskrypcje");
        setSize(150, 335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("Subskrypcje RSS: ");
        panel.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scroll = new JScrollPane(subList);
        panel.add(scroll);

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
        Subscriptions.setLookAndFeel();
        Subscriptions subscriptions = new Subscriptions();
    }
}
