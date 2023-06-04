import java.io.FileWriter;
import java.io.PrintWriter;
public class Exercicio1 {

    public static void main(String[] args) {
        
        try{
            FileWriter arq = new FileWriter("C:\\Users\\viruscb\\Desktop\\alunos_universidade.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.write("Aluno1: Kevin\nNota:80");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nAluno2: Matheus\nNota:85");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nAluno3: Larissa\nNota:75");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nAluno4: Pedro\nNota:90");
            gravarArq.write("\n-------------------------");
            gravarArq.write("\nAluno5: Gabriela\nNota:100");
            gravarArq.write("\n-------------------------");
            arq.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}