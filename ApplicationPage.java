import java.awt.*;
import javax.swing.*;

public class ApplicationPage {
    JFrame main;
    JLabel h1;
    JLabel idCandLabel;
    JLabel nameCandLabel;
    JLabel emailCandLabel;

    ApplicationPage() {
        main = new JFrame();
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        component();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        main.add(h1);
        main.add(idCandLabel);
        main.add(nameCandLabel);
        main.add(emailCandLabel);
    }

    void component() {
        h1 = new JLabel("Application");
        h1.setBounds(800,100,300,40);
        h1.setFont(new Font(null, Font.PLAIN, 30));
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setBackground(Color.LIGHT_GRAY);
        h1.setOpaque(true);
    }

    public static void main(String[] args) {
        ApplicationPage app = new ApplicationPage();
    }
}
