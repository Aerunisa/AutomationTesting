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

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/a_Forgotten password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'), 
    'fchaerin.c196@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue'))

'Kodenya berubah2'
WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Please check your emails for a messag_6d8c97'), '135715')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new'), 'Aerunisa77')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_(1) Facebook/span_Lanjutkan'))

WebUI.closeBrowser()

