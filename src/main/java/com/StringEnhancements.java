package com;

public class StringEnhancements {
    public static void main(String[] args) {
        System.out.println("x".repeat(5));
        System.out.println("x".isBlank());
        System.out.println("   ".isBlank());
        System.out.println("   java 11   ".strip());
        System.out.println("   java 11   ".stripLeading());
        System.out.println("   java 11   ".stripTrailing());
        String rows = "Line1\nLine2\nLine3";
        rows.lines().forEach(System.out::println);
    }
}
