package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.ShiftingContent.ShiftingContentImage;
import pages.TheInternetHookUpWithAvailableExamples.ShiftingContent.ShiftingContentList;
import pages.TheInternetHookUpWithAvailableExamples.ShiftingContent.ShiftingContentMenuElements;

public class ShiftingContentPage extends MainMethods {
    private final By menuElement=By.xpath("//a[@href='/shifting_content/menu']");
    private final By menuImage=By.xpath("//a[@href='/shifting_content/image']");
    private final By menuList=By.xpath("//a[@href='/shifting_content/list']");
    public ShiftingContentMenuElements clickOnMenuElements(){
   click(menuElement);
    test.log(LogStatus.INFO, "Menu elements is clicked");
    return new ShiftingContentMenuElements();
}
    public ShiftingContentImage clickOnImageContentPage(){
        click(menuImage);
        test.log(LogStatus.INFO, "Image elements is clicked");
        return new ShiftingContentImage();
    }
    public ShiftingContentList clickOnListContentPage(){
        click(menuList);
        test.log(LogStatus.INFO, "List elements is clicked");
        return new ShiftingContentList();
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
