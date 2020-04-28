package view;
import java.util.Scanner;
import model.Triangulo;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 09/04/2020 17:12
 */
public class Pricipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Bem vindo(a) ao sistema!");
        System.out.println("Digite o lado A do triângulo");
        triangulo.lado[0] = scanner.nextDouble();
        System.out.println("Digite o lado B do triângulo");
        triangulo.lado[1] = scanner.nextDouble();
        System.out.println("Digite o lado C do triângulo");
        triangulo.lado[2] = scanner.nextDouble();

        System.out.println(triangulo.verificarLados() ? "Os valores digitados formam um " + triangulo.verificarTipoDeTriangulo() : "Erro");
    }
}
