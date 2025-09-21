import java.awt.*;
import javax.swing.*;

public class JobsPage {
    JFrame main;
    JLabel h1;
    JLabel idCandLabel;
    JLabel nameCandLabel;
    JLabel emailCandLabel;

    JobsPage() {
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
        h1 = new JLabel("Jobs");
        h1.setBounds(800,100,300,40);
        h1.setFont(new Font(null, Font.PLAIN, 30));
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setBackground(Color.LIGHT_GRAY);
        h1.setOpaque(true);
        detail();
    }

    void detail() {
        idCandLabel = new JLabel("ID Candidate : " + "");
        nameCandLabel = new JLabel("Name : ");
        emailCandLabel = new JLabel("Email :");
        idCandLabel.setBounds(100,250,200,20);
        idCandLabel.setFont(new Font(null, Font.PLAIN, 20));

        nameCandLabel.setBounds(100,300,200,20);
        nameCandLabel.setFont(new Font(null, Font.PLAIN, 20));

        emailCandLabel.setBounds(100,350,200,20);
        emailCandLabel.setFont(new Font(null, Font.PLAIN, 20));
    }

    public static void main(String arge[]) {
        JobsPage t = new JobsPage();
    }
}
