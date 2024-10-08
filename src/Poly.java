public class Poly {
    public static void main(String[] args) {

        X parent = new X();
        Y firstChild = new Y();
        Z secondChild = new Z();
        W grandChild = new W();

        System.out.println("First child: " + firstChild.doSomething() +
                "\nSecond child: " + secondChild.doSomething() +
                "\nParent: " + parent.doSomething() +
                 "\nGrand Child: " + grandChild.doSomething());

    }

    public static String getMode(X x){
        return x.mode;
    }
}
