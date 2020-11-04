package com.cybertek.pages;

import com.cybertek.utiities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {
    public WikiSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy (id = "searchInput")
        public WebElement searchBox;

        @FindBy (xpath="//button[@type='submit']")
        public WebElement submitButton;

        @FindBy (xpath="//h1[@id='firstHeading']")
        public WebElement mainHeader;

        @FindBy (xpath="//div[@class='fn']")
        public WebElement imageHeader;

}

