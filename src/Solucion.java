import java.util.Scanner;

public class Solucion {
    public static void main(String[] args) {
        //int n = 9;
        //System.out.println((char)(n+48));
        ejercicioDigitos();
    }
    public static void ejercicioDigitos(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        int Occurences =0;
        int i =0;
        String currentNumber ;
        while(count < n){
            currentNumber = String.valueOf(i);
            for (int j = 0; j < currentNumber.length();j++) {
                if (currentNumber.charAt(j) == (char)(d+48)){
                    //System.out.println(currentNumber.charAt(j));
                    Occurences++;
                }
            }
            if (Occurences >= m){
                System.out.println(i);
                count++;
            }
            Occurences =0;
            i++;

        }
    }
}
