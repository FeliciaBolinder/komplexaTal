public class Komplex {

    public Komplex (double real, double imag; {
        //real = reella delen, imag = imaginära delen
    }
        this.real = real;
        this.imag = imag;

}
    //Metod för addition av talen
    public static Komplex add(Komplex n1, Komplex n2)

    {
        Komplex temp = new Komplex(0.0, 0.0);

        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;

        return(temp);
    }
    //Metod för multiplikaton av talen
        public double[] multiply (double[] real, double[] imag) {


            double[] prod= {real[0]*imag[0] - real[1]*imag[1], real[1]*imag[0] + real[0]*imag[1]};
            return prod;
        }

    }

