package Ramen;

public class NormalRamen extends ramen{
	
	@Override
	public ramen setSize(ramen currentramen) {
		 currentramen.size = "N";
		 return currentramen;
	}
	
	@Override
	public double Cost(){
		return  17.00;
	}

}
