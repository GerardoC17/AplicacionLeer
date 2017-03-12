/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gcetzal
 */
public class Contador {

    public static void main(String[] args) {
        String nombreFich="";
        File fichero = new File(nombreFich);
        try {
            BufferedReader fich = new BufferedReader(new FileReader(nombreFich));
            int contadorL = 0;
            String linea;
            try{
                while((linea=fich.readLine())!=null){
                    contadorL++;
                }
                System.out.println("El número de líneas :" + contadorL);
            } catch (IOException e){
                  e.printStackTrace();
            }
        }catch (FileNotFoundException e){
             e.printStackTrace();
        }
    }
    
}
