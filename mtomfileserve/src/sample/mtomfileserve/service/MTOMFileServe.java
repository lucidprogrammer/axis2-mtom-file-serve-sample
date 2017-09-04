package sample.mtomfileserve.service;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;

public class MTOMFileServe {

  public DataHandler getFile(String fileName) {
    String axisLogo = System.getenv("AXIS2_HOME") + "/samples/mtomfileserve/axis.jpg";
    FileDataSource dataSource = new FileDataSource(axisLogo);
    DataHandler fileDataHandler = new DataHandler(dataSource);
    return fileDataHandler;
  }

}
