package CoffeeShopVer4;

public class Staff {
	//Field
	String menu="";
	int price=0;
	
	//Constructor
	public Staff(){
		System.out.println("Staff : 주문하시겠습니까?(번호로)");		
	}
	
	//getter, setter method
	public String getMenu(){		return menu;	}
	public void setMenu(String menu){		this.menu = menu;	}
	public int getPrice(){		return price;	}
	public void setPrice(int price){	this.price = price;	}	
	
	//Method
	public void selectMenu(int choiceMenu){
		switch(choiceMenu){
		case 1:
			menu = "아메리카노";
			price = 5000;
			break;
		case 2:
			menu = "라떼";
			price=6000;
			break;
		case 3:
			menu="모카";
			price=6500;
			break;
		case 4:
			menu="프라프치노";
			price=7000;
			break;
		default:
			menu="";
			price=0;
		}
		
	}
	
	public void menuConfirm(){
		System.out.println("Staff : 주문하신 메뉴가 " + menu 
				+ " 맞습니까?(맞으면 1, 다시선택 2)");
	}
	
	public void reSelect(){
		System.out.println("Staff : 메뉴를 다시 선택해 주세요.");
	}
	

	public void calculate(){
		System.out.println("Staff : 금액이 "+ price + "입니다.");
	}
	
	public void moneyCheck(int money){
		
		if(price == money){
			System.out.println("Staff : 금액이 정확합니다.");
		}else if(price < money){
			int change = money-price;
			System.out.println("Staff : 거스름돈은 "+change+" 입니다.");
		}else if(price > money){
			System.out.println("Staff : 금액이 부족합니다.");
		}		
		
	}
	
	
	public void finalComment(){
		System.out.println("Staff : 주문이 완료되었습니다. 오른쪽에서 기다려 주세요");
	}	
	
	
	
}










