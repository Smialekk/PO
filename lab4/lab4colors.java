package Ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4colors extends JFrame{
    private JPanel mainPanel;
    private JComboBox colorCombo;
    private JEditorPane editor;
    private JButton bButton;
    private JButton iButton;
    private JButton zButton;
    private JButton pButton;

    private boolean bold = false;
    private boolean italic = false;

    public static void main(String[] args) {
        lab4colors frame = new lab4colors();
        frame.setVisible(true);
    }

    public lab4colors() {
        super("Edytor tesktu");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(400,300);

        colorCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String color = colorCombo.getSelectedItem().toString();

                if (color.equals("Czerwony")) editor.setForeground(Color.RED);
                else if (color.equals("Czarny")) editor.setForeground(Color.BLACK);
                else if (color.equals("Zielony")) editor.setForeground(Color.GREEN);
                else if (color.equals("Niebieski")) editor.setForeground(Color.BLUE);
                else if (color.equals("Żółty")) editor.setForeground(Color.YELLOW);
                else if (color.equals("Szary")) editor.setForeground(Color.GRAY);
                else if (color.equals("Fioletowy")) editor.setForeground(Color.MAGENTA);


            }
        });

        bButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()));
                    bold = true;
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()));
                    bold = true;
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()));
                    bold = false;
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()));
                    bold = false;
                }
            }
        });

        iButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()));
                    italic = true;
                } else if (!italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()));
                    italic = true;
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN + Font.BOLD, editor.getFont().getSize()));
                    italic = false;
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()));
                    italic = false;
                }
            }
        });

        zButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()+1));
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()+1));
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()+1));
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()+1));
                }
            }
        });

        pButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC, editor.getFont().getSize()-1));
                } else if (!italic && !bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.PLAIN, editor.getFont().getSize()-1));
                } else if (italic && bold) {
                    editor.setFont(editor.getFont().deriveFont(Font.ITALIC + Font.BOLD, editor.getFont().getSize()-1));
                } else {
                    editor.setFont(editor.getFont().deriveFont(Font.BOLD, editor.getFont().getSize()-1));
                }
            }
        });
    }

}
