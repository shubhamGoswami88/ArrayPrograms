import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepatingNUm {

	
	 public static char getFirstNonRepeatedChar(String str) {
	        Map<Character,Integer> counts = new LinkedHashMap<Character,Integer>(str.length());
	        
	        for(char c : str.toCharArray()) {
	        	counts.put(c, counts.containsKey(c)? counts.get(c)+1:1);
	        	}
	        
	        
	      for(Entry<Character,Integer> entry : counts.entrySet()) {
	    	  if(entry.getValue()==1) {
	    		  return entry.getKey();
	    	  }
	    	  
	      }
		return (Character) null;
	     
	   
	    }

	 
	 public static void main(String args[]) {
		 
			String string = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
	        System.out.println("Output: " + getFirstNonRepeatedChar(string));
		 
	 }

	
}
