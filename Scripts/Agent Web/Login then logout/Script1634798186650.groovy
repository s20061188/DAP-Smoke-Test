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

WebUI.navigateToUrl('https://platform-test.ljhooker.com/')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_email'), 'tyip@ljhooker.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_password'), 
    '04itpW7Jvvu6q4eKWSS9Yg==')

WebUI.click(findTestObject('Object Repository/Page_Sign In with Auth0/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/i_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_LJ Hooker/div_Log out'))

WebUI.closeBrowser()

