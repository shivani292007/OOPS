import javax.swing.*;
import java.awt.*;

public class MyQuiz {

    static int index = 0;
    static int score = 0;

    static String[] questions = {
            "Which company developed Java?",
            "Which keyword is used to inherit a class in Java?",
            "Which language is primarily used for web development?",
            "Which data structure uses LIFO?",
            "Which language is known as the 'mother of all languages'?"
    };

    static String[][] options = {
            {"Microsoft", "Sun Microsystems", "Google", "Apple"},
            {"extends", "implements", "inherits", "super"},
            {"HTML", "Python", "C++", "Assembly"},
            {"Queue", "Stack", "Array", "Linked List"},
            {"C", "Assembly", "FORTRAN", "COBOL"}
    };

    static int[] answers = {1, 0, 0, 1, 2};

    public static void main(String[] args) {

        JFrame frame = new JFrame("Programming Quiz App");
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(6,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel question = new JLabel();
        JRadioButton[] opt = new JRadioButton[4];
        ButtonGroup group = new ButtonGroup();

        // ✅ Smaller Next button inside a FlowLayout panel
        JButton next = new JButton("Next");
        next.setPreferredSize(new Dimension(80, 30)); // width=80, height=30
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(next);

        frame.add(question);

        for(int i=0;i<4;i++){
            opt[i] = new JRadioButton();
            group.add(opt[i]);
            frame.add(opt[i]);
        }

        frame.add(buttonPanel); // add panel instead of button directly

        // Load question
        Runnable load = () -> {
            question.setText("Q" + (index+1) + ": " + questions[index]);
            for(int i=0;i<4;i++){
                opt[i].setText(options[index][i]);
            }
            group.clearSelection();
        };

        load.run();

        // Button click
        next.addActionListener(e -> {
            for(int i=0;i<4;i++){
                if(opt[i].isSelected() && i == answers[index]){
                    score++;
                }
            }
            index++;

            if(index < questions.length){
                load.run();
            } else {
                JOptionPane.showMessageDialog(frame, "Quiz Over! Your score: " + score + "/" + questions.length);
            }
        });

        frame.setVisible(true);
    }
}