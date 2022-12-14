package Oef1;

import java.util.Arrays;

public class Array2Dim {

    private int[][]dubbeleInt=new int[3][3];

    public Array2Dim(int[][] dubbeleInt) {
        this.dubbeleInt = dubbeleInt;
    }

    public int[][] getDubbeleInt() {
        return dubbeleInt;
    }

    public void setDubbeleInt(int[][] dubbeleInt) {
        this.dubbeleInt = dubbeleInt;
    }

    @Override
    public String toString() {
        return "Array2Dim{" +
                "dubbeleInt=" + Arrays.toString(dubbeleInt) +
                '}';
    }
}
