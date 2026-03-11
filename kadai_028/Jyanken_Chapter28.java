package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		while( !input.equals("r") && !input.equals("s") && !input.equals("p")) {
			System.out.println("正しいじゃんけんの手を入力してください");
			scanner = new Scanner(System.in);
			input = scanner.next();
			System.out.println(input);
		}
		
		scanner.close();
		
		return input;
		
	}
	
	public String getRandom() {
		
		String[] choice = {"r", "s", "p"};
		
		int randNum = (int)(Math.floor(Math.random() * 3));
		
		return choice[randNum];
	}
	
	public void playGame(String myChoice, String randChoice) {
		
		HashMap<String, String> jyankenMap = new HashMap<>();
		
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p",  "パー");
		
		System.out.println("自分の手は" + jyankenMap.get(myChoice) + ",対戦相手の手は" + jyankenMap.get(randChoice));
		
		if(myChoice.equals(randChoice)) {
			System.out.println("あいこです");
		} else {
			switch(myChoice) {
			case "r":
				if(randChoice == "s") {
					System.out.println("自分の勝ちです");
				} else {
					System.out.println("自分の負けです");
				}
				break;
			case "s":
				if(randChoice == "p") {
					System.out.println("自分の勝ちです");
				} else {
					System.out.println("自分の負けです");
				}
				break;
			case "p":
				if(randChoice == "r") {
					System.out.println("自分の勝ちです");
				} else {
					System.out.println("自分の負けです");
				}
				break;
				
			}
		}
	}

}
