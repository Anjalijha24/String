public class StringBufferExample {

    public static void main(String[] args) {
     
    	StringBuffer sb = new StringBuffer("This is StringBuffer");
    	
    	
    	//Adding the given string in existing string
    	sb.append("This is a sample Program");
    	System.out.println(sb);
    	
    	//Insert the string object into existing string at 21st position
    	sb.insert(21,"Object");
    	System.out.println(sb);
    	
    	//Replaces the word Buffer with Builder
    	sb.replace(14, 22, "Builder");
    	System.out.println(sb);
    	
    	sb.reverse();
    	System.out.println(sb);
    	
    	
    }
} 