package javaapplication21;

import java.awt.*;
import java.awt.event.*;

public class ListExample extends Frame implements ActionListener {

    TextField tf;
    Button btn;
    List list;

    public ListExample() {
        tf = new TextField(20);
        btn = new Button("Add");
        list = new List();

        setLayout(new FlowLayout());

        add(tf);
        add(btn);
        add(list);

        btn.addActionListener(this);

        setSize(400, 300);
        setTitle("Add Items to List");
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = tf.getText();

        if (!text.isEmpty()) {
            list.add(text);
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new ListExample();
    }
}
