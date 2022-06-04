package com.backendschool.task.taskOneToFour;

public class TaskOne {

    public static void main(String[] args) {

        NumberInput numberInput = new NumberInput();
        float sum = 0f;

        System.out.print("첫번째 숫자를 입력해주세요 : ");
        String firstNumber = numberInput.inputNumber();
        while (!numberInput.isNumber(firstNumber)) {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            firstNumber = numberInput.inputNumber();
        }

        System.out.print("두번째 숫자를 입력해주세요 : ");
        String secNumber = numberInput.inputNumber();
        while (!numberInput.isNumber(secNumber)) {
            System.out.print("두번째 숫자를 입력해주세요 : ");
            secNumber = numberInput.inputNumber();
        }

        sum += Float.parseFloat(firstNumber) + Float.parseFloat(secNumber);
        String sumString = "" + sum;
        sumString = numberInput.removeDotIfInt(sumString);
        System.out.println("결과 : " + sumString);
    }
}
