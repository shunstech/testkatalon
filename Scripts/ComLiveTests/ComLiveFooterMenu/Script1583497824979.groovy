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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://spacecasino.com/')

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/span_About'))

WebUI.click(findTestObject('Page_About Space - Space Casino/span_Cookies'))

WebUI.click(findTestObject('Page_Cookies - Space Casino/span_Terms and Conditions'))

WebUI.click(findTestObject('Page_Terms and Conditions - Space Casino/span_Players Guide'))

WebUI.click(findTestObject('Page_Players Guide - Space Casino/span_Contact Us'))

WebUI.click(findTestObject('Page_Contact Us - Space Casino - Space Casino/span_Help'))

WebUI.click(findTestObject('Page_Deposit Help - Space Casino/span_Responsible Gaming'))

WebUI.click(findTestObject('Page_Responsible Gaming - Space Casino/span_Privacy Policy'))

WebUI.click(findTestObject('Page_Privacy Policy - Space Casino/span_Customer Complaints'))

WebUI.closeBrowser()

