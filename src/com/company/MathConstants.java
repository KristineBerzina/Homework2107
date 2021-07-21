package com.company;

public enum MathConstants {
    PI(Math.PI),
    EULER(Math.E),
    TAU(2*Math.PI),
    GOLDENRATIO(1.618033988),
    GRAVITATION(6.673*Math.pow(10, -11));

    private final double constant;

    MathConstants(double constant) {
        this.constant = constant;
    }

    public double getConstant() {
        return constant;
    }

}
