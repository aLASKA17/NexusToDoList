import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{

    private TitleBar titleBar;
    private Footer footer;
    private ListTask listTask;
    private JButton addButton;
    private JButton clearButton;

    public MainWindow(){

        this.setSize(500,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
//        this.setResizable(false);

        titleBar = new TitleBar();
        listTask = new ListTask();
        footer = new Footer();

        this.add(titleBar,BorderLayout.NORTH);
        this.add(footer,BorderLayout.SOUTH);
        this.add(listTask,BorderLayout.CENTER);

    }

//    public void AddTask(){
//        JPanel taskPanel = new JPanel();
//        tasksPanel.setPreferredSize(new Dimension(500,40));
//        JLabel idTask = new JLabel(String.valueOf(idCounter));// Добавление новой задачи
//        idCounter++;
//
//        JTextField textTask = new JTextField();
//        textTask.setPreferredSize(new Dimension(400,30));
//
//        JCheckBox isDecide = new JCheckBox();
//
//        taskPanel.add(idTask);
//        taskPanel.add(textTask);
//        taskPanel.add(isDecide);
//
//        tasksPanel.add(taskPanel);
//
//        mainWindow.revalidate();
//
//    }
}
