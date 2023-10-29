import java.util.Scanner;

class saldoKurangexcep extends Exception{
    public saldoKurangexcep(String message) {
        super(message);
    }
}

public class saldoRek {
    public double saldo = 1000000;
    public double sisa;
    public double Tarik;
    public double sisaAkhir;

    public void penarikanSaldo() throws saldoKurangexcep{
        Scanner input = new Scanner(System.in);
        System.out.print("Penarikan Sejumlah : ");
        Tarik = input.nextDouble();
            try{
                if (Tarik >= saldo){
                    throw new saldoKurangexcep("Mohon Maaf Saldo Anda kurang");
                }
                sisa = saldo-Tarik;
                System.out.println("Sisa saldo anda sejumlah : "+sisa);
                System.out.println("Selamat Anda Berhasil Melakukan Penarikan");
            }catch(saldoKurangexcep e){
                System.out.println(e.getMessage());
            }

            System.out.println("Apakah anda ingin melakukan penarikan lagi? 1/0");
            int pilih = input.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Penarikan Sejumlah : ");
                    Tarik = input.nextDouble();
                        try{
                            if (Tarik >= sisa){
                                throw new saldoKurangexcep("Mohon Maaf Saldo Anda kurang");
                            }
                            sisaAkhir = sisa-Tarik;
                            System.out.println("Sisa saldo anda sejumlah : "+sisaAkhir);
                            System.out.println("Selamat Anda Berhasil Melakukan Penarikan");
                        }catch(saldoKurangexcep e){
                            System.out.println(e.getMessage());
                        }
                        case 0 :
                            break;
                    } }
    public static void main(String[] args) {
        saldoRek sr = new saldoRek();

        try {
            sr.penarikanSaldo();
        } catch (saldoKurangexcep e) {
            System.out.println(e.getMessage());
        }


    }
}
