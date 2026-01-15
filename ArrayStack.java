
import java.util.Scanner;

public class ArrayStack {

    static int[] arr;
    static int top = -1;
    static int size;
    static Scanner sc = new Scanner(System.in);

    // Push function
    static void push() {
        if (top == size - 1) {
            System.out.println("Stack Overflow! Cannot push more elements.");
        } else {
            top++;
            System.out.print("\nEnter element to push: ");
            int value = sc.nextInt();
            arr[top] = value;
            System.out.println(value + " pushed into " + top + " number of index.");
        }
    }

    // Pop function
    static void pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
        } else {
            int y = arr[top];
            top--;
            System.out.println("Element pop successfully..");
        }
    }

    // Peep function
    static void peep() {
        if (top == -1) {
            System.out.println("Stack is empty. You don't perform Peep operation.");
        } else {
            System.out.println("Enter the index for peep: ");
            int p = sc.nextInt();
            int peepIndex = arr[p];
            System.out.println("Peep element: " + peepIndex);

        }
    }

    // Display function
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("\nStack elements are:");
            for (int i = 0; i <= top; i++) {
                System.out.println("Element " + (i + 1) + ": " + arr[i]);
            }
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the size of stack: ");
        size = sc.nextInt();
        arr = new int[size];

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peep");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peep();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
