package tests.TestingInternetHookUp;

import main.MainMethods;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TheInternetHookUpWithAvailableExamples.Homepage;
import pages.TheInternetHookUpWithAvailableExamples.StatusCodes.Page301;
import pages.TheInternetHookUpWithAvailableExamples.StatusCodes.Page404;
import pages.TheInternetHookUpWithAvailableExamples.StatusCodes.Page500;

import java.awt.*;

public class TestingAllExamplesOnHerokuAppInternetTest extends MainMethods {
    Homepage homepage=new Homepage();
    Page301 p3=new Page301();  Page404 p4=new Page404();Page500 p5=new Page500();
    @BeforeClass
    public void setUp() {
        createDriver();
        openApplication("http://the-internet.herokuapp.com/");
    }
    @Test
    public void test01TryingToAddAndRemoveElements(){
        createReport("Testing adding new elements and delete elements");
        homepage.clickOnAddRemoveElementsButtonPage().clickOnAddElementButton().verifyThatNewElementIsVisible()
                .clickOnDeleteElementButton().verifyThatNewElementIsNotVisibleAnymore().getBackToHomepage();
    } @Test
    public void test02TryToLoginOnBasicAuth(){
        createReport("Testing login on basic auth");
        homepage.clickOnBasicAuthPage().typeTextInInput().getBackToHomepage();
    }
    @Test
    public void test03TryToClickOnCheckboxes(){
        createReport("Testing checboxes ");
        homepage.clickOnCheckboxesPage().clickOnChechbox1().verifyThathChecbox1IsChecked().clickOnChechbox2().verifyThatCheckbox2IsUnChecked().getBackToHomepage();
    }
    @Test
    public void test04ABTestingPageTest(){
        createReport("Verify text on AB Testing page");
        homepage.refreshPage();
        homepage.clickOnABTestingPage().verifyThatTextIsVisible().getBackToHomepage();
    }
    @Test
    public void test05KeyPressesTest() {
        createReport("Key presses ");
        homepage.clickOnKeyPressesPage().typeLetterInInputField().getBackToHomepage(); }
    @Test
    public void test07DragAndDropElementTest() throws  InterruptedException{
        createReport("Dragging div A and dropping on div B ");
        homepage.refreshPage();

        homepage.clickOnDragAndDropPage().dragAndDropColumnAToColumnB2().getBackToHomepage();
    }
    @Test
    public void test08ClickOnOptionInDropDownMenu() {
        createReport("Select option from dropdown ");
        homepage.refreshPage();
        homepage.clickOnDropDownButton().clickOnSelect().clickOnOptionInDropdown().verifyThatYouSelectOption2InDropDown().getBackToHomepage();
    }
    @Test
    public void  test09DisappearingElementsPageTest()  {
        createReport("Clicking on disappearing elements");
        homepage.refreshPage();
        homepage.clickOnDisappearingElementsPage().verifyThathElementITISVISIBLE().clickOnHomeButton();//.verifyh1TittleOnHomePage();
    }
    @Test
    public void test10DynamicControlsOnWebPage() throws InterruptedException{
        createReport("dynamic controls");
        homepage.clickOnDynamicControlsPage().clickOnCheckBox().clickOnRemoveButton().verifyThatYouRemoveCheckbox().verifyParagraphSuccessfully()
                .verifyThatInputFieldIsDisabled().clickOnEnableButton().verifYThatInputFieldIsNowEnabled().typeInInputField().verifyParagraphSuccessfully().getBackToHomepage();
    }
    @Test
    public void test11DynamicLoadingOnWebPage() throws InterruptedException{
        createReport("Dynamic loading");
        homepage.clickOnDynamicLoadingPage().clickOnButtonExample1().verifyThatTittleHelloWorldIsNotPresenting()
                .clickOnStartButton().verifyTextAfterClickButtonStart().getBackToPreviousPage()
                .clickOnButtonExample2().verifyThatTittleHelloWorldIsNotPresenting().clickOnStartButton().verifyTextAfterClickButtonStart().getBackToHomepage();
    }
    @Test
    public void test12EntryAdPage() {
        createReport("Entry AD");
        homepage.clickOnEntryAdPage().clickOnClose().verifyTitle().getBackToHomepage();
    }
    @Test
    public void test13ExitItentPage() throws InterruptedException, AWTException {
        createReport("Exit Itent");
        homepage.clickOnExitItentPage().goWithMouseOutViewPortAndClickClose().getBackToHomepage();
    }
    @Test
    public void test14DownloadFilePage() {
        createReport("Download file");
        homepage.clickOnFileDownloadPage().clickOnFileTxtToDownload().getTextFromTxtFile().getBackToHomepage();
    }
    @Test
    public void test15FileUploadOnPage()throws InterruptedException{
        createReport("File uploaded to site internet-herokuapp");
        homepage.clickOnFileUploadPage().clickOnChooseButtonAndUploadFile()
                .verifyTextFileUploaded().getTextFromDiv().getBackToHomepage();
    }
    @Test
    public void test16FormAuthenticationPage() throws InterruptedException{
        createReport("Form Authentication");
        homepage.clickOnFormAuthenticationPage().typeUsernameInInputField().clickOnLoginButton().verifyTextWelcometoSecureArea()
                .clickOnLogoutButton().verifyTextLoginPage().getBackToHomepage();
    }
    @Test
    public void test17IFramesOnPage(){
        createReport("Switch to iframes");
        homepage.clickOnFramesPage().clickOnNestedFramesPage().getTextInside_BottomFrame()
                .getTextInside_LeftFrame().getBack().clickOnIFramesPage().typeOnIFrame().getBackToHomepage();
    }
    @Test
    public void test18HorizontalSliderPage() throws InterruptedException {
        createReport("Horizontal slider move from 0 to 5");
        homepage.clickOnHorizontalSliderPage().moveSliderFromZeroToFive(50).textFromSpanToCheckIfWeMoveSliderTo5().getBackToHomepage();
    }
    @Test
    public void test19MultipleWindowsPage(){
        createReport("Click on new tab and verify text on new tab");
        homepage.clikcOnMultipleWindowsPage().clickOnButtonNewWindows().verifytextOnNewTab().closeTabAndGetBackToHomepage();
    }
    @Test
    public void test20NotificationMessagePageTest(){
        createReport("Click on clickHere button and verify that element is change");
        homepage.clickOnNotificatioPage().getMessageFromDiv().getBackToHomepageFromNotificationPage();
    }
    @Test
    public void test21JSAlertsPageTest(){
        createReport("Click on alerts and get text from alert");
        homepage.clickOnJsAlertsPage().clickOnFirtsButtonAlerts().verifyResultText().clickOnConfirmButtonAlerts().verifyResultText().clickOnPromptAlertButton().verifyResultText()
                .backToHomepage();
    }
    @Test
    public void test22SecureFileDownLoadTest() throws InterruptedException{
        createReport("Login as a admin and download picture after that validate if picture is downloaded");
        homepage.clickOnSecureFileDownloadPage().typeTextForUsernameAndPAssword().clickOnDownloadLike().goingToHomepage();
    }
    @Test
    public void test23ShiftingContentTest(){
        createReport("checking if element have same value after click refresh ");
        homepage.clickOnShiftingContentPage().clickOnMenuElements().verifyElementSizeAfterRefreshButton().getBackToHomepage()
                .clickOnImageContentPage().verifyImageSizeAfterRefreshButton().getBackToHomepage()
                .clickOnListContentPage().verifyThatElementsInListAreNotOnSameSpotAfterRefreshingPage().getBackToHomepage();
    }
    @Test
    public void test24RedirectCodePage(){
        createReport("Redirection page");
        homepage.clickOnRedirectLinkPage().clickOnStatusCodePage().clickOnButton200().verifyTextOnPages1().clickOnButtonBack().clickOnButton301();p3.verifyTextOnPages2().clickOnButtonBack()
                .clickOnButton404();p4.verifyTextOnPages3().clickOnButtonBack().clickOnButton500();p5.verifyTextOnPages4().clickOnButtonBack().goingToHomepage();
    }
    @Test
    public void test25HoversOverPageTest(){
        createReport("testing image hover over");
        homepage.clickOnHoversPage().hoverOnImageOne().hoverOnImageTwo().hoverOnImageThree().getBackToHome();
    }
    @Test
    public void test26SortableDataTablesOnHerokuInternet() throws InterruptedException {
        createReport("Checking data before and after clicking button in data");
        homepage.clickOnSortableDataPage().clickOnSortableDataInTable().getBackToHomepage();
    }
    @Test
    public void test27NestedFramesTest(){
        createReport("Get text from iframes");
        homepage.clickOnFramesPage().clickOnNestedFramesPage().getTextInside_BottomFrame().getTextInside_LeftFrame().getBackToHomepage();
    }
    @Test
    public void test28InputNumbersTest(){
        createReport("Type number in input field");
        homepage.clickOnNumberInputsPage().typeNumberInInputField().getBackToHomepage();
    }
    @Test
    public void test29JQueryUIMenuTest() throws InterruptedException {
        createReport("Jquery user interface menu");
        homepage.clickOnJQueryMenuPage().selectExcelFileInUIMenuAndVerifyThatFileIsDownloaded().getBackToHomepage();
    }
    @Test
    public void test30LargeAndDeepDOmTest()  {
        createReport("Large and deep dom ");
        homepage.clickOnLargeAndDeepDOMPage().verifyThatAllElementsFromDivIsVisible().getBackToHomepage();
    }
    @Test
    public void test31InfiniteScrollTest() {
        createReport("Infinite scroll ");
        homepage.clickOnInfiniteScrollPage().scrollToTheEndOfPage().getBackToHomepage();    }
    @Test
    public void  test32DigestAuth(){
        createReport("Digest auth ");
        homepage.clickOnDigestAuthPage().typeTextInInput2().getBackToHomepage();
    }

    @Test
    public void test33TyposPageTest(){
        createReport("Verify that typo is visible or not");
        homepage.clickOnTyposPage().verifyThatTypoIsVisible().getBackToHomepage(); }
    @Test
    public void test34WYSIWYGEditorPageTest(){
        createReport("Type text into iframe");
        homepage.clickOnEditorsPage().typeTextOnWYSIWYGEditor().getBackToHomepage();
    }
    @Test
    public void test35DynamicWebPageTest() throws InterruptedException{
        createReport("dynamic elements");
        homepage.refreshPage();
        homepage.clickOnDynamicContentButton().verifyThatImageIsChangeAfterRefresh().getBackToHomepage();
    }
    @Test
    public void test36RightClickOnDivAndAcceptingAlert() {
        createReport("Testing right click on contest menu");
        homepage.clickOnContestMenuPage().rightClickOnDiv().swicthToAlert().getBackToHomepage();
        refreshPage();
    }
    @AfterClass
    public void close() {
        quitDriver();
    }


}
