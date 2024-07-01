import javax.swing.*;
import java.awt.*;

public class MainWindow {
    public MainWindow(){

        JFrame mainWindow = new JFrame("Nexus");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Cоздание окна приложения
        mainWindow.setSize(500,1000);


        JPanel taskPanel = new JPanel();
        taskPanel.setPreferredSize(new Dimension(500,800));


        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setSize(new Dimension(500,200));


        JButton addButton = new JButton("Добавить задачу");
        JButton clearButton = new JButton("Удалить решенные задачи");
        buttonsPanel.add(addButton);
        buttonsPanel.add(clearButton);

        mainWindow.getContentPane().add(BorderLayout.SOUTH,buttonsPanel);
        mainWindow.getContentPane().add(BorderLayout.NORTH,taskPanel);

        mainWindow.setVisible(true);
    }
}
