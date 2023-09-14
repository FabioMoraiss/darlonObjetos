

public class linkList {
    public static void main(String[] args) {
        LinkedList<Integer> valores;

        valores = new LinkedList<Integer>();

        valores.add(10);
        valores.add(20);
        

        for(int i =0; i<valores.size(); i++) {
            System.out.println(valores.get(i));
        }

    }
}
