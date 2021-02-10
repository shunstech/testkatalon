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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spacecasino.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino 70 Free Spins on Starburst_df420d/span_SIGN IN'))

WebUI.setText(findTestObject('Object Repository/Page_SpaceCasino Login - SpaceCasino/input_Usernameemail or phone number_email'), 
    'lina+1@stech.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SpaceCasino Login - SpaceCasino/input_Password_password'), 
    'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Login - SpaceCasino/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Account - SpaceCasino/div_000_DefaultProfileMenu__Open-sc-167frvj_54f3f2'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Activity'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Show all'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Last Month'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Last Week'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Today'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Financial'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Show all'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Last Month'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Last Week'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_Today'))

WebUI.click(findTestObject('Object Repository/Page_Account Activity - SpaceCasino/div_All'))

WebUI.closeBrowser()

