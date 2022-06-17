package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.cunnilinux.Game.Game;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Handler implements KeyboardHandler {
    private Keyboard keyboard;
    private Game game;
    private Pointer pointer;

    public void setPointer(Pointer pointer){
        this.pointer = pointer;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_DOWN:
                pointer.moveDOWN();
                System.out.println("PRESSING DOWN!");
                break;
            case KeyboardEvent.KEY_LEFT:
                pointer.moveLEFT();
                System.out.println("PRESSING LEFT!");
                break;
            case KeyboardEvent.KEY_UP:
                pointer.moveUP();
                System.out.println("PRESSING UP!");
                break;
            case KeyboardEvent.KEY_RIGHT:
                pointer.moveRIGHT();
                System.out.println("PRESSING RIGHT!");
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
