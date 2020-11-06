package HM004;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    JTextArea textArea;
    JTextField textMassage;

    public MyWindow() {
        setTitle("Сlient window");
        setBounds(950, 400, 400, 450);

        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setBackground(Color.gray);
        centerPanel.setLayout(new BorderLayout());

        JPanel bottonPanel = new JPanel();
        add(bottonPanel, BorderLayout.SOUTH);
        bottonPanel.setBackground(Color.black);
        bottonPanel.setPreferredSize(new Dimension(2, 40));
        bottonPanel.setLayout(new BorderLayout());


        JButton startButton = new JButton("Send");
        bottonPanel.add(startButton, BorderLayout.EAST);

        textArea = new JTextArea();
        JScrollPane textAreaScroll = new JScrollPane(textArea);
        centerPanel.add(textAreaScroll, BorderLayout.CENTER);
        textArea.setEditable(false);

        textMassage = new JTextField();
        bottonPanel.add(textMassage, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });

        textMassage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addText();
            }
        });
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    void addText() {
        textArea.append(textMassage.getText()+"\n");
        textMassage.setText("");
    }
}
