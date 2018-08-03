package day9SWING;

import javax.swing.*;

public class Authenticator extends JFrame {
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4, 15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Anuluj");

    public Authenticator() {
        super("Informacje o koncie");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Uzytkownik: ");
        JLabel passwordLabel = new JLabel("Haslo: ");
        JLabel commentsLabel = new JLabel("Komentarz: ");
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(commentsLabel);
        panel.add(comments);
        panel.add(ok);
        panel.add(cancel);
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
        Authenticator.setLookAndFeel();
        Authenticator authenticator = new Authenticator();
    }
}
