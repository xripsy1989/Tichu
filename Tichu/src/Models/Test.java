/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author AngelKyriako
 */
public class Test {
    
    // private variables   
    
    // Constructors
    public Test() {
        
    }
    
    //Accessors & Mutators
    //...
    
    //Methods
    public void TestMain(){
        SampleStatements();
        TestMyPow();
    }

    void SampleStatements() {
        //numbers
        System.out.println("2 div 2 == "+ 2/2);
        System.out.println("0 div 2 == "+ 0/2);
        System.out.println("2.2 div 2 == "+ 2.2/2);
        System.out.println("2 div 1.5 == "+ 2/1.5);
        System.out.println("(int)2.0 div 1.5 == "+ (int)(2.0/1.5));
        System.out.println("2.2 div 2.0 == "+ 2.2/2.0);
        System.out.println("2.2 div 1 == "+ 2.2/1);
        System.out.println("2 mod 3 == "+ 2%3);
        
        int i = 1;
        System.out.println("i++ == "+ i++);
        System.out.println("i*2 == "+ i*2);
        System.out.println("++i == "+ ++i);
        System.out.println("i+1 == "+ (i+1));
        System.out.println("i*2 == "+ i*2);
        
        //boolean
        System.out.println("2 == 2: "+(2 == 2));
        System.out.println("2 > 2: "+(2 > 2));
        System.out.println("2 >= 2: "+(2 >= 2));
        System.out.println("2 <= 2: "+(2 <= 2));
        System.out.println("2 < 2: "+(2 < 2));
        
        boolean bool = false;
        System.out.println("bool = false: "+bool);
        bool = (2 == 2);
        System.out.println("2 == 2: "+bool);
        
        if (bool)
            i = 1;
        else
            i = 0;
        System.out.println("must be 1: "+i);
        
        i = (!bool) ? 1 : 0;
        System.out.println("must be 0: "+i);
    }
    
    void TestMyPow(){
        System.out.println("Pow2: 2^0 == "+Pow2(2, 0));
        System.out.println("Pow: 2^1 == "+Pow(2, 1));
        System.out.println("Pow: 2^2 == "+Pow(2, 2));
        System.out.println("Pow2: 2^3 == "+Pow2(2, 3));
        System.out.println("Pow3: 2^4 == "+Pow3(2, 4));
        System.out.println("Pow3: 2^0 == "+Pow3(2, 0));
        System.out.println("Pow3: 2^1 == "+Pow3(2, 1));
    }   
    
    int Pow(int base, int power) {
        //@TODO: Task 1: upgrade to calculate for negative values
        
        if (power > 0) {
            for (int i=1; i<power; ++i) { //++i equals i = i + 1
                base *= 2; // equals base = base * 2;
                //
                //
            }
            return base;
        }
        else
            return 1;
    }
    
    int Pow3(int base, int power) {
        if (power <= 0)
            base = 1;
        
//        while (power-- > 1)
//            base *= 2;
        while (power > 1) {
            base *= 2;
            power++; // or ++power; or power=power+1;
        }

        return base;
    }
    
    int Pow2(int base, int power) {
        //System.out.println("Pow2 :: base: " + base + " power: " + power);
        if (power == 0)
            return 1;
        else
            return 2 * Pow2(base, power - 1);       
    }
    
    void DeuterovathmiaEksiswsh(double a, double b, double c) {
        // Oles tis periptwseis
        
    }
    
    double Diakrinousa(double a, double b, double c) {
        return 0;
    }
}
