package Componentes;

import java.awt.Graphics;
import javax.swing.JComponent;

public class Component1 extends JComponent{
    @Override
    public void paintComponent(Graphics g){
        //cabeza
        g.drawOval(150, 50, 100, 100);
        g.drawOval(150, 48, 100, 102);
        g.drawOval(174, 44, 26, 8);
        g.drawOval(200, 44, 26, 8);
        //cuerpo
        g.drawLine(200, 150, 140, 345);
        g.drawLine(200, 150, 260, 345);
        g.drawLine(140, 345, 260, 345);
        //manos
        g.drawLine(200, 151, 150, 250);
        g.drawLine(200, 151, 250, 250);
        //pies
        g.drawLine(185, 345, 185, 385);
        g.drawLine(215, 345, 215, 385);
        g.drawOval(180, 385, 9, 4);
        g.drawOval(210, 385, 9, 4);
        g.drawOval(178, 384, 13, 10);
        g.drawOval(208, 384, 13, 10);
        
    }
}
