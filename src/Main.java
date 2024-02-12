import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*

        System.out.println("please give a value 1");
        int value1=scan.nextInt();
        System.out.println(isPalindrome(value1)); */

       /* System.out.println("please give a value 2");
        int value2=scan.nextInt();
        System.out.println(isPerfectNumber(value2));*/

        System.out.println("please give a value 3");
        int value3=scan.nextInt();
        System.out.println(numberToWords(value3));

    }

    public static boolean isPalindrome (int num){
        int originalNum = num;
        int reverseNum = 0;

        while (num != 0) {
            int kalan = num % 10;
            reverseNum = reverseNum * 10 + kalan;
            num = num / 10;
        }

        return originalNum == reverseNum;
    }

  public static boolean isPerfectNumber (int number){
      if (number <= 1) {
          return false;
      }
      int toplam = 0; //
      for (int i = 1; i< number; i++) {
          if (number % i == 0) {
              toplam += i;
          };

               }      return toplam == number;
         }
    public static String numberToWords (int sayi) {

        String[] kelime = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        int birler = sayi % 10;
        int onlar = sayi / 10;
        String sonuc = "";

        if (sayi < 0) {
            System.out.println("Invalid Value");
        }
        else if (sayi < 10) {
            return sonuc += kelime[birler];
        }
       else {
        return sonuc+=kelime[onlar]+" "+kelime[birler];
        }

        return sonuc;
    };

}