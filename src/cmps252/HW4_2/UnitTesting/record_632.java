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

@Tag("17")
class Record_632 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 632: FirstName is Aubrey")
	void FirstNameOfRecord632() {
		assertEquals("Aubrey", customers.get(631).getFirstName());
	}

	@Test
	@DisplayName("Record 632: LastName is Zarlenga")
	void LastNameOfRecord632() {
		assertEquals("Zarlenga", customers.get(631).getLastName());
	}

	@Test
	@DisplayName("Record 632: Company is Dodd & Associates")
	void CompanyOfRecord632() {
		assertEquals("Dodd & Associates", customers.get(631).getCompany());
	}

	@Test
	@DisplayName("Record 632: Address is 163 Pittsburg St")
	void AddressOfRecord632() {
		assertEquals("163 Pittsburg St", customers.get(631).getAddress());
	}

	@Test
	@DisplayName("Record 632: City is Dallas")
	void CityOfRecord632() {
		assertEquals("Dallas", customers.get(631).getCity());
	}

	@Test
	@DisplayName("Record 632: County is Dallas")
	void CountyOfRecord632() {
		assertEquals("Dallas", customers.get(631).getCounty());
	}

	@Test
	@DisplayName("Record 632: State is TX")
	void StateOfRecord632() {
		assertEquals("TX", customers.get(631).getState());
	}

	@Test
	@DisplayName("Record 632: ZIP is 75207")
	void ZIPOfRecord632() {
		assertEquals("75207", customers.get(631).getZIP());
	}

	@Test
	@DisplayName("Record 632: Phone is 214-748-1304")
	void PhoneOfRecord632() {
		assertEquals("214-748-1304", customers.get(631).getPhone());
	}

	@Test
	@DisplayName("Record 632: Fax is 214-748-0843")
	void FaxOfRecord632() {
		assertEquals("214-748-0843", customers.get(631).getFax());
	}

	@Test
	@DisplayName("Record 632: Email is aubrey@zarlenga.com")
	void EmailOfRecord632() {
		assertEquals("aubrey@zarlenga.com", customers.get(631).getEmail());
	}

	@Test
	@DisplayName("Record 632: Web is http://www.aubreyzarlenga.com")
	void WebOfRecord632() {
		assertEquals("http://www.aubreyzarlenga.com", customers.get(631).getWeb());
	}
}
