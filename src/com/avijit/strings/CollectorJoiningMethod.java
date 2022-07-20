package com.avijit.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorJoiningMethod {
    public static void main(String[] args) {
        List<String> liststr = Arrays.asList("Linear", "Regression", "SVM", "PCA");
        String str = liststr.stream().collect(Collectors.joining(", "));
        System.out.println(str.toString());
    }
}
