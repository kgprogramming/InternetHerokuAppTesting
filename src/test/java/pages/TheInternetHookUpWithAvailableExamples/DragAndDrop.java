package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class DragAndDrop extends MainMethods {


    public DragAndDrop dragAndDropColumnAToColumnB2() throws InterruptedException {
        WebElement drag=getDriver().findElement(By.xpath(".//div[@id='column-a']"));

        //Element on which need to drop.
        WebElement drop=getDriver().findElement(By.xpath(".//div[@id='column-b']"));


        String xto=Integer.toString(drag.getLocation().x);
        String yto=Integer.toString(drop.getLocation().y);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("function createEvent(typeOfEvent) {\n" +"var event =document.createEvent(\"CustomEvent\");\n"
                +"event.initCustomEvent(typeOfEvent,true, true, null);\n" +"event.dataTransfer = {\n" +"data: {},\n"
                +"setData: function (key, value) {\n" +"this.data[key] = value;\n" +"},\n" +"getData: function (key) {\n"
                +"return this.data[key];\n" +"}\n" +"};\n" +"return event;\n" +"}\n" +"\n" +"function dispatchEvent(element, event,transferData) {\n"
                +"if (transferData !== undefined) {\n" +"event.dataTransfer = transferData;\n" +"}\n" +"if (element.dispatchEvent) {\n" +
                "element.dispatchEvent(event);\n" +"} else if (element.fireEvent) {\n" +"element.fireEvent(\"on\" + event.type, event);\n"
                +"}\n" +"}\n" +"\n" +"function simulateHTML5DragAndDrop(element, destination) {\n" +"var dragStartEvent =createEvent('dragstart');\n"
                +"dispatchEvent(element, dragStartEvent);\n" +"var dropEvent = createEvent('drop');\n" +"dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
                +"var dragEndEvent = createEvent('dragend');\n" +"dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" +"}\n" +"\n" +"var source = arguments[0];\n"
                +"var destination = arguments[1];\n" +"simulateHTML5DragAndDrop(source,destination);",drag, drop);
        Thread.sleep(1500);

        String textTo = drop.getText();

        if(textTo.equals("A")) {
            System.out.println("PASS: File is dropped to target as expected");
        }else {
            System.out.println("FAIL: File couldn't be dropped to target as expected");
        }
        test.log(LogStatus.INFO, "Drag [column a] and drop to [column b]");
        return this;
    }
    public Homepage getBackToHomepage(){
        getDriver().navigate().back();
        return new Homepage();
    }


}
