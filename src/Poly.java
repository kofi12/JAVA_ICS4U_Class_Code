public class Poly {
    public static void main(String[] args) {

        X parent = new X();
        Y firstChild = new Y();
        Z secondChild = new Z();

        System.out.println("First child: " + getMode(firstChild) +
                "\nSecond child: " + getMode(secondChild) +
                "\nParent: " + getMode(parent));

    }

    public static String getMode(X x){
        return x.mode;
    }
}
