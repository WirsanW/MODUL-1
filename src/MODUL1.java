import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class MODUL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama                      : ");
        String nama = input.nextLine();
        System.out.print("Jenis kelamin (L/P)       : ");
        String kelamin = input.nextLine();
        char jenisKelamin = kelamin.toUpperCase().charAt(0);
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggal = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggal);

        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, sekarang);
        int tahun = period.getYears();
        int bulan = period.getMonths();

        if (jenisKelamin == 'p' || jenisKelamin == 'P'){
            System.out.println("Nama            :"+nama);
            System.out.println("Jenisn Kelamin  :Perempuan");
            System.out.println("Tanggal Lahir   :"+tanggal);
            System.out.println("Umur Anda: " + tahun + " tahun " + bulan + " bulan ");
        }
        else if (jenisKelamin == 'l' || jenisKelamin == 'L'){
            System.out.println("Nama            :"+nama);
            System.out.println(" Jenis Kelamin  :Laki-Laki");
            System.out.println("Tanggal Lahir   :"+tanggal);
            System.out.println("Umur Anda: " + tahun + " tahun" + bulan + " bulan ");
        }

        input.close();
    }
}