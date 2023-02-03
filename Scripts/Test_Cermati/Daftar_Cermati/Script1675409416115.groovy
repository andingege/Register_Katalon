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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.url_cermati)

WebUI.setText(findTestObject('Daftar_Cermati/input_Email_email'), 'marpaungandin@gmail.com')

WebUI.setText(findTestObject('Daftar_Cermati/input_No. Handphone_mobilePhone'), '082274131101')

WebUI.setText(findTestObject('Daftar_Cermati/input_Kata Sandi_password'), '@Andingg123')

WebUI.setText(findTestObject('Daftar_Cermati/input_Ulangi Kata Sandi_confirmPassword'), '@Andingg123')

WebUI.setText(findTestObject('Daftar_Cermati/input_Nama Depan_firstName'), 'Andin Gevin')

WebUI.setText(findTestObject('Daftar_Cermati/input_Nama Belakang_lastName'), 'Marpaung')

WebUI.setText(findTestObject('Daftar_Cermati/input_KabupatenKota_cityAndProvince'), 'Kabupaten Tapanuli utara')

WebUI.click(findTestObject('Daftar_Cermati/button_KABUPATEN TAPANULI UTARA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Daftar_Cermati/p_Daftar'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Daftar_Cermati/div_Pilih metode verifikasi untuk mengirim kode OTP'), 0)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('1', null)

WebUI.closeBrowser()

