import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightsUtil {

    private FlightsUtil() {
    }

    public static void createTable() {

        String createSql = "CREATE TABLE FLIGHTS (" +
                "CITY_1 VARCHAR(255), " +
                "CITY_2 VARCHAR(255), " +
                "DATE1 INTEGER," +
                "AMOUNT INTEGER NOT NULL," +
                "";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Flights flights) {

        String insertSql = "INSERT INTO FLIGHTS(CITY1, CITY2, DATE1, AMOUNT) VALUES(" +
                "'" + flights.getCity1() + "', " +
                "'" + flights.getCity2() + "', " +
                "'" + flights.getDate() + "', " +
                "" + flights.getAmount() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }




}
