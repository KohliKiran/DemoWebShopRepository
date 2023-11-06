package genericlibrery;
/**
 * This method is used to store all the contents such as path of PropertyFile,ExcelFile,ScreenShot
 * and DataBase URL and password and browser,
 */
public interface IAutoConstants {
	String PROPERTY_FILE_PATH="./src/test/resources/ConfigurationData.property";
	String EXCEL_PATH="./src/test/resources/New Microsoft Excel Worksheet - Copy.xlsx";
	String DATABASE_URL="jdbc:mysql://localhost:3306/test";
	String DATABASE_UN="root";
	String DATABASE_PWD="root";
	String BROWSER="chrome";

}
