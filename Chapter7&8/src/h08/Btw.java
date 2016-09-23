package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Btw extends Applet {


    TextField invoervak1,  resultaat;
    Button maal;
    double invoergetal1,invoergetal2, resultaatgetal, btw;

    public void init() {
        invoervak1 = new TextField( 12 );
        resultaat = new TextField( 12 );
        invoervak1 = new TextField(12);

        resultaat = new TextField(12);
        btw = 1.21;

        maal = new Button("x");
        maal.addActionListener(new maalHandler());


        add(invoervak1);
        add(maal);
        add(resultaat);

    }

    class maalHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String invoer1 = invoervak1.getText();
            invoergetal1 = Double.parseDouble(invoer1);



            resultaatgetal = invoergetal1 * btw;
            resultaat.setText("" + resultaatgetal);
        }
    }
}
