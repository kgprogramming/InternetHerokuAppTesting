package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends MainMethods {
    private final By buttonChoose=By.xpath("//input[@id='file-upload']");
    private final By buttonUpload=By.xpath("//input[@id='file-submit']");
    private final By textSuccessfully=By.xpath("//h3[text()='File Uploaded!']");
    private final By textFile=By.xpath("//div[@id='uploaded-files']");
    public FileUpload clickOnChooseButtonAndUploadFile() throws InterruptedException {
        getDriver().findElement(buttonChoose).sendKeys("/home/pepe/projects/InternetHerokuApp/folder/saveText.txt");
        String filePath="/home/pepe/projects/InternetHerokuApp/folder/saveText.txt";
        WebElement chooseFile=getDriver().findElement(buttonChoose);
        Thread.sleep(1000);
        chooseFile.sendKeys(filePath);
        getDriver().findElement(buttonUpload).click();
        test.log(LogStatus.INFO, "File is uploaded");
        return this;
    }
    public FileUpload verifyTextFileUploaded(){
        verifyThatElementIsVisible(textSuccessfully);
        test.log(LogStatus.INFO, "Text [File Uploaded] is visible");
        return this;
    }
    public FileUpload getTextFromDiv(){
        String textFromDIv=getDriver().findElement(textFile).getText();
        if (textFromDIv.equals("saveText.txt")){
            System.out.println("It's saveText.txt");
        }else {
            System.out.println("It's not saveText.txt");
        }

    return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }
}
