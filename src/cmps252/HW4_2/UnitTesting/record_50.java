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

@Tag("2")
class Record_50 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 50: FirstName is Jeanne")
	void FirstNameOfRecord50() {
		assertEquals("Jeanne", customers.get(49).getFirstName());
	}

	@Test
	@DisplayName("Record 50: LastName is Bonefont")
	void LastNameOfRecord50() {
		assertEquals("Bonefont", customers.get(49).getLastName());
	}

	@Test
	@DisplayName("Record 50: Company is Gem Industrial Inc")
	void CompanyOfRecord50() {
		assertEquals("Gem Industrial Inc", customers.get(49).getCompany());
	}

	@Test
	@DisplayName("Record 50: Address is 1490 N Clinton Ave")
	void AddressOfRecord50() {
		assertEquals("1490 N Clinton Ave", customers.get(49).getAddress());
	}

	@Test
	@DisplayName("Record 50: City is Bay Shore")
	void CityOfRecord50() {
		assertEquals("Bay Shore", customers.get(49).getCity());
	}

	@Test
	@DisplayName("Record 50: County is Suffolk")
	void CountyOfRecord50() {
		assertEquals("Suffolk", customers.get(49).getCounty());
	}

	@Test
	@DisplayName("Record 50: State is NY")
	void StateOfRecord50() {
		assertEquals("NY", customers.get(49).getState());
	}

	@Test
	@DisplayName("Record 50: ZIP is 11706")
	void ZIPOfRecord50() {
		assertEquals("11706", customers.get(49).getZIP());
	}

	@Test
	@DisplayName("Record 50: Phone is 631-666-7002")
	void PhoneOfRecord50() {
		assertEquals("631-666-7002", customers.get(49).getPhone());
	}

	@Test
	@DisplayName("Record 50: Fax is 631-666-7126")
	void FaxOfRecord50() {
		assertEquals("631-666-7126", customers.get(49).getFax());
	}

	@Test
	@DisplayName("Record 50: Email is jeanne@bonefont.com")
	void EmailOfRecord50() {
		assertEquals("jeanne@bonefont.com", customers.get(49).getEmail());
	}

	@Test
	@DisplayName("Record 50: Web is http://www.jeannebonefont.com")
	void WebOfRecord50() {
		assertEquals("http://www.jeannebonefont.com", customers.get(49).getWeb());
	}
}
