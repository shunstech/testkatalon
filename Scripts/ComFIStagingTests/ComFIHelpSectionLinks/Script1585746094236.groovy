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

WebUI.navigateToUrl('https://staging.spacecasino.com/fi')

WebUI.setEncryptedText(findTestObject('Page_Password Protection/input_Password protected site_password'), 'w+vHgk+xIi0zVCLvZ6PU6w==')

WebUI.click(findTestObject('Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Paras kasino ja vedonlyntipaikka - Spa_00c2a4/div_Ohjeet'))

WebUI.click(findTestObject('Object Repository/Page_Turvallisuusneuvonta - Space Casino/a_Turvallisuus'))

WebUI.click(findTestObject('Object Repository/Page_Turvallisuusneuvonta - Space Casino/a_Vastuullinen pelaaminen'))

WebUI.click(findTestObject('Object Repository/Page_Vastuullisen pelaamisen apu - Space Casino/a_Nosta'))

WebUI.click(findTestObject('Object Repository/Page_Kotiutusapu - Space Casino/a_Talleta'))

WebUI.closeBrowser()

