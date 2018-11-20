/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.crypto.Implementation;

import cvicenie1.crypto.Key;

/**
 *
 * @author xsebest
 */
public class CaesarKey implements Key{
    int posun = 5;
    int modulo = 26;
    void setPosun(int posun){
        this.posun = posun;
    }
    void setModulo(int modulo){
        this.modulo = modulo;
    }
            
    
}
