import java.util.Scanner;
public class Lab_8_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Prefix : ");
        String prefix = sc.nextLine();
        int res = evalPrefix(prefix);
        System.out.println(res);
    }
    public static int evalPrefix(String prefix){
        Stack st = new Stack(prefix.length());
        int value=0;
        for(int i=prefix.length()-1;i>=0;i--){
            char temp = prefix.charAt(i);
            if(Character.isDigit(temp)){
                st.push(Integer.parseInt(temp+""));
            }
            else{
                int operand1 = st.pop();
                int operand2 = st.pop();
                value = perform_operation(operand1, operand2, temp);
                st.push(value);
            }
        }
        return st.pop();
    }
    public static int perform_operation(int operand1,int operand2,char temp){
        if(temp=='+'){
            return operand1+operand2;
        }
        else if(temp=='-'){
            return operand1-operand2;
        }
        else if(temp=='/'){
            return operand1/operand2;
        }
        else if(temp=='*'){
            return operand1*operand2;
        }
        else if(temp=='^'){
            return (int)Math.pow(operand1,operand2);
        }
        return 0;
    }
}
class Stack {
    int[] S;
    int TOP = -1;
    int N;

    public Stack(int size) {
        N = size;
        S = new int[N];
    }

    public void push(int X) {
        if (TOP >= N - 1) {
            System.out.println("Stack Overflow");
        } else {
            TOP++;
            S[TOP] = X;
        }
    }

    public int pop() {
        if (TOP == -1) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            return S[TOP--];
        }
    }

    public int peep(int index) {
        if (TOP - index + 1 < 0) {
            System.out.println("Stack Underflow");
            return ' ';
        } else {
            return S[TOP - index + 1];
        }
    }
}