package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(numberToWords(123));
    }

    public static Boolean isPalindrome(int number){
        int num = Math.abs(number);
        char[] n = String.valueOf(num).toCharArray();
        String yeni = "";
        for (int i = n.length - 1; i >= 0; i--){
            yeni = yeni + n[i];
        }

        return String.valueOf(num).equals(yeni);
    }

    public static Boolean isPerfectNumber(int num) {
        int toplam = 0;
         for(int i = 1;i < num;i++){
             if(num % i == 0) {
                 toplam += i;
             }
         }
         return num == toplam;

    }


    public static String numberToWords(int num2) {
        if(num2 < 0 ){
            return "Invalid Value";
        }
        String result = "";
        String[] numbers = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        char[] n = String.valueOf(num2).toCharArray();
        for(int i = 0;i < n.length;i++){
            result += numbers[Character.getNumericValue(n[i])] + " ";
        }
        return result.trim();

    }


}
