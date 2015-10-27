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
   
    public KirbyClass(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
   public void draw(Graphics graphics) {
       graphics.drawRect(x, y, width, height);
       //Body
       graphics.setColor(new Color (245, 94, 177));
       graphics.fillOval(x, y, width * 5/6, height * 5/6);
       
       //arm 1
       graphics.setColor(new Color (236, 93, 178));
       graphics.fillOval(x + (width * 1/160), y + (height * 1/980), width * 3/13, height * 5/10);

       //arm 2
       graphics.setColor(new Color (236, 93, 178));
       graphics.fillOval(x + (width * 9/14), y + (height * 1/500), width * 3/13, height * 5/10);
       
       //foot 1
       graphics.setColor(new Color(220,20,60));
       graphics.fillOval(x + (width * 21/40), y + (height * 8 / 16),width * 4/13, height * 4/10);
       
       //Body over foot 1
       graphics.setColor(new Color (245, 94, 177));
       graphics.fillOval(x, y, width * 5/6, height * 5/6);
 
       //Eye 1
       graphics.setColor(Color.black);
       graphics.fillOval(x + (width * 12/20), y + (height * 5/22), width * 1/13, height * 2/10);
       graphics.setColor(Color.blue);
       graphics.fillOval(x + (width * 49/80), y + (height * 7/22), width * 3/52, height * 4/40);
       graphics.setColor(Color.WHITE);
       graphics.fillOval(x + (width *49/80), y + (height * 10/44), width * 3/52, height * 3/40);
       
       //Eye 2
       graphics.setColor(Color.black);
       graphics.fillOval(x + (width * 7/20), y + (height *5/22), width * 1/13, height * 2/10);
       graphics.setColor(Color.blue);
       graphics.fillOval(x + (width * 29/80), y + (height * 7/22), width * 3/52, height * 4/40);
       graphics.setColor(Color.WHITE);       
       graphics.fillOval(x + (width *29/80), y + (height * 10/44), width * 3/52, height * 3/40);
       
      
       
       
       //foot 2 over body
       graphics.setColor(new Color(220,20,60));
       Graphics2D g2D2 = (Graphics2D)graphics;
       g2D2.rotate(Math.toRadians(4 * Math.PI / 2));
       graphics.fillOval(x + (width * 1/9), y + (height * 7/ 16), width * 4/13, height * 4/10);
       

       
       
   }
      private int x;
      private int y;
      private int width;
      private int height;
    
}
