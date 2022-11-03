package auxiliares;

import javax.swing.JTextField;
import javax.swing.JFrame;

public class Auxiliares {

    public void clean_tfs(JTextField[] tf) {
        for (int i = 0; i < tf.length; i++) {
            tf[i].setText("");
        }
    }

    public boolean tf_are_empty(JTextField[] tf) {
        for (int i = 0; i < tf.length; i++) {
            if (tf[i].getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void change_jf(JFrame show, JFrame hide) {
        show.setVisible(true);
        hide.setVisible(false);
        hide.dispose();
    }
}
