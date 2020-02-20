import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.imageio.*;

public class Adventure extends JPanel implements ActionListener{
    Menu menu = new Menu();
    public static boolean parks = false;
    public static boolean restaurants = false;
    public static boolean schools = false;
    public Rectangle rButton = new Rectangle(10, 10, 100, 50);
    public Rectangle blueAgave = new Rectangle(Adventure.WIDTH / 2 + 130, 250, 210, 50);
    public Rectangle missionHills = new Rectangle(Adventure.WIDTH / 2 + 120, 250, 210, 50);
    public Rectangle tawny = new Rectangle(Adventure.WIDTH / 2 + 120, 350, 120, 50);
    public Rectangle Strizzis = new Rectangle(Adventure.WIDTH / 2 + 130, 350, 200, 50);
    public Rectangle park = new Rectangle(Adventure.WIDTH / 2 + 130, 250, 100, 50);
    public Rectangle rest = new Rectangle(Adventure.WIDTH / 2 + 130, 350, 200, 50);
    static JFrame frame = new JFrame("Choose Your Adventure");
    public static final int WIDTH = 450;
    public static final int HEIGHT = (WIDTH / 12) * 9;
    public static enum STATE{
        MENU,
        GAME
    };
    public static STATE State;
    public void actionPerformed(ActionEvent click) {
        Object source = click.getSource();

    }

    public Adventure() {
        this.addMouseListener(new MouseInput());
        setFocusable(true);
    }

    public void paint(Graphics g) {
        if (State == STATE.GAME && MouseInput.count == 1) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));
            g2d.drawString("You just strolled into the fantastic town of Pleasanton.", 100, 100);
            g2d.drawString("You can choose to visit a park, or restaurant.", 100, 150);
            g2d.drawString("Park", park.x + 19, park.y + 30);
            g2d.drawString("Restaurant", rest.x + 19, rest.y + 30);
            g2d.draw(park);
            g2d.draw(rest);

        }
        else if(State == STATE.GAME && MouseInput.count  == 2) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));

            g2d.drawString("Which park do you want to go to?", 100, 100);
            g2d.drawString("Tawny", tawny.x + 19, tawny.y + 30);
            g2d.drawString("Mission Hills", missionHills.x + 19, missionHills.y + 30);
            g2d.draw(tawny);
            g2d.draw(missionHills);
        }
        else if(State == STATE.GAME && MouseInput.count  == 3) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));

            g2d.drawString("What kind of food do you want?", 100, 100);
            g2d.drawString("Blue Agave", blueAgave.x + 19, blueAgave.y + 30);
            g2d.drawString("Strizzis", Strizzis.x + 19, Strizzis.y + 30);
            g2d.draw(blueAgave);
            g2d.draw(Strizzis);
        }
        else if(State == STATE.GAME && MouseInput.count  == 4) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));
            g2d.drawString("Congratulations! You get to see a fantastic park!", 100, 100);
                        g2d.drawString("Enjoy P-TOWN!", 100, 150);
        }
        else if(State == STATE.GAME && MouseInput.count == 5) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));
            g2d.drawString("Tawny is alright, but try visiting Mission!", 100, 100);
            g2d.drawString("Enjoy P-TOWN!", 100, 150);

        }
        else if(State == STATE.GAME && MouseInput.count == 6) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));
            g2d.drawString("I love mexican food!", 100, 100);
            g2d.drawString("Blue Agave is a great choice.", 100, 150);


            
            
            
        }
        else if(State == STATE.GAME && MouseInput.count == 7) {
            super.paint(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.GRAY);
            g2d.setFont(new Font("Arial", Font.BOLD, 30));
            g2d.drawString("I love Italian food!", 100, 100);
            g2d.drawString("Strizzi's is a great choice.", 100, 150);
        }
        else  {
            menu.render(g);
        }    

    }

    public static void main(String [] args) {
        Adventure adventure = new Adventure();
        frame.add(adventure);
        frame.setSize(WIDTH * 2,HEIGHT * 2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            adventure.repaint();

        }
    }

  
}