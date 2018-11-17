/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1.helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Peter
 */
public class Permutations {
     public static void rndPerm(Object input[]){
         Random rnd  = new Random(System.currentTimeMillis());
         int SiZe = input.length;
         for(int i = 0; i <=SiZe - 1; i++){
             int j = i +rnd.nextInt(SiZe - i);
             swap(input,i,j);

         }
         System.out.println("\n knut perm");
         for(Object i : input)
            System.out.print(" " + i.toString());
         
         input = inversePerm(input);
         System.out.println("\n knut - inverse perm");
         for(Object i : input)
            System.out.print(" " + i.toString());
         
    }
     public static Object[] inversePerm(Object[] input){
         Object[] inverse = new Object[input.length];
         if(input instanceof Character[]){
             System.out.println("je to charackter");
             Character[] inputCopy = (Character[]) input.clone();
             Arrays.sort(inputCopy);
             for(int i = 0; i < inputCopy.length; i++){
                 int j = 0;
                 while(inputCopy[i] != input[j]){
                     j++;
                 }
                 inverse[i] =input[j];
                 }
             return inverse;
         }
         for(int i = 1; i <= input.length; i++){
             int j = 0;
             while((Object) i != input[j]){
                 j++;
             }
             inverse[i -1] =j+1;
         }         
         return inverse;
     }
     //all perm - generovanie vsetkych permutacii """!!!OPRAVIT"""!!! MUSI TO BYT V PORADI
     /*copied*/
     public static List allPerm(Object input[]) {
        List<Object[]> retVal = new ArrayList(Math.factorial(input.length));
        allPerm(0, input, retVal);
        return retVal;
    }
     
     private static void allPerm(int fixed, Object input[], List output) {
        Object in[] = input.clone();
        if (fixed == input.length) {
            output.add(input);
        } else {
            for (int i = fixed; i < input.length; i++) {
                // swap
                swap(input, fixed, i);
                // recursion
                allPerm(fixed + 1, in, output);
            }
        }
    }

//     public static List allPerm(Object input[]){
//         List <Object> output = new ArrayList<Object>(input.length);
//         Set <Object>unique = new HashSet<Object>();
//         if(input instanceof Character[])
//             System.out.println("je to character");
//         
//         for(int i =0; i < input.length;i++){
//             for(int j = 0; j < input.length; j++){
//                  Object[] copy = input.clone();
//                 if(i == j){
//                      unique.add(copy);
//                     continue;
//                 }
//                 swap(copy, i, j);
//                 unique.add(copy);                
//             }
//             Set <Object>unique_copy = new HashSet<Object>();
//             for(Object k : unique_copy){
//                  List <Object> sub_output = new ArrayList<Object>(input.length);
//                  sub_output = allPerm((Object[]) k);
//                  unique.addAll(sub_output);             
//             }
//         }
//        output.addAll(unique);
//        return output;
//     }
     public static List allPerm2(Object input[]){
         List <Object[]> output = new ArrayList<Object[]>();
         if(input.length == 1)
            // return Arrays.asList(input);
         output.add(input);
         else
             for(int i = 0; i < input.length; i++){// ==0 with itself --> perm 1,...
                 Object copyInput[] = input.clone();
                 swap(copyInput, 0, i); 
                 Object  copyPerm[] = new Object[input.length-1];

                 System.arraycopy(copyInput, 1, copyPerm , 0, input.length - 1);
                  List <Object[]> currentList = allPerm2(copyPerm);
                 //Collections.addAll(output,Collections. allPerm2(dest,output));
                 for(int  j = 0; j < currentList.size();j++){
                       Object tmpPerm[] = new Object[input.length];
                       tmpPerm[0] = copyInput[0];
                       Object tmpPerm2[] = currentList.get(j).clone();
//                       if(tmpPerm[0] == tmpPerm2[0])
//                           break;
                      System.arraycopy(tmpPerm2, 0, tmpPerm, 1, input.length-1);
                       //currentList.set(j, tmpPerm);                   
                       output.add(tmpPerm);
                 }

         }
         return output;
     }
     public static int noPerm(Object input[]){
         Object copy[] = input.clone();
         List sorted =new ArrayList<> (Arrays.asList(input.clone() ));
         Collections.sort(sorted);
         int no = 0;
         int length = input.length;
         for(int i = 0;i < input.length;i++){
             sorted.remove(input[i]);
             int index = (i >= sorted.size()) ? sorted.size() : i;
             no += ((int)input[index]-1) * Math.factorial(input.length-  (i+1));
         }
         return no;
     }
     public static Object[] permAt(int C, Object M[]){
         if(C > M.length)
             return null;
         return null;
     }
     
     public static void ARRAY_CHANGE_F_TEST(Object OBJECTS[]){
         OBJECTS[0] = 10000;
     }
     static void swap(Object input[], int i, int j){
         if(i >= input.length || j >= input.length){
             System.err.println("can't swap out of range ...");
             return;
         }
             
          Object tmp = input[i];
         input[i] = input[j];
         input[j] = tmp;
     }
     
}
