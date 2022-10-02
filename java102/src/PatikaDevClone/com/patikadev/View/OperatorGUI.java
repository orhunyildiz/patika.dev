package PatikaDevClone.com.patikadev.View;

import PatikaDevClone.com.patikadev.Helper.Config;
import PatikaDevClone.com.patikadev.Helper.Helper;
import PatikaDevClone.com.patikadev.Helper.Item;
import PatikaDevClone.com.patikadev.Model.Course;
import PatikaDevClone.com.patikadev.Model.Operator;
import PatikaDevClone.com.patikadev.Model.Patika;
import PatikaDevClone.com.patikadev.Model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Objects;

public class OperatorGUI extends JFrame {
    private JPanel wrapper;
    private JTabbedPane tab_operator;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JButton btn_logout;
    private JPanel pnl_user_list;
    private JScrollPane scrl_user_list;
    private JTable tbl_user_list;
    private JPanel pnl_user_form;
    private JTextField fld_user_name;
    private JTextField fld_user_uname;
    private JPasswordField fld_user_pass;
    private JComboBox cmb_user_type;
    private JButton btn_user_add;
    private JTextField fld_user_id;
    private JButton btn_user_delete;
    private JTextField fld_srch_user_name;
    private JTextField fld_srch_user_uname;
    private JComboBox cmb_srch_user_type;
    private JButton btn_user_srch;
    private JPanel pnl_patika_list;
    private JScrollPane scrl_patika_list;
    private JTable tbl_patika_list;
    private JPanel pnl_patika_add;
    private JTextField fld_patika_name;
    private JButton btn_patika_add;
    private JPanel pnl_user_top;
    private JPanel pnl_course_list;
    private JScrollPane scrl_course_list;
    private JTable tbl_course_list;
    private JPanel pnl_course_add;
    private JTextField fld_course_name;
    private JTextField fld_course_lang;
    private JComboBox cmb_course_patika;
    private JComboBox cmb_course_user;
    private JButton btn_course_add;
    private DefaultTableModel mdl_user_list;
    private Object[] row_user_list;
    private DefaultTableModel mdl_patika_list;
    private Object[] row_patika_list;
    private JPopupMenu pp_patika_menu;
    private DefaultTableModel mdl_course_list;
    private Object[] row_course_list;
    private final Operator operator;

