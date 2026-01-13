package Assignments;

public class DiamondGlass {
public static void DiamondGlass(int n) {
    for (int i = 0; i < 2 * n - 1; i++) {
        int comp;
        if (i < n) {
            comp = 2 * i + 1;
        } else {
            comp = 2 * (2 * n - i) - 3;
        }
        for (int j = 0; j < comp; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < 2 * n - comp; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
	DiamondGlass(3);
}
}
