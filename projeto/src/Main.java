import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int soma(Integer x, Integer y) {
        return x + y;
    }

    static void exibeSoma(int x, int y) {
        System.out.println("Exibindo soma: " + (x + y));
    }

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int x = 2;
        double y = 3.14;
        char n = 'P';
        //////////////
        String pedro = "Pedro";
        //////////////
        Object meuNome = "Pedro";
        Object idade = 35;
        //////////////
        var a = 34;
        var b = 56;
        //////////////
        int[] arrayInteiros = {1, 2, 3};
        double[] arrayDouble = {1, 2, 3.14};
        /////////////
        for (int i = 0; i < arrayInteiros.length; i++ ) {
            System.out.println(arrayInteiros[i]);
        }
        /////////////////
        Integer novoInteiro = 2;
        Double novoDouble = 3.14;
        String novaString = "Nome";
        ////////////////
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(3);
        lista.add(5);

        for (var item : lista) {
            System.out.println(item);
        }

        System.out.println("Tamanho da lista é " + lista.size());

        lista.forEach((qualquerNome) -> System.out.println(qualquerNome));
        /////////////

        int resultado = soma(3, 2);
        System.out.println("Resultado é " + resultado);

        exibeSoma(4,3 );
        /////////////////////////////////////////
        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        nome = sc.nextLine();
        System.out.println("O nome digitado foi: " + nome);

        ///1) Criar um código que vai receber entradas do usuário e armazenar tais entradas em um ArrayList
        ///2) O processo deve ser repetido ENQUANTO o usuário não der o comando de parada
        ///3) AO final, o código deve exibir o conteúdo do ArrayList na tela.











    }


}

