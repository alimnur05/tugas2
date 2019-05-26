package tugas2;

/**
 *
 * @author acer
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        toko saya = new toko();
        saya.produksi();
        saya.jual();
        saya.pesan();
        
        System.out.println("\nJumlah baju   : "+saya.baju);
        System.out.println("Jumlah celana : "+saya.celana);
        System.out.println("Jumlah topi   : "+saya.topi);
    }
    
}
