import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import Controller.ListCandidate;
import Controller.Model.Candidate;

public class DetailCandPage {
    private String idCand;
    private ListCandidate listCand = new ListCandidate();
    private ArrayList<Candidate> list = new ArrayList<>(listCand.getCandList());

    JFrame main;
    JLabel h1;
    JLabel idCandLabel;
    JLabel nameCandLabel;
    JLabel emailCandLabel;

    DetailCandPage(String id) {
        this.idCand = id;
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
        h1 = new JLabel("Candidate Detail");
        h1.setBounds(800,100,300,40);
        h1.setFont(new Font(null, Font.PLAIN, 30));
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setBackground(Color.LIGHT_GRAY);
        h1.setOpaque(true);
        detail();
    }

    void detail() {
        idCandLabel = new JLabel();
        nameCandLabel = new JLabel();
        emailCandLabel = new JLabel();
        for(int i = 0; i < list.size(); i++) {
            if(idCand.equals(list.get(i).getIdCand())) {
                idCandLabel.setText("ID Candidate : + " + list.get(i).getIdCand());
                nameCandLabel.setText("Name : " + list.get(i).getFnameCand() + " " + list.get(i).getLnameCand());
                emailCandLabel.setText("Email : " + list.get(i).getEmailCand());
            }
        }
        
        idCandLabel.setBounds(100,250,1000,20);
        idCandLabel.setFont(new Font(null, Font.PLAIN, 20));

        nameCandLabel.setBounds(100,300,1000,20);
        nameCandLabel.setFont(new Font(null, Font.PLAIN, 20));

        emailCandLabel.setBounds(100,350,1000,20);
        emailCandLabel.setFont(new Font(null, Font.PLAIN, 20));
    }

    public static void main(String arge[]) {
        DetailCandPage a = new DetailCandPage(null);
    }
}