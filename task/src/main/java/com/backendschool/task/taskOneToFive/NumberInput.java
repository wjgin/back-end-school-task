package com.backendschool.task.taskOneToFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberInput {

    protected static FastReader scan = new FastReader();

    public String removeDotIfInt(String numString) {
        if (isFloat(numString)) {
            return numString;
        } else {
            int dotIdx = numString.indexOf('.');
            if (dotIdx == -1) return numString;
            else return numString.substring(0, dotIdx);
        }
    }

    public String inputNumber() {
        String token = scan.next();
        return token;
    }

    boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    boolean isNumber(String token) {
        if(isFloat(token) || isInt(token)) {
            return true;
        } else {
            System.out.println("[입력오류] : 숫자로 입력해주세요.");
            return false;
        }
    }

    boolean isFloat(String token) {
        return token.matches("[+-]?\\d*(\\.[0]*[1-9]+[0]*)");
    }

    boolean isInt(String token) {
        return token.matches("[+-]?\\d*(\\.[0]*)?");
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }
}
