package lab3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab3 extends JFrame{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JButton showButton;
    private JLabel labelText;


    public static void main(String[] args) {

        lab3 ob1 = new lab3();
        ob1.setVisible(true);

    }

    public lab3(){
        super("Example");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);

        createComboBox();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Wybrano język: "+ comboBox1.getItemAt(comboBox1.getSelectedIndex());
                labelText.setText(data);
            }
        });

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataSelect = (String) comboBox1.getSelectedItem();
                JOptionPane.showMessageDialog(lab3.this,"wybrano język: "+dataSelect);
            }
        });
    }
    private void createComboBox(){
        comboBox1.setModel(new DefaultComboBoxModel(new String[]{"C++","C#","PHP","Java"}));
    }

}
