/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
//import java.util.Scanner;

/**
 *
 * @author gcetzal
 */
public class ObtenerInfo {

    public ArrayList<Tipos> obtenerInfo(String informacion) {

        File obj;
        String ruta = "";
        String Texto = "";
        float num = 0.0f;

        ArrayList<Tipos> listaInfo = new ArrayList<>();
        File file = new File(informacion);
        File[] listaArchivos = file.listFiles();

        for (File listaArchivo : listaArchivos) {

            Tipos obtener = new Tipos();
            obtener.setNombre(listaArchivo.getName());
            Texto = obtener.getNombre();
            num = listaArchivo.length();

            obtener.setTamano(comprobarTamano(num));
            //obtener.setTamano(Long.toString(listaArchivo.length() / 1048576));
            obtener.setTipo(obtenerTipo(Texto));
            obtener.setLineasCodigo(contador(listaArchivo.getAbsolutePath()));
            listaInfo.add(obtener);

        }
        return listaInfo;

    }

    /*public ArrayList<Tipos> extension(String sTexto){
        ArrayList<Tipos> listaTipo = new ArrayList<>();
    }*/
    public String obtenerTipo(String sTexto) {
        String guardarTexto = "";
        char[] aCaracteres;
        char punto = '.';
        int iContador = 0, numGuardar = 0;

        aCaracteres = sTexto.toCharArray();

        for (int i = 0; i < aCaracteres.length; i++) {
            iContador++;
            if (aCaracteres[i] == (punto)) {
                numGuardar += iContador;
                for (int x = (numGuardar); x < aCaracteres.length; x++) {
                    guardarTexto += aCaracteres[x];
                }
            }
        }

        return guardarTexto;
    }

    public String comprobarTamano(float numero) {
        float resp = 0.0f;
        String respuestaCadena = "";

        DecimalFormat formato = new DecimalFormat("000.000");

        if (numero > 1073741824) {
            formato.format(resp = numero / 1073741824);
            respuestaCadena = (Float.toString(resp) + " GB");

        } else if (numero >= 1048576 && numero < 1073741824) {
            formato.format(resp = numero / 1048576);
            respuestaCadena = (Float.toString(resp) + " MB");

        } else if (numero >= 1024 && numero < 1048576) {
            formato.format(resp = numero / 1024);
            respuestaCadena = (Float.toString(resp) + " KB");
        } else if (numero < 1024) {
            resp = numero;
            respuestaCadena = (Float.toString(resp) + " byte");
        }
        return respuestaCadena;
    }

    /*public String contadorLineas(String info) {

        int lineas;
        Scanner archivo = new Scanner(info);
        for (lineas = 0;
                archivo.hasNextLine();
                lineas++) {
            archivo.nextLine();
        }

        archivo.close();

        return Integer.toString(lineas);
    }*/
    public String contador(String nombreFich) {

        int contador = 0;
        File fichero = new File(nombreFich);
        try {
            BufferedReader fich = new BufferedReader(new FileReader(nombreFich));

            String linea;
            try {

                while ((linea = fich.readLine()) != null) {

                    contador++;
                }
            } catch (IOException e) {
                // e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
        }
        return Integer.toString(contador);
    }

}
