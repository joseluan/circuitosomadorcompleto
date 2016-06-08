/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portas;

/**
 *
 * @author Luan
 */
public class SomadorSimples {
    
    private static byte saida;
    private static byte vai;
    public static byte getSaida(){
        return saida;
    }
    public static byte getVai(){
        return vai;
    }

    public static void start(byte a, byte b, byte entrada){
        vai = Or.startTree(And.start(a, b),And.start(a, entrada), And.start(entrada, b));
        saida = Xor.start(Xor.start(a,b),entrada);
    }
}
