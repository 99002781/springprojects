package com.lts.foodwiring;
import java.util.List;
import com.lts.foodwiring.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class FoodPanda{
	@Autowired
	@Qualifier("chinese")
	Menu cmenu;
	@Autowired
	@Qualifier("indian")
	Menu imenu;
	public List<String> showMenu(String choice) {
	
	if(choice.equals("Chinese")){
		return cmenu.itemsAvailable();
	}
	else if(choice.equals("Indian")) {
		return imenu.itemsAvailable();
	}
	return null;
	}
}


