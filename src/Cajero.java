public class Cajero {
    static int total;

    public Cajero(int total){
        this.total = total;
    }


    public  void totalApagar() {

        ticket();
    }

    public static void ticket() {
        System.out.println("el precio total a pagar es de: " + total);
    }

}
