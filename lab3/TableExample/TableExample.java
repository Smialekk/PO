package TableExample;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Objects;

public class TableExample extends JFrame{
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField1;
    private JTable showTable;
    private JButton episodeButton;
    private JButton IMDBPageButton;
    private JPanel MainPanel;

    public static void main(String[] args) {
        TableExample table = new TableExample();
        table.setVisible(true);
    }

    public TableExample() {
        super("TableWindow");
        this.setContentPane(this.MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        createTable();
    }

    private  void createTable(){
        Object[][] data = {
                {"film 1",2022,8.123,12435},
                {"film 3",2022,6.15,10485},
                {"film 4",2022,8.123,7295},
        };

        showTable.setModel(new DefaultTableModel(
                data,new String[]{"Tytuł","Rok","Ranking","Liczba opinii"}
        ));
    }

}
