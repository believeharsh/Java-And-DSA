import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumber extends JFrame implements ActionListener {
    private JTextField guessField;
    private JLabel messageLabel;
    private int targetNumber;
    private int numberOfGuesses;

    public GuessTheNumber() {
        // Frame settings
        setTitle("Guess the Number Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize game
        targetNumber = generateRandomNumber();
        numberOfGuesses = 0;

        // Message label
        messageLabel = new JLabel("Guess a number between 1 and 100:");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        add(messageLabel, BorderLayout.NORTH);

        // Input field and button panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        guessField = new JTextField(10);
        guessField.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(guessField);

        JButton guessButton = new JButton("Guess");
        guessButton.setFont(new Font("Arial", Font.PLAIN, 16));
        guessButton.addActionListener(this);
        panel.add(guessButton);

        add(panel, BorderLayout.CENTER);
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generate number between 1 and 100
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int guess = Integer.parseInt(guessField.getText());
            numberOfGuesses++;

            if (guess < 1 || guess > 100) {
                messageLabel.setText("Please enter a number between 1 and 100.");
            } else if (guess < targetNumber) {
                messageLabel.setText("Too low! Try again.");
            } else if (guess > targetNumber) {
                messageLabel.setText("Too high! Try again.");
            } else {
                messageLabel.setText("Correct! You guessed it in " + numberOfGuesses + " tries.");
            }
        } catch (NumberFormatException ex) {
            messageLabel.setText("Please enter a valid number.");
        }
        guessField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GuessTheNumber game = new GuessTheNumber();
            game.setVisible(true);
        });
    }
}