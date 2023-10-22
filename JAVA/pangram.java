//C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
//from a-z)
public class pangram {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace with your input

        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // to mark the frequency of the characters from the input string
        int[] freq = new int[26];

        // Convert the input to lowercase
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            
            if (ch >= 'a' && ch <= 'z') {
                // increment the freqeuncy of the current char, 'a' at index '0'
                freq[ch - 'a']++;
            }
        }

        
        for (int i=0;i<freq.length;i++) {
            if (freq[i]==0) {
                return false; // return false if frequency of any char is 0
            }
        }

        return true;
    }
}
