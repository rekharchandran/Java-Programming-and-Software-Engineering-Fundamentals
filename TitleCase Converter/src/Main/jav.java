package Main;

import javax.swing.*;
import java.awt.*;

class  Main {

    public static void main(String... args) {
        JFrame application = createGUI();
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setVisible(true);

    }

    private static JFrame createGUI() {

        JTextField input = new JTextField();

        input.setPreferredSize(new Dimension(300, 40));

        JButton convertButton = new JButton("Convert");

        JLabel output = new JLabel();
        output.setPreferredSize(new Dimension(300, 40));

        convertButton.addActionListener(event -> {
            output.setText(input.getText());
        });


        return null;
    }

}