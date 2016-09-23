package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Openavond extends Applet {

    Button a;
    Button b;
    Button c;
    Button d;
    int f;
    int j;
    int h;
    int i;
    int z;

    public void init() {
        setLayout(new FlowLayout());

        a = new Button("mannen");
        KnopListener kl = new KnopListener();
        a.addActionListener(kl);
        add(a);

        b = new Button("vrouwen");
        KnopListener1 ht = new KnopListener1();
        b.addActionListener(ht);
        add(b);

        c = new Button("leerlingen mannen");
        KnopListener2 rs = new KnopListener2();
        c.addActionListener(rs);
        add(c);

        d = new Button("leerlingen vrouwen");
        KnopListener3 az = new KnopListener3();
        d.addActionListener(az);
        add(d);

        f = 0;
        j = 0;
        h = 0;
        i = 0;
        z = 0;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("mannen : " + f, 100, 40);
        g.drawString("vrouwen : " + j, 100, 55);
        g.drawString("leerlingen mannen : " + h, 100, 70);
        g.drawString("leelingen vrouwen : " + i, 100, 85);
        g.drawString("totaal = " + z, 100, 100);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            f = f + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            j = j + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            h = h + 1;
            z = z + 1;
            repaint();
        }
    }

    class KnopListener3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            i = i + 1;
            z = z + 1;
            repaint();
        }
    }
}
