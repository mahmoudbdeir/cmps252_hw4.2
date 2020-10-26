package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("8")
class Record_4759 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4759: FirstName is Josefina")
	void FirstNameOfRecord4759() {
		assertEquals("Josefina", customers.get(4758).getFirstName());
	}

	@Test
	@DisplayName("Record 4759: LastName is Dickhaut")
	void LastNameOfRecord4759() {
		assertEquals("Dickhaut", customers.get(4758).getLastName());
	}

	@Test
	@DisplayName("Record 4759: Company is Wallpaper Hawaii Ltd")
	void CompanyOfRecord4759() {
		assertEquals("Wallpaper Hawaii Ltd", customers.get(4758).getCompany());
	}

	@Test
	@DisplayName("Record 4759: Address is 315 E Sandusky St")
	void AddressOfRecord4759() {
		assertEquals("315 E Sandusky St", customers.get(4758).getAddress());
	}

	@Test
	@DisplayName("Record 4759: City is Findlay")
	void CityOfRecord4759() {
		assertEquals("Findlay", customers.get(4758).getCity());
	}

	@Test
	@DisplayName("Record 4759: County is Hancock")
	void CountyOfRecord4759() {
		assertEquals("Hancock", customers.get(4758).getCounty());
	}

	@Test
	@DisplayName("Record 4759: State is OH")
	void StateOfRecord4759() {
		assertEquals("OH", customers.get(4758).getState());
	}

	@Test
	@DisplayName("Record 4759: ZIP is 45840")
	void ZIPOfRecord4759() {
		assertEquals("45840", customers.get(4758).getZIP());
	}

	@Test
	@DisplayName("Record 4759: Phone is 419-422-3929")
	void PhoneOfRecord4759() {
		assertEquals("419-422-3929", customers.get(4758).getPhone());
	}

	@Test
	@DisplayName("Record 4759: Fax is 419-422-9061")
	void FaxOfRecord4759() {
		assertEquals("419-422-9061", customers.get(4758).getFax());
	}

	@Test
	@DisplayName("Record 4759: Email is josefina@dickhaut.com")
	void EmailOfRecord4759() {
		assertEquals("josefina@dickhaut.com", customers.get(4758).getEmail());
	}

	@Test
	@DisplayName("Record 4759: Web is http://www.josefinadickhaut.com")
	void WebOfRecord4759() {
		assertEquals("http://www.josefinadickhaut.com", customers.get(4758).getWeb());
	}
}
