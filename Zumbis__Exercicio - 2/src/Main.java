public class Main {

   public static void main(String[] args) {

      Zumbi zumbi1 = new Zumbi();
      zumbi1.vida = 100;
      zumbi1.nome = "Romulo";

      Zumbi zumbi2 = new Zumbi();
      zumbi2.vida = 80;
      zumbi2.nome = "Pedrinho";

      //Mensagem sobre o zumbi
      System.out.println("A vida do zumbi é: " + zumbi1.vida);
      System.out.println("Nome do zumbi: " + zumbi1.nome);

      System.out.println("A vida do zumbi é: " + zumbi2.vida);
      System.out.println("Nome do zumbi: " + zumbi2.nome);

      double valor = 150;

      boolean retorno = zumbi1.transferirVida(valor,zumbi2);

      if(retorno){
         System.out.println("Deu certo!");
      }else{
         System.out.println("Deu ruim!");
      }

      System.out.println("Vida do zumbi 1: " + zumbi1.vida + " Vida do zumbi 2: " + zumbi2.vida );

   }
}
