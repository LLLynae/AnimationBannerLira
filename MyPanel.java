/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Nov 20,2022
 *Windows 11
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyPanel extends JPanel implements ActionListener, KeyListener {

    int imageWidth = 200;
    int imageHeight = 100;
    Image textBanner = new ImageIcon("JavaText.png").getImage().getScaledInstance(imageWidth, imageHeight,
            Image.SCALE_SMOOTH);
    Timer timer;
    int x = 0;
    int y;
    int cycles = 0;

    int xVelocity = 1;

    public MyPanel() {/*Sets up JPanel and its attributes, Constructor */
        this.setPreferredSize(new Dimension(800, 800));
        this.setBackground(Color.BLACK);
        this.y = (this.getHeight() / 2) - (this.imageHeight / 2);
        timer = new Timer(1, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {/*Overrides the actionperformed method
        and replaces it with the mathematical properties of the animation*/
        if (this.x == this.getWidth() + 5) {
            this.x = (this.imageWidth + 5) * -1;
        }
        this.x += this.xVelocity;
        this.y = (this.getHeight() / 2) - (this.imageHeight / 2);
        repaint();
        cycles++;
    }

    @Override
    public void paint(Graphics g) {/*Overrides the paint method and replaces it with
        graphics2D cast*/
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(textBanner, x, y, null);
        g2d.dispose();
    }

    @Override
    public void keyTyped(KeyEvent e) {/*Needed for implementation */
        // this is filler

    }

    @Override
    public void keyPressed(KeyEvent e) {/*Stops timer when key is pressed*/
        timer.stop();
    }

    @Override
    public void keyReleased(KeyEvent e) {/*Shows dialog box after animation is stopped upon key press */
        String message = String.format("The %s key was pressed and the animation lasted %s miliseconds.",
                e.getKeyChar(), (timer.getDelay() * cycles));
        JOptionPane.showMessageDialog(this, message);
        System.exit(0);
    }
}//End of class MyPanel
