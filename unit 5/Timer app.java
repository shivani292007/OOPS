import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {

    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;

    private int seconds = 0;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setTitle("Timer App");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        setLocationRelativeTo(null);

        timeLabel = new JLabel("00:00:00", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 35));
        add(timeLabel, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        panel.add(startButton);
        panel.add(stopButton);
        panel.add(resetButton);

        add(panel, BorderLayout.SOUTH);

        timer = new Timer(1000, e -> {
            seconds++;
            updateTime();
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            seconds = 0;
            updateTime();
        });

        setVisible(true);
    }

    private void updateTime() {
        int hrs = seconds / 3600;
        int mins = (seconds % 3600) / 60;
        int secs = seconds % 60;

        timeLabel.setText(String.format("%02d:%02d:%02d", hrs, mins, secs));
    }
}