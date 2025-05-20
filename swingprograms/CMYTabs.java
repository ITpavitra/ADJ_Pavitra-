package A1;
import javax.swing.*;
import java.awt.*;


public class CMYTabs extends JFrame {



	    public CMYTabs() {
	        // Create a tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels with respective colors
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("Cyan", cyanPanel);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("Magenta", magentaPanel);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbedPane to the frame
	        add(tabbedPane);

	        // Frame settings
	        setTitle("Tabbed Pane - Cyan, Magenta, Yellow");
	        setSize(400, 300);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the frame
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        // Run on Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> new CMYTabs());
	    }
	}