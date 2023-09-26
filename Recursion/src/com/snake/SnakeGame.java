package com.snake;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SnakeGame extends JPanel implements ActionListener {
    private final int TILE_SIZE = 20;
    private final int WIDTH = 30;
    private final int HEIGHT = 20;
    private final int GAME_SPEED = 140;

    private ArrayList<Point> snake;
    private Point apple;
    private int direction;
    private boolean inGame;
    private Timer timer;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH * TILE_SIZE, HEIGHT * TILE_SIZE));
        setBackground(Color.black);
        setFocusable(true);
        initGame();
        initGameBoard();
    }

    private void initGame() {
        snake = new ArrayList<>();
        snake.add(new Point(5, 5));
        apple = new Point(10, 10);
        direction = KeyEvent.VK_RIGHT;
        inGame = true;

        timer = new Timer(GAME_SPEED, this);
        timer.start();
    }

    private void initGameBoard() {
        addKeyListener(new TAdapter());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            move();
            checkCollision();
            repaint();
        }
    }

    private void move() {
        int headX = snake.get(0).x;
        int headY = snake.get(0).y;

        switch (direction) {
            case KeyEvent.VK_LEFT:
                headX -= 1;
                break;
            case KeyEvent.VK_RIGHT:
                headX += 1;
                break;
            case KeyEvent.VK_UP:
                headY -= 1;
                break;
            case KeyEvent.VK_DOWN:
                headY += 1;
                break;
        }

        snake.add(0, new Point(headX, headY));

        if (headX == apple.x && headY == apple.y) {
            // Snake ate the apple
            generateApple();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    private void generateApple() {
        int randX, randY;
        do {
            randX = (int) (Math.random() * WIDTH);
            randY = (int) (Math.random() * HEIGHT);
        } while (snake.contains(new Point(randX, randY)));

        apple.setLocation(randX, randY);
    }

    private void checkCollision() {
        Point head = snake.get(0);

        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT) {
            inGame = false;
        }

        if (snake.indexOf(head) != 0) {
            inGame = false;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    private void draw(Graphics g) {
        if (inGame) {
            g.setColor(Color.green);
            for (Point p : snake) {
                g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }

            g.setColor(Color.red);
            g.fillRect(apple.x * TILE_SIZE, apple.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        } else {
            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {
        String msg = "Game Over";
        Font font = new Font("Helvetica", Font.BOLD, 20);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.white);
        g.setFont(font);
        g.drawString(msg, (WIDTH * TILE_SIZE - metrics.stringWidth(msg)) / 2, HEIGHT * TILE_SIZE / 2);
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if ((key == KeyEvent.VK_LEFT) && (direction != KeyEvent.VK_RIGHT)) {
                direction = KeyEvent.VK_LEFT;
            }
            if ((key == KeyEvent.VK_RIGHT) && (direction != KeyEvent.VK_LEFT)) {
                direction = KeyEvent.VK_RIGHT;
            }
            if ((key == KeyEvent.VK_UP) && (direction != KeyEvent.VK_DOWN)) {
                direction = KeyEvent.VK_UP;
            }
            if ((key == KeyEvent.VK_DOWN) && (direction != KeyEvent.VK_UP)) {
                direction = KeyEvent.VK_DOWN;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame snakeGame = new SnakeGame();
        frame.add(snakeGame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
