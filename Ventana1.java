package ventanas;

import Componentes.Component1;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Ventana1 extends JFrame{
        public Ventana1() throws HeadlessException {
            setSize(400,500);
            setTitle("Persona");
            setLocation(200,100);
            setResizable(false);
            Component1 c= new Component1();
            add(c);
    }
}
