package ad325.token;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Hashtable;
public class WordCount
{
	public static void main(String[] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		tokenCount(sc.nextLine());
	}
	public static void tokenCount(String filename)
	{
    		java.util.Scanner scan;
		// open the file for reading using Scanner
   		try
		{
     			scan = new java.util.Scanner(new java.io.File(filename));
	   	} catch(java.io.FileNotFoundException e) 
		{
      			scan = null;
    		}
//		Hashtable<String, Integer> source = new Hashtable<String, Integer>();
		HashMap<String, Counter> map = new HashMap<String, Counter>();
    		// process the file, token by token
		//Counter ct = new Counter();
		int i = 0;
    		while(scan.hasNext())
		{
      			String token = scan.next().toLowerCase();
			if(map.get(token) != null)
			{
				map.get(token).increment();
				map.put(token, map.get(token));
			}else{
				map.put(token, new Counter());
			}
			//if map is not empty...
			//check if token exists
			//if not add to hashmap
			//if it does get value at current key(token)
			// increment value at current key(token)
			i ++;
    		}
		Iterator<String> keySetIterator = map.keySet().iterator();
    		// close the file
    		scan.close();
   		// output statistics
    		System.out.println("Token count: " + i);
    		System.out.println();
	        while(keySetIterator.hasNext())
		{
                	String key = keySetIterator.next();
			if(map.get(key).count >2)
			{
				System.out.printf("%4s", map.get(key).count);
                       		System.out.println(" : " + key );
			}
                }
/*	create Iterator using the mao
	While iterator has next loop
	// current key
	// if maps.get(key) > 2 print it
	// print format should be
	count(#tokens>2) : type(toekns)
	_,_,_,_ : token
EX:	9999 : the
tring heading1 = "Exam_Name";
String heading2 = "Exam_Grade";
System.out.printf( "%-15s %15s %n", heading1, heading2);
To get the left-justified column, you need a percentage symbol, a minus symbol, the number of characters, and then the letter "s" (lowercase). So ''%-15s'' means fifteen characters left-justified.
To get a right-justified column the same sequence of characters are used, except for the minus sign.
To get a newline %n is used. Note that the characters are surrounded with double quotes.
After a comma, you type the text that you want formatting. The first comma in the code above separates the format specification from the text being formatted.
	*/
  	}

private static class Counter{
		int count;
		public Counter(){
			count = 1;
		}
		private int returnCount(){
			return count;
		}
		void increment(){
			count++;
		}
	}

}
