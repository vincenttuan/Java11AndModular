package com.jep_323;

import java.util.stream.Stream;

public class LambdaLocalVariable {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("john", "mary", "jo");
        names.forEach((String name) -> System.out.println(name));
        
        names = Stream.of("john", "mary", "jo");
        names.forEach((name) -> System.out.println(name));
        
        names = Stream.of("john", "mary", "jo");
        names.forEach((var name) -> System.out.println(name));
        
    }
}
