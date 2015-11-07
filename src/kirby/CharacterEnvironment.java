/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirby;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Camille
 */
class CharacterEnvironment extends Environment {
    private KirbyClass bro, yo;
   

    public CharacterEnvironment() {
        //bro = new KirbyClass(300, 100, 400, 400);
        this.setBackground(Color.white);
        yo = new KirbyClass(200, 200, 200, 200);
    }

    @Override
    public void initializeEnvironment() {

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (bro != null) {
            bro.draw(graphics);
        }
        if (yo != null) {
            yo.draw(graphics);
        }
    }
    
}
