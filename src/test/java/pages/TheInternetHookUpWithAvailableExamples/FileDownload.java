package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDownload extends MainMethods {
    private final By fileToDownload = By.xpath("//a[2]");

    public FileDownload clickOnFileTxtToDownload() {
        click(fileToDownload);
        test.log(LogStatus.INFO, "File is clicked");
        return this;

    }
    private static final String FILENAME = "/home/pepe/Downloads";
    BufferedReader br = null;
    FileReader fr = null;
    public FileDownload getTextFromTxtFile() {

    try {

        fr = new FileReader(FILENAME);
        br = new BufferedReader(fr);

        String sCurrentLine;

        br = new BufferedReader(new FileReader(FILENAME));

        while ((sCurrentLine = br.readLine()) != null) {
            test.log(LogStatus.INFO, "" + sCurrentLine);
        }

    } catch (  IOException e) {

        e.printStackTrace();

    } finally {

        try {

            if (br != null)
                br.close();

            if (fr != null)
                fr.close();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

    }
return this;
}
    public Homepage getBackToHomepage(){
        getDriver().navigate().to("http://the-internet.herokuapp.com/");
        return new Homepage();
    }

}
