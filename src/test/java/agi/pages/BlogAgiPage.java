package agi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogAgiPage {

    @FindBy(id = "search-open")
    public WebElement buttonSearch;

    @FindBy(xpath = "(//input[@placeholder ='Pesquisar …'])[1]")
    public WebElement inputSearch;

    @FindBy(css = "div.desktop-search > form > input")
    public WebElement inputSearchSubmit;

    @FindBy(css = ".archive-title")
    public WebElement archiveTitle;

    @FindBy(css = ".entry-title")
    public WebElement entryTitle;

    public WebDriver driver;

    public BlogAgiPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void formularioDeLogin(String email, String senha) {

    }

    public String obterTituloPagina() {
        return driver.getTitle();

    }

    public String validarArchiveTitle() {
        return archiveTitle.getText();

    }

    public String validarEntryTitle() {
        return entryTitle.getText();

    }

    public void searchOpen() {
        buttonSearch.click();
    }

    public void inputSearch(String txt) {
        inputSearch.clear();
        inputSearch.sendKeys(txt);

    }

    public void inputSearchSubmit() {
        inputSearchSubmit.click();
    }

}
