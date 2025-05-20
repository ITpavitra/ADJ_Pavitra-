package A1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class imageButton {

	

		    public static void main(String[] args) {
		        // Create the frame
		        JFrame frame = new JFrame("Image Button Press");
		        frame.setSize(400, 200);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setLayout(null);

		        // Create buttons with images
		        JButton digitalClockButton = new JButton(new ImageIcon("digitalClock.jpg"));
		        JButton hourGlassButton = new JButton(new ImageIcon("hourGlass.jpg"));

		        // Set button positions
		        digitalClockButton.setBounds(50, 50, 100, 100);
		        hourGlassButton.setBounds(200, 50, 100, 100);

		        // Create label to display messages
		        JLabel label = new JLabel("", JLabel.CENTER);
		        label.setBounds(50, 150, 300, 30);

		        // Add action listener to Digital Clock button
		        digitalClockButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                label.setText("Digital Clock is pressed");
		            }
		        });

		        // Add action listener to Hour Glass button
		        hourGlassButton.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                label.setText("Hour Glass is pressed");
		            }
		        });

		        // Add buttons and label to frame
		        frame.add(digitalClockButton);
		        frame.add(hourGlassButton);
		        frame.add(label);

		        // Make the frame visible
		        frame.setVisible(true);
		    }
		}