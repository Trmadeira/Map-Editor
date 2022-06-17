package org.academiadecodigo.cunnilinux;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class MyKeyboard {
    Pointer pointer;

    Handler handler = new Handler();
    KeyboardEvent pointerUp = new KeyboardEvent();
    KeyboardEvent saveButton = new KeyboardEvent();
    KeyboardEvent loadButton = new KeyboardEvent();
    KeyboardEvent pointerDown = new KeyboardEvent();
    KeyboardEvent pointerLeft = new KeyboardEvent();
    KeyboardEvent pointerRight = new KeyboardEvent();
    KeyboardEvent pointerSpace = new KeyboardEvent();
    Keyboard keyboard = new Keyboard(handler);

    public MyKeyboard() {
        this.pointer = pointer;
    }

    public void pointerKeyboard(){
        handler.setPointer(pointer);

        pointerUp.setKey(KeyboardEvent.KEY_UP);
        pointerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerUp);

        pointerDown.setKey(KeyboardEvent.KEY_DOWN);
        pointerDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerDown);

        pointerUp.setKey(KeyboardEvent.KEY_UP);
        pointerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerUp);

        pointerUp.setKey(KeyboardEvent.KEY_UP);
        pointerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerUp);

        pointerUp.setKey(KeyboardEvent.KEY_UP);
        pointerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerUp);

        pointerUp.setKey(KeyboardEvent.KEY_UP);
        pointerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerUp);

        pointerUp.setKey(KeyboardEvent.KEY_UP);
        pointerUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(pointerUp);

    }

}
