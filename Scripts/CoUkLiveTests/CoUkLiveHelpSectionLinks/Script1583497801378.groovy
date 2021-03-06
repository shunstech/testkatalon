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

WebUI.navigateToUrl('https://spacecasino.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_Tournaments - Space Casino/a_Help'))

WebUI.click(findTestObject('Object Repository/Page_Deposit Help - Space Casino/a_Security'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Security Help - Space Casino/a_Privacy Policy_1'))

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Security Help - Space Casino/a_Responsible Gaming'))

WebUI.delay(2)

WebUI.back()

WebUI.click(findTestObject('Object Repository/Page_Responsible Gaming Help - Space Casino/a_Withdraw'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Withdraw Help - Space Casino/a_Deposit'))

WebUI.closeBrowser()

