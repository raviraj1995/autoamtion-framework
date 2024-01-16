package Reusable;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	
	public static void getDropdownOptions(WebElement element,String valueToBeSelected) {
		Select select=new Select(element);
		select.selectByVisibleText(valueToBeSelected);

	}
	
	public void selectRadioButtons(List<WebElement> element,String valueToBeSelected) {
		
		for(int i=0;i<element.size();i++) {
			if(element.get(i).getText().equalsIgnoreCase(valueToBeSelected)) {
				element.get(i).click();
				break;
			}
		}
		
	}

}
