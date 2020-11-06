package virtual_chat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonListner implements ActionListener {
    private JTextArea outField;
    private JTextField inField;
    public ActionButtonListner(JTextArea outField, JTextField inField){
        this.outField = outField;
        this.inField=inField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        outField.setText(outField.getText() + "Вы: "+inField.getText()+"\n");
        inField.setText("");
    }
}
