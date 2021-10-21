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

WebUI.navigateToUrl('https://platform-test.ljhooker.com/listings/75471778-86d5-5735-a366-3b3cc934a48f')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_email'), 'tyip@ljhooker.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_password'), 
    '04itpW7Jvvu6q4eKWSS9Yg==')

WebUI.click(findTestObject('Object Repository/Page_Sign In with Auth0/span_Log In'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Social report link_f_c3bea489-15d5-44_478121'), 'https://www.spokeapp.io/')

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_LJ Hooker/i_cancel'))

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Social report link_f_c3bea489-15d5-44_478121'), 'https://www.spokeapp.io/123')

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/i_cancel'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Save'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://platform-test.ljhooker.com/listings/75471778-86d5-5735-a366-3b3cc934a48f')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_email'), 'tyip@ljhooker.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_password'), 
    '04itpW7Jvvu6q4eKWSS9Yg==')

WebUI.click(findTestObject('Object Repository/Page_Sign In with Auth0/span_Log In'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Social report link_f_c3bea489-15d5-44_478121'), 'https://www.spokeapp.io/')

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/input_Social report link_f_cdc9e6ea-4f3f-42_32eb21'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/i_cancel'))

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Social report link_f_c3bea489-15d5-44_478121'), 'https://www.spokeapp.io/123')

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/input_Social report link_f_cdc9e6ea-4f3f-42_32eb21'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/i_cancel'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Save'))

WebUI.delay(2)

WebUI.closeBrowser()

