package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scrivere un programma che consente di creare delle ricette personalizzate.

		All'avvio del programma è presente un elenco di ingredienti predefiniti.

		Per ogni ingrediente è specificato:

		nome dell'ingrediente
		calorie per unità (gr o ml)
		L'utente inserisce il nome della ricetta, e sceglie tra l'elenco degli ingredienti disponibili (da visualizzare) uno o più ingredienti, indicando:

		nome dell'ingrediente
		quantità
		(dopo ogni ingrediente chiedere se se ne vuole aggiungere un altro)
		
		Alla fine dell'inserimento, mostrare il numero di calorie totali*/
		Scanner sc=new Scanner(System.in);
		String[] ingredienti= {"insalata  ","uova      ","pomodori  ","guanciale ","patate    ","formaggio ","cipolla   ",
				               "latte     ","acqua     ","olio      ","caffè     ","savoiardi ","mascarpone","cacao     ","pasta     "};
		int[] calorie= {200,300,40,500,150,70,230,50,65,12,110,45,85,350,60,75};
		ArrayList<String> ricetta=new ArrayList<>();
		ArrayList<Integer> listaQuantità=new ArrayList<>();
		int i,quantità,calorieTot=0,calorieIng;
		String nome,prodotto,risposta;
		for(i=0;i<calorie.length;i++);
		System.out.println("gli ingrediente a tua disposizione sono: ");
		for(i=0;i<ingredienti.length;i++) {	
			System.out.println( ingredienti[i]+ "  " + calorie[i] );
		}
		System.out.println("inserisci il nome della ricetta");
		nome=sc.nextLine();
		do {
		System.out.println("quale ingrediente vuoi aggiungere ?");
		prodotto=sc.nextLine();
 			System.out.println("inserire la qauntità");
			quantità=Integer.parseInt(sc.nextLine());
			ricetta.add(prodotto);
			listaQuantità.add(quantità);
			calorieIng=calorie[i]*quantità;
			calorieTot=calorieTot+calorieIng;
		System.out.println("vuoi aggiungere un altro ingrediente ?");
		risposta=sc.nextLine();
		}while(risposta.equals("si"));
		System.out.println("le calorie totali della ricetta sono: " + calorieTot);
	}
 
}
