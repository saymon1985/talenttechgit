
public class Javaworkq2 {

	public static void main(String[] args) {
		
		Javaworkq2 jh=new Javaworkq2();
		jh.gradecalculater(87);
	}
	
   void gradecalculater(int marks) {
	   if (marks>=90){
		   System.out.println("Grade is A");   
	   }
	   else if(marks>=80 && marks<=89) {
		   System.out.println("Grade is B");
	   }
	   else if(marks>=70 && marks<=79) {
		   System.out.println("Grade is C");
	   }
	   else if(marks>=60 && marks<=69) {
		   System.out.println("Grade is D");
	   }
	   else if (marks > 60){
		   System.out.println("You Failed!");}
		  
		   else {
			   System.out.println("Invalid Answer");
		   }
		   
	   }
   }
	

