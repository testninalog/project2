package day2;

public class SeconClass1 {
    public static void main(String[] args) {
        int j = 1;
        int count = 0;
        while(j <= 10){
            if (j%2 ==0){
                count++;
                System.out.println(j);
            }
            // moze i ovde j++;
            if (count == 3){
                break;
            }
            j++;// bolje je da bude na kraju
        }

        String str = "C";
        switch (str){
            case "A": {
                System.out.println("String je A");
                break;
            }
            case "B":
            case "C":{//moze za vise opcija isti deo koda
                System.out.println("String je B");
                break;
            }
            default:
            {
                System.out.println("Nema takvog stringa");
                break;//ovde ne mora jer je poslednji deo koda
            }
        }

        System.out.println("-------------------------------------------");
        int i =0;
        while(++i <=10){//krece od 1, ali uvek treba teziti lakse citljivom i jednostavnijem
            System.out.println("i je = " + i);
            if (i == 6){//kad se radi samo neka provera
                continue;
               // System.out.println(i + "/2");
            }

            if (i % 4 == 0) {
                System.out.println(i + "/4");
            }
            //i++;
        }

        int n = 2017;
        boolean isPrime = true;

        for (int k = 2; k < n; k++){// moze k<= n/2 jer u matematici ako nema delioca do pola, nece ih biti ni posle
            if(n % k == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Is a prime");
        }else System.out.println("Not a prime");

    }
}
