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
<<<<<<< HEAD
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('https://staging.spacecasino.co.uk')

WebUI.click(findTestObject('Object Repository/Page_Join SpaceCasino 70 Free Spins on Star_59130b/span_SIGN IN'))

WebUI.click(findTestObject('Page_SpaceCasino Login - SpaceCasino/p_Forgot your password'))

WebUI.setText(findTestObject('Page_SpaceCasino Recover Password - SpaceCasino/input_Usernameemail or phone number_emailOr_51fc75'), 
    'iforgot')

WebUI.click(findTestObject('Page_SpaceCasino Recover Password - SpaceCasino/button_Recover password'))

WebUI.click(findTestObject('Page_SpaceCasino Recover Password - SpaceCasino/button_Sign In'))

WebUI.click(findTestObject('Page_SpaceCasino Login - SpaceCasino/p_Forgot your password'))

WebUI.click(findTestObject('Page_SpaceCasino Recover Password - SpaceCasino/button_Sign in instead'))
=======

WebUI.openBrowser('https://staging.spacecasino.co.uk')

WebUI.setEncryptedText(findTestObject('Page_Password Protection/input_Password protected site_password'), '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting - Space Casino/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/Page_Recover Password - Space Casino/a_Sign in instead'))

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Recover Password - Space Casino/input_Email or Username_emailOrUsername'), 
    'iforgot')

WebUI.click(findTestObject('Object Repository/Page_Recover Password - Space Casino/button_Submit'))
>>>>>>> branch 'master' of https://github.com/WhiteOrg/SCAutoTests

WebUI.closeBrowser()

