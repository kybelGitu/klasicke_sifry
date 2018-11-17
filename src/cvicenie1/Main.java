/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenie1;

import java.util.Arrays;
import java.util.Random;
import cvicenie1.helpers.Math;
import cvicenie1.helpers.Permutations;
import cvicenie1.helpers.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.File;
import java.util.HashSet;

/**
 *
 * @author xsebest
 * Spravte úlohy podľa nasledovných tematických okruhov. Čo nestihnete do konca cvičenia, dorobte doma.

Vytvorenie projektu

    Vytvorte prázdny projekt s názvom Cvicenie1 cez File/New Project/Java/JavaApplication. 
    Nezabudnite zaškrtnúť možnosť Create Main Class a zmente názov triedy na cvicenie1.Main. 
    Vytvorte nový balík s názvom cvicenie1.helpers a pridajte do neho novú triedu s názvom Text a jednu s názvom Math. 
    * 
    * Cykly, podmienky a dátové typy

V triede Main do statickej metódy main (prístupový bod aplikácie) naprogramujte: 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd  = new Random(System.currentTimeMillis());
        // TODO code application logic here
        //Jeden for cyklus, v ktorom iterujete čísla od 1 do 21 a vypíšete 
        //(do konzoly pomocou System.out.println()) či je dané číslo párne,
        //alebo nepárne. 
//        for(int i=1; i < 21;i++)
//            System.out.println("dane cislo je" + ((i%2==0) ?  " parne" :  "neparne"));
//        /*Vytvorte pole celých čisel s názvom p veľkosti 12 prvkov. 
//Pole inicializujete s hodnotami 1 až 12 pomocou for cyklu tak, aby na
//každom indexe i bola hodnota i+1, ukončovaciu podmienku vo fore určte cez 
//atribút <premenna>.length. */
//        int[] p = new int[12];
//        for(int i =0; i < p.length; i++)
//            p[i] = i+1;
//        
//        for(int i : p)
//             System.out.println("cislo:" + i);
//            
//        System.out.println("pole p" + Arrays.toString(p));
//        int bound = 100;
//        //Cyklus pomocou do-while, kde generujete a vypisujete do konzoly náhodné celé čisla v intervale <1,100> použite tiedu Random a jeho metódu nextInt(int bound), kým nenarazíte na prvé prvočíslo (použite funkciu isPrime()). 

//        int rndInt;
//        do{
//             rndInt = rnd.nextInt(bound);
//             System.out.println("rand cislo " + rndInt);
//        }while(Math.isPrime(rndInt) );
//        /*Generické dátové typy
//
//V triede Main do statickej metódy main (prístupový bod aplikácie)
//naprogramujte:
//        Vytvorte zoznam z (použite implementáciu ArrayList)
//        typu Double, do ktorého pridajte 100 náhodných čisiel
//        v intervale <0,1> (použite metódu nextDouble() triedy Random).*/
//        
//        List<Double>  z  = new ArrayList();
//        for(int i = 0; i < 100; i++)
//            z.add(rnd.nextDouble());
//        
///*Utriedte zoznam pomocou Collections.sort() 
//a vypíšte prvky zoznamu pomocou rozšíreného for cyklu. */
//    Collections.sort(z);
//    
//    for(Double x : z)
//        System.out.println(" num-> " + x);
///*Vymente poradie prvkov v zozname pomocou Collections.reverse()
//a vypíšte prvky zoznamu pomocou rozšíreného for cyklu. */
//    Collections.reverse(z);
//    System.out.println(" reverse");
//    for(Double x : z)
//        System.out.println(" num-> " + x);
///*Vytvorte zoznam reťazcov s názvom mena, ktorý obsahuje štyri
//ľubovoľné mená. Inicializujte (vytvorte) pomocou Arrays.asList(). */    
//     List<String>  mena  =  Arrays.asList("Palo","Emanuel", "Albrecht", "Dionyz");
///*Vytvorte pole reťazcov menaPole velkosti mena.size() do ktorého nahráte
//hodnoty zo zoznamu mena. Použite metódu zoznamu  */
//     String[] menaPole = new String[mena.size()]; 
//     menaPole = mena.toArray(menaPole);
//     for(String s : menaPole)
//         System.out.println(s);
//     //file choser
//     File file = Text.pickFromFileChooser();
//     String str_file = Text.readText(file);
//     String[] strings = str_file.split("\n");
//     HashSet<String> hasSetaStringov = new HashSet<String>();
//     String tmp;
//     for(String i:strings){
//         if(i.startsWith("m")||i.startsWith("M"))
//             continue;          
//         hasSetaStringov.add(i.toLowerCase());
//     }
//     //rekurzia
//     int recSize = 5;
//     List testListRecursion = Text.recursion(recSize);
//        System.out.println("recursion grade : " + "  size list  --> : " + testListRecursion.size());
//        
//         //CVICENIE 2
    //factorial - test
    int fak_test = 5;
    int resFak = Math.factorial(fak_test);
    System.out.println("factorial test : " + fak_test + " -> result ==> " + resFak);
