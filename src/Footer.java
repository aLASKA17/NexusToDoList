import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class Footer extends JPanel {
    JButton addTask;
    JButton clearTasks;
    String addTaskText = "Добавить задачу";
    String spaces = "      ";
    String clearTasksText = "Удалить завершенные задачи";
    Border emptyBorder = BorderFactory.createLineBorder(Color.white);

    Footer(){
        this.setPreferredSize(new Dimension(500,100));
        this.setBackground(Color.lightGray);

        addTask = new JButton(spaces + addTaskText + spaces);
        addTask.setBorder(emptyBorder);

        addTask.setFont(new Font("YanoneKaffeesatz", Font.BOLD,25));
        addTask.setForeground(Color.white);
        addTask.setBackground(Color.gray);
        addTask.setVerticalAlignment(JButton.BOTTOM);
        this.add(addTask);

        clearTasks = new JButton(spaces + clearTasksText + spaces);
        clearTasks.setFont(new Font("YanoneKaffeesatz", Font.BOLD,25));
        clearTasks.setBorder(emptyBorder);
        clearTasks.setBackground(Color.gray);
        clearTasks.setForeground(Color.white);
        this.add(clearTasks);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClearTasks() {
        return clearTasks;
    }

    public void setAddTask(JButton addTask) {
        this.addTask = addTask;
    }

    public void setClearTasks(JButton clearTasks) {
        this.clearTasks = clearTasks;
    }
}
