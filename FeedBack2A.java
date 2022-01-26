import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class FeedBack2A {

    public static void main (String [] args) {
        File data; //Usamos esto para editar los datos
        FileWriter write; //Usamos esto para escribir los datos en el "Data"
        PrintWriter line; // Usamos line para escribir tambien el en "Data"

        String CAutonoma="", Provincia="", Poblacion="", Padron="";

        data = new File("data.txt"); //Creamos el fichero donde se almacenara "Data"

        if (!data.exists()){ //Ahora observamos que si "Data" no existe, intentamos crear el fichero nuevo como data.txt, y si ya existe le solicitamos los datos.

            try {
              data.createNewFile();
              CAutonoma=JOptionPane.showInputDialog(null, "Ingresa la Comunidad Autonoma:");
              Provincia=JOptionPane.showInputDialog(null, "Ingresa la Provincia:");
              Poblacion=JOptionPane.showInputDialog(null, "Ingresa el Nombre de la Población:");
              Padron=JOptionPane.showInputDialog(null, "Ingresa el Padrón:");

              write = new FileWriter(data, true);
              line = new PrintWriter(write);

              line.println(CAutonoma);
              line.println(Provincia);
              line.println(Poblacion);
              line.println(Padron);

              line.close();
              write.close();

            } catch (IOException ex) {
              Logger.getLogger(FeedBack2A.class.getName()) .log(Level.SEVERE, null, ex);
            }

        } else {
          try {
            CAutonoma=JOptionPane.showInputDialog(null, "Ingresa la Comunidad Autonoma:");
            Provincia=JOptionPane.showInputDialog(null, "Ingresa la Provincia:");
            Poblacion=JOptionPane.showInputDialog(null, "Ingresa el Nombre de la Población:");
            Padron=JOptionPane.showInputDialog(null, "Ingresa el Padrón:");

            write = new FileWriter(data, true);
            line = new PrintWriter(write);

            line.println(CAutonoma);
            line.println(Provincia);
            line.println(Poblacion);
            line.println(Padron);

            line.close();
            write.close();

          } catch (IOException ex) {
            Logger.getLogger(FeedBack2A.class.getName()) .log(Level.SEVERE, null, ex);
          }
        }
    }
}
