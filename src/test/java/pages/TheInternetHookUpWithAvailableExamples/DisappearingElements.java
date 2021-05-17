package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DisappearingElements extends MainMethods {

private final By homeButton=By.xpath("//a[@href='/']");

public Homepage clickOnHomeButton(){
  int br=2;
  for (int i=0;i<br; i++){
      refreshPage();
  }
   click(homeButton);
    test.log(LogStatus.INFO, "Button [home] is clicked");
    return new Homepage();
}
public DisappearingElements verifyThathElementITISVISIBLE(){

    List<WebElement> elements=getDriver().findElements(By.cssSelector("ul li"));
    int sizeBeforeRefresh =elements.size();
    refreshPage();
    List<WebElement> elementsAfterRefresh=getDriver().findElements(By.cssSelector("ul li"));
    int sizeAfterRefresh=elementsAfterRefresh.size();
    if(sizeBeforeRefresh==sizeAfterRefresh){
        System.out.println("The number of elements are the same after refresh");
    }else {
        System.out.println("The number of elements changed");
    }
    return this;
}
}


