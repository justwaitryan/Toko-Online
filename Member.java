
package tokoonline;

import java.util.ArrayList;

public class Member implements User{
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public Member(){
    this.namaMember.add("Ali");
    this.alamat.add("Belimbing");
    this.telepon.add("081234567890");
    this.saldo.add(500000);
    
    this.namaMember.add("Roman");
    this.alamat.add("Panjen");
    this.telepon.add("081987654321");
    this.saldo.add(300000);
    
    }
    
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void editSaldo(int idMember, int saldo){
        this.saldo.set(idMember,saldo);
    }
    public int getJmlMember(){
        return this.saldo.size();
    }

    @Override
    public String getNama(int idMember) {
        return this.namaMember.get(idMember);
    }
    
    @Override
    public void setNama(String namaMember) {
        this.namaMember.add(namaMember);
    }
    @Override
    public String getAlamat(int idMember) {
        return this.namaMember.get(idMember);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public String getTelepon(int idMember) {
        return this.namaMember.get(idMember);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    
}
