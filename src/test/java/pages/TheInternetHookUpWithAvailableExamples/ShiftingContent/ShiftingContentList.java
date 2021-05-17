package pages.TheInternetHookUpWithAvailableExamples.ShiftingContent;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TheInternetHookUpWithAvailableExamples.Homepage;

import java.util.ArrayList;
import java.util.List;

public class ShiftingContentList extends MainMethods {
    private final By list=By.xpath("//div[@class='large-6 columns large-centered']");
    public ShiftingContentList verifyThatElementsInListAreNotOnSameSpotAfterRefreshingPage(){
        ArrayList<String> shift = new ArrayList<String>();
shift.add("Nesciunt autem eum odit fuga tempora deleniti.");
shift.add("Sed deleniti blanditiis odio laudantium.");
shift.add("Vel aliquid dolores veniam enim nesciunt libero quaerat.");
shift.add("Et numquam et aliquam.");
shift.add("Important Information You're Looking For");
        System.out.println("List of all elements: " + shift);
refreshPage();
//String div=getDriver().findElement(list).getText();

        List<WebElement> elements = getDriver().findElements(By
                .className("large-6 columns large-centered"));
        for (WebElement element : elements) {
            System.out.println("List after refresing page"+element.getText());
        }
        return this;
    }
    public Homepage getBackToHomepage(){
        int back=2;
        for (int i=0;i<back; i++){
            getDriver().navigate().back();
        }

        return new Homepage();
    }
}
