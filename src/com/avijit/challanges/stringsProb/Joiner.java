package com.avijit.challanges.stringsProb;

import java.util.ArrayList;
import java.util.List;

public class Joiner {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        
    }

    public static String join(List<String> values, String delimeter){
        var sb = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            sb.append(values.get(i));

            // no sep after last occur
            if (i < values.size() - 1) {
                sb.append(delimeter);
            }
        }
        return sb.toString();
    }
}