//    
     //permutacia mnoziny mnozina P 10 cisel HashSet <Integer>
     HashSet <Integer> hashSetPerm = new HashSet<Integer>(10);
     // tooltip function -> to word at cursor & ctrl + shift +space
     //System.out.print(" hash set length +--->> " + hashSetPerm.size());
     while(hashSetPerm.size() < 10)
         hashSetPerm.add(rnd.nextInt(10) + 1);
     
//     Collections.shuffle(hashSetPerm);
     //System.out.println("hash seta permutations >-+-+-> " + hashSetPerm.toString());
     List <Integer> z = new ArrayList<Integer>(10);
     z.addAll(hashSetPerm);
     System.out.println("list copy >-+-+-> " + z.toString());
     for(int i = 0; i < 5; i++){
         Collections.shuffle(z);
         System.out.println("list copy >-+-+-> " +  z.toString() + " preusporadanie: " + (i + 1) );
     }
     Integer[] IntegerArray = new Integer[hashSetPerm.size()];
     IntegerArray =  hashSetPerm.toArray(IntegerArray);
     //System.out.print(IntegerArray.toString());
     for(Integer I : IntegerArray)
           System.out.print(I.toString() + "\t");
     
     for(int i = 0; i < 5; i++)
        Permutations.rndPerm(IntegerArray);
     Character[] CharacterArray = {'a','z','b','p','c'};
     Object[] CharArrayINVERSE =new Character[CharacterArray.length];
     System.out.println("charracter array  :");
     for(Object i : CharacterArray)
         System.out.print(i.toString() + ", ");
     CharArrayINVERSE =  Permutations.inversePerm(CharacterArray);
      System.out.println("charracter array Inverse :" + CharArrayINVERSE);
      for(Object i : CharArrayINVERSE)
         System.out.print(i.toString() + ", ");
      
     Integer[] perm_short = {1,2,3,4};
     System.out.println(" input for all perm : ");
     for(Object i : perm_short)
            System.out.print(i.toString() + ", ");
     List<Object> all_short_perm = Permutations.allPerm(perm_short);
         Text.printList(all_short_perm, "output of all permuts ");
     //charactersllll
     Character[] perm_char = {'a','b','c','d'};
     Text.printList(all_short_perm,"pole charov.  : " + perm_char.toString());
     List<Object> all_char_perm = Permutations.allPerm2(perm_char);
     Text.printList(all_char_perm, "out put, size: " + all_char_perm.size());
     
          Integer[] perm123 = {3,1,2,5,7,4,6};
          int no = Permutations.noPerm(perm123);
          System.out.println(" no of" + Arrays.toString(perm123) + " -->" + no);
     Permutations.ARRAY_CHANGE_F_TEST(perm123);
     Text.printObjects(perm123, "test perm123 ");
    
    }
}