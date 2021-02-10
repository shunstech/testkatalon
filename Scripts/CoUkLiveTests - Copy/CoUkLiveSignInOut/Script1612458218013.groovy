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

WebUI.navigateToUrl('https://www.spacecasino.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Login - SpaceCasino/span_SIGN IN'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Login - SpaceCasino/div_Welcome backUsernameemail or phone numb_fa2d91'))

WebUI.setText(findTestObject('Page_SpaceCasino Login - SpaceCasino/input_Usernameemail or phone number_email'), 'lina+1@stech.com')

WebUI.setEncryptedText(findTestObject('Page_SpaceCasino Login - SpaceCasino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Page_SpaceCasino Login - SpaceCasino/button_Sign in'))

WebUI.click(findTestObject('Page_SpaceCasino Account - SpaceCasino/svg_000_Icon-sc-1uj1ima-0 bxPyTz'))

WebUI.click(findTestObject('Page_SpaceCasino Account - SpaceCasino/div_000_Shared__Box-sc-1eqascn-0 DefaultPro_7ca5eb'))

WebUI.click(findTestObject('Page_SpaceCasino Account - SpaceCasino/div_000_DefaultProfileMenu__Open-sc-167frvj_54f3f2'))

WebUI.click(findTestObject('Object Repository/Page_SpaceCasino Account - SpaceCasino/span_Log Out'))

WebUI.closeBrowser()

