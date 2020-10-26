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

@Tag("43")
class Record_13 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 13: FirstName is Stewart")
	void FirstNameOfRecord13() {
		assertEquals("Stewart", customers.get(12).getFirstName());
	}

	@Test
	@DisplayName("Record 13: LastName is Sheakley")
	void LastNameOfRecord13() {
		assertEquals("Sheakley", customers.get(12).getLastName());
	}

	@Test
	@DisplayName("Record 13: Company is Chase Communications Group Ltd")
	void CompanyOfRecord13() {
		assertEquals("Chase Communications Group Ltd", customers.get(12).getCompany());
	}

	@Test
	@DisplayName("Record 13: Address is Rr 5")
	void AddressOfRecord13() {
		assertEquals("Rr 5", customers.get(12).getAddress());
	}

	@Test
	@DisplayName("Record 13: City is Mechanicsville")
	void CityOfRecord13() {
		assertEquals("Mechanicsville", customers.get(12).getCity());
	}

	@Test
	@DisplayName("Record 13: County is Saint Marys")
	void CountyOfRecord13() {
		assertEquals("Saint Marys", customers.get(12).getCounty());
	}

	@Test
	@DisplayName("Record 13: State is MD")
	void StateOfRecord13() {
		assertEquals("MD", customers.get(12).getState());
	}

	@Test
	@DisplayName("Record 13: ZIP is 20659")
	void ZIPOfRecord13() {
		assertEquals("20659", customers.get(12).getZIP());
	}

	@Test
	@DisplayName("Record 13: Phone is 301-884-1113")
	void PhoneOfRecord13() {
		assertEquals("301-884-1113", customers.get(12).getPhone());
	}

	@Test
	@DisplayName("Record 13: Fax is 301-884-4735")
	void FaxOfRecord13() {
		assertEquals("301-884-4735", customers.get(12).getFax());
	}

	@Test
	@DisplayName("Record 13: Email is stewart@sheakley.com")
	void EmailOfRecord13() {
		assertEquals("stewart@sheakley.com", customers.get(12).getEmail());
	}

	@Test
	@DisplayName("Record 13: Web is http://www.stewartsheakley.com")
	void WebOfRecord13() {
		assertEquals("http://www.stewartsheakley.com", customers.get(12).getWeb());
	}
}
