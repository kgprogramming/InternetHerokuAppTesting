package pages.TheInternetHookUpWithAvailableExamples.ShiftingContent;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import pages.TheInternetHookUpWithAvailableExamples.Homepage;
import pages.TheInternetHookUpWithAvailableExamples.ShiftingContentPage;

public class ShiftingContentImage extends MainMethods {
    private final By img=By.xpath("//img[@class='shift']");
    public ShiftingContentImage verifyImageSizeAfterRefreshButton(){
        String left1=getDriver().findElement(img).getCssValue("left");
        System.out.println(left1);
        refreshPage();
        String left2=getDriver().findElement(img).getCssValue("left");
        System.out.println(left2);
        if (left2.equals(left1)){
            System.out.println("Image have same position like before refreshing page");
        }else {
            System.out.println("Image now have value 'left': " + left2);
        }
        test.log(LogStatus.INFO, "Image after refreshing page have a value 'left': " +left2);
        return this;
    }
    public ShiftingContentPage getBackToHomepage(){
        getDriver().navigate().back();
        return new ShiftingContentPage();
    }
}
