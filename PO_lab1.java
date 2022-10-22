import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PO_lab1 extends JFrame{
    private JPanel Panel1;
    private JTextField stCel;
    private JButton roznica;
    private JLabel DataLabel;
    private JTextField textFieldB;
    private JButton sumaButton;
    private JLabel WynikLabel;
    private JLabel wynikint;

    double LiczbaA=0, LiczbaB=0, wynik;

    //I sposob
    public static void main(String[] args) {
        PO_lab1 Example1 = new PO_lab1();
        Example1.setVisible(true);
    }
    public PO_lab1(){
        super("Moja pierwsza aplikacja");
        this.setContentPane(this.Panel1); //wyswitlenie tekstu na ekranie
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        //this.pack();
        sumaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null,new Date());
                //DataLabel.setText(new Date().toString());
                LiczbaA = Double.parseDouble(stCel.getText());
                //LiczbaB = Double.parseDouble(textFieldB.getText());
                wynik = LiczbaA + 32;
                wynikint.setText("Po zamianie na F "+String.valueOf(wynik));
            }
        });
//            roznica.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    //JOptionPane.showMessageDialog(null,new Date());
//                    //DataLabel.setText(new Date().toString());
//                    LiczbaA = Double.parseDouble(textFieldA.getText());
//                    LiczbaB = Double.parseDouble(textFieldB.getText());
//                    wynik = LiczbaA - 32;
//                    wynikint.setText("Różnica "+String.valueOf(LiczbaA)+" "+String.valueOf(wynik));
//                }
//            });
//            roznica.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    dispose();
//                }
//            });
    };



//    //2 sposob
//    public static void main(String[] args) {
//        PO_lab1 Example1 = new PO_lab1();
//    }
//
//    public PO_lab1(){
//        JFrame frame = new JFrame("Moja pierwsza aplikacja");
//        frame.setContentPane(this.Panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//
//    }

}
