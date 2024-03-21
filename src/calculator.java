import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton sixButton;
    JButton fiveButton;
    JButton fourButton;
    JButton threeButton;
    JButton twoButton;
    JButton oneButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton multButton;
    JButton subtButton;
    JButton addButton, clearButton;
    boolean addOperatorClicked = false, subtOperatorClicked = false, multOperatorClicked = false, divOperatorClicked = false;
    boolean addition = false, subtraction = false, division = false, multiplication = false;
    String oldValue, newValue;


    public calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(500, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(20, 30, 540, 60);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setForeground(Color.white);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        jf.add(displayLabel);
        displayLabel.setOpaque(true);

        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 110, 80, 80);
        jf.add(sevenButton);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 110, 80, 80);
        jf.add(eightButton);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 110, 80, 80);
        jf.add(nineButton);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 210, 80, 80);
        jf.add(fourButton);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 210, 80, 80);
        jf.add(fiveButton);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 210, 80, 80);
        jf.add(sixButton);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 310, 80, 80);
        jf.add(oneButton);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 310, 80, 80);
        jf.add(twoButton);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 310, 80, 80);
        jf.add(threeButton);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 410, 80, 80);
        jf.add(dotButton);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);


        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 410, 80, 80);
        jf.add(zeroButton);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 410, 80, 80);
        jf.add(equalButton);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);

        divButton = new JButton("/");
        divButton.setBounds(330, 110, 80, 80);
        jf.add(divButton);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);

        multButton = new JButton("x");
        multButton.setBounds(330, 210, 80, 80);
        jf.add(multButton);
        multButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multButton.addActionListener(this);

        subtButton = new JButton("-");
        subtButton.setBounds(330, 310, 80, 80);
        jf.add(subtButton);
        subtButton.setFont(new Font("Arial", Font.PLAIN, 40));
        subtButton.addActionListener(this);

        addButton = new JButton("+");
        addButton.setBounds(330, 410, 80, 80);
        jf.add(addButton);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.setBounds(430, 410, 80, 80);
        jf.add(clearButton);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
        clearButton.addActionListener(this);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (addOperatorClicked) {
                displayLabel.setText("7");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("7");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("7");
                subtOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("7");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }


        } else if (e.getSource() == eightButton) {
            if (addOperatorClicked) {
                displayLabel.setText("8");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("8");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("8");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("8");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }


        } else if (e.getSource() == nineButton) {
            if (addOperatorClicked) {
                displayLabel.setText("9");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("9");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("9");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("9");
                divOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");

            }


        } else if (e.getSource() == fourButton) {
            if (addOperatorClicked) {
                displayLabel.setText("4");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("4");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("4");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("4");
                divOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");

            }


        } else if (e.getSource() == fiveButton) {
            if (addOperatorClicked) {
                displayLabel.setText("5");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("5");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("5");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("5");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "5");

            }


        } else if (e.getSource() == sixButton) {
            if (addOperatorClicked) {
                displayLabel.setText("6");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("6");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("6");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("6");
                divOperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");

            }


        } else if (e.getSource() == oneButton) {
            if (addOperatorClicked) {
                displayLabel.setText("1");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("1");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("1");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("1");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "1");

            }

        } else if (e.getSource() == twoButton) {
            if (addOperatorClicked) {
                displayLabel.setText("2");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("2");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("2");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("2");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "2");

            }


        } else if (e.getSource() == threeButton) {
            if (addOperatorClicked) {
                displayLabel.setText("3");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("3");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("3");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("3");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "3");

            }

        } else if (e.getSource() == dotButton) {
            displayLabel.setText(displayLabel.getText() + ".");

        } else if (e.getSource() == zeroButton) {
            if (addOperatorClicked) {
                displayLabel.setText("0");
                addOperatorClicked = false;

            } else if (subtOperatorClicked) {
                displayLabel.setText("0");
                subtOperatorClicked = false;

            } else if (multOperatorClicked) {
                displayLabel.setText("0");
                multOperatorClicked = false;

            } else if (divOperatorClicked) {
                displayLabel.setText("0");
                divOperatorClicked = false;

            } else {
                displayLabel.setText(displayLabel.getText() + "0");


            }


        } else if (e.getSource() == equalButton) {
            newValue = displayLabel.getText();
            float oldValuef = Float.parseFloat(oldValue);
            float newValuef = Float.parseFloat(newValue);
            if (addition) {
                float result = oldValuef + newValuef;
                displayLabel.setText(result + "");
            } else if (subtraction) {
                float result = oldValuef - newValuef;
                displayLabel.setText(result + "");
            } else if (division) {
                float result = oldValuef / newValuef;
                displayLabel.setText(result + "");

            } else if (multiplication) {
                float result = oldValuef * newValuef;
                displayLabel.setText(result + "");


            } else if (e.getSource() == divButton) {
                divOperatorClicked = true;
                division = true;
                oldValue = displayLabel.getText();


            } else if (e.getSource() == multButton) {
                multOperatorClicked = true;
                multiplication = true;
                oldValue = displayLabel.getText();


            } else if (e.getSource() == subtButton) {
                subtOperatorClicked = true;
                subtraction = true;
                oldValue = displayLabel.getText();


            } else if (e.getSource() == addButton) {
                addOperatorClicked = true;
                addition = true;
                oldValue = displayLabel.getText();

            } else if (e.getSource() == clearButton) {
                displayLabel.setText("");

            }
        }


    }
}
