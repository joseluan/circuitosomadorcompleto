/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portas;

import java.util.Scanner;

/**
 *
 * @author Luan
 */
public class Teste {
    public static String inverter(String msg){
            String retorno = "";
            for (int i = msg.length()-1; i >= 0; i--) {
                retorno += msg.charAt(i);
            }
            return retorno;
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        byte vai = 0;
        String saida = "";

        // bit 0
        SomadorSimples.start((byte)1, (byte) 1, (byte) 0);
        saida += SomadorSimples.getSaida();
        vai = SomadorSimples.getVai();
        // bit 1
        SomadorSimples.start((byte)1, (byte) 1, vai);
        saida += SomadorSimples.getSaida();
        vai = SomadorSimples.getVai();
        // bit 2
        SomadorSimples.start((byte)1, (byte) 1, vai);
        saida += SomadorSimples.getSaida();
        vai = SomadorSimples.getVai();
        // bit 3
        SomadorSimples.start((byte)1, (byte) 1, vai);
        saida += SomadorSimples.getSaida();
        vai = SomadorSimples.getVai();
        // bit 4
        SomadorSimples.start((byte)0, (byte) 0, vai);
        saida += SomadorSimples.getSaida();
        vai = SomadorSimples.getVai();
        
        System.out.println("saida: "+inverter(saida));
        System.out.println("vai: "+vai);
    
    }  
}
