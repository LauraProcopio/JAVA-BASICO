import java.util.Scanner;

public class ContaTerminal
{
  public static void main (String[]args)
  {

    Scanner c = new Scanner (System.in);

      System.out.println ("Por favor digite o numero : ");
    int numero = c.nextInt ();

      System.out.println ("Por favor digite a Agencia : ");
    String agencia = c.next ();

      System.out.println ("Por favor informe o nome do cliente : ");
    String nome = c.next ();

      System.out.println ("Por favor digite o Saldo : ");
    double saldo = c.nextDouble ();

      System.out.println ("Olá! " + nome +
			  " obrigado por criar uma conta em nosso banco, sua agencia "
			  + agencia + ", conta " + numero + " e seu saldo " +
			  saldo + " já está disponivel para saque.");


  }
}