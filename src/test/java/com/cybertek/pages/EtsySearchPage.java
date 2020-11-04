package com.cybertek.pages;
import com.cybertek.utiities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {
    public EtsySearchPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy (className = "wt-input-btn-group__btn")
    public WebElement submitButton;
}


