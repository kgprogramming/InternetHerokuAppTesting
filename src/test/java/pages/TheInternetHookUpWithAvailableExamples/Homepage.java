package pages.TheInternetHookUpWithAvailableExamples;

import com.relevantcodes.extentreports.LogStatus;
import main.MainMethods;
import org.openqa.selenium.By;

public class Homepage  extends MainMethods {
    private final By addremoveButton=By.xpath("//a[@href='/add_remove_elements/']");
    private final By basicAuthButton=By.xpath("//a[@href='/basic_auth']");
    private final By digestAuthButton=By.xpath("//a[@href='/digest_auth']");
    private final By checkboxes=By.xpath("//a[@href='/checkboxes']");
    private final By contestMenuButton=By.xpath("//a[@href='/context_menu']");
    private final By disappearingElementsButton=By.xpath("//a[@href='/disappearing_elements']");
    private final By h1Text=By.xpath("//h1");
    private final By dragAndDropButton=By.xpath("//a[@href='/drag_and_drop']");
    private final By dropdownButton=By.xpath("//a[@href='/dropdown']");
    private final By dynamicContentbutton=By.xpath("//a[@href='/dynamic_content']");
    private final By dynamicControlsbutton=By.xpath("//a[@href='/dynamic_controls']");
    private final By dynamicLoadingbutton=By.xpath("//a[@href='/dynamic_loading']");
    private final By entryAdButton=By.xpath("//a[@href='/entry_ad']");
    private final By buttonExitItent =By.xpath("//a[@href='/exit_intent']");
    private final By buttonFileDownload=By.xpath("//a[@href='/download']");
    private final By buttonUploadFile=By.xpath("//a[@href='/upload']");
    private final By buttonFormAuthentication=By.xpath("//a[@href='/login']");
    private final By buttoFrames=By.xpath("//a[@href='/frames']");
    private final By buttonHorizontalSlider=By.xpath("//a[@href='/horizontal_slider']");
    private final By buttonMultipleWindows=By.xpath("//a[@href='/windows']");
    private final By buttonNotificationMessage=By.xpath("//a[@href='/notification_message']");
    private final By buttonAlerts=By.xpath("//a[@href='/javascript_alerts']");
    private final By buttonSecureDownload=By.xpath("//a[@href='/download_secure']");
    private final By buttonShiftting=By.xpath("//a[@href='/shifting_content']");
    private final By buttonRedirection=By.xpath("//a[@href='/redirector']");
    private final By buttonHovers=By.xpath("//a[@href='/hovers']");
    private final By buttonTables=By.xpath("//a[@href='/tables']");
    private final By buttonInputs=By.xpath("//a[@href='/inputs']");
    private final By buttonUIMenu=By.xpath("//a[@href='/jqueryui/menu']");
    private final By buttonDOM=By.xpath("//a[@href='/large']");
    private final By buttonScroll=By.xpath("//a[@href='/infinite_scroll']");
    private final By buttonKeyPresses=By.xpath("//a[@href='/key_presses']");
    private final By buttonTypos=By.xpath("//a[@href='/typos']");
    private final By buttonEditor=By.xpath("//a[@href='/tinymce']");
    private final By buttonAB=By.xpath("//a[@href='/abtest']");


