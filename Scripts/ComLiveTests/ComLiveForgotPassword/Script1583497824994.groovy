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

WebUI.openBrowser('https://spacecasino.com')

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting - Space Casino/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/Page_Recover Password - Space Casino/a_Sign in instead'))

WebUI.click(findTestObject('Object Repository/Page_Login - Space Casino/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Recover Password - Space Casino/input_Email or Username_emailOrUsername'), 
    'iforgot')

WebUI.click(findTestObject('Object Repository/Page_Recover Password - Space Casino/button_Submit'))

WebUI.closeBrowser()

