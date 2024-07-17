import java.io.File;
import java.util.Scanner;

public class A07 {
    
    /*****************************
     * DO NOT MODIFY METHOD MAIN *
     ****************************/
    public static void main(String[] args) {
        String filename = "Assignments/Assignment_07/book.txt";
        String longest = findLongestWord(filename);
        int longestLength = longest.length();
        int asLongAsLongest = countWithLength(longestLength);
        System.out.printf(
                "\nThe longest word in the book is \"%s\" witn %d characters.",
                longest, longestLength);
        System.out.printf(
                "\nI also found %d more words in the book with the same length.\n\n",
                asLongAsLongest - 1);
    } // method main

    public static String findLongestWord(String filename) {
        String longestWord = "";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                // Check if the current word is longer than the past longest word
                if (word.length() > longestWord.length())) {
                    longestWord = word;
                }
            }

            scanner.close();
        }
        
        return longestWord
            }

    public static int countWithLength(String filename, int length) {
        int count = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                // Check if the current word has the specified length
                if (word.length() == length) {
                    count++;
                }
            }

            scanner.close();
        }
        
        return count;
        }

        public static int countAsLongAsLongest(String filename, int longestLength) {
            int count = 0;
            try {
                File file = new File(filename);
                Scanner scanner = new Scanner(file);

                while (scanner.hasNext()) {
                    String word = scanner.next();
                    // Check if the current longest word has equal length to the longest word length
                    if (word.length() == longestLength) {
                        count++;
                    }
                }

                scannner.close();
            }
            
            return count;
                }
    
} // class A07
