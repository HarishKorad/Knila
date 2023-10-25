package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RegisterPage extends BaseClass {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='givenName']")
	private WebElement givenNameInput;

	@FindBy(xpath = "//input[@name='familyName']")
	private WebElement lastNameInput;

	@FindBy(xpath = "//li[@class='question-legend']")
	private WebElement genderQuestion;

	@FindBy(xpath = "//option[text()='Male']")
	private WebElement maleOption;

	@FindBy(xpath = "//span[text()='Birthdate']")
	private WebElement birthdateLabel;

	@FindBy(xpath = "//input[@name='birthdateDay']")
	private WebElement birthdateDayInput;

	@FindBy(xpath = "//select[@name='birthdateMonth']")
	private WebElement birthdateMonthDropdown;

	@FindBy(xpath = "//input[@name='birthdateYear']")
	private WebElement birthdateYearInput;

	@FindBy(xpath = "//span[text()='Address']")
	private WebElement addressLabel;

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address1Input;

	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address2Input;

	@FindBy(xpath = "//input[@id='cityVillage']")
	private WebElement cityInput;

	@FindBy(xpath = "//input[@id='stateProvince']")
	private WebElement stateInput;

	@FindBy(xpath = "//input[@id='country']")
	private WebElement countryInput;

	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement postalCodeInput;

	@FindBy(xpath = "//span[text()='Phone Number']")
	private WebElement phoneNumberLabel;

	@FindBy(xpath = "//input[@name='phoneNumber']")
	private WebElement phoneNumberInput;

	@FindBy(xpath = "//button[@id='next-button']")
	private WebElement nextButton;

	@FindBy(xpath = "//span[text()='Relatives']")
	private WebElement relativesSection;

	@FindBy(xpath = "//span[@id='confirmation_label']")
	private WebElement confirmationLabel;

	@FindBy(xpath = "//span[text()='Name: ']//parent::p")
	private WebElement verifyName;

	@FindBy(xpath = "//span[text()='Gender: ']//parent::p")
	private WebElement verifyGender;

	@FindBy(xpath = "//span[text()='Birthdate: ']//parent::p")
	private WebElement verifyBirthdate;

	@FindBy(xpath = "//span[text()='Address: ']//parent::p")
	private WebElement verifyAddress;

	@FindBy(xpath = "//span[text()='Phone Number: ']//parent::p")
	private WebElement verifyPhoneNumber;

	@FindBy(xpath = "//input[@id='submit']")
	private WebElement confirmButton;

	public WebElement getGivenNameInput() {
		return givenNameInput;
	}

	public void setGivenNameInput(WebElement givenNameInput) {
		this.givenNameInput = givenNameInput;
	}

	public WebElement getLastNameInput() {
		return lastNameInput;
	}

	public void setLastNameInput(WebElement lastNameInput) {
		this.lastNameInput = lastNameInput;
	}

	public WebElement getGenderQuestion() {
		return genderQuestion;
	}

	public void setGenderQuestion(WebElement genderQuestion) {
		this.genderQuestion = genderQuestion;
	}

	public WebElement getMaleOption() {
		return maleOption;
	}

	public void setMaleOption(WebElement maleOption) {
		this.maleOption = maleOption;
	}

	public WebElement getBirthdateLabel() {
		return birthdateLabel;
	}

	public void setBirthdateLabel(WebElement birthdateLabel) {
		this.birthdateLabel = birthdateLabel;
	}

	public WebElement getBirthdateDayInput() {
		return birthdateDayInput;
	}

	public void setBirthdateDayInput(WebElement birthdateDayInput) {
		this.birthdateDayInput = birthdateDayInput;
	}

	public WebElement getBirthdateMonthDropdown() {
		return birthdateMonthDropdown;
	}

	public void setBirthdateMonthDropdown(WebElement birthdateMonthDropdown) {
		this.birthdateMonthDropdown = birthdateMonthDropdown;
	}

	public WebElement getBirthdateYearInput() {
		return birthdateYearInput;
	}

	public void setBirthdateYearInput(WebElement birthdateYearInput) {
		this.birthdateYearInput = birthdateYearInput;
	}

	public WebElement getAddressLabel() {
		return addressLabel;
	}

	public void setAddressLabel(WebElement addressLabel) {
		this.addressLabel = addressLabel;
	}

	public WebElement getAddress1Input() {
		return address1Input;
	}

	public void setAddress1Input(WebElement address1Input) {
		this.address1Input = address1Input;
	}

	public WebElement getAddress2Input() {
		return address2Input;
	}

	public void setAddress2Input(WebElement address2Input) {
		this.address2Input = address2Input;
	}

	public WebElement getCityInput() {
		return cityInput;
	}

	public void setCityInput(WebElement cityInput) {
		this.cityInput = cityInput;
	}

	public WebElement getStateInput() {
		return stateInput;
	}

	public void setStateInput(WebElement stateInput) {
		this.stateInput = stateInput;
	}

	public WebElement getCountryInput() {
		return countryInput;
	}

	public void setCountryInput(WebElement countryInput) {
		this.countryInput = countryInput;
	}

	public WebElement getPostalCodeInput() {
		return postalCodeInput;
	}

	public void setPostalCodeInput(WebElement postalCodeInput) {
		this.postalCodeInput = postalCodeInput;
	}

	public WebElement getPhoneNumberLabel() {
		return phoneNumberLabel;
	}

	public void setPhoneNumberLabel(WebElement phoneNumberLabel) {
		this.phoneNumberLabel = phoneNumberLabel;
	}

	public WebElement getPhoneNumberInput() {
		return phoneNumberInput;
	}

	public void setPhoneNumberInput(WebElement phoneNumberInput) {
		this.phoneNumberInput = phoneNumberInput;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public void setNextButton(WebElement nextButton) {
		this.nextButton = nextButton;
	}

	public WebElement getRelativesSection() {
		return relativesSection;
	}

	public void setRelativesSection(WebElement relativesSection) {
		this.relativesSection = relativesSection;
	}

	public WebElement getConfirmationLabel() {
		return confirmationLabel;
	}

	public void setConfirmationLabel(WebElement confirmationLabel) {
		this.confirmationLabel = confirmationLabel;
	}

	public WebElement getVerifyName() {
		return verifyName;
	}

	public void setVerifyName(WebElement verifyName) {
		this.verifyName = verifyName;
	}

	public WebElement getVerifyGender() {
		return verifyGender;
	}

	public void setVerifyGender(WebElement verifyGender) {
		this.verifyGender = verifyGender;
	}

	public WebElement getVerifyBirthdate() {
		return verifyBirthdate;
	}

	public void setVerifyBirthdate(WebElement verifyBirthdate) {
		this.verifyBirthdate = verifyBirthdate;
	}

	public WebElement getVerifyAddress() {
		return verifyAddress;
	}

	public void setVerifyAddress(WebElement verifyAddress) {
		this.verifyAddress = verifyAddress;
	}

	public WebElement getVerifyPhoneNumber() {
		return verifyPhoneNumber;
	}

	public void setVerifyPhoneNumber(WebElement verifyPhoneNumber) {
		this.verifyPhoneNumber = verifyPhoneNumber;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public void setConfirmButton(WebElement confirmButton) {
		this.confirmButton = confirmButton;
	}

}