package io.github.taills;

import io.github.taills.ui.DemoForm;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        DemoForm mainPanel = new DemoForm();
        final JFrame mainJFrame = new JFrame("Your Title");
        mainJFrame.add(mainPanel.getPanel1());
        mainJFrame.setDefaultCloseOperation(3);
        int width = (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 0.8);
        int height = (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);

        mainJFrame.setSize(width, height);

        mainJFrame.setPreferredSize(new Dimension(width, height));
//            mainJFrame.pack();
        mainJFrame.setVisible(true);
        mainJFrame.setLocationRelativeTo(null);
    }
}
