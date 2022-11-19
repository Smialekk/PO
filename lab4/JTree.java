package JTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.*;

public class JTree extends JFrame {
    private javax.swing.JTree tree1;
    private JTextField KursInput;
    private JTextField cenInput;
    private JButton wyjścieButton;
    private JButton opłaćKursButton;
    private JPanel Jpanel1;
    private JTabbedPane tabbedPane1;

    public static void main(String[] args) {
        JTree drzewo = new JTree();
        drzewo.setVisible(true);
    }

    public JTree(){
        super("Jtree");
        this.setContentPane(this.Jpanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,300);
        this.createUIComponents();//wywwolanie metody ze zdefiniowwanym swoim Jtree

        tree1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                super.mouseClicked(e);

                DefaultMutableTreeNode root =
                        (DefaultMutableTreeNode) tree1.getSelectionPath().getLastPathComponent();

                KursInput.setText(root.getUserObject().toString());

                String select = root.getUserObject().toString();
                if (select.equals("C++")) cenInput.setText("1234");
                else if(select.equals("C#")) cenInput.setText("123234");
                else if(select.equals("Java")) cenInput.setText("1534");
                else if(select.equals("Python")) cenInput.setText("1994");
                else if(select.equals("ASP.NET")) cenInput.setText("12334");
                else if(select.equals("C")) cenInput.setText("123");
                else if(select.equals("Photoshop")) cenInput.setText("12234");
                else if(select.equals("Corel")) cenInput.setText("124");
                else if(select.equals("AutoCad")) cenInput.setText("1234");
                else if(select.equals("InDesign")) cenInput.setText("1232334");

            }
        });

        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });

        opłaćKursButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String po = JOptionPane.showInputDialog("Podaj dane:");
                if(po.isEmpty()) JOptionPane.showMessageDialog(tree1,"Błędne dane");
                else JOptionPane.showMessageDialog(tree1, po+ " Kurs opłacony");
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Moje kursy");

        //poziom I
        DefaultMutableTreeNode Kprog = new DefaultMutableTreeNode("Programowanie");
        DefaultMutableTreeNode P1 = new DefaultMutableTreeNode("C++");
        DefaultMutableTreeNode P2 = new DefaultMutableTreeNode("C#");
        DefaultMutableTreeNode P3 = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode P4 = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode P5 = new DefaultMutableTreeNode("ASP.NET");
        DefaultMutableTreeNode P6 = new DefaultMutableTreeNode("C");

        Kprog.add(P1);
        Kprog.add(P2);
        Kprog.add(P3);
        Kprog.add(P4);
        Kprog.add(P5);
        Kprog.add(P6);

        //poziom II
        DefaultMutableTreeNode KGrafika = new DefaultMutableTreeNode("Grafika Komputerowa");
        DefaultMutableTreeNode G1 = new DefaultMutableTreeNode("Photoshop");
        DefaultMutableTreeNode G2 = new DefaultMutableTreeNode("Corel");
        DefaultMutableTreeNode G3 = new DefaultMutableTreeNode("AutoCad");
        DefaultMutableTreeNode G4 = new DefaultMutableTreeNode("InDesign");

        KGrafika.add(G1);
        KGrafika.add(G2);
        KGrafika.add(G3);
        KGrafika.add(G4);

        //dodawanie po root
        root.add(Kprog);
        root.add(KGrafika);

        DefaultTreeModel myModel  = new DefaultTreeModel(root);

       // tree1.setModel(myModel);

       tree1 = new javax.swing.JTree(myModel);
    }
}

