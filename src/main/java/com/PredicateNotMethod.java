package com;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateNotMethod {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("john", "mary", "jo", "a");
        Optional<String> optName = names.filter(Predicate.not(s -> s.length() >= 3)).findFirst();
        if(optName.isPresent()) {
            System.out.println("Found: " + optName.get());
        } else {
            System.out.println("Not Found !");
        }
    }
}
