import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Mahasiswa
        System.out.println("UNIVERSITAS DUTA BANGSA SURAKARTA");
        System.out.println("FAKULTAS ILMU KOMPUTER");
        System.out.println("=======================================================");
        System.out.println();
        System.out.println("KARTU RENCANA STUDI MAHASISWA");
        System.out.println("-------------------------------------------------------");

        System.out.print("Nama Mahasiswa\t\t: ");
        String nama = scanner.nextLine();

        System.out.print("NIM\t\t\t: ");
        String nim = scanner.nextLine();

        System.out.print("Kelas\t\t\t: ");
        String kelas = scanner.nextLine();

        System.out.print("Program Studi\t\t: ");
        String programStudi = scanner.nextLine();

        System.out.print("Pembimbing Akademik\t: ");
        String pembimbing = scanner.nextLine();

        // Input KRS
        System.out.println();
        System.out.println("=======================================================");
        System.out.println("MATA KULIAH YANG DIAMBIL MAHASISWA :");
        System.out.println("-------------------------------------------------------");

        System.out.print("Matakuliah 1\t\t= ");
        String matkul1 = scanner.nextLine();
        System.out.print("SKS\t\t\t= ");
        String sks1 = scanner.nextLine();
        System.out.println("---------------------------");

        System.out.print("Matakuliah 2\t\t= ");
        String matkul2 = scanner.nextLine();
        System.out.print("SKS\t\t\t= ");
        String sks2 = scanner.nextLine();
        System.out.println("---------------------------");

        System.out.print("Matakuliah 3\t\t= ");
        String matkul3 = scanner.nextLine();
        System.out.print("SKS\t\t\t= ");
        String sks3 = scanner.nextLine();
        System.out.println("---------------------------");

        System.out.print("Matakuliah 4\t\t= ");
        String matkul4 = scanner.nextLine();
        System.out.print("SKS\t\t\t= ");
        String sks4 = scanner.nextLine();
        System.out.println("---------------------------");

        System.out.print("Matakuliah 5\t\t= ");
        String matkul5 = scanner.nextLine();
        System.out.print("SKS\t\t\t= ");
        String sks5 = scanner.nextLine();
        System.out.println("--------------------------");
        System.out.println("-------------------------------------------------------");
    }
}
