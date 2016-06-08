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
public class And {
    public static byte start(byte a, byte b){
        
        if ((a == 0 || a == 1) && (b == 0 || b==1)) {
            if (a == 1) {
                if (b == 0) {
                    return 0;
                }else if (b == 1){
                    return 1;
                }
            }
            return 0;
        }
        return 2;
    }
    
}
