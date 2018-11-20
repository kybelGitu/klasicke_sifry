/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.crypto;

/**
 *
 * @author xsebest
 */
public interface Cipher {
   public String encrypt(String OT, Key K);
   public String decrypt(String ZT, Key K);
}
