package com.avijit.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Account {
    private String accName;
    private String accHolder;
    private String accNumber;

    public Account(String accName, String accHolder, String accNumber) {
        this.accName = accName;
        this.accHolder = accHolder;
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accName='" + accName + '\'' +
                ", accHolder='" + accHolder + '\'' +
                ", accNumber='" + accNumber + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();

        accList.add(new Account("BDO", "Jenifer Alvez", "001-237-9900"));
        accList.add(new Account("BPI", "John Ronel", "001-247-9982"));
        accList.add(new Account("JPMC", "Ross Geller", "001-239-9920"));
        accList.add(new Account("BDO", "Jenifer Adriana", "001-217-9980"));

        for (Account acc :
                accList) {
            System.out.println(acc.toString());
        }

    }
}
