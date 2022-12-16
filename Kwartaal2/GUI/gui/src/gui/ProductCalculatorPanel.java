package gui;

import javax.swing.*;

public class ProductCalculatorPanel {

    private JButton berekenButton;
    private JPanel paneelBerekenProduct;
    private JTextField eersteGetalTextField;
    private JTextField tweedeGetalTextField;
    private JTextField resultaatTextField;

    public void run() {
        JFrame frame = new JFrame();
        frame.setContentPane(paneelBerekenProduct);
        frame.setTitle("Bereken product");
//        frame.setSize(800,400);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

