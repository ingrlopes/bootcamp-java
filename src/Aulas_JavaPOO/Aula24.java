package Aulas_JavaPOO;

import java.text.NumberFormat;
import java.text.ParseException;

public class Aula24 {

    public static void main(String[] args) throws ParseException {

     try { // TENTE:
         Number valor = NumberFormat.getInstance().parse("a1.56"); // Converte uma String em um valor
         System.out.println(valor);

     } catch(ParseException e) { // SE DER ERRO, MOSTRE:
         e.printStackTrace();
         System.out.println("!!! ERRO !!!");
     }
    }
}