package customermodule;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass {
	
	@Test(priority = 0)
	public void testLogin() {
		Reporter.log("Login Successful",true);
	}
	
	@Test(priority = 1)
	public void testCreateCustomer() {
		Reporter.log("CreateCustomer",true);
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		et.setTasksTab();	
		
		TaskListPage tl= new TaskListPage(driver);
		tl.setAddNew();
		tl.setNewCustomer();
		tl.setCustName("HDFC_001");
		tl.setDescription("Banking customer");
		tl.setImportCust();
		tl.setSelCust();
		tl.setSubmitBtn();
		String confirmtext=tl.getConfirmText();
		Reporter.log(confirmtext,true);
	}
	
	@Test(priority = 2)
	public void testDeleteCustomer() throws InterruptedException {
		Reporter.log("DeleteCustomer",true);
		EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		et.setTasksTab();	
		
		TaskListPage tl= new TaskListPage(driver);
		tl.setCustSettings();
		Thread.sleep(1000);
		tl.setActionsOpt();
		Thread.sleep(1000);
		tl.setDeleteCust();
		Thread.sleep(1000);
		tl.setConfirmDel();
		Thread.sleep(1000);
		String confirmtext=tl.getConfirmText();
		Reporter.log(confirmtext,true);
		
	}
	

}
