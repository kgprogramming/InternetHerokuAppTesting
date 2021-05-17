package pages.TheInternetHookUpWithAvailableExamples;

import main.MainMethods;
import org.openqa.selenium.By;

public class JQueryUIMenu extends MainMethods {
    private final By buttonEnabled = By.xpath("//a[@id='ui-id-2']");
    private final By buttonDownloads = By.xpath("//a[@id='ui-id-4']");
    private final By buttonExcel = By.xpath("//div[@class='example']//ancestor::ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']//li[@class='ui-menu-item']//a[text()='Excel']");
public JQueryUIMenu selectExcelFileInUIMenuAndVerifyThatFileIsDownloaded() throws InterruptedException {
    click(buttonEnabled);
    Thread.sleep(300);
    click(buttonDownloads);
    Thread.sleep(300);
    click(buttonExcel);
    Thread.sleep(500);
    getLastModifiedFileName("A://firstProject//folder");
    return this;
}
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }
}