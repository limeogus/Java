package CoffeeShopVer4;

public class Guest {
	//Field
	int money=0;
	
	//Constructor
	public Guest(){}
	
	public Guest(int money){ 
		this.money = money;
	}	
	
	//getter, setter method
	public int getMoney(){	return money;	}
	public void setMoney(int money){	this.money = money;	}
	
	//Method
	public void pay(){
		System.out.println("Guest : 여기 있습니다.");
	}
	
	public void addMoney(int money){
		this.money += money;
	}
	
}








