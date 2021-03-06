package cn.edu.bupt.ch2.Buffer;

import javax.swing.*;
import java.awt.*;

/**
 * 无缓冲实现的画图
 * <p>
 * Created by FirenzesEagle on 2016/5/19 0019.
 * Email:liumingbo2008@gmail.com
 */
public class NoBufferMovingCircle extends JApplet implements Runnable {

    Image screenImage = null;
    Thread thread;
    int x = 5;
    int move = 1;

    public void init() {
        screenImage = createImage(230, 160);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run() {
        try {
            while (true) {
                x += move;
                if ((x > 105) || (x < 5))
                    move *= -1;
                repaint();
                Thread.sleep(10);
            }
        } catch (Exception e) {
        }
    }

    public void drawCircle(Graphics gc) {
        Graphics2D g = (Graphics2D) gc;
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 200, 100);
        g.setColor(Color.red);
        g.fillOval(x, 5, 90, 90);
    }

    public void paint(Graphics g) { //画一个圈
        g.setColor(Color.white);    //这里没有缓冲
        g.fillRect(0, 0, 200, 100);
        drawCircle(g);
    }

}
