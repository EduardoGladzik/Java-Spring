package gladzik.eduardo.Maven.example.model;

import gladzik.eduardo.Maven.example.interfaces.TriangleInterface;

/**
 * @author Eduardo Gladzik
 * @version 1.0
 * @since 15/04/2020 17:58
 */
public class Triangle implements TriangleInterface {

    public double[] side = new double[3];

    public Triangle() {
    }

    /**
     * @return checks whether the values ​​entered by the user can form a triangle
     */
    @Override
    public boolean checkSides() {
        if(this.side[0] > this.side[1] + this.side[2] || this.side[1] > this.side[0] + this.side[2] || this.side[2] > this.side[1] + this.side[0])
            return false;
        else
            return true;
    }

    /**
     * @return Returns the type of the triangle based on the values entered by the user
     */
    @Override
    public String checkTriangleType() {
        if ((this.side[0] == this.side[1] && this.side[0] != this.side[2]) || (this.side[0] == this.side[2] && this.side[0] != this.side[1]) || (this.side[1] == this.side[2] && this.side[1] != this.side[0]))
            return "Isosceles triangle";
        else if (this.side[0] != this.side[1] && this.side[0] != this.side[2] && this.side[1] != this.side[2])
            return "Scalene triangle";
        else if (this.side[0] == this.side[1] && this.side[1] == this.side[2])
            return "Equilateral triangle";
        else
            return "The entered values don't correspond to any triangle";
    }
}
