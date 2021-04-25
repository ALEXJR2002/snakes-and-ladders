package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Game;

public class Menu {
	
	private final static int START = 1;
	private final static int SHOW_RANKING = 2;
	private final static int EXIT = 3;

	private Game game;
	
	private BufferedReader br;
		
	public Menu() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public void showMenu() {
		System.out.println("(1) Empezar nuevo juego");
		System.out.println("(2) Ver tablero de posiciones");
		System.out.println("(3) Salir del programa");
	}
	
	public int readOption() throws NumberFormatException, IOException {
		int choice = Integer.parseInt(br.readLine());
		return choice;
	}

	public void readGame() throws IOException {
		String firstLine = br.readLine();
		String[] parts = firstLine.split(" ");
		int rows = Integer.parseInt(parts[0]);
		int columns = Integer.parseInt(parts[1]);
		int snakes = Integer.parseInt(parts[2]);
		int ladders = Integer.parseInt(parts[3]);
		
		if(parts[4].contains("*") || parts[4].contains("!") || parts[4].contains("O") || parts[4].contains("X") || parts[4].contains("%") || parts[4].contains("$") || parts[4].contains("#") || parts[4].contains("+") || parts[4].contains("&")) {
			String players = parts[4];
			game = new Game(rows, columns, snakes, ladders, players);
		}
		else {
			int players = Integer.parseInt(parts[4]);
			game = new Game(rows, columns, snakes, ladders, players);
		}
	}
	
	public void showRankingBoard() {
		
	}
	
	public void doOperation(int choice) {
		switch(choice) {
			case START:
				try {
					readGame();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case SHOW_RANKING:
				showRankingBoard();
				break;
			case EXIT:
				System.out.println("�Adios!");
				break;
			default:
				System.out.println("Opcion invalida, repita nuevamente");
		}
	}
}