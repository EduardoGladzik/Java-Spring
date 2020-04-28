package model;

import interfaces.TrianguloInterface;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 09/04/2020 16:23
 */
public class Triangulo implements TrianguloInterface {

    public double[] lado = new double[3];

    public Triangulo() {
    }

    /**
     * @return Varifica se os valores digitados pelo usuário podem ou não formar um triângulo.
     */
    public boolean verificarLados() {
        if(this.lado[0] > this.lado[1] + this.lado[2] || this.lado[1] > this.lado[0] + this.lado[2] || this.lado[2] > this.lado[1] + this.lado[0])
            return false;
        else
            return true;
    }

    /**
     * @method Verifica o tipo de triângulo com base nos valores dos lados que o usuário digitou.
     * @return Retorna o tipo de triângulo.
     */
    public String verificarTipoDeTriangulo() {
        if ((this.lado[0] == this.lado[1] && this.lado[0] != this.lado[2]) || (this.lado[0] == this.lado[2] && this.lado[0] != this.lado[1]) || (this.lado[1] == this.lado[2] && this.lado[1] != this.lado[0]))
            return "Triângulo isósceles";
        else if (this.lado[0] != this.lado[1] && this.lado[0] != this.lado[2] && this.lado[1] != this.lado[2])
            return "Triângulo escaleno";
        else if (this.lado[0] == this.lado[1] && this.lado[1] == this.lado[2])
            return "Triângulo equilatero";
        else
            return "Os valores digitados não combinam com nenhum dos triãngulos possiveis";
    }
}
