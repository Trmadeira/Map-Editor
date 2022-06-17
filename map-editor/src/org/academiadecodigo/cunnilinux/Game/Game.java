package org.academiadecodigo.cunnilinux.Game;

import org.academiadecodigo.cunnilinux.Keyboard.GridFactory;
import org.academiadecodigo.cunnilinux.Pointer;

public class Game {
    private GridFactory grid;
    private Pointer pointer;
    public Game(int cols, int rows){
        this.grid = new GridFactory(30,30);
        this.pointer = new Pointer();



    }
}
