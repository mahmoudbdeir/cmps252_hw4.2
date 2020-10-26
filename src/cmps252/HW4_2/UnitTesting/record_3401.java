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

@Tag("47")
class Record_3401 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3401: FirstName is Dewitt")
	void FirstNameOfRecord3401() {
		assertEquals("Dewitt", customers.get(3400).getFirstName());
	}

	@Test
	@DisplayName("Record 3401: LastName is Gowler")
	void LastNameOfRecord3401() {
		assertEquals("Gowler", customers.get(3400).getLastName());
	}

	@Test
	@DisplayName("Record 3401: Company is Boyd, Paul M Esq")
	void CompanyOfRecord3401() {
		assertEquals("Boyd, Paul M Esq", customers.get(3400).getCompany());
	}

	@Test
	@DisplayName("Record 3401: Address is 151 W 26th St")
	void AddressOfRecord3401() {
		assertEquals("151 W 26th St", customers.get(3400).getAddress());
	}

	@Test
	@DisplayName("Record 3401: City is New York")
	void CityOfRecord3401() {
		assertEquals("New York", customers.get(3400).getCity());
	}

	@Test
	@DisplayName("Record 3401: County is New York")
	void CountyOfRecord3401() {
		assertEquals("New York", customers.get(3400).getCounty());
	}

	@Test
	@DisplayName("Record 3401: State is NY")
	void StateOfRecord3401() {
		assertEquals("NY", customers.get(3400).getState());
	}

	@Test
	@DisplayName("Record 3401: ZIP is 10001")
	void ZIPOfRecord3401() {
		assertEquals("10001", customers.get(3400).getZIP());
	}

	@Test
	@DisplayName("Record 3401: Phone is 212-645-0146")
	void PhoneOfRecord3401() {
		assertEquals("212-645-0146", customers.get(3400).getPhone());
	}

	@Test
	@DisplayName("Record 3401: Fax is 212-645-9573")
	void FaxOfRecord3401() {
		assertEquals("212-645-9573", customers.get(3400).getFax());
	}

	@Test
	@DisplayName("Record 3401: Email is dewitt@gowler.com")
	void EmailOfRecord3401() {
		assertEquals("dewitt@gowler.com", customers.get(3400).getEmail());
	}

	@Test
	@DisplayName("Record 3401: Web is http://www.dewittgowler.com")
	void WebOfRecord3401() {
		assertEquals("http://www.dewittgowler.com", customers.get(3400).getWeb());
	}
}
