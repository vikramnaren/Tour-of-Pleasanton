import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Menu extends Frame{
    public Rectangle playButton = new Rectangle(Adventure.WIDTH / 2 + 130, 250, 100, 50);
    public Rectangle quitButton = new Rectangle(Adventure.WIDTH / 2 + 130, 350, 100, 50);
    public Menu() {
    }
    public void render(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        Font fnt0 = new Font("arial", Font.BOLD, 45);
        g.setFont(fnt0);
        g.setColor(Color.black);
        g.drawString("Choose Your Own Adventure:", 100, 100);
        g.drawString("Pleasanton Edition", 200, 150);
        Font fnt1 = new Font("arial", Font.BOLD, 30);
        g.setFont(fnt1);
        g.drawString("Play", playButton.x + 19, playButton.y + 30);
        g2d.draw(playButton);
        g.drawString("Quit", quitButton.x + 19, quitButton.y + 30);
        g2d.draw(quitButton);

    }
}
