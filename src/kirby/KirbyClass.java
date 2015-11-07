/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirby;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;

/**
 *
 * @author Camille
 */
public class KirbyClass {

    public KirbyClass(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics graphics) {

        //rectangle outline
        graphics.drawRect(x, y, width, height);
        //Body
        graphics.setColor(new Color(245, 94, 177));
        graphics.fillOval(x, y, width * 5 / 6, height * 5 / 6);

        //arm 1
        graphics.setColor(new Color(236, 93, 178));
        graphics.fillOval(x + (width * 1 / 160), y + (height * 1 / 980), width * 3 / 13, height * 5 / 10);

        //arm 2
        graphics.setColor(new Color(236, 93, 178));
        graphics.fillOval(x + (width * 9 / 14), y + (height * 1 / 500), width * 3 / 13, height * 5 / 10);

        //foot 1
        graphics.setColor(new Color(220, 20, 60));
        graphics.fillOval(x + (width * 21 / 40), y + (height * 9 / 16), width * 7 / 26, height * 7 / 20);

        //Body over foot 1
        graphics.setColor(new Color(245, 94, 177));
        graphics.fillOval(x, y, width * 5 / 6, height * 5 / 6);

        //Eye 1
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 12 / 20), y + (height * 5 / 22), width * 1 / 13, height * 2 / 10);
        graphics.setColor(Color.blue);
        graphics.fillOval(x + (width * 49 / 80), y + (height * 7 / 22), width * 3 / 52, height * 4 / 40);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 49 / 80), y + (height * 10 / 44), width * 3 / 52, height * 3 / 40);

        //Eye 2
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 7 / 20), y + (height * 5 / 22), width * 1 / 13, height * 2 / 10);
        graphics.setColor(Color.blue);
        graphics.fillOval(x + (width * 29 / 80), y + (height * 7 / 22), width * 3 / 52, height * 4 / 40);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x + (width * 29 / 80), y + (height * 10 / 44), width * 3 / 52, height * 3 / 40);

        //Mouth
        graphics.setColor(Color.black);
        graphics.fillArc(x + (width * 38 / 100), y + (height * 29 / 100), width * 27 / 100, height * 33 / 100, 180, 180);
        graphics.setColor(new Color(230, 51, 70));
        graphics.fillOval(x + (width * 5 / 12), y + (height * 11 / 24), width * 3 / 15, height * 15 / 96);

        //Blushes
        graphics.setColor(new Color(255, 20, 147, 170));
        graphics.fillOval(x + (width * 3 / 12), y + (height * 10 / 24), width * 3 / 30, height * 1 / 20);
        graphics.fillOval(x + (width * 8 / 12), y + (height * 10 / 24), width * 3 / 30, height * 1 / 20);

        //Cupcake
        graphics.setColor(new Color(0, 191, 255));
        graphics.fillRoundRect(x + (width * 17 / 20), y + (height * 13 / 24), width * 1 / 10, height * 1 / 10, 10, 10);
        graphics.setColor(new Color(245, 5, 250));
        graphics.fillOval(x + (width * 133 / 160), y + (height * 25 / 48), width * 11 / 80, height * 3 / 40);
        graphics.setColor(Color.orange);
        graphics.fillRect(x + (width * 71 / 80), y + (height * 11 / 24), width * 1 / 40, height * 1 / 10);
        graphics.setColor(new Color(255, 69, 0));
        graphics.fillOval(x + (width * 71 / 80), y + (height * 10 / 24), width * 1 / 40, height * 3 / 60);
        
        //Message
        //graphics.setColor(Color.green);
        //graphics.drawString("Happy Birthday!", x +(width *1/3), y + (height * 19/20));
        
        //Sparkles
        int[] xValues = new int[9];
        xValues[0] = (x + (width * 90/100));
        xValues[1] = (x + (width * 93/100));
        xValues[2] = (x + (width * 95/100));
        xValues[3] = (x + (width * 97/100));
        xValues[4] = (x + (width * 100/100));
        xValues[5] = (x + (width * 97/100));
        xValues[6] = (x + (width * 95/100));
        xValues[7] = (x + (width * 93/100));
        xValues[8] = (x + (width * 90/100));
        
        int[] yValues = new int [9];
        yValues[0] = (y + (height * 5/100));
        yValues[1] = (y + (height * 7/100));
        yValues[2] = (y + (height * 10/100));
        yValues[3] = (y + (height * 7/100));
        yValues[4] = (y + (height * 5/100));
        yValues[5] = (y + (height * 3/100));
        yValues[6] = (y + (height * 0/100));
        yValues[7] = (y + (height * 3/100));
        yValues[8] = (y + (height * 5/100));
        
        
        if (Math.random() > .5){
            graphics.setColor(Color.yellow);
        } else {
            graphics.setColor(Color.orange);
        }
        graphics.fillPolygon(xValues, yValues, 9);
        
        int[] xPoints = new int[9];
        xPoints[0] = (x + (width * 80/100));
        xPoints[1] = (x + (width * 83/100));
        xPoints[2] = (x + (width * 85/100));
        xPoints[3] = (x + (width * 87/100));
        xPoints[4] = (x + (width * 90/100));
        xPoints[5] = (x + (width * 87/100));
        xPoints[6] = (x + (width * 85/100));
        xPoints[7] = (x + (width * 83/100));
        xPoints[8] = (x + (width * 80/100));
        
        int[] yPoints = new int [9];
        yPoints[0] = (y + (height * 15/100));
        yPoints[1] = (y + (height * 17/100));
        yPoints[2] = (y + (height * 20/100));
        yPoints[3] = (y + (height * 17/100));
        yPoints[4] = (y + (height * 15/100));
        yPoints[5] = (y + (height * 13/100));
        yPoints[6] = (y + (height * 10/100));
        yPoints[7] = (y + (height * 13/100));
        yPoints[8] = (y + (height * 15/100));
        
        if (Math.random() > .5){
            graphics.setColor(Color.blue);
        } else {
            graphics.setColor(Color.GREEN);
        }
        graphics.fillPolygon(xPoints, yPoints, 9);     
        
        
        int[] xThings = new int[9];
        xThings[0] = (x + (width * 90/100));
        xThings[1] = (x + (width * 93/100));
        xThings[2] = (x + (width * 95/100));
        xThings[3] = (x + (width * 97/100));
        xThings[4] = (x + (width * 100/100));
        xThings[5] = (x + (width * 97/100));
        xThings[6] = (x + (width * 95/100));
        xThings[7] = (x + (width * 93/100));
        xThings[8] = (x + (width * 90/100));
        
        int[] yThings = new int [9];
        yThings[0] = (y + (height * 20/100));
        yThings[1] = (y + (height * 22/100));
        yThings[2] = (y + (height * 25/100));
        yThings[3] = (y + (height * 22/100));
        yThings[4] = (y + (height * 20/100));
        yThings[5] = (y + (height * 18/100));
        yThings[6] = (y + (height * 15/100));
        yThings[7] = (y + (height * 18/100));
        yThings[8] = (y + (height * 20/100));        
        
        if (Math.random() > .5){
            graphics.setColor(Color.yellow);
        } else {
            graphics.setColor(Color.GREEN);
        }
        graphics.fillPolygon(xThings, yThings, 9);
    
        
        
        //foot 2 over body Leave this last it has a rotation!
        graphics.setColor(new Color(220, 20, 60));
        //Graphics2D g2D = (Graphics2D) graphics;
        //g2D.rotate(Math.toRadians(4 * Math.PI / 2));
        graphics.fillOval(x + (width * 1 / 18), y + (height * 9 / 16), width * 7 / 26, height * 7 / 20);


    }
    private int x;
    private int y;
    private int width;
    private int height;

}
