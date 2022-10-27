package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Narzędziownia extends JFrame {
    private JButton potwierdzamButton;
    private JPanel CBPanel;
    private JCheckBox suwmiarka;
    private JCheckBox szpachla;
    private JCheckBox wkrętak;
    private JCheckBox tarczaDoBOSCH;
    private JPanel PanelGlowny;
    private JCheckBox piła;
    private JCheckBox poziomica;
    private JPasswordField passField;
    private JLabel pic;
    private JLabel pic3;
    private JLabel pic2;
    private JLabel pic1;
    private JLabel pic4;
    private JLabel pic5;

    private double koszta = 0;
    private int pass = 0;
    private String podsumowanie = "Twoje narzędzia to:";

    private ImageIcon picSuwmiarka = new ImageIcon(getClass().getResource("suwmiarka.jpg"));
    private ImageIcon picWkretak = new ImageIcon(getClass().getResource("wkretak.jpg"));
    private ImageIcon picPila = new ImageIcon(getClass().getResource("pila.jpg"));
    private ImageIcon picSzpachla = new ImageIcon(getClass().getResource("szpachla.jpg"));
    private ImageIcon picTarcza = new ImageIcon(getClass().getResource("tarcza.jpg"));
    private ImageIcon picPoziomica = new ImageIcon(getClass().getResource("poziomica.jpg"));

    public ImageIcon setSizeIcon(ImageIcon ic) {
        Image im = ic.getImage();
        Image newImg = im.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }



    public Narzędziownia(){
        super("Skrzyna z narzędziami");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(PanelGlowny);
        this.setSize(700,600);

        potwierdzamButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (suwmiarka.isSelected()){
                    pic.setIcon(setSizeIcon(picSuwmiarka));
                    koszta += 170;
                    podsumowanie += "\nsuwmiarka - 170zł";
                }
                if (piła.isSelected()){
                    pic4.setIcon(setSizeIcon(picPila));
                    koszta += 300;
                    podsumowanie += "\npiła - 300zł";
                }
                if (wkrętak.isSelected()){
                    pic1.setIcon(setSizeIcon(picWkretak));
                    koszta += 30;
                    podsumowanie += "\nwkrętak - 30zł";
                }
                if (szpachla.isSelected()){
                    pic3.setIcon(setSizeIcon(picSzpachla));
                    koszta += 45;
                    podsumowanie += "\nszpachla - 45 zł";
                }
                if (tarczaDoBOSCH.isSelected()){
                    pic2.setIcon(setSizeIcon(picTarcza));
                    koszta += 90;
                    podsumowanie += "\ntarcza do BOSCH - 90zł";
                }
                if (poziomica.isSelected()){
                    pic5.setIcon(setSizeIcon(picPoziomica));
                    koszta += 35;
                    podsumowanie += "\npoziomica - 35zł";
                }

                if (!new String(passField.getPassword()).equals(""))
                    pass = Integer.parseInt(String.valueOf(passField.getPassword()));

                if (pass != 777)
                    podsumowanie = "Nie podano prawidłowego numeru stałego klienta.\n\n" + podsumowanie;
                else {
                    podsumowanie = "Wprowadzono vnumer stałego klienta:  " + pass + "\n\n" + podsumowanie;
                    koszta -= (koszta*25)/100; //koszta -25%
                }
                podsumowanie += "\n-----------------------------\nCałkowity koszt: " + koszta + "zł";

                if (koszta!=0) JOptionPane.showMessageDialog(null, podsumowanie);
                else JOptionPane.showMessageDialog(null, "Wybierz narzędzie!");

                podsumowanie = "Twoje narzędzia:";
                koszta=0;
                pass=0;



            }
        });

    }
    public static void main(String[] args) {
        Narzędziownia frame = new Narzędziownia();
        frame.setVisible(true);
    }
}

