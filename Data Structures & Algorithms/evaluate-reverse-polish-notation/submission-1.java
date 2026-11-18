class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String currentToken = tokens[i];
            if (isNumeric(currentToken)) {
                Integer number = Integer.parseInt(currentToken);
                stack.push(number);
            } else {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                int res = 0;
                switch (currentToken) {
                    case "+":
                        res = firstOperand + secondOperand;
                        break;
                    case "-":
                        res = firstOperand - secondOperand;
                        break;
                    case "*":
                        res = firstOperand * secondOperand;
                        break;
                    case "/":
                        res = firstOperand / secondOperand;
                        break;
                }
                stack.push(res);
            }
        }
        return stack.peek(); 
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    


}
