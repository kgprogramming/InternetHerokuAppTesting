package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class KeyPresses extends MainMethods {
private final By inputField= By.xpath("//input");
    private final By result= By.xpath("//p[@id='result']");

public KeyPresses typeLetterInInputField(){
   getDriver().findElement(inputField).sendKeys("A");
   String text=getDriver().findElement(result).getText();

   if(text.equals("You entered: A")){
       System.out.println("test passed easy");
   }else {
       System.out.println("not passed");
   }
    return this;
}
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
