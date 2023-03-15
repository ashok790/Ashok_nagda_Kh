import java.util.Scanner;

class pattern5{
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int i;
		int j;
		int alphabets=65;
		for(i=1;i<=5;i++){
		  for(j=1;j<i+1;j++)
		  {
			System.out.print((char)alphabets+" ");
		  }
		 System.out.println();
		 alphabets++;
		}
    }
}