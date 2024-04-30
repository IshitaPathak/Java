import java.awt.*;
import java.awt.event.*;

public class DelegationEventHandlingExample extends Frame {
    // Constructor
    public DelegationEventHandlingExample() {
        setTitle("Delegation Event Handling Example");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Create controls
        Button button = new Button("Click Me");
        TextField textField = new TextField(20);
        Checkbox checkbox = new Checkbox("Check Me");
        Label label = new Label("Status: ");
        TextArea textArea = new TextArea(5, 30);

        // Add controls to the frame
        add(button);
        add(textField);
        add(checkbox);
        add(label);
        add(textArea);

        // Event handling for button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked");
            }
        });

        // Event handling for text field
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                label.setText("Text entered: " + text);
            }
        });

        // Event handling for checkbox
        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkbox.getState()) {
                    label.setText("Checkbox checked");
                } else {
                    label.setText("Checkbox unchecked");
                }
            }
        });

        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new DelegationEventHandlingExample();
    }
}
