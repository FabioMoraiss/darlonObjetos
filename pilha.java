import java.util.Stack;


public class pilha {
    public static void main(String[] args) {
        int x;
        Stack<Integer> minhaPilha = new Stack<Integer>();

        minhaPilha.push(10);
        minhaPilha.push(20);
        minhaPilha.push(30);
        minhaPilha.push(40);
        minhaPilha.push(50);

        while(! minhaPilha.isEmpty()) {
            x = minhaPilha.pop();
            System.out.println(x);
        }

    }
}
