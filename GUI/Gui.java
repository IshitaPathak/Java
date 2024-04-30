import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame {

    private Button button1, button2, button3;
    private TextField textField1, textField2;

    public Gui() {
        setLayout(new FlowLayout());

        button1 = new Button("Button 1");
        add(button1);

        button2 = new Button("Button 2");
        add(button2);

        button3 = new Button("Button 3");
        add(button3);

        textField1 = new TextField(20);
        add(textField1);

        textField2 = new TextField(20);
        add(textField2);

        // Add event listeners to the buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Button 1 clicked");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText("Button 2 clicked");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Gui example = new Gui();
        example.setSize(300, 300);
        example.setVisible(true);
    }
}