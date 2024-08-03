package dataType;

public class ArrayIntegerClass {

	public static void main(String[] args) {
		//array is a collection of similar data type
		//array holds the multiple value
		//array size is fixed
		//array is static beacuse it hold the all memory/garbage value
		//array is define by sqaure bracket[]
		
		int age =12;//which holds single value
		int[] ages=new int[4];//age1 is a arrya of type integer nold the multiple value
		
		ages[0]=23;
		ages[1]=25;
		//the defalute value of integer is zero-0
		ages[3]=33;
		System.out.println(ages.length);
		
		for(int index=0;index<ages.length;index++) {
			System.out.println(ages[index]);
		}
		int[] a= {23,24,25,26,27,28};
		for(int index=0;index<a.length;index++) {
			System.out.println(a[index]);
		}
		
		
	}

}
