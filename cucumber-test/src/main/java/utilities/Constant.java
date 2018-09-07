package utilities;

import java.io.File;
import java.nio.file.Paths;


class Constant {

    /**Config Properties file **/
  //  final static String CONFIG_PROPERTIES_DIRECTORY = Constant.class.getResource("/config.properties").getPath();
    
    //final static String CONFIG_PROPERTIES_DIRECTORY = Paths.get(System.getProperty("user.dir"), "src", "main", "resources", "config.properties").toString();
  
    final static String CONFIG_PROPERTIES_DIRECTORY = System.getProperty("user.dir") + "/src/main/resources/config.properties";
    
  // final static String CONFIG_PROPERTIES_DIRECTORY = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"  + File.separator + "resources"  + File.separator + "config.properties";

    final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver.exe";

    final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "chromedriver.exe";

    final static String IE_DRIVER_DIRECTORY = System.getProperty("user.dir") + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "IEDriverServer.exe";
}