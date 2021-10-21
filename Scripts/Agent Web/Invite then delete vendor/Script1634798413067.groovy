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

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Invite vendors'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Sending Invite will send an email to _611173'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Full name_f_32a36437-4ac8-4b2b-92ea-2_bf0118'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Send invite'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://platform-test.ljhooker.com/listings/75471778-86d5-5735-a366-3b3cc934a48f')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_email'), 'tyip@ljhooker.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_password'), 
    '04itpW7Jvvu6q4eKWSS9Yg==')

WebUI.click(findTestObject('Object Repository/Page_Sign In with Auth0/span_Log In'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Invite vendors'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Sending Invite will send an email to _611173'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_LJ Hooker/input_Full name_f_32a36437-4ac8-4b2b-92ea-2_bf0118'), 'test@test.com')

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Send invite'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/i_more_vert'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/div_Remove vendor'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Confirm remove'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/span_Dismiss'))

WebUI.closeBrowser()

