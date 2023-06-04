import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine().toUpperCase();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe seu CPF: ");
        String cpf = scanner.next();

        System.out.println("=====================================");
        System.out.println("Destinos disponíveis");
        System.out.println("1.São Paulo");
        System.out.println("2.Nova York");
        System.out.println("3.Berlim");
        System.out.println("Gentileza escolher um dos destino");
        int destinoEscolhido = scanner.nextInt();
        scanner.close();

        String destino;
        double valorPassagem;

        switch(destinoEscolhido){
            case 1:
            destino = "SÃO PAULO";
            valorPassagem = 250.00;
            break;
            
            case 2:
            destino = "NOVA YORK";
            valorPassagem = 2400.00;
            break;

            case 3:
            destino = "BERLIM";
            valorPassagem = 3800.00;
            break;

            default:
            System.out.println("Destino inexistente");
            return;
            
        }
        Random random = new Random();
        int numeroPoltrona = random.nextInt(20) + 1;

        System.out.println("==========Recibo da Viagem==========");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF : " + cpf);
        System.out.println("Destino: " + destino);
        System.out.println("Valor a ser pago: " + valorPassagem);
        System.out.println("Número da Poltrona: " + numeroPoltrona);
        System.out.println("========================================");


       
         
         try{
            FileWriter arq = new FileWriter("C:\\Users\\viruscb\\Desktop\\recibo_viagem.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.write("==========Recibo da Viagem==========");
            gravarArq.write("\nNome: " + nome);
            gravarArq.write("\nIdade: " + idade);
            gravarArq.write("\nCPF : " + cpf);
            gravarArq.write("\nDestino: " + destino);
            gravarArq.write("\nValor a ser pago: " + valorPassagem);
            gravarArq.write("\nNúmero da Poltrona: " + numeroPoltrona);
            gravarArq.write("\n========================================");
    
            arq.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
         
       

    }
}

    

