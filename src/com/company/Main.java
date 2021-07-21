package com.company;

public class Main {

    public static void main(String[] args) {
        MathConstants newPi = MathConstants.PI;
        MathConstants newEULER = MathConstants.EULER;
        MathConstants newTau = MathConstants.TAU;
        MathConstants newGoldenratio = MathConstants.GOLDENRATIO;
        MathConstants newGravitation = MathConstants.GRAVITATION;
        System.out.println("The value of the constant " + newPi + " is " + newPi.getConstant());
        System.out.println("The value of the constant " + newEULER + " is " + newEULER.getConstant());
        System.out.println("The value of the constant " + newTau + " is " + newTau.getConstant());
        System.out.println("The value of the constant " + newGoldenratio + " is " + newGoldenratio.getConstant());
        System.out.println("The value of the constant " + newGravitation + " is " + newGravitation.getConstant());
    }
}
