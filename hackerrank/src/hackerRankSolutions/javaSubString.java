package hackerRankSolutions;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-substring
 * Given a string,s, and two indices,start and end, print a substring consisting of all characters in the inclusive range from start to end -1.
 * ***Constraints:***
 * 1<=length of s<=100
 * 0<=start<=end<=n i.e a positive integer
 * String s consists of English alphabetical letters only
 * ***InputFormat***
 * The first line contains a single string denoting . 
 * The second line contains two space-separated integers denoting the respective values of start and end .
 */
public class javaSubString {
    public static void main(String[] args) {
    	//gets input
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String output = null;
        //Checks constraints
            if ((S.length() > 0) &&(S.length()<=100)){
            if((start>=0) && (start<end)){                
                if (checkValidInput(S)){
                	//take substring
                    output = wordCutter(S, start, end);
                    System.out.println(output);
                }
            }  
            }
        if (output == null){
            System.out.println("Invalid input");
        }
        in.close();
    }
        
    public static String wordCutter(String word, int first, int second){
       return (word.substring(first,second));        
    }
    public static boolean checkValidInput(String word){
        return word.matches("[a-zA-Z]+");        
    }
    
}
