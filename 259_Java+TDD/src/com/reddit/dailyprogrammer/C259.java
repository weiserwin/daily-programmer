package com.reddit.dailyprogrammer;

public class C259 {


    /* EASY */

    public static int NOS2int(String input) {
        int sum = 0;
        int currentSeqValue = 0;
        for (char c : input.toCharArray()) {
        switch (Character.getNumericValue(c)) {
                case 0 : sum += ++currentSeqValue; break;
                case 1 : sum -= ++currentSeqValue; break;
                case 2 : sum *= ++currentSeqValue; break;
                default : break;
            }
        }
        return sum;
    }


    /* HARD */

    public static String initString(char c, int size) {
        String str = "";
        for (int i = 0; i < size ; i++) str += c;
        return (str);
    }

    public static char nextChar(char current) {
        char next = '0';
        switch (current) {
            case '0' : next = '1'; break;
            case '1' : next = '2'; break;
            case '2' : next = '0'; break;
        }
        return next;
    }

    public static String nextString(String current) {
        char[] next = current.toCharArray();
        int l = next.length - 1;
        next[l] = nextChar(next[l]);
        if (next[l] == '0') {
            l--;
            while (l > 0 && next[l] == '2') {
                next[l] = '0';
                l--;
            }
            next[l] = nextChar(next[l]);
        }
        return new String(next);
    }

    public static String int2NOS(int input) {
        boolean found = false;
        int strLength = 1;
        String result = "";
        while (!found) {
            String tmp = initString('0', strLength);
            String last = initString('2', strLength);
            while (!last.equals(tmp) && !found) {
                if (NOS2int(tmp) == input) {
                    found = true;
                    result = tmp;
                } else tmp = nextString(tmp);
            }
            strLength++;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " : " + int2NOS(i));
        }
    }
}
