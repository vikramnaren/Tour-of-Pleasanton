import java.awt.event.*;
public class MouseInput implements MouseListener
{   public static int count = 0;
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();
        if (Adventure.State != Adventure.STATE.GAME) {
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 250 && my <= 300)

            {
              
              Adventure.State = Adventure.STATE.GAME;
              count = 1;
            }

        }
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 350 && my <= 400)
          
            {
                System.exit(0);
                
            }

        }
    }
    else if (count == 1) { //restaurant or park
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 250 && my <= 300)

            {
                Adventure.State = Adventure.STATE.GAME;
                count = 2;


            }

        }
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 350 && my <= 400)
          
            {
                Adventure.State = Adventure.STATE.GAME;
                count = 3;

            }

        }
    }
    else if(count == 2) {
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 250 && my <= 300)

            {
                Adventure.State = Adventure.STATE.GAME;
                count = 4; //mission
            }

        }
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 350 && my <= 400)
          
            {
                Adventure.State = Adventure.STATE.GAME;
                count = 5; //tawny
            }

        }
    else if(count == 3) {
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 250 && my <= 300)

            {
                Adventure.State = Adventure.STATE.GAME;
                count = 6; //mission
            }

        }
        if (mx >= Adventure.WIDTH / 2 + 120 && mx <= Adventure.WIDTH / 2 + 220) {
            if (my >= 350 && my <= 400)
          
            {
                Adventure.State = Adventure.STATE.GAME;
                count = 7; //tawny
            }

        }
        
        
    }
    }
}
    @Override
    public void mouseReleased(MouseEvent e) {}
}
