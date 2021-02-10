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

WebUI.navigateToUrl('https://staging.spacecasino.com/')

WebUI.setEncryptedText(findTestObject('Page_Password Protection/input_Password protected site_password'), 'w+vHgk+xIi0zVCLvZ6PU6w==')

WebUI.click(findTestObject('Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Page_Best Online Casino and Sports Betting _8ba448/a_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/input_Deposit 10 and play with 60_wba'))

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Username_username'), 'newusernopromo')

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Email_email'), 'newusernopromo@n.test.spacecasino.com')

WebUI.setEncryptedText(findTestObject('Page_Register - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.setEncryptedText(findTestObject('Page_Register - Space Casino/input_Password Confirmation_password_confirmation'), 
    'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Page_Register - Space Casino/label_I agree to the Terms and Conditions a_06dc0c'))

WebUI.click(findTestObject('Page_Register - Space Casino/label_I certify that I am 18 years of age or older'))

WebUI.click(findTestObject('Page_Register - Space Casino/button_Next'))

WebUI.setText(findTestObject('Page_Register - Space Casino/input_First name_first_name'), 'newuser')

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Last name_last_name'), 'nopromo')

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Date of birth_flatpickr-input active'), '01/03/2002')

WebUI.click(findTestObject('Page_Register - Space Casino/label_other'))

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Address_address'), '987 finland')

WebUI.setText(findTestObject('Page_Register - Space Casino/input_City_city'), 'land')

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Postcode_post_code'), '76537')

WebUI.setText(findTestObject('Page_Register - Space Casino/input_Phone number_phone_number'), '567891234')

WebUI.click(findTestObject('Page_Register - Space Casino/button_Submit'))

WebUI.setText(findTestObject('Page_account - Space Casino/input_Resend Validation Code_code1'), '9')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Resend Validation Code_code2'), '9')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Resend Validation Code_code3'), '9')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Resend Validation Code_code4'), '9')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Resend Validation Code_code5'), '9')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Resend Validation Code_code6'), '9')

WebUI.click(findTestObject('Page_account - Space Casino/button_Maybe Later'))

WebUI.click(findTestObject('Page_account - Space Casino/a_Deposit'))

WebUI.click(findTestObject('Page_account - Space Casino/a_Select'))

WebUI.setText(findTestObject('Page_account - Space Casino/input_Card Number_cardNumber'), '4012-0003-0000-1003')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Name On Card_nameOnCard'), 'nopromo test')

WebUI.setText(findTestObject('Page_account - Space Casino/input_CVV_cvv'), '003')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Expiry Month_expiryMonth'), '01')

WebUI.setText(findTestObject('Page_account - Space Casino/input_Expiry Year_expiryYear'), '2023')

WebUI.click(findTestObject('Page_account - Space Casino/input_Amount_amount'))

WebUI.click(findTestObject('Page_account - Space Casino/button_Submit'))

