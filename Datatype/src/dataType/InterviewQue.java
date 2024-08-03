package dataType;

public class InterviewQue {

	public static void main(String[] args) {
		
		int ramAge =21;  //24,24,21,21,24,21,21,19,21
		int omAge =25;   //21,25,25,21,21,21,19,21,21
		int hariAge =24; //26,21,24,26,21,21,21,21,19
		
	   if(ramAge>omAge&&omAge<hariAge) {
		   System.out.println("om is younger");
	   }else if(ramAge>hariAge) {
		   System.out.println("hari is younger");
	   }else if(ramAge<omAge) {
		   System.out.println("ram is younger");
	   }else if(ramAge>omAge && omAge==hariAge) {
		   System.out.println("om and hari is younger");
	   }else if (ramAge==omAge&&hariAge==omAge) {
		   System.out.println("all are younger");
	   
	   }else
	   System.out.println("ram and om is younger");{
		   
	   }
		

	}

}
