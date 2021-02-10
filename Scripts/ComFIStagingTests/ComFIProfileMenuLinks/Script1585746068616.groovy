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

WebUI.navigateToUrl('https://staging.spacecasino.com/fi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    'w+vHgk+xIi0zVCLvZ6PU6w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), Keys.chord(
        Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_account - Space Casino/select_EnglishSuomi'), 'fi', true)

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting _8ba448/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - Space Casino/input_usernameemail or phone number_username'), 
    'moneytest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login - Space Casino/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_7140_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Ohjausnkym'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Talleta'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Takaisin'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Nosta'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Takaisin'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Aloita'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Takaisin'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Katsaus'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Takaisin'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/a_Aloita_1'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Takaisin'))

WebUI.closeBrowser()

