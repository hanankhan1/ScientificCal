import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.Collections;

public class Main {
    // member variables
    static JLabel lable;
    static JFrame frame;
    static JTextField textField;
    //number bottons
    static JButton[] numberBotton = new JButton[10];
    //function bottons
    static JButton[] funBotton = new JButton[22];
    static JButton addBotton, subBotton, mulBotton, divBotton, medianBotton, equalBotton, clearBotton, deciBotton, sinBotton, cosBotton,
            tanBotton, cotBotton, secBotton, cosceBotton, powerBotton, sqrBotton, logBotton, lnBotton, eBotton, meanBotton, moodeBotton, sdBotton;
    static JPanel panel;
    static double result = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0, num11 = 0, num12 = 0, num13 = 0, num14 = 0, num15 = 0;
    static String operator;
    static ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {
        frame = new JFrame("Scientific Calculator ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 70, 500, 700);
        frame.setLayout(null);

        //for fonts
        Font calFont = new Font("MY FONT", Font.ITALIC, 25);
        textField = new JTextField();
        textField.setBounds(30, 15, 430, 60);
        frame.add(textField);
        textField.setFont(calFont);
        textField.setEditable(false);

//botton
        //Basic Arithmetic:
        addBotton = new JButton("+");
        subBotton = new JButton("-");
        mulBotton = new JButton("*");
        divBotton = new JButton("/");
        deciBotton = new JButton(".");
        equalBotton = new JButton("=");
        clearBotton = new JButton("DEL");
        //Trigonometric Functions:
        sinBotton = new JButton("SIN");
        cosBotton = new JButton("COS");
        tanBotton = new JButton("TAN");
        cotBotton = new JButton("COT");
        cosceBotton = new JButton("COSEC");
        secBotton = new JButton("SEC");
        // Logarithmic Functions:
        logBotton = new JButton("log");
        lnBotton = new JButton("ln");
        eBotton = new JButton("e^");
        //Power and Root Functions:
        powerBotton = new JButton("x^");
        sqrBotton = new JButton("SQR");
//Statistical Functions:
        meanBotton = new JButton("MEN");
        medianBotton = new JButton("MED");
        moodeBotton = new JButton("MOD");
        sdBotton = new JButton("SAD");

//FUNCTON BOTTON array
        //Basic Arithmetic:
        funBotton[0] = addBotton;
        funBotton[1] = subBotton;
        funBotton[2] = mulBotton;
        funBotton[3] = divBotton;
        funBotton[4] = deciBotton;
        funBotton[5] = equalBotton;
        funBotton[6] = clearBotton;
        //Trigonometric Functions:
        funBotton[7] = cosBotton;
        funBotton[8] = sinBotton;
        funBotton[9] = tanBotton;
        funBotton[10] = cotBotton;
        funBotton[11] = secBotton;
        funBotton[12] = cosceBotton;
        // Logarithmic Functions:
        funBotton[13] = eBotton;
        funBotton[14] = logBotton;
        funBotton[15] = lnBotton;
        //Statistical Functions:
        funBotton[16] = meanBotton;
        funBotton[17] = medianBotton;
        funBotton[18] = sdBotton;
        funBotton[19] = moodeBotton;
        //Power and Root Functions:
        funBotton[20] = powerBotton;
        funBotton[21] = sqrBotton;
//Array fo function buttons
        for (int i = 0; i < 22; i++) {
            funBotton[i].setFont(calFont);
            funBotton[i].setFocusable(false);
            funBotton[i].setForeground(Color.WHITE);
            if (i < 4) {
                funBotton[i].setBackground(Color.darkGray);
            } else if (i == 4) {
                funBotton[i].setBackground(Color.GRAY);
            } else if (i == 6) {
                funBotton[i].setBackground(Color.RED);

            } else if (i == 5) {
                funBotton[i].setBackground(Color.GREEN);
            } else if (i >= 7 && i <= 21) {
                funBotton[i].setBackground(Color.darkGray);

            }
        }
        //number button array
        for (int i = 0; i < 10; i++) {
            numberBotton[i] = new JButton(String.valueOf(i));
            numberBotton[i].setFont(calFont);
            numberBotton[i].setBackground(Color.GRAY);
            numberBotton[i].setForeground(Color.WHITE);
            numberBotton[i].setFocusable(false);
        }
//panel
        // Set bounds and add number buttons
        numberBotton[0].setBounds(30, 590, 100, 60);
        frame.add(numberBotton[0]);
        numberBotton[1].setBounds(30, 520, 100, 60);
        frame.add(numberBotton[1]);
        numberBotton[2].setBounds(140, 520, 100, 60);
        frame.add(numberBotton[2]);
        numberBotton[3].setBounds(250, 520, 100, 60);
        frame.add(numberBotton[3]);
        numberBotton[4].setBounds(30, 450, 100, 60);
        frame.add(numberBotton[4]);
        numberBotton[5].setBounds(140, 450, 100, 60);
        frame.add(numberBotton[5]);
        numberBotton[6].setBounds(250, 450, 100, 60);
        frame.add(numberBotton[6]);
        numberBotton[7].setBounds(30, 380, 100, 60);
        frame.add(numberBotton[7]);
        numberBotton[8].setBounds(140, 380, 100, 60);
        frame.add(numberBotton[8]);
        numberBotton[9].setBounds(250, 380, 100, 60);
        frame.add(numberBotton[9]);
        // Set bounds and add function buttons
        addBotton.setBounds(360, 590, 100, 60);
        subBotton.setBounds(360, 520, 100, 60);
        mulBotton.setBounds(360, 450, 100, 60);
        divBotton.setBounds(360, 380, 100, 60);
        deciBotton.setBounds(140, 590, 100, 60);
        equalBotton.setBounds(250, 590, 100, 60);
        clearBotton.setBounds(360, 310, 100, 60);
        sinBotton.setBounds(30, 310, 100, 60);
        cosBotton.setBounds(140, 310, 100, 60);
        tanBotton.setBounds(250, 310, 100, 60);
        cotBotton.setBounds(30, 240, 100, 60);
        cosceBotton.setBounds(140, 240, 100, 60);
        secBotton.setBounds(250, 240, 100, 60);
        logBotton.setBounds(30, 170, 100, 60);
        lnBotton.setBounds(140, 170, 100, 60);
        eBotton.setBounds(250, 170, 100, 60);
        powerBotton.setBounds(360, 240, 100, 60);
        sqrBotton.setBounds(360, 170, 100, 60);
        meanBotton.setBounds(30, 100, 100, 60);
        medianBotton.setBounds(140, 100, 100, 60);
        moodeBotton.setBounds(250, 100, 100, 60);
        sdBotton.setBounds(360, 100, 100, 60);
        // Add all function buttons to the frame
        for (int i = 0; i < 22; i++) {
            frame.add(funBotton[i]);
        }
        panel = new JPanel();
        panel.setBounds(0, 0, 500, 700);
        panel.setBackground(Color.BLACK);
        lable = new JLabel();
        lable.setForeground(Color.DARK_GRAY);
        frame.add(panel);
        frame.add(lable);
        frame.setVisible(true);
//actioin lissteners
        //for numbers
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numberBotton[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + numberBotton[finalI].getText());
                }
            });
        }
        //Basic ArithmeticActionListener
        deciBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ".");
            }
        });
        addBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "+";
                textField.setText("");
            }
        });

        subBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "-";
                textField.setText("");
            }
        });

        mulBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "*";
                textField.setText("");
            }
        });
        divBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "/";
                textField.setText("");
            }
        });
        clearBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = textField.getText();
                if (txt.length() > 0) {
                    textField.setText(txt.substring(0, txt.length() - 1));
                }
            }
        });
