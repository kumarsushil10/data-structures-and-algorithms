package javaCode;

public class FascinatingNumber {
    public static void main(String[] args) {
//        Scanner n = new Scanner(System.in);
//        System.out.print("Enter number:  ");
//        int num = n.nextInt();



        System.out.println(isFascinatingNumber(12));




    }

    public static boolean isFascinatingNumber(int num){
        int num2X = 2*num;
        int num3X = 3*num;
        String concatenation = Integer.toString(num) + Integer.toString(num2X) + Integer.toString(num3X);
        System.out.println(concatenation);

        return true;
    }
}
