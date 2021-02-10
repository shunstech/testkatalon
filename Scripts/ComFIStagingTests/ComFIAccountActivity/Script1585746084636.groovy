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
<<<<<<< HEAD
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.com/fi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    'w+vHgk+xIi0zVCLvZ6PU6w==')

WebUI.click(findTestObject('Object Repository/Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Paras kasino ja vedonlyntipaikka - Spa_00c2a4/a_Kirjaudu'))

WebUI.setText(findTestObject('Object Repository/Page_Kirjaudu - Space Casino/input_Kyttjtunnusshkposti tai puhelinnumero_6c9f18'), 
    'moneytest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kirjaudu - Space Casino/input_Salasana_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Kirjaudu - Space Casino/button_Kirjaudu'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_7140_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Aktiivisuus'))

WebUI.waitForElementVisible(findTestObject(null), GlobalVariable.null)

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Pivmr'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime kuukausi'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime viikko'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Tnn'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Finanssi'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Pivmr'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime kuukausi'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime viikko'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Tnn'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Back'))

WebUI.closeBrowser()
=======

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.com/fi')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    'w+vHgk+xIi0zVCLvZ6PU6w==')

WebUI.click(findTestObject('Object Repository/Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Paras kasino ja vedonlyntipaikka - Spa_00c2a4/a_Kirjaudu'))

WebUI.setText(findTestObject('Object Repository/Page_Kirjaudu - Space Casino/input_Kyttjtunnusshkposti tai puhelinnumero_6c9f18'), 
    'moneytest')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kirjaudu - Space Casino/input_Salasana_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Kirjaudu - Space Casino/button_Kirjaudu'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_7140_profileMenuButton'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Aktiivisuus'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Pivmr'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime kuukausi'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime viikko'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Tnn'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Finanssi'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Pivmr'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime kuukausi'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Viime viikko'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/button_Tnn'))

WebUI.click(findTestObject('Object Repository/Page_account - Space Casino/div_Back'))
>>>>>>> branch 'master' of https://github.com/WhiteOrg/SCAutoTests

