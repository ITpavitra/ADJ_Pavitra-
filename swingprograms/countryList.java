package A1;


import javax.swing.*;
import java.awt.event.*;
import java.util.List;
public class countryList extends JFrame {
	    public countryList() {
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                List<String> selected = countryList.getSelectedValuesList();
	                System.out.println("Selected Countries:");
	                for (String country : selected) {
	                    System.out.println(country);
	                }
	            }
	        });

	        add(new JScrollPane(countryList));
	        setTitle("Country List");
	        setSize(300, 200);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        new countryList();
	    }
	}