package guru.qa;

public class FirstClass {

    public static void main(String[] args) {

        String aS = "исходные данные:";
        String aS1 = "результаты вычислений:";

        byte b = 45;
        short s = 1005;
        int i = 700_000, r1 = i/b,  r2 = i%b;
        float f = 4.55f;
        char c = 'c';
        long l = 2147483648L;
        double d = 1.456, r3 = (f * b) + (i/c) - (d * s);
        boolean bol = false;

        System.out.println("\n"+aS);

        System.out.println("b = "+b);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("c = "+c);
        System.out.println("l = "+l);
        System.out.println("bol = "+bol);


        System.out.println("\n"+aS1);

        System.out.println("i / b = "+r1);
        System.out.println("i % b = "+r2);
        System.out.println("(f * b) + (i/c) - (d * s) = "+r3);
        System.out.println("--b = "+ --b);
        System.out.println("++c = "+ ++c);

        System.out.println("i < f - " + (i < f));
        System.out.println("i >= f - " + (i >= f));
        System.out.println("c > (i + b) - " + (c > (i + b)));
        System.out.println("(i < f) && (d <= c) - " + ((i < f) && (d <= c)));
        System.out.println("(i == f) || (d != c) - " + ((i == f) || (d != c)));
        System.out.println("! ((i < f) || (d <= c)) - " + (!(i < f) || (d >= c)));
        System.out.println("!bol - " + !bol + "\n");


        System.out.println("Переполнение:" + "\n" + " [" + Byte.MIN_VALUE +" , " +  Byte.MAX_VALUE + "]");
        System.out.println("Byte.SIZE  =   " + Byte.SIZE);

        byte n = 120;
        System.out.println("n = "+n);

        n += 19;
        System.out.println("n += 19 - " + n);
    }
}
