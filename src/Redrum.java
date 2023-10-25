import java.util.Scanner;

public class Redrum {

    static String checkAndreturnWord(){
        Scanner getTheWord = new Scanner(System.in);
        return getTheWord.next();
    }

    static void makeRevWordPrintIt(String word){

        char[] revArr = word.toCharArray();
        String drow = "";

        int i = revArr.length-1;

        do {

            drow += revArr[i];
            i--;

        }while (i>=0);

        System.out.println(drow);

    }

    public static void main(String[] args) {
        System.out.println("type in some word");
        String word = checkAndreturnWord();
        makeRevWordPrintIt(word);
    }
}
