import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    JButton addButton,clearButton;
    JPanel taskPanel,buttonsPanel;
    JFrame mainWindow;
    int idCounter = 1;
    public MainWindow(){

        mainWindow = new JFrame("Nexus");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cоздание окна приложения
        mainWindow.setSize(500,1000);

        taskPanel = new JPanel();
        taskPanel.setPreferredSize(new Dimension(500,800));// Создание панели для размешения задач

        buttonsPanel = new JPanel();
        buttonsPanel.setSize(new Dimension(500,200));// Создание панели для двух кнопок

        addButton = new JButton("Добавить задачу");// Кнопка добавление и очистки задач
        clearButton = new JButton("Удалить решенные задачи");
        buttonsPanel.add(addButton);
        buttonsPanel.add(clearButton);

        mainWindow.getContentPane().add(BorderLayout.SOUTH,buttonsPanel);// Добавление панелей в окно
        mainWindow.getContentPane().add(BorderLayout.NORTH,taskPanel);

        mainWindow.setVisible(true);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddTask();
            }
        });
    }

    public void AddTask(){
        JLabel idTask = new JLabel(String.valueOf(idCounter));
        idCounter++;

        JTextField textTask = new JTextField();
        textTask.setPreferredSize(new Dimension(400,30));

        JCheckBox isDecide = new JCheckBox();

        taskPanel.add(idTask);
        taskPanel.add(textTask);
        taskPanel.add(isDecide);

        mainWindow.revalidate();

    }
}
