public class Calculator {

    private float a;
    private float b;
    private char sign;
    private float result;

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public float getResult() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                break;
        }
        return result;
    }
}