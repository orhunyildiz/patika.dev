package PatikaDevClone.com.patikadev.View;

import PatikaDevClone.com.patikadev.Helper.Config;
import PatikaDevClone.com.patikadev.Helper.Helper;

import javax.swing.*;

public class EducatorGUI extends JFrame {
    private JPanel wrapper;

    public EducatorGUI() {
        setContentPane(wrapper);
        setSize(400, 400);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);
    }
}
