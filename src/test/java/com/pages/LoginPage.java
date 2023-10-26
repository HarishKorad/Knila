package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//li[@id='Isolation Ward']")
    private WebElement locationButton;

    @FindBy(xpath = "//input[@id='loginButton']")
    private WebElement loginButton;

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public void setUsernameInput(WebElement usernameInput) {
        this.usernameInput = usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(WebElement passwordInput) {
        this.passwordInput = passwordInput;
    }

    public WebElement getLocationButton() {
        return locationButton;
    }

    public void setLocationButton(WebElement locationButton) {
        this.locationButton = locationButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElement loginButton) {
        this.loginButton = loginButton;
    }
}
