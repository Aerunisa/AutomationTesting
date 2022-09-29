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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/a_Create New Account'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_8e27d1'), 
    'Fitri')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_342d17'), 
    'Ani')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_554ec3'), 
    'jhonsonsteven07@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_19fc6e'), 
    'jhonsonsteven07@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_concat(We couldn, , t create your acc_7f0a99'), 
    'HZ6drPYsd0E=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook  log in or sign up/select_123456789101112131415161718192021222_566da4'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook  log in or sign up/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook  log in or sign up/select_202220212020201920182017201620152014_d959b4'), 
    '2008', true)

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/label_Custom'))

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/div_Select your pronounShe Wish her a happy_e76b2f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Facebook  log in or sign up/select_Select your pronounShe Wish her a ha_90e2d2'), 
    '6', true)

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Your pronoun is visible to everyone_c_a78fbb'), 
    'Optional')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Resend confirmation code'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_To confirm your account, enter the 5-_70a6c3'), '155')

WebUI.doubleClick(findTestObject('Object Repository/Page_Facebook/input_To confirm your account, enter the 5-_70a6c3'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_To confirm your account, enter the 5-_70a6c3'), '15667')

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_Disagree With Decision'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Enter number_phone'), '085887173252')

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Send Login Code'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_To verify your mobile number, please _653879'), '042301')

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Next'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_Upload Image'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Continue'))

WebUI.closeBrowser()

