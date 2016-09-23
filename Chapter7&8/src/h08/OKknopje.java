package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OKknopje extends Applet {

    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;
    String s;

    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new TekstvakListener());
// de knoppen
        knop1 = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop1.addActionListener(kl);

        knop2 = new Button("Reset");
        KnopListener1 rs = new KnopListener1();
        knop2.addActionListener(rs);

        label = new Label("Type iets " +
                "en druk op enter " + "of klik op Ok");
        add(label);
        add(tekstvak);
        add(knop1);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 40, 100);
    }
    // knop1
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    // knop 2
    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }
    }
    //uitkomst op scherm
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}
