import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spacecasino.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino 70 Free Spins on Starburst_df420d/span_Help'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Help - Security - SpaceCasino/p_Security'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Help - Security - SpaceCasino/p_Responsible Gambling'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Help - Responsible Gamblin_839c31/p_Withdraw'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Help - Withdraw - SpaceCasino/p_Deposit'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Help - Deposit - SpaceCasino/button_Chat with support'))

WebUI.closeBrowser()

