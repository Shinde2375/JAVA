package com.tka.hw.prog8;

public class Phone {
	int MobNumber;
	int cost;
	@Override
	public String toString() {
		return "Phone [MobNumber=" + MobNumber + ", cost=" + cost + "]";
	}
	public Phone(int mobNumber, int cost) {
		super();
		MobNumber = mobNumber;
		this.cost = cost;
	}
		public Phone()
		{
			
		}
	
}

