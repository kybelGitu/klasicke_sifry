/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

/**
 *
 * @author xsebest
 */
public class Math {
    public static boolean isPrime(int input){
        Boolean ret  =(input < 0 ) ? false : true;
        
        //double maxNum = Math.sqrt(input);
        for(int i = 2; i*i <= input; i++)
            if(input % i == 0 )
                return false;
            
        
        return ret;
    }
    public static int factorial(int num){
        //osetrit zaporne  vonku
        return (num <= 1) ? 1 : num * factorial(num - 1);
//        if(num <= 1)
//            return 1;
//        else return num * factorial(num - 1);
    }
}