    public OperatorGUI(Operator operator) {
        this.operator = operator;
        setContentPane(wrapper);
        setSize(1000, 500);
        int x = Helper.screenCenterPoint("x", getSize());
        int y = Helper.screenCenterPoint("y", getSize());
        setLocation(x, y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(Config.PROJECT_TITLE);
        setVisible(true);
        lbl_welcome.setText("Hoş Geldin " + operator.getName() + "!");

        //Model User List
        mdl_user_list = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0)
                    return false;
                return super.isCellEditable(row, column);
            }
        };
        Object[] col_user_list = {"ID", "Ad Soyad", "Kullanıcı Adı", "Şifre", "Üyelik Tipi"};
        mdl_user_list.setColumnIdentifiers(col_user_list);
        row_user_list = new Object[col_user_list.length];
        /*
        Object[] firstRow = {"1","Orhun Yıldız","orhun","1234","operator"};
        mdl_user_list.addRow(firstRow);
        */
        loadUserModel();
        tbl_user_list.setModel(mdl_user_list);
        tbl_user_list.getTableHeader().setReorderingAllowed(false);
        tbl_user_list.getSelectionModel().addListSelectionListener(e -> {
            try {
                String selected_user_id = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 0).toString();
                fld_user_id.setText(selected_user_id);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        });
        tbl_user_list.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE) {
                int id = Integer.parseInt(tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 0).toString());
                String name = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 1).toString();
                String uname = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 2).toString();
                String pass = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 3).toString();
                String type = tbl_user_list.getValueAt(tbl_user_list.getSelectedRow(), 4).toString();
                if (User.update(id, name, uname, pass, type)) {
                    Helper.showMessage("done");
                }
                loadUserModel();
                loadEducatorCombo();
                loadCourseModel();
            }
        });
        // ## Model User List

        // Model Patika List
        pp_patika_menu = new JPopupMenu();
        JMenuItem updateMenu = new JMenuItem("Güncelle");
        JMenuItem deleteMenu = new JMenuItem("Sil");
        pp_patika_menu.add(updateMenu);
        pp_patika_menu.add(deleteMenu);

        updateMenu.addActionListener(e -> {
            int selectedId = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0).toString());
            UpdatePatikaGUI updatePatikaGUI = new UpdatePatikaGUI(Patika.getFetch(selectedId));
            updatePatikaGUI.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadPatikaModel();
                    loadPatikaCombo();
                    loadCourseModel();
                }
            });
        });

        deleteMenu.addActionListener(e -> {
            if (Helper.confirm("sure")) {
                int selectedId = Integer.parseInt(tbl_patika_list.getValueAt(tbl_patika_list.getSelectedRow(), 0).toString());
                if (Patika.delete(selectedId)) {
                    Helper.showMessage("done");
                    loadPatikaModel();
                    loadPatikaCombo();
                    loadCourseModel();
                }
                else {
                    Helper.showMessage("error");
                }
            }
        });

        mdl_patika_list = new DefaultTableModel();
        Object[] col_patika_list = {"ID", "Patika Adı"};
        mdl_patika_list.setColumnIdentifiers(col_patika_list);
        row_patika_list = new Object[col_patika_list.length];
        loadPatikaModel();
        tbl_patika_list.setModel(mdl_patika_list);
        tbl_patika_list.setComponentPopupMenu(pp_patika_menu);
        tbl_patika_list.getTableHeader().setReorderingAllowed(false);
        tbl_patika_list.getColumnModel().getColumn(0).setMaxWidth(30);

        tbl_patika_list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                int selectedRow = tbl_patika_list.rowAtPoint(point);
                tbl_patika_list.setRowSelectionInterval(selectedRow, selectedRow);
            }
        });
        // ## Model Patika List

        // CourseList
        mdl_course_list = new DefaultTableModel();
        Object[] col_course_list = {"ID", "Ders Adı", "Programlama Dili", "Patika", "Eğitmen"};
        mdl_course_list.setColumnIdentifiers(col_course_list);
        row_course_list = new Object[col_course_list.length];
        loadCourseModel();
        tbl_course_list.setModel(mdl_course_list);
        tbl_course_list.getColumnModel().getColumn(0).setMaxWidth(75);
        tbl_course_list.getTableHeader().setReorderingAllowed(false);
        loadPatikaCombo();
        loadEducatorCombo();
        // ## CourseList
        btn_user_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_name) || Helper.isFieldEmpty(fld_user_uname) || Helper.isFieldEmpty(fld_user_pass)) {
                Helper.showMessage("fill");
            }
            else {
                String name = fld_user_name.getText();
                String uname = fld_user_uname.getText();
                String pass = String.valueOf(fld_user_pass.getPassword());
                String type = Objects.requireNonNull(cmb_user_type.getSelectedItem()).toString();
                if (User.add(name, uname, pass, type)) {
                    Helper.showMessage("done");
                    loadUserModel();
                    loadEducatorCombo();
                    fld_user_name.setText(null);
                    fld_user_uname.setText(null);
                    fld_user_pass.setText(null);
                    cmb_user_type.setSelectedIndex(0);
                }
            }
        });
        btn_user_delete.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_user_id)) {
                Helper.showMessage("fill");
            }
            else {
                if (Helper.confirm("sure")) {
                    int id = Integer.parseInt(fld_user_id.getText());
                    if (User.delete(id)) {
                        Helper.showMessage("done");
                        loadUserModel();
                        loadEducatorCombo();
                        loadCourseModel();
                        fld_user_id.setText(null);
                    }
                    else {
                        Helper.showMessage("error");
                    }
                }
            }
        });
        btn_user_srch.addActionListener(e -> {
            String name = fld_srch_user_name.getText();
            String uname = fld_srch_user_uname.getText();
            String type = cmb_srch_user_type.getSelectedItem().toString();
            String query = User.searchQuery(name, uname, type);
            ArrayList<User> userSearch = User.searchUserList(query);
            loadUserModel(userSearch);
        });
        btn_logout.addActionListener(e -> {
            dispose();
            new LoginGUI();
        });
        btn_patika_add.addActionListener(e -> {
            if (Helper.isFieldEmpty(fld_patika_name)) {
                Helper.showMessage("fill");
            }
            else {
                if (Patika.add(fld_patika_name.getText())) {
                    Helper.showMessage("done");
                    loadPatikaModel();
                    loadPatikaCombo();
                    fld_patika_name.setText(null);
                }
                else {
                    Helper.showMessage("error");
                }
            }
        });
        btn_course_add.addActionListener(e -> {
            Item patikaItem = (Item) cmb_course_patika.getSelectedItem();
            Item userItem = (Item) cmb_course_user.getSelectedItem();
            if (Helper.isFieldEmpty(fld_course_name) || Helper.isFieldEmpty(fld_course_lang)) {
                Helper.showMessage("fill");
            }
            else {
                if (Course.add(userItem.getKey(), patikaItem.getKey(), fld_course_name.getText(), fld_course_lang.getText())) {
                    Helper.showMessage("done");
                    loadCourseModel();
                    fld_course_name.setText(null);
                    fld_course_lang.setText(null);
                }
                else {
                    Helper.showMessage("error");
                }
            }
        });
    }

    private void loadCourseModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_course_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Course obj : Course.getList()) {
            i = 0;
            row_course_list[i++] = obj.getId();
            row_course_list[i++] = obj.getName();
            row_course_list[i++] = obj.getLang();
            row_course_list[i++] = obj.getPatika().getName();
            row_course_list[i] = obj.getEducator().getName();
            mdl_course_list.addRow(row_course_list);
        }
    }

    public void loadUserModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj : User.getList()) {
            i = 0;
            row_user_list[i++] = obj.getId();
            row_user_list[i++] = obj.getName();
            row_user_list[i++] = obj.getUname();
            row_user_list[i++] = obj.getPass();
            row_user_list[i] = obj.getType();
            mdl_user_list.addRow(row_user_list);
        }
    }

    public void loadUserModel(ArrayList<User> list) {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_user_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (User obj : list) {
            i = 0;
            row_user_list[i++] = obj.getId();
            row_user_list[i++] = obj.getName();
            row_user_list[i++] = obj.getUname();
            row_user_list[i++] = obj.getPass();
            row_user_list[i] = obj.getType();
            mdl_user_list.addRow(row_user_list);
        }
    }

    public void loadPatikaModel() {
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika_list.getModel();
        clearModel.setRowCount(0);
        int i;
        for (Patika obj : Patika.getList()) {
            i = 0;
            row_patika_list[i++] = obj.getId();
            row_patika_list[i] = obj.getName();
            mdl_patika_list.addRow(row_patika_list);
        }
    }

    public void loadPatikaCombo() {
        cmb_course_patika.removeAllItems();
        for (Patika obj : Patika.getList()) {
            cmb_course_patika.addItem(new Item(obj.getId(), obj.getName()));
        }
    }

    public void loadEducatorCombo() {
        cmb_course_user.removeAllItems();
        for (User obj : User.getList()) {
            if (obj.getType().equals("educator")) {
                cmb_course_user.addItem(new Item(obj.getId(), obj.getName()));
            }
        }
    }

    public static void main(String[] args) {
        Helper.setLayout();
        Operator op = new Operator();
        op.setId(1);
        op.setName("Orhun Yıldız");
        op.setUname("orhun");
        op.setPass("1234");
        op.setType("operator");
        new OperatorGUI(op);
    }
}
