
public class NestedLoop {

	public static void main(String[] args) {
		/*
		 * for(int row=1;row<=4;row++){ for(int col=1;col<=4;col++){ if(row==1 || row==4
		 * || col==1 || col==4) System.out.print("$"); else System.out.print(" "); }
		 * System.out.println(); }
		 */    //Dollar Box Problem
		
		/*
		 * for (int row = 1; row <= 3; row++) { int value = 65; for (int t = 1; t <=
		 * row; t++) { char letter = (char)value; System.out.print(letter + " ");
		 * value++; } System.out.println(); }
		 */   // ABC pattern
		
		for(int i=0; i<=5; i++)
		  {
		   int count=1;
		   for(int j=0;j<=i;j++)
		   {
		    System.out.print(count);
		    count++;
		   }
		   System.out.println();
		  }
	}

}
