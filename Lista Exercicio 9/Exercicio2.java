import java.io.FileWriter;
import java.io.PrintWriter;
public class Exercicio2 {

    public static void main(String[] args) {
        
        try{
            FileWriter arq = new FileWriter("C:\\Users\\viruscb\\Desktop\\itens_supermercado.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.write("Item1: Ovo\nValor:R$23,90");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem2: Óleo\nValor:R$4,50");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem3: Iogurte\nValor:R$");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem4: Suco\nValor:R$5,70");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem5: Papel Higiênico\nValor:R$9,00");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem6: Azeite\nValor:R$9,40");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem7: Trigo\nValor:R$5,90");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem8: Macarrão\nValor:R$7,50");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem9: Arroz\nValor:R$14,00");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nItem10: Feijão\nValor: R$6,50");
            gravarArq.write("\n-------------------------");

            arq.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
