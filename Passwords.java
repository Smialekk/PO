package Lab2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Passwords extends JFrame {
    private JPanel mainPanel;
    private JButton OKButton;
    private JPasswordField firstPassword;
    private JPasswordField secondPassword;

    private String pass1, pass2;

    public Passwords() {
        super("Passwords");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(300, 150);

        OKButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pass1 = new String(firstPassword.getPassword());
                pass2 = new String(secondPassword.getPassword());

                if (pass1.equals(pass2)) {
                    if (pass1.equals("bojesiealgorytmow")) JOptionPane.showMessageDialog(null, "Zostałeś zalogowany");
                    else JOptionPane.showMessageDialog(null, "Złe hasło, spróbuj ponownie");
                } else {
                    JOptionPane.showMessageDialog(null, "Błąd, Podałeś zły login lub hasło");
                }
            }
        });
    }

    public static void main(String[] args) {
        Passwords frame = new Passwords();
        frame.setVisible(true);
    }
}
