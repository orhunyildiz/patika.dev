package PatikaDevClone.com.patikadev.View;

import PatikaDevClone.com.patikadev.Helper.Config;
import PatikaDevClone.com.patikadev.Helper.Helper;
import PatikaDevClone.com.patikadev.Model.Operator;
import PatikaDevClone.com.patikadev.Model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JPanel wrapper;
    private JPanel wtop;
    private JPanel wbottom;
    private JLabel lbl_icon;
    private JTextField fld_user_uname;
    private JPasswordField fld_user_pass;
    private JButton btn_login;

    public LoginGUI() {
        setContentPane(wrapper);
        setSize(400, 500);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yildi\\IdeaProjects\\java102\\src\\PatikaDevClone\\patikaLogo.png");
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImg);
        lbl_icon.setIcon(imageIcon);
        btn_login.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_pass)) {
                Helper.showMessage("fill");
            }
            else {
                User user = User.getFetch(fld_user_uname.getText(), fld_user_pass.getText());
                if (user == null) {
                    Helper.showMessage("Kullanıcı Bulunamadı!");
                }
                else {
                    switch (user.getType()) {
                        case "operator":
                            OperatorGUI operatorGUI = new OperatorGUI((Operator) user);
                            break;
                        case "educator":
                            EducatorGUI educatorGUI = new EducatorGUI();
                            break;
                        case "student":
                            StudentGUI studentGUI = new StudentGUI();
                            break;
                    }
                    dispose();
                }
            }
        });
    }

    public static void main(String[] args) {
        Helper.setLayout();
        LoginGUI loginGUI = new LoginGUI();
    }
}
