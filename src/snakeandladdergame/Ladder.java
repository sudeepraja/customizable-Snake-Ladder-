
package snakeandladdergame;

/**
 *
 * @author sudeepraja
 */
public class Ladder extends Transpoter{
    
     public Ladder(int mouth,int tail)
    {
        super(mouth,tail);
    }
    public void climb(Player p)
    {
        if(p.getPosition()==this.tail)
        {
            p.setPosition(this.mouth);
        }
    }   
}
