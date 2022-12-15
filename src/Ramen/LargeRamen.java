package Ramen;

public  class LargeRamen extends ramen{
	
	@Override
	public ramen setSize(ramen currentramen) {
		 currentramen.size = "L";
		 return currentramen;
	}
	
	@Override
	public double Cost(){
		return  21.00;
	}

}
