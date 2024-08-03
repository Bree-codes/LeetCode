package com.bughunter.bree.code;

public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();

        // Add some keys
        myHashSet.add(5);
        myHashSet.add(1005);
        myHashSet.add(2005);

        // Check if keys are contained
        System.out.println("Contains 5? " + myHashSet.contains(5)); // Should print: true
        System.out.println("Contains 1005? " + myHashSet.contains(1005)); // Should print: true
        System.out.println("Contains 2005? " + myHashSet.contains(2005)); // Should print: true
        System.out.println("Contains 3005? " + myHashSet.contains(3005)); // Should print: false

        // Remove a key
        myHashSet.remove(1005);

        // Check again if keys are contained
        System.out.println("Contains 1005? " + myHashSet.contains(1005)); // Should print: false
    }
}
