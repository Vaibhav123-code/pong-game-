import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends Rectangle {
    int id;
    int yVelocity;
    int speed =10;
    Paddle(int x,int y,int paddle_Width,int paddle_Height,int id)
    {
        super(x,y,paddle_Width,paddle_Height);
        this.id = id;
    }

    public void draw(Graphics g)
    {
       if(id ==1)
       {
         g.setColor(Color.blue);
       }else {
        g.setColor(Color.red);
       }
       g.fillRect(x, y, width, height);
    }

    public void keyPressed(KeyEvent e)
    {
        switch(id)
        {
            case 1:

            if(e.getKeyCode()==KeyEvent.VK_W)
            {
                setYDirection(-speed);
            }
            if(e.getKeyCode()== KeyEvent.VK_S)
            {
                setYDirection(speed);
            }
            break;
            case 2:

            if(e.getKeyCode()==KeyEvent.VK_UP)
            {
                setYDirection(-speed);
            }
            if(e.getKeyCode()== KeyEvent.VK_DOWN)
            {
                setYDirection(speed);
            }
            break;
        }
    }

    public void keyReleased(KeyEvent e)
    {
        switch(id)
        {
            case 1:

            if(e.getKeyCode()==KeyEvent.VK_W)
            {
                setYDirection(0);
            }
            if(e.getKeyCode()== KeyEvent.VK_S)
            {
                setYDirection(0);
            }
            break;
            case 2:

            if(e.getKeyCode()==KeyEvent.VK_UP)
            {
                setYDirection(0);
            }
            if(e.getKeyCode()== KeyEvent.VK_DOWN)
            {
                setYDirection(0);
            }
            break;
        }
    }

    private void setYDirection(int i) {
        yVelocity = i;
    }

    public void move()
    {
        y = y + yVelocity;
    }
}
