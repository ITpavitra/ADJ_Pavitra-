package A1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class countryButton {


		
		
		    public static void main(String[] args) {
		        // Create the frame
		        JFrame frame = new JFrame("Country Button Press");
		        frame.setSize(400, 200);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setLayout(null);

		        // Create buttons
		        JButton srilankaButton = new JButton("Srilanka");
		        JButton indiaButton = new JButton("India");

		        // Set button positions
		        srilankaButton.setBounds(50, 50, 100, 30);
		        indiaButton.setBounds(200, 50, 100, 30);

		        // Create label to display messages
		        JLabel label = new JLabel("", JLabel.CENTER);
		        label.setBounds(50, 100, 300, 30);

		        // Add action listener to Srilanka button
		        srilankaButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                label.setText("Srilanka is pressed");
		            }
		        });

		        // Add action listener to India button
		        indiaButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                label.setText("India is pressed");
		            }
		        });

		        // Add buttons and label to frame
		        frame.add(srilankaButton);
		        frame.add(indiaButton);
		        frame.add(label);

		        // Make the frame visible
		        frame.setVisible(true);
		    }
		}