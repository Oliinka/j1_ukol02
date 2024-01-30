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

        nakresliRovnoramennyTrojuhelnik(200,45,Color.BLACK);


        nakresliKolecko(200);
        zofka.turnRight(90);
        zofka.move(200);
        nakresliCtverecek(200, Color.blue);
        nakresliObdelnik(200,300,Color.RED);
        nakresliRonostrannyTrojuhelnik(100,Color.GRAY);
    }

    public void nakresliCtverecek(int stranaA, Color barva) {
        stranaA=stranaA;
        zofka.setPenColor(barva);
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
            zofka.move(stranaA);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
            zofka.turnRight(90);
        }// Turn left by 90 degrees to create the square shape
        zofka.penUp();
    }
    public void nakresliObdelnik(int stranaA, int stranaB, Color barva) {
        stranaA=stranaA;
        stranaB=stranaB;
        zofka.setPenColor(barva);
        zofka.penDown();
        for (int i = 0; i < 2; i++) {
            zofka.move(stranaA);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
            zofka.turnRight(90);
            zofka.move(stranaB);    // Move forward by 100 units (assuming 'zofka' is an instance of a turtle)
            zofka.turnRight(90);

        }// Turn left by 90 degrees to create the square shape
        zofka.penUp();
    }
    public void nakresliRonostrannyTrojuhelnik(float stranaA, Color barva) {
        stranaA = stranaA;
        barva = barva;
        zofka.setPenColor(barva);
        zofka.penDown();
        zofka.turnRight(90);
        for (int i = 0; i < 3; i++) {
            zofka.move(stranaA);
            zofka.turnLeft(120);
        }
        zofka.turnLeft(90);
    }

    public void nakresliRovnoramennyTrojuhelnik(float stranaA,float uhel, Color barva) {
        stranaA = stranaA;
        barva = barva;
        zofka.setPenColor(barva);
        zofka.turnRight(uhel);
        zofka.penDown();
        zofka.move(stranaA);
        zofka.turnRight(uhel+45);
        zofka.move(stranaA);
        zofka.turnLeft(-uhel-90);
        zofka.move(Math.sqrt(2*stranaA*stranaA));
        zofka.turnRight(90);

    }

        public void nakresliKolecko(int polomer) {
            polomer = polomer ;
            zofka.penDown();
            for (int i = 0; i < 360; i++) {
                zofka.setPenColor(Color.black);
                zofka.move(2 * Math.PI * polomer / 360);
                zofka.turnRight(1);
            }
            zofka.penUp();
        }

    }