//Trigonometric ActionListener
        sinBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.sin(Math.toRadians(num1));
                textField.setText(String.valueOf(result));
            }
        });
        cosBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.cos(Math.toRadians(num1));
                textField.setText(String.valueOf(result));
            }
        });
        tanBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.tan(Math.toRadians(num1));
                textField.setText(String.valueOf(result));

            }
        });
        cotBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = 1.0 / Math.tan(Math.toRadians(num1));
                textField.setText(String.valueOf(result));
            }
        });
        secBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = 1.0 / Math.cos(Math.toRadians(num1));
                textField.setText(String.valueOf(result));

            }
        });
        cosceBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = 1.0 / Math.sin(Math.toRadians(num1));
                textField.setText(String.valueOf(result));
            }
        });
        // Logarithmic ActionListener
        lnBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.log(num1);
                textField.setText(String.valueOf(result));
            }
        });
        logBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.log10(num1);
                textField.setText(String.valueOf(result));
            }
        });
        eBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.exp(num1);
                textField.setText(String.valueOf(result));
            }
        });
//Power and Root ActionListener
        powerBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                operator = "x^";
                textField.setText("");
            }
        });
        sqrBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                result = Math.sqrt(num1);
                textField.setText(String.valueOf(result));
            }
        });
//Statistical ActionListener
        meanBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers.add(Double.parseDouble(textField.getText()));
                operator = "mean";
                textField.setText("");
                //numbers.add(Double.parseDouble(textField.getText()));
            }
        });
        medianBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers.add(Double.parseDouble(textField.getText()));
                operator = "median";
                textField.setText("");
            }
        });
        moodeBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers.add(Double.parseDouble(textField.getText()));
                operator = "moode";
                textField.setText("");
            }
        });
        sdBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numbers.add(Double.parseDouble(textField.getText()));
                operator = "sd";
                textField.setText("");
            }
        });

        equalBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                switch (operator) {
                    case "+": {
                        num2 = Double.parseDouble(textField.getText());
                        result = num1 + num2;
                    }
                    break;
                    case "-": {
                        num2 = Double.parseDouble(textField.getText());
                        result = num1 - num2;
                    }
                    break;
                    case "*": {
                        num2 = Double.parseDouble(textField.getText());
                        result = num1 * num2;
                    }
                    break;
                    case "/": {
                        num2 = Double.parseDouble(textField.getText());
                        result = num1 / num2;
                    }
                    break;
                    case "x^": {
                        num2 = Double.parseDouble(textField.getText());
                        result = Math.pow(num1, num2);
                    }
                    break;
                    case "mean": {

                        double sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        result = sum / numbers.size();
                    }
                    break;
                    case "median": {

                        Collections.sort(numbers);
                        //there are two logic for median even no. of element and odd
                        //even no. of elements
                        if (numbers.size() % 2 == 0) {
                            double med1 = numbers.get(numbers.size() / 2 - 1);
                            double med2 = numbers.get(numbers.size() / 2);
                            result = (med1 + med2) / 2;
                        } else {
                            // odd number of elements

                            result = numbers.get(numbers.size() / 2);
                        }

                    }
                    break;
                    case "moode": {
                        double maxcount = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            numbers.get(i);
                            double count = 0;
                            for (int j = 0; j < numbers.size(); j++) {
                                numbers.get(j);
                                if (numbers.get(i) == numbers.get(j)) {
                                    count++;
                                }
                            }
                            if (count > maxcount) {
                                maxcount = count;
                                result = numbers.get(i);
                            }
                        }

                    }
                    break;
                    case "sd": {
                        //first we calculate mean 
                        double sum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            sum += numbers.get(i);
                        }
                        double mean = sum / numbers.size();
                        //now we calculate varience
                        double verisum = 0;
                        for (int i = 0; i < numbers.size(); i++) {
                            verisum = Math.pow(numbers.get(i) - mean, 2);
                        }
                        double veri = verisum / numbers.size();
                        //now here we calculate the SD which is the sqrt of verience
                        result = Math.sqrt(veri);
                    }
                    break;

                }
                numbers.clear();
                textField.setText(String.valueOf(result));
            }
        });


    }
}