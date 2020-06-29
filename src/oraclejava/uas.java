package oraclejava;

import controller.getData;
import uas.mainframe;
import java.sql.SQLException;
import java.text.ParseException;

public class uas {
    public static void main(String[] args) throws SQLException, ParseException {
        mainframe  main= new mainframe();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        new getData();
    }
}