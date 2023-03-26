package stepdefinitions.database;

import io.cucumber.java.en.*;
import utilities.JdbcUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_029_TC001_DB {


    List<Object> namecolumnList;
    @Given("Admin gets the column {string} from {string} country table")
    public void admin_gets_the_column_from_country_table(String columnName, String tableName) {
        String query = "SELECT * FROM " + tableName;
        namecolumnList = JdbcUtils.getColumnData(query, columnName);
        System.out.println("namecolumnList = " + namecolumnList);

    }

    @Then("verify the name column  contains of the created {string} country")
    public void verifyTheNameColumnContainsOfTheCreatedCountry(String countryName) {
        assertTrue(namecolumnList.contains(countryName));
    }

    @Given("Admin creates country name {string} from {string} country table to {string} column")
    public void admin_creates_country_name_from_country_table_to_column(String countryName, String tableName, String columnNames) {
       String query = "INSERT INTO "+tableName+"("+columnNames+") VALUES("+countryName+")";
       JdbcUtils.insertDataIntoTable(query);
    }

    @Then("verify that the name column gives the country created {string}")
    public void verify_that_the_name_column_gives_the_country_created(String string) {

    }

}
