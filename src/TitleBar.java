import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class TitleBar extends JPanel {
    TitleBar(){
        ImageIcon logo = new ImageIcon("C:\\Users\\valer\\IdeaProjects\\ToDoList\\src\\logo.png");
        JLabel label = new JLabel(logo);
        this.setPreferredSize(new Dimension(500,200));
        this.setBackground(Color.lightGray);
        this.add(label);

    }
}
