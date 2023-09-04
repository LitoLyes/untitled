import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        H6();
    }
        public static void H1(){

        int[] lockers = new int[4];

        lockers[0] = 0;
        lockers[1] = 2;
        lockers[2] = 4;
        lockers[3] = 6;

        int v = lockers[1] - lockers[0];
        boolean isarith = true;


        for (int i = 1; i < lockers.length && isarith; i++) {
            int diff = lockers[i] - lockers[i - 1];
            if (diff != v) {
                isarith = false;
            }
        }
        System.out.println(isarith);

        ///Homework 1

        int[] Numbers = {2, 5, -3, 11, 193, -2};
        int G = 0;

            for (int number : Numbers) {
                System.out.print(number + ",");

                G = G + number;

            }
        System.out.println();
        System.out.print(G);
    }
        public static void H2(){
        ///Homework 2

        System.out.println();

        int [] Nums = {3,5,0,11,1};
        int Count = 0;
        int S = 0;


        for (int I = 0;I <= 4;) {
            if (Nums[I] != 0){
                S = S + Nums[I];
                Count++;
            }
            I++;
        }
        if (Count == 0){
            System.out.println("0");
        }else {
            System.out.println(S / Count);
        }






        }
        public static void H3(){

        int[] Values = {-3,2,5,4,7};
        boolean Result = true;


        for (int N = 1;N < 5 && Result ;N++){
            if (Values[N] < Values[N-1]){
                Result = false;
            }
            System.out.println(Result);
        }
        }
        public static void H4(){

        int[] P = {5,4,-7,-2,-1};

        for (int N = 4; N >= 0;N--){
            System.out.print(P[N]+ ",");
        }
        }
        public static void H5(){
            int[] Numbers={-3,2,6,-11};
            int Sum = 0;
            for(int N = 0;N < Numbers.length;N++){
                 Sum = Sum + Numbers[N];

                System.out.print(Sum + " ");
            }

        }
        public static void H6(){

            int[] Numbers = {4,-3,-5,9,1,11};
            List<Integer> Smaller = new ArrayList<>();
            List<Integer> Larger = new ArrayList<>();
            int M = 1;

            for (int num : Numbers) {
                if (num < M) {
                    Smaller.add(num);
                }if (num > M){
                    Larger.add(num);
                }if (num == M){
                    System.out.println("This is m: " + M);
                }
            }
            System.out.println("Smaller: "+ Smaller);
            System.out.println("Larger: " + Larger);
        }
    }




