package CoffeeShopVer4;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
				
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("CoffeeShop�� ���Ű��� ȯ���մϴ�");
		System.out.println("1�� : ���̽� �Ƹ޸�ī��(5000��)");
		System.out.println("2�� : ���� ��(6000��)");
		System.out.println("3�� : ���� ��ī(6500��)");
		System.out.println("4�� : ���� ������ġ��(7000��)");
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








