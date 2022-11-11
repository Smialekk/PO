import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contact extends JFrame{
    private JPanel mainPanel;
    private JList<Object> list;
    private JTextField nameField;
    private JTextField numberField;
    private JTextField addressField;
    private JTextField birthField;
    private JLabel yearsLabel;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JTextField emailField;

    private static List dane = new ArrayList<ArrayList<Object>>();
    private static Object[] o1 = {"Jan Kowalski", "kowalJanek3@lipton.pl", "608903511", "Rzeszów", LocalDate.of(2003, 2, 8)};
    private static Object[] o2 = {"Marian Nowak", "MariaanoItaliano@gmaail.com", "504512388", "Moniuszki", LocalDate.of(1999, 11, 10)};
    private static Object[] o3 = {"Janina Urban", "janka96@onet.pl", "602789876", "Wielopole", LocalDate.of(1996, 1, 7)};
    private static Object[] o4 = {"Ewelina Nowak-Maciąg", "e.nowakk@op.pl", "409443127", "Warszawa", LocalDate.of(1988, 8, 25)};
    private static List<String> nazw = new ArrayList<String>();

    public Contact() {
        super("Contact Project");
        this.setContentPane(mainPanel);
        this.setBounds(200, 200, 400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        dane.addAll(List.of(o1));
        dane.addAll(List.of(o2));
        dane.addAll(List.of(o3));
        dane.addAll(List.of(o4));

        nazw.add(String.valueOf(o1[0]));
        nazw.add(String.valueOf(o2[0]));
        nazw.add(String.valueOf(o3[0]));
        nazw.add(String.valueOf(o4[0]));

        createList();

        saveNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                List newContact = new ArrayList<Object>();
                newContact.add(nameField.getText());
                newContact.add(emailField.getText());
                newContact.add(numberField.getText());
                newContact.add(addressField.getText());
                newContact.add(LocalDate.parse(String.valueOf(birthField.getText())));

                dane.addAll(newContact);
                nazw.add(String.valueOf(newContact.get(0)));

                int birth = LocalDate.parse(newContact.get(4).toString()).getYear();
                int now = LocalDate.now().getYear();
                int years = now - birth;

                yearsLabel.setText(years + " years");
                createList();
            }
        });

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int i = list.getSelectedIndex();

                nameField.setText(dane.get(i*5).toString());
                emailField.setText(dane.get(i*5 + 1).toString());
                numberField.setText(dane.get(i*5 + 2).toString());
                addressField.setText(dane.get(i*5 + 3).toString());
                birthField.setText(dane.get(i*5 + 4).toString());

                int birth = LocalDate.parse(dane.get(i*5+4).toString()).getYear();
                int now = LocalDate.now().getYear();
                int years = now - birth;

                yearsLabel.setText(years + " years");
                saveExistingButton.setEnabled(true);
            }
        });

        saveExistingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int i = list.getSelectedIndex();

                dane.set(i*5, nameField.getText());
                dane.set(i*5 + 1, emailField.getText());
                dane.set(i*5 + 2, numberField.getText());
                dane.set(i*5 + 3, addressField.getText());
                dane.set(i*5 + 4, LocalDate.parse(String.valueOf(birthField.getText())));

                int birth = LocalDate.parse(dane.get(i*5+4).toString()).getYear();
                int now = LocalDate.now().getYear();
                int years = now - birth;

                yearsLabel.setText(years + " years");
                saveExistingButton.setEnabled(false);
            }
        });
    }

    public static void main(String[] args) {
        Contact f = new Contact();
        f.setVisible(true);
        System.out.println(dane);
    }

    public void createList() {
        list.setListData(nazw.toArray());
    }
}
