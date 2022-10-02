package PatikaDevClone.com.patikadev.View;

import PatikaDevClone.com.patikadev.Helper.Config;
import PatikaDevClone.com.patikadev.Helper.Helper;
import PatikaDevClone.com.patikadev.Model.Patika;

import javax.swing.*;

public class UpdatePatikaGUI extends JFrame {
    private JPanel wrapper;
    private JTextField fld_patika_name;
    private JButton btn_update;
    private Patika patika;

    public UpdatePatikaGUI(Patika patika) {
        this.patika = patika;
        setContentPane(wrapper);
        setSize(300, 150);
        setLocation(Helper.screenCenterPoint("x", getSize()), Helper.screenCenterPoint("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);

        fld_patika_name.setText(patika.getName());
        btn_update.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)) {
                Helper.showMessage("fill");
            }
            else {
                if (Patika.update(patika.getId(), fld_patika_name.getText())) {
                    Helper.showMessage("done");
                }
                dispose();
            }
        });
    }
}
