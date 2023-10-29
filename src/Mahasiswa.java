import java.util.Scanner;

public class Mahasiswa {
private String NAMA;
private String NIM;
private String Pass;

    public String getNAMA() {
        return NAMA;
    }

    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public void daftar(){
        System.out.println("=====Daftar=====");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        NAMA = sc.nextLine();
        if (NAMA.matches("[a-z, A-Z]+")){
            setNAMA(NAMA);
            System.out.print("NIM : ");
            NIM = sc.nextLine();
            if (NIM.matches("[0-9]{15}")){
                setNIM(NIM);
                System.out.print("Password : ");
                Pass = sc.nextLine();
                if (Pass.matches("[a-z. A-Z]{8}")){
                    setPass(Pass);
                }else {
                    System.out.println("Inputan minimal 8 karakter");
                    daftar();
                }
            }else {
                System.out.println("Inputan tidak boleh kurang atau lebih dari 15 angka");
                daftar();
            }
        }else {
            System.out.println("Inputan harus berupa karakter");
            daftar();
        }
        }

    public void tampil(){
        System.out.println("Selamat " +getNAMA() + " Anda berhasil daftar");
        System.out.println("Berikut username dan password anda");
        System.out.println("Username : "+getNIM());
        System.out.println("Password : "+getPass());
    }

    public static void main(String[] args) {
        Mahasiswa mn = new Mahasiswa();
        mn.daftar();
        mn.tampil();
    }
}
