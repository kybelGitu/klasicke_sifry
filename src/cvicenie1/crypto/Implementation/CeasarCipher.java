/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.crypto.Implementation;

import cvicenie1.crypto.Cipher;
import cvicenie1.crypto.Key;

/**
 *
 * @author xsebest
 */
public class CeasarCipher implements Cipher{

    @Override
    public String encrypt(String OT, Key K) {
        if(!(K instanceof CaesarKey)){
            throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        }
        
    }

    @Override
    public String decrypt(String ZT, Key K) {
        if(!(K instanceof CaesarKey)){
            throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
