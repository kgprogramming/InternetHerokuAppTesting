package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class InfiniteScroll extends MainMethods {
    private final By text = By.className("jscroll-added");

    public InfiniteScroll scrollToTheEndOfPage() {
        int index=50;
        String script = "window.scrollTo(0,document.body.scrollHeight)";
        while (getNumberOfParagraphsPresent() < index) {
            ((JavascriptExecutor) getDriver()).executeScript(script);
        }
 return this;
    }

    private int getNumberOfParagraphsPresent(){
        return getDriver().findElements(text).size();
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
