/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d.difference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ranaemad
 */
public class DDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        long A,B,C,D,X;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] in = new String[4];
        in = input.readLine().split(" ");
        A = Long.parseLong(in[0]);
        B = Long.parseLong(in[1]);
        C = Long.parseLong(in[2]);
        D = Long.parseLong(in[3]);
        
        X = (A*B)-(C*D);
        System.out.print("Difference  =  "+X);
        

        
    }
   
}
