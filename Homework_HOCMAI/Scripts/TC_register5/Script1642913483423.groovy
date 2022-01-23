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

WebUI.navigateToUrl('https://hocmai.vn/loginv2/signup.php?fbclid=IwAR3VgN2ZaoB9-SHDHsIKq3u06-pO3-9ZZU1kJAKklMTT8d5uAqm_PR3pIM8')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/FullName'), 'Luong Meo')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/EmailAddress'), 'chuemomuop123@gmail.com')

WebUI.setText(findTestObject('Page_ng k nhp hc - HOCMAI/PhoneNumber'), '0372792861')

WebUI.setEncryptedText(findTestObject('Page_ng k nhp hc - HOCMAI/Password'), 'BMQOnuhNWyz827lZLV1rhA==')

WebUI.setEncryptedText(findTestObject('Page_ng k nhp hc - HOCMAI/RePassword'), 'BMQOnuhNWyz827lZLV1rhA==')

WebUI.click(findTestObject('Page_ng k nhp hc - HOCMAI/Button_DangKy'))

WebUI.click(findTestObject('Page_Thng tin ti khon - HOCMAI/Button_KickHoat'))

WebUI.setText(findTestObject('Page_Thng tin ti khon - HOCMAI/Code'), '1659')

WebUI.click(findTestObject('Page_Thng tin ti khon - HOCMAI/Button_KickHoat'))

WebUI.closeBrowser()

