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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spacecasino.com/')

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/div_Help'))

WebUI.click(findTestObject('Object Repository/Page_Deposit Help - Space Casino/div_Promotions'))

WebUI.click(findTestObject('Page_Promotions - Space Casino/div_Live Casino'))

WebUI.click(findTestObject('Object Repository/Page_Live Casino - Space Casino/div_Casino'))

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/a_Sign Up'))

WebUI.click(findTestObject('Page_Register - Space Casino/a_Sign in'))

WebUI.closeBrowser()

