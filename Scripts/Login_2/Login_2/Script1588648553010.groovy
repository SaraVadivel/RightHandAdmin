import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cyberready.right-hand.ai/auth/signin-1')

WebUI.setText(findTestObject('Page_Welcome  Right-Hand Cybersecurity/input_Login_email'), 'sara.vadivel@right-hand.ai')

WebUI.setEncryptedText(findTestObject('Page_Welcome  Right-Hand Cybersecurity/input_Login_password'), '3Z9vEXbPUsD5eDQOwLR1+w==')

WebUI.click(findTestObject('Page_Welcome  Right-Hand Cybersecurity/button_Login'))

WebUI.click(findTestObject('Page_Welcome  Right-Hand Cybersecurity/path'))

WebUI.click(findTestObject('Object Repository/Page_Welcome  Right-Hand Cybersecurity/a_Company Management'))

WebUI.click(findTestObject('Object Repository/Page_Welcome  Right-Hand Cybersecurity/a_Employees'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/button_New'))

WebUI.setText(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/input_First Name_first_name'), 
    'New')

WebUI.setText(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/input_Last Name_last_name'), 'Auto1')

WebUI.setText(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/input_Email_email'), 'sara.vadivel+newauto1@right-hand.ai')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/select_Please SelectAdminEmployee'), 
    'employee', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/select_Please SelectFull TimeContract'), 
    'full_time', true)

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/input_Employee Type_is_user_auto_invite'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/button_Save Changes'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/button_Right-Hand Cybersecurity_dropdown-basic'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/i_Sara Vadivel_feather icon-log-out'))

WebUI.closeBrowser()

WebUI.click(findTestObject('Object Repository/Page_Welcome  Right-Hand Cybersecurity/span_Company Management'))

WebUI.click(findTestObject('Object Repository/Page_Welcome  Right-Hand Cybersecurity/span_Employees'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/li_Dashboard_nav-item pcoded-menu-caption'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/span_Employees'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/button_New'))

WebUI.click(findTestObject('Object Repository/Page_Employees  Right-Hand Cybersecurity/button_Close'))

