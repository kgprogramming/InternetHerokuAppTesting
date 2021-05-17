package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortableDataTables extends MainMethods {
private final By dataInTable=By.xpath("//table[@id='table1']//tbody//tr//td[1]");
private final By buttonSort=By.xpath("//table[@id='table1']//thead//th[1]");
public SortableDataTables clickOnSortableDataInTable() throws InterruptedException {
    //Store the table size
    WebElement webtable = getDriver().findElement(By.xpath("//table[@id='table1'][text()]"));

    //Get 2nd column cells which has data
    List<WebElement> colsWithData = webtable.findElements(dataInTable);

    //Print the text of 2nd column
    System.out.println("Data from column last name before sort: ");
    for(int index =0; index<colsWithData.size(); index++) {
        System.out.println(colsWithData.get(index).getText());
    }
    click(buttonSort);
    Thread.sleep(300);
    WebElement webtable1 = getDriver().findElement(By.xpath("//table[@id='table1'][text()]"));

    //Get 2nd column cells which has data
    List<WebElement> colsWithData1 = webtable1.findElements(dataInTable);

    //Print the text of 2nd column
    System.out.println("Data from column last name after sort ");
    for(int index =0; index<colsWithData1.size(); index++) {
        System.out.println(colsWithData1.get(index).getText());
    }

    test.log(LogStatus.INFO, "You click on [Last name] in table");
    return this;
}
public SortableDataTables verifyIsItTheLastNameSorted(){
    List<WebElement> lastName=getDriver().findElements(dataInTable);
    String[] beforeSort_LastNames=new String[lastName.size()];
    for (int i=0; i<lastName.size(); i++){
        beforeSort_LastNames[i]=lastName.get(i).getText().trim();
    }
    System.out.println("##### Before clicicking sort button #####"+beforeSort_LastNames);
    return this;
}
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }
}
