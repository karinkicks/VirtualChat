package virtual_chat;

import javax.swing.*;
import java.awt.*;

public class VirtualChat {
private JFrame mainFrame;
public VirtualChat(){
    mainFrame = new JFrame();
    mainFrame.setTitle("Виртуальный чат");
    mainFrame.setBounds(250,250, 500, 200);
    mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    mainFrame.setLayout(new BorderLayout());
    JPanel top = new JPanel();
    top.setLayout(new BorderLayout());

    JPanel bottom = new JPanel();
    bottom.setLayout(new BorderLayout());

    mainFrame.add(top, BorderLayout.NORTH);
    mainFrame.add(bottom, BorderLayout.CENTER);

    JTextArea outField = new JTextArea();
    outField.setBackground(Color.LIGHT_GRAY);
    outField.setEditable(false);
    outField.setLineWrap(true);
    outField.setRows(5);
    outField.setWrapStyleWord(true);

    JLabel textTop = new JLabel("Ваша переписка");
    textTop.setText("Ваша переписка");

    top.add(textTop, BorderLayout.BEFORE_FIRST_LINE);
    top.add(outField, BorderLayout.CENTER);

    JTextField inField = new JTextField();
    inField.setBackground(Color.LIGHT_GRAY);
    ActionButtonListner abListner = new ActionButtonListner(outField,inField);
    inField.addActionListener(abListner);

    JScrollPane scroll = new JScrollPane (outField);
    top.add(scroll);

    JLabel textBottom = new JLabel("Введите свое сообщение");
    textBottom.setText("Введите свое сообщение");

    JButton submit = new JButton();
    submit.setText("Отправить");

    submit.addActionListener(abListner);
    bottom.add(textBottom, BorderLayout.NORTH);
    bottom.add(inField, BorderLayout.CENTER);
    bottom.add(submit, BorderLayout.SOUTH);

    mainFrame.setVisible(true);
}
}
