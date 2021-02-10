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
<<<<<<< HEAD
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/en/')

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting _04238b/span_SIGN IN'))

WebUI.setText(findTestObject('Object Repository/Page_Login - SpaceCasino/input_Usernameemail or phone number_email'), 'moneytest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - SpaceCasino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Login - SpaceCasino/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Account - SpaceCasino/div_7140_DefaultProfileMenu__Open-sc-167frv_02a174'))

WebUI.click(findTestObject('Object Repository/Page_Account - SpaceCasino/div_Log Out'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)
=======

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/en/')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Object Repository/Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting - Space Casino/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - Space Casino/input_usernameemail or phone number_username'), 
    'moneytest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/button_Sign in'))

WebUI.click(findTestObject('Page_account - Space Casino/button_7140_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Log Out'))

WebUI.closeBrowser()
>>>>>>> branch 'master' of https://github.com/WhiteOrg/SCAutoTests

