package Desktop.DevopsAtelier;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("now we merge ");
        System.out.println("rebase_commit1 ");
        System.out.println("rebase_commit2 ");

    }
}
