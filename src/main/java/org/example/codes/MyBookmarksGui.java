package org.example.codes;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BoxLayout; 
import java.awt.Component; 

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyBookmarksGui {

public static void main(String[] args) throws IOException, URISyntaxException {

    JFrame frame = new JFrame("Intuit Bookmarks");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    frame.add(panel);

    JLabel lbl = new JLabel("Select any bookmark and click OK");
    lbl.setVisible(true);
    lbl.setMaximumSize(lbl.getPreferredSize()); 
    lbl.setAlignmentX(Component.CENTER_ALIGNMENT);

    panel.add(lbl);

    String[] in = { "HR Connect","Service-Now", "Workday Production","ILN","Dell Boomi","OIM","Insight"};
    final JComboBox<String> cb = new JComboBox<String>(in);
    cb.setMaximumSize(cb.getPreferredSize()); 
    cb.setAlignmentX(Component.CENTER_ALIGNMENT);
    cb.setVisible(true);
    panel.add(cb);

    JButton btn = new JButton("OK");
    btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    panel.add(btn);
    frame.setVisible(true);

    }
}