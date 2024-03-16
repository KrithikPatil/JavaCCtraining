// import java.util.Scanner;
import java.util.Arrays;

public class WaterJug {

    public int CAPACITY_A = 5;
    public int CAPACITY_B = 3;
    public int[] jugA = new int[CAPACITY_A];
    public int[] jugB = new int[CAPACITY_B];
    public int topA = 4;
    public int topB = -1;

    public WaterJug() {
        Arrays.fill(jugA, 1);
        Arrays.fill(jugB, 0);
    }

    public int pop(int[] stack, int top) {
        // int element = stack[top];
        stack[top] = 0;
        top -= 1;

        return top;
    }

    public int push(int[] stack, int top, int element) {
        top += 1;
        stack[top] = element;

        // System.out.println("The element to be pushed is: " + element);
        return top;
    }

    public static void main(String[] args) {
        WaterJug wj = new WaterJug();

        while (wj.topA != 3) {
            if (wj.topA != -1 && wj.topB != wj.CAPACITY_B - 1) {
                while (wj.topB != wj.CAPACITY_B - 1) {
                    wj.topA = wj.pop(wj.jugA, wj.topA);
                    wj.topB = wj.push(wj.jugB, wj.topB, 1);
                    if (wj.topA == -1) {
                        break;
                    }
                }
            }
            else if (wj.topB == wj.CAPACITY_B - 1) {
                while (wj.topB != -1) {
                    wj.topB = wj.pop(wj.jugB, wj.topB);
                }
            }
            else if (wj.topA == -1) {
                while (wj.topA != wj.CAPACITY_A - 1) {
                    wj.topA = wj.push(wj.jugA, wj.topA, 1);
                }
            }
            System.out.println("Stack A \t Stack B");
            System.out.println((wj.topA + 1) + "\t" + (wj.topB + 1));
        }
    }
}
