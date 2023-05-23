
public class OccuranceOfWord {
	

		  public static int findOccurrencesOfWord(String str, String word) {
		    int count = 0;
		    int index = 0;
		    while ((index = str.indexOf(word, index)) != -1) {
		      count++;
		      index += word.length();
		      System.out.println("Index:"+index);
		    }
		    System.out.println("COunt:"+count);
		    System.out.println("Index outside while loop"+index);
		    return count;
		    
		  }

		  public static void main(String[] args) {
		    String str = "This is a string with the word 'string' appearing 2 times.";
		    String word = "string";
		    System.out.println( word + "' appears " + findOccurrencesOfWord(str, word) );
		  }
		}

