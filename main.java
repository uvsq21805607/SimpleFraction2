import java.awt.*;
import java.util.*;


public class main {


	public static void main(String[] args){

//AFFICHER UNE SIMPLE FRACTION :

		frac M = new frac(26, 6);
		
		System.out.println(" fraction 1 = " + M.toString() + "\n");

// MULTIPLICATION DE DEUX FRACTIONS : 

		frac L = new frac(6,26);

		frac c = L.multiplication(M);

		 System.out.println(" Multiplication : \n ");

		 System.out.println( M.toString() + " * " + L.toString() + "\n");

		 System.out.println(" Resultat de la multiplication = \n " + c.toString()+ "\n");

// ADDITION DE DEUX FRACTIONS : 

		frac S = new frac(1,2);

		frac d = L.addition(S);

		 System.out.println(" Addition : \n ");

		 System.out.println( S.toString() + " + " + L.toString() + "\n");

		 System.out.println(" Resultat de la addition = \n " + d.toString()+ "\n");


	} 
}
