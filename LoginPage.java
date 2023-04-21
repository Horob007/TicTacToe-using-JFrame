//import java.awt.*;
//import java.awt.event.*;
//import java.util.*;
//import javax.swing.*;
//import java.io.*;
//import javazoom.jl.player.Player;
//
//public class LoginPage extends JFrame implements ActionListener {
//
//    JFrame frame = new JFrame();
//    JButton loginButton = new JButton("Login");
//    JButton resetButton = new JButton("Reset");
//    JTextField userIDField = new JTextField();
//    JPasswordField userPasswordField = new JPasswordField();
//    JLabel userIDLabel = new JLabel("USERID:");
//    JLabel userPasswordLabel = new JLabel("PASSWORD:");
//    JLabel messageLabel = new JLabel();
//    HashMap<String, String> logininfo = new HashMap<String, String>();
//
//
//    LoginPage(HashMap<String, String> loginInfoOriginal) {
//
//        logininfo = loginInfoOriginal;
//
//
//        JLabel backgroundLabel = new JLabel(new ImageIcon("D:\\RRR\\untitled\\src\\back2.jpg"));
//        backgroundLabel.setBounds(0, 0, 600, 600);
//        frame.add(backgroundLabel);
//
//        userIDLabel.setBounds(50, 100, 75, 25);
//        userPasswordLabel.setBounds(50, 150, 75, 25);
//        userIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        userPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
//        userIDLabel.setForeground(Color.WHITE);
//        userPasswordLabel.setForeground(Color.WHITE);
//
//
//        messageLabel.setBounds(125, 250, 250, 35);
//        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
//        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
//
//        userIDField.setBounds(125, 100, 200, 25);
//        userPasswordField.setBounds(125, 150, 200, 25);
//        userIDField.setHorizontalAlignment(SwingConstants.CENTER);
//        userPasswordField.setHorizontalAlignment(SwingConstants.CENTER);
//
//        loginButton.setBounds(125, 200, 100, 25);
//        loginButton.setFocusable(false);
//        loginButton.addActionListener(this);
//        loginButton.setHorizontalAlignment(SwingConstants.CENTER);
//
//        resetButton.setBounds(225, 200, 100, 25);
//        resetButton.setHorizontalAlignment(SwingConstants.CENTER);
//        resetButton.setFocusable(false);
//        resetButton.addActionListener(this);
//
//        // Make sure the JLabel with the background image is behind other components
//        backgroundLabel.setOpaque(true);
//        backgroundLabel.setBackground(Color.WHITE);
//        backgroundLabel.add(userIDLabel);
//        backgroundLabel.add(userPasswordLabel);
//        backgroundLabel.add(messageLabel);
//        backgroundLabel.add(userIDField);
//        backgroundLabel.add(userPasswordField);
//        backgroundLabel.add(loginButton);
//        backgroundLabel.add(resetButton);
//        backgroundLabel.setLayout(null);
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(600, 600);
//        frame.setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if (e.getSource() == resetButton) {
//            userIDField.setText("");
//            userPasswordField.setText("");
//        }
//
//        if (e.getSource() == loginButton) {
//
//            String userID = userIDField.getText();
//            String password = String.valueOf(userPasswordField.getPassword());
//
//            if (logininfo.containsKey(userID)) {
//                if (logininfo.get(userID).equals(password)) {
//                    messageLabel.setForeground(Color.GREEN);
//                    messageLabel.setText("Login successful");
//                    frame.dispose();
//                    TicTacToe tictactoe = new TicTacToe();
//
//                    // create a new Media object with the file path
//                    String filePath = "music.mp3";
//                    Media sound = new Media(filePath);
//
//                    // create a new Thread to play the music
//                    Thread musicThread = new Thread(new Runnable() {
//                        public void run() {
//                            try {
//                                sound.play();
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    });
//
//                    // start the Thread to play the music
//                    musicThread.start();
//
//                } else {
//                    messageLabel.setForeground(Color.red);
//                    messageLabel.setText("username not found");
//                }
//            }
//        }
//    }



//














import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import static java.awt.Color.*;

public class LoginPage extends JFrame implements ActionListener {

    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("USERID:");
    JLabel userPasswordLabel = new JLabel("PASSWORD:");
    JLabel messageLabel = new JLabel();
    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {

        logininfo = loginInfoOriginal;

        JLabel backgroundLabel = new JLabel(new ImageIcon("D:\\RRR\\untitled\\src\\back2.jpg"));

        userIDLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        userIDLabel.setForeground(WHITE);
        userPasswordLabel.setForeground(WHITE);

        messageLabel.setFont(new Font(null, Font.ITALIC, 25));
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        userIDField.setHorizontalAlignment(SwingConstants.CENTER);
        userPasswordField.setHorizontalAlignment(SwingConstants.CENTER);

        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        loginButton.setHorizontalAlignment(SwingConstants.CENTER);

        resetButton.setHorizontalAlignment(SwingConstants.CENTER);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // use GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        backgroundLabel.setLayout(layout);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        backgroundLabel.add(userIDLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        backgroundLabel.add(userIDField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        backgroundLabel.add(userPasswordLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        backgroundLabel.add(userPasswordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        backgroundLabel.add(messageLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        backgroundLabel.add(loginButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        backgroundLabel.add(resetButton, gbc);

        getContentPane().add(backgroundLabel);

        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
        if (e.getSource() == loginButton) {

            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {
                if (logininfo.get(userID).equals(password)) {
                    dispose();
                    TicTacToe tictactoe = new TicTacToe();
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("username not found");

            }
        }
    }
}