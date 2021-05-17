package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LargeAndDeepDOM extends MainMethods {
    public LargeAndDeepDOM verifyThatAllElementsFromDivIsVisible(){
        List<WebElement> numbers = getDriver().findElements(By.xpath("//div[@id='sibling-2.1']"));
        String allChildren = numbers.get(0).getText();
        System.out.println(allChildren);
        List<WebElement> table = getDriver().findElements(By.xpath("//table[@id='large-table']"));
    String alltablechildren=table.get(0).getText();
    System.out.println(alltablechildren);
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
