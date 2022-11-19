package Lab4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class lab4Jlist extends JFrame{
    private JList list1;
    private JList list2;
    //private JList<Object> list1;
    //private JList<Object> list2;
    private JButton doLewej;
    private JButton WszystkoLewa;
    private JButton WszystkoPrawa;
    private JButton doPrawej;
    private JPanel Jpanel1;

    public static String[] tabOfEleme = {"Mleko", "Ser", "Pieczywo", "Owoce","Mięso"};

    public static List<String> l1 = new ArrayList<>();

    public static List<String> l2 = new ArrayList<>();

    public static void main(String[] args) {
        lab4Jlist listy = new lab4Jlist();
        listy.setVisible(true);
    }

    public lab4Jlist(){
        super("Zad1");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(this.Jpanel1);
        this.setSize(400,300);
        l1.addAll(List.of(tabOfEleme));
        createList();

        doLewej.addActionListener(e -> {
            int index = list1.getSelectedIndex();
            l2.add(l1.get(index));
            l1.remove(index);
            createList();
        });
        doPrawej.addActionListener(e -> {
            int index = list2.getSelectedIndex();
            l1.add(l2.get(index));
            l2.remove(index);
            createList();
        });
        WszystkoPrawa.addActionListener(e ->{
            l2.addAll(l1);
            l1.clear();
            createList();
        });
        WszystkoLewa.addActionListener(e ->{
            l1.addAll(l2);
            l2.clear();
            createList();
        });
    }
    public void createList()
    {
        list1.setListData(l1.toArray());
        list2.setListData(l2.toArray());
    }
}

