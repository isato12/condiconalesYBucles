public class BucleDoWhile {
    

        public static void main(String[] args) {
            int multiplo = 1;
            int indice = 1;
            // bucle do while
            System.out.println("bucle do while");

            do {
                System.out.println(multiplo + " X " + indice + " = " + multiplo * indice);
                multiplo++;
            } while (multiplo <= 1);
        }
    }
