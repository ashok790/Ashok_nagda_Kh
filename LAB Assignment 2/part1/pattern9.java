  class pattern9{
  public static void main(String args[]){
		int i;
		int j;
		for(i=1;i<=5;i++){
	    int alphabets=65;
		  for(j=5;j>=i;j--)
	         {
	          System.out.print(" ");
	         }
		  for(j=1;j<=i;j++)
		  {
		     System.out.print((char)alphabets+" ");
			 alphabets++;
		  }
		  System.out.println();
		}
    }
}