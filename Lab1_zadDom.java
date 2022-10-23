import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Lab1_zadDom extends  JFrame {
    private JButton zgadujeButton;
    private JTextField podajLiczbe;
    private JLabel odp;
    private JLabel text1;
    private JLabel text2;
    private JPanel Panel1;

    int Liczba = 0;
    int zaKtorymRazem = 0;
    Random generator = new Random();
    int wylosowanaLiczba = generator.nextInt(101);

    public static void main(String[] args) {
        Lab1_zadDom ramka = new Lab1_zadDom();
        ramka.setVisible(true);
    }
    public Lab1_zadDom(){
        super("Zgadnij Liczbę");
        this.setContentPane(this.Panel1); //wyswitlenie tekstu na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700,300);
        zgadujeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Liczba = Integer.parseInt(podajLiczbe.getText());
                if (Liczba < wylosowanaLiczba) {
                    zaKtorymRazem++;
                    odp.setText("Niestety, to za malo. Podaj wieksza liczbe," +
                            "    twoja próba: "+zaKtorymRazem);}
                else if (Liczba > wylosowanaLiczba) {
                    zaKtorymRazem++;
                    odp.setText("Za dużooo!. Podaj mniejsza liczbe"+ " twoja próba to: "+zaKtorymRazem);}
                else if (Liczba == wylosowanaLiczba) {
                    odp.setText("Gratuluje, Zgadles za "+ zaKtorymRazem+". razem, a Liczba o ktorej myślałem to: "+Liczba);}
            }
        });
    }
}
