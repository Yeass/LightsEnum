package com.company;

enum TrafficLight{
    RED,YELLOW,GREEN
}

class Simulator{
    TrafficLight tl = TrafficLight.RED;

    public void changeColor() {
        try {
            switch (tl) {
                case RED:
                    Thread.sleep(700);
                    tl = TrafficLight.GREEN;
                    break;
                case YELLOW:
                    Thread.sleep(500);
                    tl = TrafficLight.RED;
                    break;
                case GREEN:
                    Thread.sleep(300);
                    tl = TrafficLight.YELLOW;
                    break;
            }
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public String toString(){return " " + tl;}
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Simulator tl1 = new Simulator();
        for(int i = 0; i < 9; i++){
            System.out.println(tl1);
            tl1.changeColor();
        }
    }
}
