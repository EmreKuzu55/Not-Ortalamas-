package sa;

import java.util.Scanner;

public class Not {

	public static void main(String[] args) {

		int Mat, Fizik, Turkce, Kimya, Muzik;

		Scanner input = new Scanner(System.in);
		System.out.print("Matematik Notunuzu Giriniz :");
		Mat = input.nextInt();
		if (Mat > 0 && Mat < 100) {
			Mat = Mat;
		} else {
			Mat = 0;
		}

		System.out.print("Fizik Notunuzu Giriniz :");
		Fizik = input.nextInt();
		if (Fizik > 0 && Fizik < 100) {
			Fizik = Fizik;
		} else {
			Fizik = 0;
		}

		System.out.print("Türkçe Notunuzu Giriniz :");
		Turkce = input.nextInt();
		if (Turkce > 0 && Turkce < 100) {
			Turkce = Turkce;
		} else {
			Turkce = 0;
		}

		System.out.print("Kimya Notunuzu Giriniz :");
		Kimya = input.nextInt();
		if (Kimya > 0 && Kimya < 100) {
			Kimya = Kimya;
		} else {
			Kimya = 0;
		}

		System.out.print("Müzik Notunuzu Giriniz :");
		Muzik = input.nextInt();
		if (Muzik > 0 && Muzik < 100) {
			Muzik = Muzik;
		} else {
			Muzik = 0;
		}

		int average = (Turkce + Fizik + Mat + Kimya + Muzik) / 5;

		if (average < 55) {
			System.out.println("Sınıfı Geçemediniz :" + average);
		} else {
			System.out.println("Sınıfı Geçtiniz :" + average);
		}

	}

}
