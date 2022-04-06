package Task17;

import java.util.Scanner;

public class horoscopeFindingProgram {
    /*
    * Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev
Aynı örneği switch-case kullanmadan yapınız.
    * */
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int month,day;
        String horoscope = null;
        System.out.println("***** Horoscope Finding *****");
        System.out.println("Please enter month (1 to 12)");
        month=scanner.nextInt();
        while(month<1||month>12){
            System.out.println("Please enter month (1 to 12)");
            month=scanner.nextInt();
        }
        System.out.println("Please enter day (1 to 12)");
        day=scanner.nextInt();
        while(day<1||day>31){
            System.out.println("Please enter day (1 to 12)");
            day=scanner.nextInt();
        }
        if(month==1){
            if(day<=19){horoscope="Capricorn";}
            if(day>19){horoscope="Aquarius";}
        }
        if(month==2){
            if(day<=18){horoscope="Aquarius";}
            if(day>18){horoscope="Pisces";}
        }
        if(month==3){
            if(day<=19){horoscope="Pisces";}
            if(day>19){horoscope="Aries";}
        }
        if(month==4){
            if(day<=19){horoscope="Aries";}
            if(day>19){horoscope="Taurus";}
        }
        if(month==5){
            if(day<=20){horoscope="Taurus";}
            if(day>20){horoscope="Gemini";}
        }
        if(month==6){
            if(day<=21){horoscope="Gemini";}
            if(day>21){horoscope="Cancer";}
        }
        if(month==7){
            if(day<=22){horoscope="Cancer";}
            if(day>22){horoscope="Leo";}
        }
        if(month==8){
            if(day<=22){horoscope="Leo";}
            if(day>22){horoscope="Virgo";}
        }
        if(month==9){
            if(day<=22){horoscope="Virgo";}
            if(day>22){horoscope="Libra";}
        }
        if(month==10){
            if(day<=22){horoscope="Libra";}
            if(day>22){horoscope="Scorpio";}
        }
        if(month==11){
            if(day<=21){horoscope="Scorpio";}
            if(day>21){horoscope="Sagittarius";}
        }
        if(month==12){
            if(day<=21){horoscope="Sagittarius";}
            if(day>21){horoscope="Capricorn";}
        }
        System.out.println("Your zodiac sign: "+ horoscope);
    }
}

