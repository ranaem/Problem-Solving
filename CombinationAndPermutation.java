/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combinationandpermutation;
import java.util.Scanner;
/**
 *
 * @author ranaemad
 */

public class CombinationAndPermutation {

    /**
     * @param NOrP
     * doing recursive method
     * @return 
     */
    public double factorial(double NOrR){

    
        if(NOrR == 0) 
            return 1;
        else
            return NOrR*factorial(NOrR-1);

    }
    public static void main(String[] args) {
        
        //making object of the class so i can use its methods
        CombinationAndPermutation obj = new CombinationAndPermutation();
        CombinationAndPermutation ob = new CombinationAndPermutation();
        CombinationAndPermutation o = new CombinationAndPermutation();
        //taking the inputs from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter TheTwo Factorial N And R In Order : ");
        int n = input.nextInt();
        int r = input.nextInt();
        //declaration of the outputs
        double c,p;
        //doing the mathematics processing by calling the factorial method
        c = obj.factorial((double)n)/(ob.factorial((double)r)*o.factorial((double)(n-r)));
        p = obj.factorial((double)n)/ob.factorial((double)(n-r));
        //print the results
        System.out.println("Thank You, The Result Is : ");
        System.out.println("nCr \"Combination\" = "+ c);
        System.out.println("nPr \"Permutation\" = "+ p);
        
        
    }
    
}
