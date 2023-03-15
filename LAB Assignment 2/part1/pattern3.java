import java.util.Scanner;

class pattern3{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int i;
		int j;
		
		for(i=1;i<=5;i++){
		  for(j=1;j<=i;j++)
		  {
		     System.out.print("*"+" ");
		  }
		  System.out.println();
		}
    }

}