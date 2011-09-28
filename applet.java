import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NewJApplet extends JApplet implements ActionListener{
    double suma, n1, n2;
    JLabel n1etiqueta, n2etiqueta, sumaetiqueta;
    JTextField n1campo, n2campo, sumacampo;
    JButton botonsuma;
    public void init() {
            //Creación de contenedor o formulario
            Container contenedor = getContentPane();
            contenedor.setLayout(new FlowLayout());

            //Creación de Etiqueta 1
            n1etiqueta = new JLabel("Primer número");

            //Agregar Etiqueta1 a formulario
            contenedor.add(n1etiqueta);

			//Creación de Cuadro de texto 1
n1campo = new JTextField(8);
 //Permitir contenido de texto editable
            n1campo.setEditable(true);

            //Agregar textbox n1campo a contenedor 
            contenedor.add(n1campo);

            //Creación y add de etiqueta2, campo2;
            n2etiqueta = new JLabel("Segundo número");
            contenedor.add(n2etiqueta);
            n2campo = new JTextField(8);
            n2campo.setEditable(true);
            contenedor.add(n2campo);
			
			//Creacion y Add de etiqueta y campo suma

            sumaetiqueta = new JLabel("SUMATORIA");
            contenedor.add(sumaetiqueta);
            sumacampo = new JTextField(8);
            sumacampo.setEditable(false);
            contenedor.add(sumacampo);

            //Creación, configuracion y add de boton
            botonsuma = new JButton("Sumar");
            botonsuma.addActionListener(this);
            contenedor.add(botonsuma);
    }  //FIN MODULO DE INICIALIZACION DEL APPLET, 
        //VARIABLES Y OBJETOS

		public void actionPerformed(ActionEvent e) {
        String num1, num2, su;
        double nu1, nu2, s;

        num1 = n1campo.getText();
        num2 = n2campo.getText();

        nu1 = Double.parseDouble(num1);
        nu2 = Double.parseDouble(num2);

        s = nu1 + nu2;
        su = String.valueOf(s);

        sumacampo.setText(su);
                   
        throw new UnsupportedOperationException();
    }
}//fin del applet
