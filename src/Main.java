import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        Scanner nomEntrada = new Scanner(System.in);
        System.out.println("Digite o nome da Conta: ");
        String nomeEntrada = nomEntrada.nextLine();
        minhaConta.setNome(nomeEntrada);
        System.out.println("Nome da Conta: " + minhaConta.getNome());
    }

}