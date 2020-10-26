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

@Tag("14")
class Record_3838 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3838: FirstName is Earle")
	void FirstNameOfRecord3838() {
		assertEquals("Earle", customers.get(3837).getFirstName());
	}

	@Test
	@DisplayName("Record 3838: LastName is Laprade")
	void LastNameOfRecord3838() {
		assertEquals("Laprade", customers.get(3837).getLastName());
	}

	@Test
	@DisplayName("Record 3838: Company is Jaunty Textiles")
	void CompanyOfRecord3838() {
		assertEquals("Jaunty Textiles", customers.get(3837).getCompany());
	}

	@Test
	@DisplayName("Record 3838: Address is 310 Grant St")
	void AddressOfRecord3838() {
		assertEquals("310 Grant St", customers.get(3837).getAddress());
	}

	@Test
	@DisplayName("Record 3838: City is Pittsburgh")
	void CityOfRecord3838() {
		assertEquals("Pittsburgh", customers.get(3837).getCity());
	}

	@Test
	@DisplayName("Record 3838: County is Allegheny")
	void CountyOfRecord3838() {
		assertEquals("Allegheny", customers.get(3837).getCounty());
	}

	@Test
	@DisplayName("Record 3838: State is PA")
	void StateOfRecord3838() {
		assertEquals("PA", customers.get(3837).getState());
	}

	@Test
	@DisplayName("Record 3838: ZIP is 15219")
	void ZIPOfRecord3838() {
		assertEquals("15219", customers.get(3837).getZIP());
	}

	@Test
	@DisplayName("Record 3838: Phone is 412-471-0763")
	void PhoneOfRecord3838() {
		assertEquals("412-471-0763", customers.get(3837).getPhone());
	}

	@Test
	@DisplayName("Record 3838: Fax is 412-471-1976")
	void FaxOfRecord3838() {
		assertEquals("412-471-1976", customers.get(3837).getFax());
	}

	@Test
	@DisplayName("Record 3838: Email is earle@laprade.com")
	void EmailOfRecord3838() {
		assertEquals("earle@laprade.com", customers.get(3837).getEmail());
	}

	@Test
	@DisplayName("Record 3838: Web is http://www.earlelaprade.com")
	void WebOfRecord3838() {
		assertEquals("http://www.earlelaprade.com", customers.get(3837).getWeb());
	}
}
