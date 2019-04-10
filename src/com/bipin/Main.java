package com.bipin;

import com.bipin.util.Calculator;
import com.bipin.util.internal.AddHelper;

public class Main {

    public static void main(String[] args) {
        Calculator c =new Calculator();
        System.out.println(c.add(2,3));

        AddHelper addHelper = new AddHelper();
        System.out.println(addHelper.add(4,5));
    }
}
