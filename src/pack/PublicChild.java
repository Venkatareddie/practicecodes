package pack;

import com.softworld.www.PublicModifier;

public class PublicChild {

	public static void main(String[] args) {
		PublicModifier p =new PublicModifier();
		System.out.println(p.name+ " "+p.age);
		p.message();
	}

}
