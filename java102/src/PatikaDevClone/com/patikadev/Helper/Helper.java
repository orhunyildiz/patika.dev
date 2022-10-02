package PatikaDevClone.com.patikadev.Helper;

import org.checkerframework.checker.guieffect.qual.UI;

import javax.swing.*;
import java.awt.*;

public class Helper {

    public static void setLayout() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                         UnsupportedLookAndFeelException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    public static int screenCenterPoint(String axis, Dimension size) {
        return switch (axis) {
            case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
            default -> 0;
        };
    }

    public static boolean isFieldEmpty(JTextField textField) {
        return textField.getText().trim().isEmpty();
    }

    public static void showMessage(String str) {
        optionPaneTR();
        String message;
        String title;
        switch (str) {
            case "fill" -> {
                message = "Lütfen tüm alanları doldurunuz!";
                title = "Hata!";
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
            }
            case "done" -> {
                message = "İşlem Başarılı!";
                title = "Başarılı!";
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            }
            case "error" -> {
                message = "Bir Hata Oluştu!";
                title = "Hata!";
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
            }
            default -> {
                message = str;
                title = "Title";
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static boolean confirm(String str) {
        optionPaneTR();
        String message;
        switch (str) {
            case "sure":
                message = "Bu işlemi gerçekleştirmek istediğinize emin misiniz?";
                break;
            default:
                message = str;
        }
        return JOptionPane.showConfirmDialog(null, message, "Emin Misiniz?", JOptionPane.YES_NO_OPTION) == 0;
    }

    public static void optionPaneTR() {
        UIManager.put("OptionPane.okButtonText", "Tamam");
        UIManager.put("OptionPane.yesButtonText", "Evet");
        UIManager.put("OptionPane.noButtonText", "Hayır");
    }
}
