  class pattern13{
  public static void main(String args[]){
	  int alphabets=65;
		for(int i=1;i<=5;i++){
	    
		  for(int j=5;j>=i;j--)
	         {
	          System.out.print(" ");
	         }
		  for(int j=1;j<=i;j++)
		  {
		     System.out.print((char)alphabets+" ");
			 
		  }
		  alphabets++;
		  System.out.println();
		}
    }
}