package jana60.generalità;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//array
		Persona[] persona = new Persona[2];
			for (int i = 0; i < 2; i++) 
			{
			
			
			System.out.print("Inserisci i dati della persona numero " + (i+1));
			System.out.print("\nNome: ");
			String nome = scan.nextLine();
			System.out.print("Cognome:");
			String cognome = scan.nextLine();
			System.out.print("Abita in via: ");
			String via = scan.nextLine();
			System.out.print("Numero: ");
			String numero = scan.nextLine();
			System.out.print("Nella città di: ");
			String citta = scan.nextLine();
			
			Indirizzo indirizzo = new Indirizzo(via, numero, citta);
			persona[i] = new Persona(nome, cognome, indirizzo);
			}
			
			for (int i = 0; i < 2; i++)
			 {
				System.out.println("Persona" + (i+1) + " è " + persona[i].getNome() + " " + persona[i].getCognome());
				System.out.println("Abita in via " + persona[i].getIndirizzo().getVia() + " n°" + persona[i].getIndirizzo().getNumero());
				System.out.println("Nella città di " + persona[i].getIndirizzo().getCitta());
			 }
			
			System.out.println(" Persona 2 ha cambiato città, dimmi la nuova città: ");
			String cittaNuova = scan.nextLine();
			
			persona[1].getIndirizzo().setCitta(cittaNuova);
			
			System.out.println("Persona 1 vive a " + persona[0].getIndirizzo().getCitta());
			System.out.println("Persona 2 vive a " + persona[1].getIndirizzo().getCitta());
			
			scan.close();
	}

}
