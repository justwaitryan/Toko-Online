
package tokoonline;
import java.util.ArrayList;

public class Karyawan implements User {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Karyawan(){
        this.namaKaryawan.add("Slamet");
        this.alamat.add("Sawojajar");
        this.telepon.add("082543459465");
        this.jabatan.add(0);    
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmlKaryawan(){
        return this.jabatan.size();
    }

    
    @Override
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }
    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);   
    }
     @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    @Override
    public void setAlamat(String alamat) {
        this.namaKaryawan.add(alamat);
    }
    @Override
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
    @Override
    public void setTelepon(String telepon) {
        this.namaKaryawan.add(telepon);
    }
    
    
}
