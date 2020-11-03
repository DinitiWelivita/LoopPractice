package looppractice;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 802967
 */
public class LoopPractice extends JPanel implements KeyListener, MouseListener {
    
    private Timer timer;
    private int frameCount = 0;
    
    public LoopPractice() {
        timer = new Timer();
        //timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/12);
    }
    
     @Override
     /**
      * This controls what shows up on the screen and what happens
      * @param g paint brush of the canvas
      */
     public void paintComponent(Graphics g) {
        super.paintComponent(g);
        frameCount++;   
       
        this.setBackground(Color.CYAN);
        
        g.setColor(Color.RED);
       // g.fillOval(10,10,100,200);
        
        //CODE GOES HERE!
        
        for (int y = 0; y<400; y+=50) {
            //this is slower
            g.drawLine (0,y,400,y);
            if (y==200) continue;
            for (int x = 0; x<400;x +=50) {
               //this is faster
               if (x==50) continue;
                g.fillOval(x,y,50,50);
            }
            
            for (int i=0; i<10; i++) {
                if (i<3 && i>7) continue;
                for (int j=0; j<10; j++) {
                    if (j%2==1) continue;
                     g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
                   g.fillRect(j*50, i*50, 50, 50);
                }
            }
            
            
        }
        
       /* for (int i=0; i<50; i++) {
            int x = i*50;
            int y = i*50;
            g.fillOval(x,y, 50, 50);
        }
        
        
        
        int number = 1;
        while (number <= 20) {
            System.out.println(number);
            number++; //number+=1
        }
       
        number = 7;
        int count = 0;
        while (number <= 500) {
            System.out.println(number);
            number+=7; //number+=1
            count++;
        }
        
        System.out.println(count);
        
        int numberhello = 1;
        while (numberhello <= 5) {
            System.out.println("hello");
            numberhello++; //numberhello+=1
        }
        
         count = 0;
         int x = 10;
         int y = 10;  
         int size = 10;
        while (count<100000) {
            g.setColor(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
            g.fillOval(x, y, size, size);
            count++;
            x+=10;
            if (x>=500) {
                y+=10;
                x=0;
            }
            
        }
      */  
    }
     
    private class ScheduleTask extends TimerTask {

        @Override
        public void run() {
            repaint();
        }
    }
    
    
    
    
    public static void main(String[] args) {
        JFrame j = new JFrame();
        Container c = new LoopPractice();        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension size = new Dimension(800,800);
        j.setSize(size);
        c.setSize(size);
        j.setPreferredSize(size);
        c.setPreferredSize(size);
        j.setMinimumSize(size);
        c.setMinimumSize(size);
        j.getContentPane().add(c);
        j.pack();        
        j.setLocationRelativeTo(null);
        j.addKeyListener((KeyListener) c);
        j.addMouseListener((MouseListener) c);
        j.setVisible(true);
    }
    
     @Override
    public void keyPressed(KeyEvent e) {
        //System.out.printf("\nKeyCode: %d was pressed",e.getKeyCode());
    }
    
     @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.printf("\nMouse Clicked at (%d,%d)",e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}