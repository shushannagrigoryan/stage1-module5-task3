package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().max(Integer :: compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().flatMap(Collection::stream).min(Integer :: compare);
    }

    public Integer sum(List<Integer> list) {
        //throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().mapToInt(Integer:: intValue).reduce(0, Integer::sum);
    }
}
