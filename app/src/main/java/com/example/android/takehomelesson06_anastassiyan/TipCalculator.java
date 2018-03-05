package com.example.android.takehomelesson06_anastassiyan;

import java.io.Serializable;

/**
 * Created by anastasianossal on 3/3/18.
 */

public class TipCalculator implements Serializable {

    public double amount;
    public double tax;
    public double tip;
    public double total;

    public TipCalculator(double amount, double tax, double tip) {
        this.amount = amount;
        this.tax = tax;
        this.tip = tip;
    }

    public String toString() {
        total = amount + (amount * tax) +
                (amount * tip);
        return "Total: " + amount + "\nSales Tax: " + (tax * 100) +
                "\nTip: " + (tip * 100) + "\nGrand Total: " + total;
    }


}
