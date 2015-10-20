/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirby;

import java.awt.Graphics;

/**
 *
 * @author Camille
 */
public class KirbyClass {
   
    public KirbyClass(int x, int y){
        this.x = x;
        this.y = y;
    }
   public void draw(Graphics graphics) {
       graphics.drawRect(x, y, 200, 200);
   }
      private int x;
      private int y;
    
}
