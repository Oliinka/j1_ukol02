package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        //TODO Tady bude kód pro kreslení želví grafiky.


        //MOVE TO SPECIFIC COORDINATES
        zofka.setX(200);
        zofka.setY(100);

        //ICECREAM
        zofka.turnLeft(180);
        drawTriangle(150, 80, Color.CYAN);
        zofka.turnRight(90);
        zofka.move(80);
        zofka.turnRight(90);
        drawCircle(40, Color.PINK);

        //MOVE TO SPECIFIC COORDINATES
        zofka.setX(350);
        zofka.setY(50);

        //SNOWMAN
        drawSnowmanBody(40, Color.BLUE);
        zofka.move(40 + 20 + (40 + 40) * 2);
        zofka.turnLeft(90);
        zofka.move(40 + 20 + 20 + 20);
        zofka.turnRight(90);
        drawCircle(20, Color.BLUE);
        zofka.turnRight(90);
        zofka.move(20 * 2 + (40 + 20) * 2);
        zofka.turnLeft(90);
        drawCircle(20, Color.BLUE);

        //MOVE TO SPECIFIC COORDINATES
        zofka.setX(600);
        zofka.setY(300);

        //TRAIN
        drawTrain();

    }

    public void drawRectangle(int sideA, int sideB, Color color) {
        zofka.setPenColor(color);
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(sideA);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
            zofka.turnRight(90);
            zofka.move(sideB);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
            zofka.turnRight(90);

        }// Turn left by 90 degrees to create the square shape
        zofka.penUp();
    }

    //FULLY AWARE THAT THIS METHOD IS UNUSED, JUST THINK I MIGHT NEED IT FOR THE NEXT HOMEWORKS
    public void drawEquilateralTriangle(float sideA, Color color) {
        zofka.setPenColor(color);
        zofka.penDown();
        zofka.turnRight(90);
        for (int i = 0; i < 3; i++) {
            zofka.move(sideA);
            zofka.turnLeft(120);
        }
        zofka.turnLeft(90);
    }

    public void drawTriangle(float height, float base, Color color) {
        zofka.setPenColor(color);
        zofka.penDown();
        zofka.turnRight(90);
        zofka.move(base);
        double angle = Math.atan2(base / 2, height);
        zofka.turnLeft(90 + Math.toDegrees(angle));
        zofka.move(Math.hypot(base / 2, height));
        zofka.turnLeft(180 - 2 * Math.toDegrees(angle));
        zofka.move(Math.hypot(base / 2, height));
        zofka.penUp();
        zofka.turnRight(180 - Math.toDegrees(angle));
    }


    public void drawCircle(int pericular, Color color) {
        zofka.penDown();
        for (int i = 0; i < 360; i++) {
            zofka.setPenColor(color);
            zofka.move(2 * Math.PI * pericular / 360);
            zofka.turnRight(1);
        }
        zofka.penUp();
    }

    public void drawSnowmanBody(int pericular, Color color) {
        zofka.penUp();
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(180);
            zofka.move(pericular + i * 20);
            zofka.turnRight(90);
            zofka.move(pericular + i * 20);
            zofka.turnRight(90);
            zofka.penDown();
            drawCircle(pericular + i * 20, color);
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(pericular + i * 20);
            zofka.turnRight(90);
            zofka.move(pericular + i * 20);
            zofka.turnRight(180);
        }
    }

    //TRAIN
    public void drawTrain() {
        drawRectangle(120, 250, Color.MAGENTA);
        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnLeft(90);
        drawRectangle(200, 160, Color.BLACK);
        drawCircle(80, Color.BLACK);
        zofka.turnLeft(90);
        zofka.move(90);
        zofka.turnLeft(180);
        drawCircle(40, Color.BLACK);
        zofka.turnLeft(180);
        zofka.move(40 + 30);
        zofka.turnLeft(90);
        zofka.move(40);
        drawCircle(40, Color.BLACK);
        zofka.turnRight(90);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.turnLeft(180);
        drawTriangle(80, 160, Color.MAGENTA);
        zofka.turnRight(45);
        zofka.turnRight(180);
    }
}

