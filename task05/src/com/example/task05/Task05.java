package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int result=0;
        int num;
        while (x>0){
            num=x%10;
            if (num%2!=0){
                result++;
            }
            x/=10;
            System.out.println(result);
        }
        if(result==0) {
            return "TRUE";
        }
        else
            return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(1234);
        System.out.println(result);

    }

}
