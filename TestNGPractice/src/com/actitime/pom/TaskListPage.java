package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[contains(text(),'New Customer')]")
	private WebElement newCustomer;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement custName;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement description;
	
	@FindBy(id="customerLightBox_customerSelectorPlaceholder")
	private WebElement importCust;
	
	@FindBy(linkText="Our Company")
	private WebElement selCust;
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement submitBtn;
	
	@FindBy(className="innerHtml")
	private WebElement confirmText;
	
	@FindBy(xpath="//div[text()='HDFC_001 ']/../div[4]")
	private WebElement custSettings;
	
	@FindBy(className="actionButtonWrapper")
	private WebElement actionsOpt;
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deleteCust;
	
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement confirmDel;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setAddNew() {
		addNew.click();
	}
	
	public void setNewCustomer() {
		newCustomer.click();
	}
	
	public void setCustName(String cname) {
		custName.sendKeys(cname);
	}
	
	public void setDescription(String desc) {
		description.sendKeys(desc);
	}
	
	public void setImportCust() {
		importCust.click();
	}
	
	public void setSelCust() {
		selCust.click();
	}
	
	public void setSubmitBtn() {
		submitBtn.click();
	}
	
	public String getConfirmText() {
		return confirmText.getText();
	}
	
	public void setCustSettings() {
		custSettings.click();
	}
	
	public void setActionsOpt() {
		actionsOpt.click();
	}
	
	public void setDeleteCust() {
		deleteCust.click();
	}
	
	public void setConfirmDel() {
		confirmDel.click();
	}

}
