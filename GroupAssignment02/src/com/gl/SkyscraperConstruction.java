package com.gl;
import java.util.Scanner;
import java.util.Stack;

public class SkyscraperConstruction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of floors in the building:");
        int N = scanner.nextInt();

        Stack<Integer> floors = new Stack<>();

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the floor size given on day " + i + ":");
            int floorSize = scanner.nextInt();

            // Process the floor construction
            processFloorConstruction(floors, floorSize, i);
        }

        scanner.close();
    }

    private static void processFloorConstruction(Stack<Integer> floors, int floorSize, int day) {
        System.out.println("\nDay: " + day);

        // Check if the current floor can be assembled
        while (!floors.isEmpty() && floorSize > floors.peek()) {
            System.out.print(floors.pop() + " ");
        }

        // Add the current floor to the stack
        floors.push(floorSize);

        System.out.println();
    }
}