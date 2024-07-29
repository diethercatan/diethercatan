import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Stack;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, equalsButton, clearButton;
    private JPanel panel;
    private ImageIcon icon = new ImageIcon("CalcPic.png");

    private String equation = "";

    public SimpleCalculator() {
        this.setTitle("Simple Calculator");
        this.setIconImage(icon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setResizable(false);
        this.setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 30, 240, 30);
        textField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        functionButtons = new JButton[6];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("clr");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = equalsButton;
        functionButtons[5] = clearButton;

        for (int i = 0; i < 6; i++) {
            functionButtons[i].addActionListener(this);
        }

        panel = new JPanel();
        panel.setBounds(30, 80, 240, 260);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(clearButton);
        panel.add(numberButtons[0]);
        panel.add(equalsButton);
        panel.add(divButton);

        this.add(textField);
        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                equation = equation.concat(String.valueOf(i));
                textField.setText(equation);
            }
        }

        if (e.getSource() == addButton) {
            equation = equation.concat("+");
            textField.setText(equation);
        }

        if (e.getSource() == subButton) {
            equation = equation.concat("-");
            textField.setText(equation);
        }

        if (e.getSource() == mulButton) {
            equation = equation.concat("*");
            textField.setText(equation);
        }

        if (e.getSource() == divButton) {
            equation = equation.concat("/");
            textField.setText(equation);
        }

        if (e.getSource() == equalsButton) {
            textField.setText(convertPostfix(equation));
            equation = "";
        }

        if (e.getSource() == clearButton) {
            textField.setText("");
            equation = "";
        }
    }
    
    // The convertPostfix method
    public static String convertPostfix(String equation) { // an equation is the parameter
        LinkedList<String> operand = new LinkedList<String>(); 
        Stack<Character> operator = new Stack<>();
        String value = ""; // the variable for multiple-digit values

        // Reads each character of an equation
        for (int x = 0; x < equation.length(); x++) {
            char ch = equation.charAt(x); // the variable for a character

            // Checks if the character is a digit
            if (Character.isDigit(ch) || dotOp(ch)) { // can read dot operator
                value = value.concat(Character.toString(ch));
                System.out.println("Value: " + value);

                if ((x < equation.length()-1 && !Character.isDigit(equation.charAt(x+1)) && !dotOp(equation.charAt(x+1))) || x == equation.length()-1) {
                    operand.addLast(value);
                    value = "";
                    
                    if (x >= 2) {
                        if (equation.charAt(x-2) == ')') {
                              if (checkPrecedence(operator.peek()) == 2) 
                                 operand.addLast(String.valueOf(operator.pop()));
                        }
                    }
                }
            } 

            // Checks if the character is an open parenthesis
            else if (ch == '(')
                operator.push(ch);

            // Checks if the character is a close parenthesis
            else if (ch == ')') {
                while (operator.peek() != '(') {
                    operand.addLast(String.valueOf(operator.pop())); // adds operator to result
                }
                
                operator.pop();
            } 
            
            // Checks if the character is an operator
            else if (isOperator(ch)) { 
                if (x != 0 && operator.isEmpty()) { operator.push(ch); } 
                
                // Checks if the operator is a negative sign
                else if ((x == 0) || (x >= 1 && equation.charAt(x-1) == '(') || (isOperator(equation.charAt(x-1)))) {
                    value = value.concat(Character.toString(ch));
                }
                
                else {
                    while (!operator.isEmpty() && checkPrecedence(ch) <= checkPrecedence(operator.peek())) {
                        operand.addLast(String.valueOf(operator.pop())); // Append operators to nResult
                    }
                    
                    operator.push(ch);
                }
            }

            // To check if all the characters are separated correctly
            System.out.println("\nCurrent Character: " + ch);
            System.out.println("Operand: " + operand);
            System.out.println("Operator: " + operator);
        }
        
        System.out.println();

        // Adds the left character in operators to operands
        while (!operator.isEmpty()) operand.addLast(String.valueOf(operator.pop()));
        
        return evalTop(operand);
    }

    // The isOperator method checks if the character is an operator
    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    
    // The dotOp method checks if the character is a dot
    public static boolean dotOp(char ch) {
        return ch == '.';
    }
    
    // The checkPrecedence method checks if the operator has high/low precedence
    public static int checkPrecedence(char operator) {
        switch (operator) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }
    
    // invalidInputYN method with an input as a parameter
    public static boolean invalidInputYN(String _input) {
       return ((_input.length() != 1 || !Character.isDigit(_input.charAt(0))) || (Integer.parseInt(_input) != 1 && Integer.parseInt(_input) != 2));
    }

    // The evalTop method 
    public static String evalTop(LinkedList<String> _operand) {
        LinkedList<String> val = new LinkedList<String>();
        String finalResult = "";
        
        // Transfers operands' values to val 
        while (_operand.size() > 0) { 
            val.addLast(_operand.getFirst()); 
            System.out.println("Add in val: " + _operand.getFirst());
            _operand.removeFirst();
        }

        // For the computation
        while (val.size() > 1) {
            System.out.println("\nContent of val:  " + val);
            int numOp = 0;

            // Searching for the first operator's index
            for (int x = val.size()-1; x >= 0; x--) 
                 if (val.get(x).length() == 1 && isOperator(val.get(x).charAt(0))) { numOp = x; }
            
            double operand1 = Double.parseDouble(val.get(numOp-2)); // for the first operand
            System.out.println("Operand 1: " + operand1);
            
            double operand2 = Double.parseDouble(val.get(numOp-1)); // for the second operand
            System.out.println("Operand 2: " + operand2);
             
            char operator = val.get(numOp).charAt(0); // for the operator
            System.out.println("Operator: " + operator);
            
            // Removes characters
            for (int x = 0; x <= 1; x++) val.remove(numOp-x);
            val.set(numOp-2, "");
            
            // Computes for the result and adds in val
            val.set(numOp-2, String.valueOf(operation(operand1, operand2, operator)));
            System.out.println("Initial result: " + operation(operand1, operand2, operator)); // prints the initial result
        }

        // Prints the final result if the val is not empty
        if (!val.isEmpty()) { 
            int index = val.get(0).indexOf('.'); // index of a dot operator
            
            // Checks if the result has decimal values
            if (val.get(0).charAt(index+1) == '0' && val.get(0).length() == index+2) {
                StringBuilder result = new StringBuilder(val.get(0));

                // Sets characters into null
                for (int x = index; x < val.get(0).length(); x++) { result.setCharAt(x, ' '); }
                System.out.println("\nFinal result: " +  result); // prints the result
                finalResult = String.valueOf(result); 
            }

            // Prints the result with decimal values
            else { 
               System.out.println("\nFinal result: " + val.get(0)); 
               finalResult = val.get(0);
            }
        }
        
        return finalResult;
    }

    // The operation method
    public static double operation(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+': // for addition
                return operand1 + operand2;
                
            case '-': // for subtraction
                return operand1 - operand2;
                
            case '*': // for multiplication
                return operand1 * operand2;
                
            case '/': // for division
                if (operand2 == 0) throw new ArithmeticException("Division by zero");
                
                return operand1 / operand2;
            
            case '^': // for exponent
                double result = operand1;
                for (int x = (int)operand2; x > 1; x--) { result *= operand1; }
                return result;

            default: // throws an exception
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
