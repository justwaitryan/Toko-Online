
package tokoonline;

import java.util.ArrayList;

public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Barang(){
    
        this.namaBarang.add("Nugget Ayam");
        this.stok.add(30);
        this.harga.add(5000);
        
        this.namaBarang.add("Pudding Caramel");
        this.stok.add(20);
        this.harga.add(8000);
        
        this.namaBarang.add("Keripik Pisang");
        this.stok.add(35);
        this.harga.add(10000);     
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    
    
    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }
 
    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);   
    }
    public int getStok(int idBarang) {
        return this.stok.get(idBarang);
    }
    public void setStok(int stok) {
        this.stok.add(stok);
    }
    public void editStok(int idBarang,int stok){
        this.stok.set(idBarang,stok);
    }
    public int getHarga(int idBarang) {
        return this.harga.get(idBarang);
    }
    public void setHarga(int harga) {
        this.harga.add(harga);
    }
}
