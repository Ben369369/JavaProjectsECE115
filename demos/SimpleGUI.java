package demos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;

public class SimpleGUI {
	public static void main(String[] args) {

		Frame frame;

		Label nameLabel;
		TextField nameTextField;

		Label ageLabel;
		TextField ageTextField;
		
		JComboBox comboBox;

		Button submitButton;

		frame = new Frame("ECE 115 Form");
		frame.setSize(300, 200);
		frame.setLayout(new FlowLayout());
		frame.setBackground(Color.GRAY);

		nameLabel = new Label("Name: ");
		nameLabel.setForeground(Color.GREEN);
		frame.add(nameLabel);

		nameTextField = new TextField(20);
		frame.add(nameTextField);

		ageLabel = new Label("Age: ");
		ageLabel.setForeground(Color.GREEN);
		frame.add(ageLabel);

		ageTextField = new TextField(20);
		frame.add(ageTextField);
		
        comboBox = new JComboBox();
        comboBox.addItem("Option 1");
        comboBox.addItem("Option 2");
        comboBox.addItem("Option 3");

        frame.add(comboBox);

		submitButton = new Button("Submit");
		frame.add(submitButton);

		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = nameTextField.getText();
				int age = Integer.parseInt(ageTextField.getText());
				String combo = (String) comboBox.getSelectedItem();
						
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Option Selected: " + combo);
				
			}
		});
		
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
		frame.setVisible(true);
	}
}