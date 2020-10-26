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

@Tag("24")
class Record_4002 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4002: FirstName is Adriana")
	void FirstNameOfRecord4002() {
		assertEquals("Adriana", customers.get(4001).getFirstName());
	}

	@Test
	@DisplayName("Record 4002: LastName is Shorten")
	void LastNameOfRecord4002() {
		assertEquals("Shorten", customers.get(4001).getLastName());
	}

	@Test
	@DisplayName("Record 4002: Company is National Fishery Research Cntr")
	void CompanyOfRecord4002() {
		assertEquals("National Fishery Research Cntr", customers.get(4001).getCompany());
	}

	@Test
	@DisplayName("Record 4002: Address is 2185 S Jason St")
	void AddressOfRecord4002() {
		assertEquals("2185 S Jason St", customers.get(4001).getAddress());
	}

	@Test
	@DisplayName("Record 4002: City is Denver")
	void CityOfRecord4002() {
		assertEquals("Denver", customers.get(4001).getCity());
	}

	@Test
	@DisplayName("Record 4002: County is Denver")
	void CountyOfRecord4002() {
		assertEquals("Denver", customers.get(4001).getCounty());
	}

	@Test
	@DisplayName("Record 4002: State is CO")
	void StateOfRecord4002() {
		assertEquals("CO", customers.get(4001).getState());
	}

	@Test
	@DisplayName("Record 4002: ZIP is 80223")
	void ZIPOfRecord4002() {
		assertEquals("80223", customers.get(4001).getZIP());
	}

	@Test
	@DisplayName("Record 4002: Phone is 303-934-7761")
	void PhoneOfRecord4002() {
		assertEquals("303-934-7761", customers.get(4001).getPhone());
	}

	@Test
	@DisplayName("Record 4002: Fax is 303-934-3619")
	void FaxOfRecord4002() {
		assertEquals("303-934-3619", customers.get(4001).getFax());
	}

	@Test
	@DisplayName("Record 4002: Email is adriana@shorten.com")
	void EmailOfRecord4002() {
		assertEquals("adriana@shorten.com", customers.get(4001).getEmail());
	}

	@Test
	@DisplayName("Record 4002: Web is http://www.adrianashorten.com")
	void WebOfRecord4002() {
		assertEquals("http://www.adrianashorten.com", customers.get(4001).getWeb());
	}
}
