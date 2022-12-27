/**
 *Lauren Lira - lllira1048
 *CIT 4423 01
 *Nov 20,2022
 *Windows 11
 */


import javax.swing.JFrame;


public class GUI extends JFrame {

    MyPanel panel = new MyPanel();//Instantiates object

    public GUI() {/*Calls panel and adds it to JFrame, sets JFrame to visible and
        allows it to exit on close. Key listener established.*/
        this.add(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addKeyListener(panel);
        this.pack();
    }

}//End of class GUU
