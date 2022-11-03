package auxiliares;

import javax.swing.JTextField;
import javax.swing.JFrame;

public class Auxiliares {

    public boolean are_strings_emtpy(String[] str) {
        for (int i = 0; i < str.length; i++) {
            return str[i].isBlank();
        }
        return true;
    }
    
    public void clean_tfs(JTextField[] tf) {
        for (int i = 0; i < tf.length; i++) {
            tf[i].setText("");
        }
    }

    public void change_jf(JFrame show, JFrame hide) {
        show.setVisible(true);
        hide.setVisible(false);
        hide.dispose();
    }
}
