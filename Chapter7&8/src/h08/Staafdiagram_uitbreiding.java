package h08;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram_uitbreiding extends Applet {

    int base;
    int Valerie;
    int Jeroen;
    int Hans;
    int lijnyas;
    Button knop;
    TextField invoervak1, invoervak2, invoervak3;
    String s;

    public void init() {
        base = 200;
        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        lijnyas = 100;
        knop = new Button("wijzig waardes");
        invoervak1 = new TextField( 12 );
        add (invoervak1);
        invoervak2 = new TextField( 12 );
        add (invoervak2);
        invoervak3 = new TextField( 12 );
        add (invoervak3);
        s ="";

    }

    public void paint(Graphics g){
        super.paint(g);

        //afmetingen
        int x = 200;
        int y = base - Valerie;
        int y2 = base - Jeroen;
        int y3 = base - Hans;

        //Grootte venster
        setSize(600, 400);

        //Valerie staaf
        g.setColor(Color.red);
        g.fillRect(x, y, 30, Valerie);
        g.setColor(Color.black);
        g.drawRect(x, y, 30, Valerie);

        //Jeroen staaf
        g.setColor(Color.green);
        g.fillRect(x+50, y2, 30, Jeroen);
        g.setColor(Color.black);
        g.drawRect(x+50, y2, 30, Jeroen);

        //Hans staaf
        g.setColor(Color.blue);
        g.fillRect(x+100, y3, 30, Hans);
        g.setColor(Color.black);
        g.drawRect(x+100, y3, 30, Hans);

        //Grafiek Lijnen
        g.setColor(Color.black);
        g.drawLine(310, base, base, base);
        g.drawLine(base, 60, base, base);

        //Schaal
        g.drawString("140",175, 70);
        g.drawString("120",175, 90);
        g.drawString("100",175, 110);
        g.drawString("80",175, 130);
        g.drawString("60", 175, 150);
        g.drawString("40",175, 170);
        g.drawString("20",175, 190);
        g.drawString("00",175, 210);
        g.drawString("Default = 40, 100, 80",200, 240);

        //Namen
        g.drawString("Valerie    Jeroen    Hans",200, 220);
        g.drawString("Valerie",132, 40);
        g.drawString("Jeroen",245, 40);
        g.drawString("Hans",360, 40);

    }
}




