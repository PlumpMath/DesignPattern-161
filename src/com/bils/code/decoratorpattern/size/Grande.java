package com.bils.code.decoratorpattern.size;

/**
 * Created by nabilla on 4/18/16.
 */
public class Grande implements Size {

    @Override
    public String getSizeDescription() {
        return " Grande";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
