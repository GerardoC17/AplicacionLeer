/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import Metodos.Tipos;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * Codigo de prueba
 *
 * @author gcetzal
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        chooser.setMultiSelectionEnabled(false);
        if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        int lineas;
        Scanner archivo = new Scanner(chooser.getSelectedFile());
        for (lineas = 0; archivo.hasNextLine(); lineas++) {
            archivo.nextLine();
        }
        archivo.close();
        JOptionPane.showMessageDialog(null, lineas + " líneas.");

    }
}
