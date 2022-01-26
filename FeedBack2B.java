import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class FeedBack2B {

    public static void main (String [] args) {
        File data; //Usamos esto para editar los datos
        FileWriter write; //Usamos esto para escribir los datos en el "Data"
        PrintWriter line; // Usamos line para escribir tambien el en "Data"

        String APadron="", NHabitantes="", PorcentajeVariacion="";

        data = new File("data.txt"); //Creamos el fichero donde se almacenara "Data"

        if (!data.exists()){ //Ahora observamos que si "Data" no existe, intentamos crear el fichero nuevo como data.txt, y si ya existe le solicitamos los datos.

            try {
              data.createNewFile();
              APadron=JOptionPane.showInputDialog(null, "Ingresa el Año del Padron:");
              NHabitantes=JOptionPane.showInputDialog(null, "Ingresa el Número de Habitantes:");
              PorcentajeVariacion=JOptionPane.showInputDialog(null, "Ingresa el Porcentaje de variación con respecto al año anterior:");

              write = new FileWriter(data, true);
              line = new PrintWriter(write);

              line.println(APadron);
              line.println(NHabitantes);
              line.println(PorcentajeVariacion);

              line.close();
              write.close();

            } catch (IOException ex) {
              Logger.getLogger(FeedBack2A.class.getName()) .log(Level.SEVERE, null, ex);
            }

        } else {
          try {
            APadron=JOptionPane.showInputDialog(null, "Ingresa el Año del Padron:");
            NHabitantes=JOptionPane.showInputDialog(null, "Ingresa el Número de Habitantes:");
            PorcentajeVariacion=JOptionPane.showInputDialog(null, "Ingresa el Porcentaje de variación con respecto al año anterior:");

            write = new FileWriter(data, true);
            line = new PrintWriter(write);

            line.println(APadron);
            line.println(NHabitantes);
            line.println(PorcentajeVariacion);

            line.close();
            write.close();

          } catch (IOException ex) {
            Logger.getLogger(FeedBack2A.class.getName()) .log(Level.SEVERE, null, ex);
          }
        }
    }
}