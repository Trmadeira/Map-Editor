package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Pointer {
    private Rectangle pointer;
    private final int CELLSIZE = 20;
    private final int PADDING = 10;

    public Pointer(){
        this.pointer = new Rectangle(PADDING,PADDING,CELLSIZE,CELLSIZE);
        this.pointer.fill();
    }
    public Rectangle getPointer(){
        return pointer;
    }

    public void moveUP(){
        getPointer().translate(0,-10);
    }

    public void moveDOWN(){
        getPointer().translate(0,10);
    }

    public void moveLEFT(){
        getPointer().translate(-10,0);
    }

    public void moveRIGHT(){
        getPointer().translate(10,0);
    }
}
