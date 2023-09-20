import java.util.Stack;

public class exeParenteses {
    public static void main(String[] args) {
        String expressao = "{([])]}";

        Stack<String> pilha = new Stack<String>();

        char c;
        String stringTeste = "";
        boolean expressaoCorreta = true;
        boolean comparar = false;
        for (int i = 0; i < expressao.length(); i++) {
            comparar = false;
            c = expressao.charAt(i);

            switch (c) {
                case '(':
                    pilha.push(c + "");
                    break;

                case '{':
                    pilha.push(c + "");
                    break;

                case '[':
                    pilha.push(c + "");
            }

            if (!pilha.isEmpty()) {

                switch (c) {
                    case ')':
                        stringTeste = pilha.pop() + c;
                        comparar = true;
                        break;

                    case '}':
                        stringTeste = pilha.pop() + c;
                        comparar = true;
                        break;

                    case ']':
                        stringTeste = pilha.pop() + c;
                        comparar = true;
                        break;
                }

                if (comparar) {
                    if (verificaParenteses(stringTeste)) {

                    } else {
                        expressaoCorreta = false;
                        break;
                    }
                }

               /*  if (c == ')') {
                    if (!pilha.isEmpty()) {
                        stringTeste = pilha.pop() + c;
                        if (verificaParenteses(stringTeste)) {

                        } else {
                            expressaoCorreta = false;
                            break;
                        }
                    } else {
                        expressaoCorreta = false;
                        break;
                    }

                }

                */

            }
        }

        if (expressaoCorreta) {
            System.out.println("expressao balanceada");
        } else {
            System.out.println("expressao desbalanceada");
        }
    }

    public static boolean verificaParenteses(String x) {
        String y = "()";
        String p = "{}";
        String z = "[]";
        if (x.equals(y) || x.equals(p) || x.equals(z)) {
            return true;
        }
        return false;
    }
}
