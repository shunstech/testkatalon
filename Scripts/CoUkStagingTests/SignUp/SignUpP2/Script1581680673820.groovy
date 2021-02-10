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

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting _04238b/span_SIGN UP'))

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Username_username'), 'newuser2')

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Email address_email'), 'newuser+2@a.test.spacecasino.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Password confirmation_passwordConfirmation'), 
    'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Password confirmation_acceptsTerms'))

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/input_I agree to theand_isOver18'))

WebUI.click(findTestObject('Page_Register - SpaceCasino/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_First name_firstName'), 'new')

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Last name_lastName'), 'user')

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/div_Day123456789101112131415161718192021222_7c10ae'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register - SpaceCasino/select_123456789101112131415161718192021222_566da4'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/div_MonthJanuaryFebruaryMarchAprilMayJuneJu_384c7d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register - SpaceCasino/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '8', true)

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Year_dateOfBirthYear'), '1980')

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/label_Female'))

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Phone number_phoneNumber'), '7956218120')

WebUI.setText(findTestObject('Object Repository/Page_Register - SpaceCasino/input_Postcode_postcode'), 'n144sp')

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/button_Search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register - SpaceCasino/select_Select one56 Prince George Avenue n1_c525cd'), 
    '88 Prince George Avenue, n144sp, London', true)

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/button_Accept'))

WebUI.click(findTestObject('Object Repository/Page_Register - SpaceCasino/button_Sign up'))

WebUI.setText(findTestObject('Object Repository/Page_Account - SpaceCasino/input_Resend Validation Code_code0'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Account - SpaceCasino/input_Resend Validation Code_code1'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Account - SpaceCasino/input_Resend Validation Code_code2'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Account - SpaceCasino/input_Resend Validation Code_code3'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Account - SpaceCasino/input_Resend Validation Code_code4'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Account - SpaceCasino/input_Resend Validation Code_code5'), '9')
=======

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.spacecasino.co.uk/')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Password Protection/input_Password protected site_password'), 
    '7Ud+37EcZMriwDyAZUmMTg==')

WebUI.click(findTestObject('Object Repository/Page_Password Protection/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Best Online Casino and Sports Betting - Space Casino/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Username_username'), 'newuser')

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Email_email'), 'newuser@a.test.spacecasino.co.uk')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Space Casino/input_Password_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - Space Casino/input_Password Confirmation_password_confirmation'), 
    'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/label_I agree to the Terms and Conditions and Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/label_I certify that I am 18 years of age or older'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_First name_first_name'), 'auto')

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Last name_last_name'), 'test')

WebUI.click(findTestObject('Object Repository/datepicker'))

WebUI.click(findTestObject('Object Repository/itemdate'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/label_male'))

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Postcode_post_code'), 'w127rr')

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/span_Please search for postcode or enter address manually_SignUpstyles__SearchButtonWrapper-x5b36l-12 fCtmFu'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/div_Select'))

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/div_Charles Tyrwhitt LLP  13 Silver Road'))

WebUI.setText(findTestObject('Object Repository/Page_Register - Space Casino/input_Phone number_phone_number'), '7900-0000-01')

WebUI.click(findTestObject('Object Repository/Page_Register - Space Casino/button_Submit'))

WebUI.closeBrowser()
>>>>>>> branch 'master' of https://github.com/WhiteOrg/SCAutoTests

