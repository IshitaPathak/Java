package GUI;
import java.awt.*;
import java.awt.event.*;

public class AWTExample extends Frame{

    public AWTExample(){
       setTitle("event handling");
       setSize(400, 200);
       setLayout(new FlowLayout());
       setVisible(true);

    //    create controls
    Button button = new Button("Click me");
    TextField textField= new TextField(23);
    Checkbox checkbox=new Checkbox("Check box");
    Label label=new Label("status");
    TextArea textArea = new TextArea(5,12);
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    Checkbox radio1 = new Checkbox("option 1",checkboxGroup,false);
    Checkbox radio2 = new Checkbox("option 2",checkboxGroup,false);


    // add controls
    add(label);
    add(button);
    add(textField);
    add(checkbox);
    add(textArea);
    add(radio1);
    add(radio2);
    
   
// event handling for buttons
button.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        label.setText("Button clicked");
    }
});


// event handling for textfields
textField.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
        String text = textField.getText();
        label.setText("text entered :" + text);
    }
});

// event handling for checkbox
checkbox.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e){
        if(checkbox.getState()){
            label.setText("checkbox checked");
        }else{
            label.setText("chekbox unchecked");
        }
    }
});

    }

  
    public static void main(String[] args) {
        new AWTExample();
    }
}
