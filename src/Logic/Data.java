/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Michael
 */
public class Data {

    private int x;
    private int z;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Data{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }

    public Data(int x, int y, int z) {
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public int[] toArray() {
        int[] a = {x, y, z};
        return a;

    }
}
