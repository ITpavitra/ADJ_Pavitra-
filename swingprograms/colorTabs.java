package A1;
import javax.swing.*;
import java.awt.*;
	public class colorTabs extends JFrame{

		    public colorTabs() {
		        // Set the title and default close operation
		        setTitle("Color Tabbed Pane");
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        setSize(400, 300);

		        // Create the tabbed pane
		        JTabbedPane tabbedPane = new JTabbedPane();

		        // Create panels for each tab
		        JPanel redPanel = new JPanel();
		        redPanel.setBackground(Color.RED);

		        JPanel bluePanel = new JPanel();
		        bluePanel.setBackground(Color.BLUE);

		        JPanel greenPanel = new JPanel();
		        greenPanel.setBackground(Color.GREEN);

		        // Add tabs to the tabbed pane
		        tabbedPane.addTab("RED", redPanel);
		        tabbedPane.addTab("BLUE", bluePanel);
		        tabbedPane.addTab("GREEN", greenPanel);

		        // Add the tabbed pane to the frame
		        add(tabbedPane);

		        // Make the frame visible
		        setVisible(true);
		    }

		    public static void main(String[] args) {
		        // Run GUI on the Event Dispatch Thread
		        SwingUtilities.invokeLater(() -> new colorTabs());
		    }
		}