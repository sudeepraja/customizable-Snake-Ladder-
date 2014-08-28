
package snakeandladdergame;

/**
 *
 * @author sudeepraja
 */
public class Snake extends Transpoter{
    
    public Snake(int mouth,int tail)
    {
        super(mouth,tail);
    }
    public void eat(Player p)
    {
        if(p.getPosition()==this.mouth)
        {
            p.setPosition(this.tail);
        }
    }
}
