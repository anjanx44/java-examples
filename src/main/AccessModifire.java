package main;

public class AccessModifire {
	
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
}

class AccessModifireDemo{

	public static void main(String[] args) {
		AccessModifire ac  = new AccessModifire();
		ac.setAlpha(-99);
		
		System.out.println("ac.alpha is "+ac.getAlpha());
		
//		alpha is a private property. it can't be assigned directly
//		ac.alpha = 10; 
		
		ac.beta = 88;
		ac.gamma = 99;
		
		System.out.println("beta = "+ac.beta + " and " +"gamma is = "+ac.gamma);
	}

}
