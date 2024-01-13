package application;

import structure.PongFrame;

public class Program {

    public static void main(String[] args){
        System.out.println("I'm alive");
        PongFrame pongFrame = new PongFrame();
        pongFrame.pongFrameInitializer();
    }

}
