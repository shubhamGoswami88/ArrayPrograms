
public class FirstNonRepeatingNumber {
	
	
	public static Character getFirstNonRepeatingCharacterLinearOptimized(String string) {
        if(string == null || string.length() == 0) {
            return null;
        }
         
        int n = string.length();
        if(n == 1) {
            return string.charAt(0);
        }
         
        int[] charIdx = new int[256];   // Index of non repeating characters. If repeating, then index = -2
        // Initialize character index of all characters to -1
        for(int i = 0; i < 256; i++) {
            charIdx[i] = -1;
        }
         
        for(int i = 0; i < n; i++) {
            if(charIdx[string.charAt(i)] == -1) {
                // character seen first time
                charIdx[string.charAt(i)] = i;
            } else {
                // Repeated character
                charIdx[string.charAt(i)] = -2;
            }
        }
         
        int minIdx = n; // Index of first non repeating character
        for(int i = 0; i < 256; i++) {
            if(charIdx[i] >= 0 && 
                    minIdx > charIdx[i]) {
                minIdx = charIdx[i];
            }
        }
        return (minIdx >= 0 && minIdx < n) ? string.charAt(minIdx) : null;
    }
	
	public static void main(String args[]) {
		String string = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
        System.out.println("Output: " + getFirstNonRepeatingCharacterLinearOptimized(string));
	}

}