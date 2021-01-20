package exerciseFivePointOneOne;

public class Addition {
    public static void main(String[] args) {
        System.out.println( Math.addExact(1,2));
        System.out.println(addition("a","1","1"));
        System.out.println(Math.min(1,Math.min(3,4)));
        System.out.println( min(1,3,4));

    }

    public static int addition(int a,int b,int c) {
        int total=a+b+c;
        return total;

    }
    public static String addition(String a,String b,String c) {
        String total=a+b+c;
        return total;

    }

    public static int min(int a,int b,int c) {
        int min=(Math.min(a,Math.min(b,c)));
        return min;
    }
}

