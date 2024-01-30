package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill b = new Bill();
				
		System.out.print("Sexo: ");
		b.gender = sc.next().charAt(0);

		while(((b.gender != 'F') && (b.gender != 'M')) && ((b.gender != 'f') && (b.gender != 'm'))) {
			System.out.print("Valor invalido! Favor digitar F ou M: ");
			b.gender = sc.next().charAt(0);
		}		
		
		System.out.print("Quantidade de cervejas: ");
		b.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		b.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		b.barbecue = sc.nextInt();
		
		System.out.println();
		System.out.println("RELATÓRIO");
		System.out.printf("Consumo = R$ %.2f", b.feeding());
		
		if (b.cover() == 0) {
			System.out.print("\nIsento de Couvert");
		}else {
			System.out.printf("\nCouvert = R$ %.2f", b.cover());
		}
		
		System.out.printf("\nIngresso = R$ %.2f", b.ticket());
		System.out.println();
		System.out.printf("\nValor a pagar = R$ %.2f", b.total());
		
		
		sc.close();
	}

}
