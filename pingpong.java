import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pingpong {
    
 private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private static final int BALL_SIZE = 20;
    private static final int PADDLE_WIDTH = 60;
    private static final int PADDLE_HEIGHT = 10;

    private int ballX = WIDTH / 2 - BALL_SIZE / 2;
    private int ballY = HEIGHT / 2 - BALL_SIZE / 2;
    private int ballSpeedX = 2;
    private int ballSpeedY = 2;

    private int paddleX = WIDTH / 2 - PADDLE_WIDTH / 2;
    private int paddleY = HEIGHT - PADDLE_HEIGHT - 20;
    private int paddleSpeed = 5;

    public PingPongGame() {
        setTitle("Ping Pong Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveBall();
                movePaddle();
                repaint();
            }
        });
        timer.start();
    }

    private void moveBall() {
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Bounce off the walls
        if (ballX <= 0 || ballX >= WIDTH - BALL_SIZE) {
            ballSpeedX = -ballSpeedX;
        }

        // Bounce off the top
        if (ballY <= 0) {
            ballSpeedY = -ballSpeedY;
        }

        // Check collision with the paddle
        if (ballY + BALL_SIZE >= paddleY && ballX >= paddleX && ballX <= paddleX + PADDLE_WIDTH) {
            ballSpeedY = -ballSpeedY;
        }

        // Check if the ball missed the paddle
        if (ballY >= HEIGHT) {
            // Game over
            ballX = WIDTH / 2 - BALL_SIZE / 2;
            ballY = HEIGHT / 2 - BALL_SIZE / 2;
        }
    }

    private void movePaddle() {
        // Move the paddle using left and right arrow keys
        if (paddleX <= 0) {
            paddleX = 0;
        }
        if (paddleX >= WIDTH - PADDLE_WIDTH) {
            paddleX = WIDTH - PADDLE_WIDTH;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw ball
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);

        // Draw paddle
        g.setColor(Color.BLUE);
        g.fillRect(paddleX, paddleY, PADDLE_WIDTH, PADDLE_HEIGHT);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PingPongGame().setVisible(true);
            }
        });
    }
}
