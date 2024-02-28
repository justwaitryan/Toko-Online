
package tokoonline;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang barang = new Barang ();
        Transaksi transaksi = new Transaksi ();
        Member member = new Member();
        Laporan laporan = new Laporan ();
        
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi, barang);
        
        transaksi.prosesTransaksi(member, transaksi, barang);
        
        laporan.laporan(transaksi, barang);
        laporan.laporan(barang);
        laporan.laporan(member);
       
    }
    
}
