package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class VitalPage extends BaseClass {

	public VitalPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='save-form']")
	private WebElement saveForm;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(WebElement saveButton) {
		this.saveButton = saveButton;
	}

	public WebElement getSaveForm() {
		return saveForm;
	}

	public void setSaveForm(WebElement saveForm) {
		this.saveForm = saveForm;
	}

	@FindBy(xpath = "//span[@id='calculated-bmi']")
	private WebElement bmi;

	public WebElement getBmi() {
		return bmi;
	}

	public void setBmi(WebElement bmi) {
		this.bmi = bmi;
	}

	@FindBy(xpath = "//input[@id='w8']")
	private WebElement height;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement weight;

	@FindBy(xpath = "//button[@id='next-button']")
	private WebElement nextButton;

	public WebElement getHeight() {
		return height;
	}

	public void setHeight(WebElement height) {
		this.height = height;
	}

	public WebElement getWeight() {
		return weight;
	}

	public void setWeight(WebElement weight) {
		this.weight = weight;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public void setNextButton(WebElement nextButton) {
		this.nextButton = nextButton;
	}

}