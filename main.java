import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Turma{
    public static void main(String[] args){
        DecimalFormat pctg = new DecimalFormat("#.00");
        System.out.println("Homens: ");
        int homens = new Scanner(System.in).nextInt();
        
        System.out.println("Mulheres: ");
        int mulheres = new Scanner(System.in).nextInt();
        
        double pctgHomens = (double)(homens*100)/(homens+mulheres);
        double pctgMulheres = (double)(mulheres*100)/(mulheres+homens);
        
        System.out.println("A turma é formada por "+pctg.format(pctgHomens)+"% de homens e por "+pctg.format(pctgMulheres)+"% de mulheres.");
    }
}
