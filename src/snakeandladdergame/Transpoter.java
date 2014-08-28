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
public class Transpoter {
    protected int mouth;
    protected int tail;
    
    public Transpoter(int mouth,int tail){
        if(mouth>tail){
            this.mouth=mouth;
            this.tail=tail;
        }
        else if(mouth<tail){
            this.mouth=tail;
            this.tail=mouth;
        }
    }
    
}
