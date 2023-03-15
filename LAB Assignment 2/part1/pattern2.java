import java.util.Scanner;

class pattern2{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int i;
		int j;
		for(i=1;i<=5;i++){
	    int alphabets=65;
		  for(j=1;j<=i;j++)
		  {
		     System.out.print((char)alphabets+" ");
			 alphabets++;
		  }
		  System.out.println();
		}
    }

}