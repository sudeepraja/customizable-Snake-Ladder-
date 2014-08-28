/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snakeandladdergame;

/**
 *
 * @author sudeepraja
 */
public class Dice {
    public static int Roll(){
        return ((int)(Math.random()*109987))%6 + 1;
    }
}
