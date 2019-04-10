package com.bipin;

import com.bipin.internal.AddHelper;

public class Calculator {
    public int add(int i, int j){
        AddHelper addHelper = new AddHelper();
        return addHelper.add(i,j);
    }
}
