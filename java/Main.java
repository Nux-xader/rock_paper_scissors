import java.util.Random;
import java.util.Scanner;

class Output {

	void penilaian(int pilihan) {
		String[] item = {"Gunting", "Kertas", "Batu"};
		String win = "Kamu Menang :)";
		String lose = "Kamu Kalah :(";
		Random rand = new Random();
		int i = rand.nextInt(3);
		if (pilihan < 0 || pilihan > 2) {
			System.out.println("Pilihan tidak tersedia pada menu!");
		} else {
			System.out.print("Komputer memilih : ");
			System.out.println(item[i]);
			if (pilihan == i) {
				System.out.println("Seri !!!");
			} else if (pilihan == 0 && i == 1) {
				System.out.println(win);
			} else if (pilihan == 0 && i == 2) {
				System.out.println(lose);
			} else if (pilihan == 1 && i == 0) {
				System.out.println(lose);
			} else if (pilihan == 1 && i == 2) {
				System.out.println(win);
			} else if (pilihan == 2 && i == 0) {
				System.out.println(win);
			} else if (pilihan == 2 && i == 1) {
				System.out.println(lose);
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		// deklarasi variable
		int pilihan;
		boolean lagi;
		Scanner input = new Scanner(System.in);
		Output output = new Output();
		System.out.println("-===-Game Gunting Kertas Batu-===-");
		while (true) {
			System.out.print("1. Gunting\n2. Kertas\n3. Batu\nPilih : ");
			pilihan = input.nextInt();
			pilihan--;
			output.penilaian(pilihan);
			while (true) {
				System.out.print("Main lagi? (1.ya, 2.Tidak) : ");
				pilihan = input.nextInt();
				if (pilihan == 1) {
					lagi = true;
					break;
				} else if (pilihan == 2) {
					lagi = false;
					break;
				} else {
					System.out.println("Pilihan salah!");
				}
			}
			if (!lagi) {
				break;
			}
		}
	}
}

