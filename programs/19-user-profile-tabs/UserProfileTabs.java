package javaapplication22;

import javax.swing.*;
import java.awt.*;

public class UserProfileTabs extends JFrame {

    public UserProfileTabs() {

        setTitle("User Profile");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // ---------------- Tab 1: Personal Info ----------------
        JPanel personalPanel = new JPanel();
        personalPanel.setLayout(new GridLayout(3, 2, 10, 10));

        personalPanel.add(new JLabel("Full Name:"));
        personalPanel.add(new JTextField("John Doe"));

        personalPanel.add(new JLabel("Date of Birth:"));
        personalPanel.add(new JTextField("01-01-2000"));

        personalPanel.add(new JLabel("Gender:"));
        personalPanel.add(new JTextField("Male"));

        tabbedPane.addTab("Personal Info", personalPanel);

        // ---------------- Tab 2: Contact Info ----------------
        JPanel contactPanel = new JPanel();
        contactPanel.setLayout(new GridLayout(3, 2, 10, 10));

        contactPanel.add(new JLabel("Email:"));
        contactPanel.add(new JTextField("john@example.com"));

        contactPanel.add(new JLabel("Phone:"));
        contactPanel.add(new JTextField("9876543210"));

        contactPanel.add(new JLabel("Address:"));
        contactPanel.add(new JTextField("New York"));

        tabbedPane.addTab("Contact Info", contactPanel);

        // ---------------- Tab 3: Account Info ----------------
        JPanel accountPanel = new JPanel();
        accountPanel.setLayout(new GridLayout(2, 2, 10, 10));

        accountPanel.add(new JLabel("Username:"));
        accountPanel.add(new JTextField("johndoe"));

        accountPanel.add(new JLabel("Password:"));
        accountPanel.add(new JPasswordField("12345"));

        tabbedPane.addTab("Account Info", accountPanel);

        add(tabbedPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserProfileTabs();
    }
}
