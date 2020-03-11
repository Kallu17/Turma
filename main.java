import java.util.Scanner;
import java.math.BigDecimal;

public class Turma{
    public static void main(String[] args){
        BigDecimal pctg = new BigDecimal("100");
        
        System.out.println("Digite quantos homens tem na turma: ");
        BigDecimal homens = new BigDecimal(new Scanner(System.in).nextInt());
        System.out.println("Digite quantas mulheres tem na turma: ");
        BigDecimal mulheres = new BigDecimal(new Scanner(System.in).nextInt());
        
        BigDecimal pctgHomens = ((homens).multiply(pctg)).divide(((homens).add(mulheres)), 2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal pctgMulheres = ((mulheres).multiply(pctg)).divide(((homens).add(mulheres)), 2, BigDecimal.ROUND_HALF_EVEN);
        
        System.out.println("A turma é constituída por "+pctgHomens+"% de homens e "+pctgMulheres+"% de mulheres");
    }
}
