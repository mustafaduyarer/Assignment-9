package Assignment_9;

public class Question5 {

	class Main {
		
		public String mergeStrings(String one, String two) {
		    
		    String merged ="" , longerStr="";
		    int shorterCharCNT = 0;
		    
		    if (one.length()== two.length()){
		    	for (int i=0 ; i<shorterCharCNT ; i++){
		 		   merged +="" + one.charAt(i) + two.charAt(i);
		 		 }
		 		 merged += longerStr.substring(shorterCharCNT);
		 		 return merged;
		      
		    }else {
		      System.out.println("cannot merge");
		    }
		    //merged ="" + one.charAt(0) + two.charAt(0);
			return merged;
		 

	}

}
}
