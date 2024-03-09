public class StringExample {

    public static void main(String[] args) {
        // Declare and initialize the variable 'name'
        String name = "Welcome to Java"; // Example string
        
        // Returns the character at 5th position.
        String CharAt = name.substring(4,5);
        System.out.println("Character at 5th position= " + CharAt);
        
        // Compare with "Welcome" lexicographically ignoring case
        boolean isEqualIgnoreCase = name.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println("Is \"Welcome\" lexicographically equal to the beginning of the string? " + isEqualIgnoreCase);
       
        // Concatenation of "Let us learn" string with "welcome to java"
        String concatenatedString = name.concat(" - Let us learn"); 
        System.out.println("Concatenated string: " + concatenatedString);
        
        // Returns the position of the first occurrences of character 'a'
        int indexOfA = name.indexOf('a');
        System.out.println("Position of the first occurrence of 'a': " + indexOfA);
       
        // Replacing the occurrences of 'a' with 'e'
        String replacedString = name.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedString);
        
        // Returns  string between 4th position and 10th position
        String Substring = name.substring(3,10);
        System.out.println("Return substring at 4th position and 10th position= " + Substring);
        
        // Return lowercase of the string
        String lowercaseString = name.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);
    }
}
