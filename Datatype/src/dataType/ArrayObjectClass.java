package dataType;

public class ArrayObjectClass {

	public static void main(String[] args) {
		
		Object[] arr=new Object[5];
		arr[0]="ram";
		arr[1]=32;
		arr[2]=100000.0;
		arr[3]=true;
		arr[4]='M';
		
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
				

	}

}
