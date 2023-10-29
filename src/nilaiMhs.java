import java.util.Scanner;

public class nilaiMhs {
private int NilaiProgdas;
private int Nilaikalkulus;
private int NilaiOrkom;
private double Hasil;

    public int getNilaiProgdas() {
        return NilaiProgdas;
    }

    public void setNilaiProgdas(int nilaiProgdas) {
        NilaiProgdas = nilaiProgdas;
    }

    public int getNilaikalkulus() {
        return Nilaikalkulus;
    }

    public void setNilaikalkulus(int nilaikalkulus) {
        Nilaikalkulus = nilaikalkulus;
    }

    public int getNilaiOrkom() {
        return NilaiOrkom;
    }

    public void setNilaiOrkom(int nilaiOrkom) {
        NilaiOrkom = nilaiOrkom;
    }


    public void hitungRata(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai Anda : ");
        System.out.print("Nilai Progdas Anda : ");
        NilaiProgdas = input.nextInt();
        setNilaiProgdas(NilaiProgdas);
        System.out.print("Nilai Orkom Anda : ");
        NilaiOrkom = input.nextInt();
        setNilaiOrkom(NilaiOrkom);
        System.out.println("Nilai Kalkulus Anda : ");
        Nilaikalkulus = input.nextInt();
        setNilaikalkulus(Nilaikalkulus);

        Hasil = (Nilaikalkulus+NilaiOrkom+NilaiProgdas)/3;
    }

    public void cekNilai(){
        System.out.println("Progdas : "+getNilaiProgdas());
        System.out.println("Orkom : "+getNilaiOrkom());
        System.out.println("Kalkulus : "+getNilaikalkulus());
        System.out.println("Hasil : "+Hasil);

        if (Hasil >=70){
            System.out.println("Status : LULUS");
        } else{
        System.out.println("Status : TIDAK LULUS");
    }
}

    public static void main(String[] args) {
        nilaiMhs nilai = new nilaiMhs();
        nilai.hitungRata();
        nilai.cekNilai();
    }
}