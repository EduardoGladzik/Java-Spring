package model;
import model.Triangulo;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 09/04/2020 17:05
 */
class TrianguloTest {

    Triangulo triangulo = new Triangulo();

    public TrianguloTest() {
        triangulo.lado[0] = 10;
        triangulo.lado[1] = 7;
        triangulo.lado[2] = 7;
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void verificarLados() {
        assertEquals(true, triangulo.verificarLados());
    }

    @org.junit.jupiter.api.Test
    void verificarTipoDeTriangulo() {
        assertEquals("Triângulo isósceles", triangulo.verificarTipoDeTriangulo());
        triangulo.lado[0] = 10;
        triangulo.lado[1] = 9;
        triangulo.lado[2] = 8;
        assertEquals("Triângulo escaleno", triangulo.verificarTipoDeTriangulo());
        triangulo.lado[0] = 7;
        triangulo.lado[1] = 7;
        triangulo.lado[2] = 7;
        assertEquals("Triângulo equilatero", triangulo.verificarTipoDeTriangulo());
    }
}