package dataType;

public class ArrayTwoDimentional {

	public static void main(String[] args) {
		
		/*    0  1  2 3  4  5 
		 * 0  1  2    4     A
		 * 1     3  B       X
		 * 2        D    4  S   
		 */
		Object[][] arr=new Object[3][6];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][3]=4;
		arr[0][5]="A";
		arr[1][1]=3;
		arr[1][2]="B";
		arr[1][5]="X";
		arr[2][2]="D";
		arr[2][4]=4;
		arr[2][5]="S";
		
		int row=arr.length;
		int col=arr[1].length;
				
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print( arr[i] [j]);
			}
			System.out.println();
		}
		

	}

}
