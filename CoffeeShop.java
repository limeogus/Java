package CoffeeShopVer4;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
				
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("CoffeeShop에 오신것을 환영합니다");
		System.out.println("1번 : 아이스 아메리카노(5000원)");
		System.out.println("2번 : 까페 라떼(6000원)");
		System.out.println("3번 : 까페 모카(6500원)");
		System.out.println("4번 : 녹차 프라프치노(7000원)");
		System.out.println("+++++++++++++++++++++++++++++++");
		
		Guest hyojin = new Guest(5000);
		Staff staff = new Staff();	
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		hyojin.addMoney(5000);
		
		while(flag){
			System.out.print("Guest : ");
			int choiceMenu = scan.nextInt();
			
			staff.selectMenu(choiceMenu);
			staff.menuConfirm();
			
			System.out.print("Guest : ");
			int answer = scan.nextInt();
			
			if(answer ==1){
				staff.calculate();
				flag = false;
			}else{
				staff.reSelect();
				flag = true;
			}
		}//end of while
		
		hyojin.pay();
		staff.moneyCheck(hyojin.money);
		staff.finalComment();	

	}

}








