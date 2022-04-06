package kuis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("FORM PENDAFTARAN PT.UDIN");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.print("Pilih Jenis Form : ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                System.out.println("\nFORM PENDAFTARAN");
                System.out.print("Input NIK : ");
                int nik = input.nextInt();
                input.nextLine();
                System.out.print("Input Nama : ");
                String nama = input.nextLine();
                System.out.print("Input Nilai Tes Tulis : ");
                int tulis = input.nextInt();
                System.out.print("Input Nilai Tes Coding : ");
                int coding = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara : ");
                int wawancara = input.nextInt();
                Android android = new Android(nik, nama, tulis, coding, wawancara);

                do {
                    System.out.println("\nMENU");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int menu = input.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.println("\nFORM EDIT");
                            System.out.print("Input Nilai Tes Tulis : ");
                            android.inputTulis(input.nextInt());
                            System.out.print("Input Nilai Tes Coding : ");
                            android.inputCoding(input.nextInt());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            android.inputWawancara(input.nextInt());
                            break;
                        case 2:
                            System.out.println("Nilai Akhir : " + android.NilaiTotal());
                            System.out.println("KETERANGAN : " + android.Keterangan());
                            break;
                        case 3:
                            input.close();
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                } while (true);
            } else if (pilih == 2) {
                System.out.println("\nFORM PENDAFTARAN");
                System.out.print("Input NIK : ");
                int nik = input.nextInt();
                input.nextLine();
                System.out.print("Input Nama : ");
                String nama = input.nextLine();
                System.out.print("Input Nilai Tes Tulis : ");
                int tulis = input.nextInt();
                System.out.print("Input Nilai Tes Coding : ");
                int coding = input.nextInt();
                System.out.print("Input Nilai Tes Wawancara : ");
                int wawancara = input.nextInt();
                Web web = new Web(nik, nama, tulis, coding, wawancara);

                do {
                    System.out.println("\nMENU");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    int menu = input.nextInt();
                    switch (menu) {
                        case 1:
                            System.out.print("Input Nilai Tes Tulis : ");
                            web.inputTulis(input.nextInt());
                            System.out.print("Input Nilai Tes Coding : ");
                            web.inputCoding(input.nextInt());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            web.inputWawancara(input.nextInt());
                            break;
                        case 2:
                            System.out.println("Nilai Akhir : " + web.NilaiTotal());
                            System.out.println("KETERANGAN : " + web.Keterangan());
                            break;
                        case 3:
                            input.close();
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                } while (true);
            } else {
                System.out.println("== Input SALAH ==");
                System.out.println("Mohon Input Ulang");
            }
            input.close();
        } catch (Exception error) {
            System.out.println("Error karena " + error.getMessage());
        }
    }
}
