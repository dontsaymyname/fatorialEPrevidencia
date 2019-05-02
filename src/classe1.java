import java.util.Scanner;

public class classe1 {
    public static void main(String[] args) {

        System.out.println("Olá, meu nome é Art, digite um número e lhe direi seu fatorial.");
        Scanner scanner = new Scanner(System.in);
        int fat = 1;

        //Número para verificar o fatorial
        int valor = scanner.nextInt();

        for( int i = 1; i <= valor; i++ )
        {
            fat = fat * i;
        }
        System.out.println( valor + "! = " + " " + fat );


        //Previdência

        System.out.println("Eu também posso dizer se você pode se aposentar");
        System.out.println("Digite sua idade.");
        int idade = scanner.nextInt();
        System.out.println("Digite o sexo.");
        System.out.println("M ou F");
        String sexo = scanner.next();
        System.out.println("Por fim, digite o tem de contribuição.");
        int contribuicao = scanner.nextInt();


        if (contribuicao >= 30 && sexo == "M" && idade >= 65 ){
            System.out.println(true);

        } if (contribuicao >= 30 && sexo == "F" && idade >= 60 ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        //Arrays

        int array[] = {1, 2, 3};
        int resultado = 1;
        for (int i = 0; i <= array.length; i++){
            resultado = resultado * array[i];
        }
        System.out.println(resultado);

    }
}
