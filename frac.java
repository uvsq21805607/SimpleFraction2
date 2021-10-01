import java.awt.*;
import java.util.*;


public class frac{

	private int nume;
	private int denom;

	public frac(int nume, int denom){

		this.nume = nume;
		this.denom = denom;
		
		
	}
	
	@Override

	public String toString(){

		return nume + " / " + denom;
	}


	public frac multiplication(frac A){

		int a = this.nume * A.nume;
		int b = this.denom * A.denom;

		return new frac(a,b);
	}

	public frac addition(frac A){

		int a = (this.nume * A.denom) + (this.denom * A.nume);
		int b = this.denom * A.denom;

		return new frac(a,b);
	}

	public frac division(frac A){

		int a = (this.nume * A.denom);
		int b = this.denom * A.denom;

		return new frac(a,b);
	}


}