package demo.p1;



public class A {
	public static void main(String args[]) {
	     int n=4;	
	     int count=0;
	     if(n<2) {
	    	 System.out.println("given number is not prime ");
			
		}
	   
	     for (int i = 1; i <=n; i++) {
			if(n%i==0) {
				count++;
			}
		
	     }
	     if(count>2) {
	    	 System.out.println("not prime");
	     }
	     else {
			System.out.println("its prime");
		}
	}
	}
	
	


