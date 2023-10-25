import java.util.Scanner;

public class Calculator {

    static String div(int opA, int opB){

        int res = opA / opB;

        return "ділення "+ res;

    }
    static String mul(int opA, int opB){

        int res = opA * opB;

        return "множення "+ res;

    }

    static String sub(int opA, int opB){

        int res = opA - opB;

        return "віднімання "+ res;

    }


    static String add(int opA, int opB){

        int res = opA + opB;

        return "Додавання "+ res;

    }

    static int indxOfStr(String _Mstr){

        int Sel = 0;

        for(int i=0; i<_Mstr.length();i++){

            Sel = _Mstr.indexOf('+');
            if(Sel>0){
                return Sel;
            }
            Sel = _Mstr.indexOf('-');
            if(Sel>0){
                return Sel;
            }
            Sel = _Mstr.indexOf('/');
            if(Sel>0){
                return Sel;
            }
            Sel = _Mstr.indexOf('*');
            if(Sel>0){
                return Sel;
            }

        }

        return Sel;

    }

    static void countAndPrint(char ss, int firstOp, int secondOp){

        switch (ss){

            case '+': {
                String resStr = add(firstOp,secondOp);
                System.out.println(resStr);
                break;
            }

            case '-':{
                String resStr = sub(firstOp,secondOp);
                System.out.println(resStr);
                break;
            }

            case '*':{
                String resStr = mul(firstOp,secondOp);
                System.out.println(resStr);
                break;
            }

            case '/':{
                if (secondOp==0){
                    System.out.println("Поділ на 0!");
                    break;
                }
                String resStr = div(firstOp,secondOp);
                System.out.println(resStr);
                break;
            }

        }

    }

    public static void main(String[] args) {
        Scanner nSc = new Scanner(System.in);
        System.out.println("Введіть вираз як у прикладі: 6+6\n знаки: +-/*");
        String enteredArg = nSc.next();
        nSc.close();
        //
        int indSign = indxOfStr(enteredArg);
        int lStr = enteredArg.length();

        char ss = enteredArg.charAt(indSign);
        String strOp1 = enteredArg.substring(0,indSign);
        String strOp2 = enteredArg.substring(indSign+1,lStr);

        //

        int firstOp = Integer.parseInt(strOp1);
        int secondOp = Integer.parseInt(strOp2);

        //
        countAndPrint(ss, firstOp, secondOp);








    }
}


