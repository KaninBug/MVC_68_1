import java.awt.*;
import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.ListCandidate;
import Controller.Model.Candidate;

public class TotalCandPage {
    private ListCandidate listcand = new ListCandidate();
    private ArrayList<Candidate> list = new ArrayList<>(listcand.getCandList());
    JFrame main;
    JLabel h1;
    JButton[] candBtn = new JButton[list.size()];

    public TotalCandPage() {
        main = new JFrame();
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        component();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonAction();

        main.add(h1);
        for(int i = 0; i < list.size(); i++) {
            main.add(candBtn[i]);
        }
        
    }

    void component() {
        h1 = new JLabel("Name Candidate");
        h1.setBounds(800,100,300,40);
        h1.setFont(new Font(null, Font.PLAIN, 30));
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setBackground(Color.LIGHT_GRAY);
        h1.setOpaque(true);
        candidateList();
    }

    void candidateList() {
        for(int i = 0; i < list.size(); i++) {
            candBtn[i] = new JButton(list.get(i).getFnameCand() + " " + list.get(i).getLnameCand());
            candBtn[i].setBounds(100,300 + (i * 50),200,40);
            candBtn[i].setFont(new Font(null, Font.PLAIN, 20));
        }
    }

    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        for(int i = 0; i < list.size(); i++) {
            candBtn[i].addActionListener(listener);
        }
        
    }
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            for(int i = 0; i < list.size(); i++) {
                if(source == candBtn[i]) {
                    DetailCandPage d = new DetailCandPage(list.get(i).getIdCand());
                    main.dispose();
                }
            }
            
        }
    }

    public static void main(String arge[]) {
        TotalCandPage t = new TotalCandPage();
    }
}
