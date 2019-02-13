public class testKomplexaTal {

    public static void main(String[] args) {
     //Nummrena n1 och n2 för att bestämma två komplexa tal, för att sedan använda dem vidare
        Komplex n1 = new Komplex(3.4, 5.6),
                n2 = new Komplex(3.4, 5.0),
                temp;

        temp = add(n1, n2);

        //Printa summan
        System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);


        //Printa produkten
        t2 x1 = new t2();
        double[] k =x1.multiply(n1,n2);
        Sustem.ot.println ("Multiplikation: ")
        System.out.println(k[0]);
        System.out.println(k[1]);
    }
}