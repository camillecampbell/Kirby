/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kirby;

import environment.ApplicationStarter;

/**
 *
 * @author Camille
 */
public class Kirby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ApplicationStarter.run("Kirby", new CharacterEnvironment());
    }
    
}
