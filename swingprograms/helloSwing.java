package A1;
import javax.swing.*;
import java.awt.*;
public class helloSwing {
		    public static void main(String[] args) {
		        // Create a JFrame to hold the label
		        JFrame frame = new JFrame("Swing Hello Program");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setSize(400, 200);

		        // Create a JLabel with the message
		        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);
		        label.setFont(new Font("Arial", Font.PLAIN, 32)); // Set font size
		        label.setForeground(Color.BLUE); // Set text color to blue

		        // Add the label to the frame
		        frame.add(label);

		        // Make the frame visible
		        frame.setVisible(true);
		    }
		}