package CoffeeShopVer4;

public class Staff {
	//Field
	String menu="";
	int price=0;
	
	//Constructor
	public Staff(){
		System.out.println("Staff : �ֹ��Ͻðڽ��ϱ�?(��ȣ��)");		
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
			menu = "�Ƹ޸�ī��";
			price = 5000;
			break;
		case 2:
			menu = "��";
			price=6000;
			break;
		case 3:
			menu="��ī";
			price=6500;
			break;
		case 4:
			menu="������ġ��";
			price=7000;
			break;
		default:
			menu="";
			price=0;
		}
		
	}
	
	public void menuConfirm(){
		System.out.println("Staff : �ֹ��Ͻ� �޴��� " + menu 
				+ " �½��ϱ�?(������ 1, �ٽü��� 2)");
	}
	
	public void reSelect(){
		System.out.println("Staff : �޴��� �ٽ� ������ �ּ���.");
	}
	

	public void calculate(){
		System.out.println("Staff : �ݾ��� "+ price + "�Դϴ�.");
	}
	
	public void moneyCheck(int money){
		
		if(price == money){
			System.out.println("Staff : �ݾ��� ��Ȯ�մϴ�.");
		}else if(price < money){
			int change = money-price;
			System.out.println("Staff : �Ž������� "+change+" �Դϴ�.");
		}else if(price > money){
			System.out.println("Staff : �ݾ��� �����մϴ�.");
		}		
		
	}
	
	
	public void finalComment(){
		System.out.println("Staff : �ֹ��� �Ϸ�Ǿ����ϴ�. �����ʿ��� ��ٷ� �ּ���");
	}	
	
	
	
}










