package org.academiadecodigo.cunnilinux.Keyboard;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridFactory {

    private int width = 0;
    private int height = 0;
    private int cols;
    private int rows;
    private final int CELLSIZE = 20;
    private final int PADDING = 10;
    private Rectangle[][] positions;


    public GridFactory(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        this.positions = new Rectangle[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                positions[i][j] = new Rectangle(PADDING+(i * CELLSIZE),PADDING+(j*CELLSIZE),CELLSIZE,CELLSIZE);
                positions[i][j].draw();
            }
        }
    }
}
