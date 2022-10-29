package Auxiliares;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Auxiliares {

    public boolean tf_are_empty(Object[] tfs) {
        for (Object tf : tfs) {
            if (tf.toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No puede dejar campos vacios");
                return true;
            }
        }
        return false;
    }

    public void clear_tfs(Object[] tf) {
        for (Object tf1 : tf) {
            ((JTextField) tf1).setText("");
        }
    }

    public void change_jf(JFrame show, JFrame hide) {
        show.setVisible(true);
        hide.setVisible(false);
        hide.dispose();
    }
}
