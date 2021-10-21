import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/s8/dyh1x3217sv5ggpf0dj43g4r0000gq/T/Katalon/20211022_094601/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://platform-test.ljhooker.com/listings/75471778-86d5-5735-a366-3b3cc934a48f\')\n\nWebUI.delay(2)\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_email\'), \'tyip@ljhooker.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Page_Sign In with Auth0/input_LJ Hooker Platform (Test)_password\'), \n    \'04itpW7Jvvu6q4eKWSS9Yg==\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_Sign In with Auth0/span_Log In\'))\n\nWebUI.delay(2)\n\nWebUI.setText(findTestObject(\'Object Repository/Page_LJ Hooker/input_Social report link_f_c3bea489-15d5-44_478121\'), \'https://www.spokeapp.io/\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/span_Save\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/input_Social report link_f_cdc9e6ea-4f3f-42_32eb21\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/i_cancel\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_LJ Hooker/input_Social report link_f_c3bea489-15d5-44_478121\'), \'https://www.spokeapp.io/123\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/span_Save\'))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/input_Social report link_f_cdc9e6ea-4f3f-42_32eb21\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/i_cancel\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_LJ Hooker/span_Save\'))\n\nWebUI.delay(2)\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

