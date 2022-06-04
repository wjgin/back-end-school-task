package com.backendschool.task.taskOneToFive;

public class TaskTwo {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        String numString;
        float sum = 0f;

        for (int i = 1; i <= 3; i++) {
            System.out.print("숫자 " + i + " : ");
            numString = numberInput.inputNumber();
            while (!numberInput.isNumber(numString)) {
                System.out.print("숫자 " + i + " : ");
                numString = numberInput.inputNumber();
            }
            sum += Float.parseFloat(numString);
        }
        String sumString = "" + sum;
        numberInput.removeDotIfInt(sumString);
    }

}
