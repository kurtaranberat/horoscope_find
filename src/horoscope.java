import  java.util.Scanner;
public class horoscope {
     public  static  void  main (String[]args ){
         Scanner brt =new Scanner(System.in);

         System.out.print("dogdugunuz ayı giriniz = ");
         int n = brt.nextInt();

         System.out.print("doğduğunuz günü giriniz =");
         int   a = brt.nextInt();

         if (n==1 ){
              if ((a >0)&&(a<22))
                  System.out.print("Oğlak burcu ");
              else
                  System.out.print("Kova burcu ");
         }
         if (n==2 ){
             if ((a >0)&&(a<20))
                 System.out.print("Kova burcu ");
             else
                 System.out.print(" Balık burcu ");
         }
         if (n==3 ){
             if ((a >0)&&(a<21))
                 System.out.print(" Balık burcu ");
             else
                 System.out.print("Koç burcu  ");
         }


         if (n==4 ){
             if ((a >0)&&(a<21))
                 System.out.print("Koç burcu ");
             else
                 System.out.print("Boğa  burcu ");
         }

         if (n==5 ){
             if ((a >0)&&(a<22))
                 System.out.print("Boğa  burcu ");
             else
                 System.out.print("İkizler burcu  ");
         }

         if (n==6 ){
             if ((a >0)&&(a<23))
                 System.out.print("İkizler burcu ");
             else
                 System.out.print("Yengeç  burcu ");
         }

         if (n==7){
             if ((a >0)&&(a<23))
                 System.out.print("Yengeç  burcu ");
             else
                 System.out.print("Aslan  burcu ");
         }

         if (n==8 ){
             if ((a >0)&&(a<23))
                 System.out.print("Aslan  burcu");
             else
                 System.out.print("Başak burcu ");
         }

         if (n==9 ){
             if ((a >0)&&(a<23))
                 System.out.print("Başak burcu ");
             else
                 System.out.print("Başak burcu  ");
         }

         if (n==10 ){
             if ((a >0)&&(a<23))
                 System.out.print("Başak burcu  ");
             else
                 System.out.print("Akrep  burcu ");
         }

         if (n==11 ){
             if ((a >0)&&(a<22))
                 System.out.print("Akrep  burcu ");
             else
                 System.out.print("Yay burcu ");
         }

         if (n==12 ){
             if ((a >0)&&(a<22))
                 System.out.print("Kova burcu ");
             else
                 System.out.print("Oğlak burcu ");
         }







     }
}
