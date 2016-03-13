package ad325.token;

public class WordCount {

  public static void tokenCount(String filename) {

    java.util.Scanner scan;

    // open the file for reading using Scanner
    try {
      scan = new java.util.Scanner(new java.io.File(filename));
    } catch(java.io.FileNotFoundException e) {
      scan = null;
    }

    // process the file, token by token
    int i = 0;
    while(scan.hasNext()) {
      String token = scan.next();
      i ++;
    }

    // close the file
    scan.close();

    // output statistics
    System.out.println("Token count: " + i);
    System.out.println();

  }

}
