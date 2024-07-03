import javax.swing.*;
import java.awt.*;

public class ListTask extends JPanel {
    JLabel idTask;
    JTextField taskName;
    JCheckBox isDecideTask;
    private boolean checkTask;

    ListTask(){

    }

    public void createTask(String nameTask){
        this.setPreferredSize(new Dimension(500,50));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.lightGray);

        checkTask = false;


    }
}