    public AddRemoveElements clickOnAddRemoveElementsButtonPage(){
       click(addremoveButton);
        test.log(LogStatus.INFO, "Page [Add/remove elements] is clicked");
        return new AddRemoveElements();
    }
    public BasicAuth clickOnBasicAuthPage(){
        click(basicAuthButton);
        test.log(LogStatus.INFO, "Page [Basic auth] is clicked");
        return new BasicAuth();
    }
    public Checkboxes clickOnCheckboxesPage(){
        click(checkboxes);
        test.log(LogStatus.INFO, "Page [checkboxes] is clicked");
        return new Checkboxes();
    }
    public ContestMenu clickOnContestMenuPage(){
        click(contestMenuButton);
        test.log(LogStatus.INFO, "Page [Contest menu] is clicked");
        return new ContestMenu();
    }
    public DigestAuth clickOnDigestAuthPage(){
        click(digestAuthButton);
        test.log(LogStatus.INFO, "Page [digest auth] is clicked");
        return new DigestAuth();
    }
    public DisappearingElements clickOnDisappearingElementsPage(){
        click(disappearingElementsButton);
        test.log(LogStatus.INFO, "Page [disappearing elements] is clicked");
        return new DisappearingElements();
    }
    public Homepage verifyh1TittleOnHomePage(){
verifyThatElementIsVisible(h1Text);
        test.log(LogStatus.INFO, "Tittle [welcome to the-internet] is visible");
        return this;
    }
public DragAndDrop clickOnDragAndDropPage(){
        click(dragAndDropButton);
    test.log(LogStatus.INFO, "Page [drag and drop] is clicked");
    return new DragAndDrop();
}
public DropDown clickOnDropDownButton(){
        click(dropdownButton);
    test.log(LogStatus.INFO, "Page [dropdown] is clicked");
    return new DropDown();
}
public DynamicContent clickOnDynamicContentButton(){
    click(dynamicContentbutton);
    test.log(LogStatus.INFO, "Page [dynamic content] is clicked");
        return new DynamicContent();
}
    public DynamicControls clickOnDynamicControlsPage(){
        click(dynamicControlsbutton);
        test.log(LogStatus.INFO, "Page [dynamic controls] is clicked");
        return new DynamicControls();
    }
    public DynamicLoading clickOnDynamicLoadingPage(){
        click(dynamicLoadingbutton);
        test.log(LogStatus.INFO, "Page [dynamic loading] is clicked");
        return new DynamicLoading();
    }
    public EntryAd clickOnEntryAdPage(){
        click(entryAdButton);
        test.log(LogStatus.INFO, "Page [Entry Ad] is clicked");
        return new EntryAd();
    }
    public ExitItent clickOnExitItentPage(){
        click(buttonExitItent);
        test.log(LogStatus.INFO, "Page [Entry Ad] is clicked");
        return new ExitItent();
    }
    public FileDownload clickOnFileDownloadPage(){
        click(buttonFileDownload);
        test.log(LogStatus.INFO, "Page [File download] is clicked");
        return new FileDownload();
    }
    public FileUpload clickOnFileUploadPage(){
        click(buttonUploadFile);
        test.log(LogStatus.INFO, "Page [File upload] is clicked");
        return new FileUpload();
    }
    public FormAuthentication clickOnFormAuthenticationPage(){
        click(buttonFormAuthentication);
        test.log(LogStatus.INFO, "Page [Form Authentication] is clicked");
        return new FormAuthentication();
    }
    public FramePage clickOnFramesPage(){
        click(buttoFrames);
        test.log(LogStatus.INFO, "Page [Frames] is clicked");
        return new FramePage();
    }
    public HorizontalSlider clickOnHorizontalSliderPage(){
        click(buttonHorizontalSlider);
        test.log(LogStatus.INFO, "Page [Horizontal slider] is clicked");
        return new HorizontalSlider();
    }
    public MultipleWindows clikcOnMultipleWindowsPage(){
        click(buttonMultipleWindows);
        test.log(LogStatus.INFO, "Page [Multiple windows] is clicked");
        return new MultipleWindows();
    }
    public NotificationMessage clickOnNotificatioPage(){
        click(buttonNotificationMessage);
        test.log(LogStatus.INFO, "Page [Notification message] is clicked");
        return new NotificationMessage();
    }
    public JSAlerts clickOnJsAlertsPage(){
        click(buttonAlerts);
        test.log(LogStatus.INFO, "Page [JS alerts] is clicked");
        return new JSAlerts();
    }
    public SecureFileDownload clickOnSecureFileDownloadPage(){
        click(buttonSecureDownload);
        test.log(LogStatus.INFO, "Page [Secure file download] is clicked");
        return new SecureFileDownload();
    }
    public ShiftingContentPage clickOnShiftingContentPage(){
        click(buttonShiftting);
        test.log(LogStatus.INFO, "Page [Shifting content] is clicked");
        return new ShiftingContentPage();
    }
    public RedirectLinkPage clickOnRedirectLinkPage(){
        click(buttonRedirection);
        test.log(LogStatus.INFO, "Page [Redirection ] is clicked");
        return new RedirectLinkPage();
    }
    public HoversPage clickOnHoversPage(){
        click(buttonHovers);
        test.log(LogStatus.INFO, "Page [hovers ] is clicked");
        return new HoversPage();
    }
    public SortableDataTables clickOnSortableDataPage(){
        click(buttonTables);
        test.log(LogStatus.INFO, "Page [sortable data tables] is clicked");
        return new SortableDataTables();
    }
    public InputNumbers clickOnNumberInputsPage(){
        click(buttonInputs);
        test.log(LogStatus.INFO, "Page [inputs numbers] is clicked");
        return new InputNumbers();
    }
    public JQueryUIMenu clickOnJQueryMenuPage(){
        click(buttonUIMenu);
        test.log(LogStatus.INFO, "Page [JQuery ui menu] is clicked");
        return new JQueryUIMenu();
    }
    public LargeAndDeepDOM clickOnLargeAndDeepDOMPage(){
        click(buttonDOM);
        test.log(LogStatus.INFO, "Page [LArge and deep dom] is clicked");
        return new LargeAndDeepDOM();
    }
    public InfiniteScroll clickOnInfiniteScrollPage(){
        click(buttonScroll);
        test.log(LogStatus.INFO, "Page [infinite scroll] is clicked");
        return new InfiniteScroll();
    }
    public KeyPresses clickOnKeyPressesPage(){
        click(buttonKeyPresses);
        test.log(LogStatus.INFO, "Page [key presses] is clicked");
        return new KeyPresses();
    }
    public Typos clickOnTyposPage(){
        click(buttonTypos);
        test.log(LogStatus.INFO, "Page [Typos] is clicked");
        return new Typos();
    }
    public WYSIWYGEditor clickOnEditorsPage(){
      click(buttonEditor);
        test.log(LogStatus.INFO, "Page [WYSIWYG Editor] is clicked");
        return new WYSIWYGEditor();
    }
    public AbTesting clickOnABTestingPage(){
        click(buttonAB);
        test.log(LogStatus.INFO, "Page [AbTesting] is clicked");
        return new AbTesting();
    }
}
