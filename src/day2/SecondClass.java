package day2;

import java.util.HashMap;
import java.util.Map;

public class SecondClass {

    public static void main(String[] args) {

        if(1==1){
            System.out.println("uvek tacna");
        }//always true

        if (2 != 2) {
            System.out.println("netacna");
        }//telo senece izvrsiti jer je izjava netacna

        if (1 == 1 && 2>1){
            // true && true -> true
            System.out.println("oba uslova tacna");
        }
        if (1 == 1 && 2>3){
            // true && false -> false
            System.out.println("oba uslova nisu tacna");
        }
        if (1 == 1 || 2>3){
            // true or false -> true
            System.out.println("dovoljno da jedan bude tacan");
        }

        if (1 < 1){//zameni sa 1 == 1 izvrsice se samo prvi uslov
            System.out.println("1 < 1");
        } else if (1 == 1){//inace ce se izvrsiti ovaj
            System.out.println("1 == 1");
        } else System.out.println("1 > 1");// ovaj se nece izvrsavati, moze se pozvati i sa else if ili samo else

        String str = "P";

        switch (str){
            case "A":
                System.out.println("String je A");//ostampa sve jer nema break ako je str A
            case "B":
                System.out.println("String je B");//ostampa sve odavde pa nadalje jer nema break ako je str B
            default:
                System.out.println("Nema takvog stringa");//ostampa samo poslednje ako takvog nema
        }
        String str1 = "A";// Integer br = 1 case 1:

        switch (str1){
            case "A": {
                System.out.println("String je A");
                break;
            }
            case "B":{
                System.out.println("String je B");
                break;
            }
            default:
            {
                System.out.println("Nema takvog stringa");
                break;
            }
        }
        TypesOfColors[] colorArray = TypesOfColors.values();

        for(int i = 0; i < colorArray.length; i++){// dinamicki nacin za duzinu
            System.out.println(colorArray[i]);
        }

        for (int i = 1; i <= 10; i++){//staticki mozemo zameniti i <= n neki broj koji nam odgovara
            //i = 0 ; ovo bi bila beskonacna petlja
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        // for each value of type color in color array we do something
        for (TypesOfColors color : colorArray){//mnogo jednostavnije
            System.out.println(color);
        }

        Map<String, Integer> phoneList = new HashMap<>();
        phoneList.put("tel1", 100);
        phoneList.put("tel2", 200);
        phoneList.put("tel3", 150);

        for (String key : phoneList.keySet()){
            System.out.println(phoneList.get(key));
            System.out.println(key);
        }

        System.out.println("-----------------------------------------");
        int i = 0;
        while(i < colorArray.length){
            System.out.println(colorArray[i]);// ili ovde mozemo u zagradi i++
            i++;
        }
        //display first 3 eve numbers
        int j = 1;
        int count = 0;
        while(j <= 10 && count < 3){
            if (j%2 ==0){
                count++;
                System.out.println(j);
                //j++ ne moze ovde petlja bi bila beskonacna
            }
            j++;// da je u if petlji prvi put kad bi if bio falce j se ne bi uvecalo
        }

        int k = 0;//izvrsice se bar jednom sa serverom proveravao stanje da li je nesto gotovo
        do {
            System.out.println(colorArray[k]);
            k++;
        }while (k < colorArray.length);

//        String status = "UP";
//        do {
//            String current = status;
//            //complex code to execute
//        }while (status = "Down");//current se ne moze koristiit u while jer ne postoji van {}
    }

}
