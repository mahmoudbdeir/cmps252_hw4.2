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

@Tag("45")
class Record_2067 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2067: FirstName is Benita")
	void FirstNameOfRecord2067() {
		assertEquals("Benita", customers.get(2066).getFirstName());
	}

	@Test
	@DisplayName("Record 2067: LastName is Coray")
	void LastNameOfRecord2067() {
		assertEquals("Coray", customers.get(2066).getLastName());
	}

	@Test
	@DisplayName("Record 2067: Company is Garys Honda")
	void CompanyOfRecord2067() {
		assertEquals("Garys Honda", customers.get(2066).getCompany());
	}

	@Test
	@DisplayName("Record 2067: Address is 2900 Vernon Pl")
	void AddressOfRecord2067() {
		assertEquals("2900 Vernon Pl", customers.get(2066).getAddress());
	}

	@Test
	@DisplayName("Record 2067: City is Cincinnati")
	void CityOfRecord2067() {
		assertEquals("Cincinnati", customers.get(2066).getCity());
	}

	@Test
	@DisplayName("Record 2067: County is Hamilton")
	void CountyOfRecord2067() {
		assertEquals("Hamilton", customers.get(2066).getCounty());
	}

	@Test
	@DisplayName("Record 2067: State is OH")
	void StateOfRecord2067() {
		assertEquals("OH", customers.get(2066).getState());
	}

	@Test
	@DisplayName("Record 2067: ZIP is 45219")
	void ZIPOfRecord2067() {
		assertEquals("45219", customers.get(2066).getZIP());
	}

	@Test
	@DisplayName("Record 2067: Phone is 513-281-9613")
	void PhoneOfRecord2067() {
		assertEquals("513-281-9613", customers.get(2066).getPhone());
	}

	@Test
	@DisplayName("Record 2067: Fax is 513-281-0853")
	void FaxOfRecord2067() {
		assertEquals("513-281-0853", customers.get(2066).getFax());
	}

	@Test
	@DisplayName("Record 2067: Email is benita@coray.com")
	void EmailOfRecord2067() {
		assertEquals("benita@coray.com", customers.get(2066).getEmail());
	}

	@Test
	@DisplayName("Record 2067: Web is http://www.benitacoray.com")
	void WebOfRecord2067() {
		assertEquals("http://www.benitacoray.com", customers.get(2066).getWeb());
	}
}
