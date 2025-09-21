import java.awt.*;
import javax.swing.*;

public class JobsPage {
    JFrame main;
    JLabel h1;
    JLabel idJobLabel;

    JobsPage() {
        main = new JFrame();
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        component();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        main.add(h1);
        main.add(idJobLabel);
    }

    void component() {
        h1 = new JLabel("Jobs");
        h1.setBounds(800,100,300,40);
        h1.setFont(new Font(null, Font.PLAIN, 30));
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setBackground(Color.LIGHT_GRAY);
        h1.setOpaque(true);
        detail();
    }

    void detail() {
        idJobLabel = new JLabel("ID Job : " + "");
        idJobLabel.setBounds(100,250,200,20);
        idJobLabel.setFont(new Font(null, Font.PLAIN, 20));
    }

    public static void main(String arge[]) {
        JobsPage t = new JobsPage();
    }
}
