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

@Tag("29")
class Record_4894 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4894: FirstName is Samual")
	void FirstNameOfRecord4894() {
		assertEquals("Samual", customers.get(4893).getFirstName());
	}

	@Test
	@DisplayName("Record 4894: LastName is Kassner")
	void LastNameOfRecord4894() {
		assertEquals("Kassner", customers.get(4893).getLastName());
	}

	@Test
	@DisplayName("Record 4894: Company is Phoenix Graphics Inc")
	void CompanyOfRecord4894() {
		assertEquals("Phoenix Graphics Inc", customers.get(4893).getCompany());
	}

	@Test
	@DisplayName("Record 4894: Address is 1100 Shackamaxon St")
	void AddressOfRecord4894() {
		assertEquals("1100 Shackamaxon St", customers.get(4893).getAddress());
	}

	@Test
	@DisplayName("Record 4894: City is Philadelphia")
	void CityOfRecord4894() {
		assertEquals("Philadelphia", customers.get(4893).getCity());
	}

	@Test
	@DisplayName("Record 4894: County is Philadelphia")
	void CountyOfRecord4894() {
		assertEquals("Philadelphia", customers.get(4893).getCounty());
	}

	@Test
	@DisplayName("Record 4894: State is PA")
	void StateOfRecord4894() {
		assertEquals("PA", customers.get(4893).getState());
	}

	@Test
	@DisplayName("Record 4894: ZIP is 19125")
	void ZIPOfRecord4894() {
		assertEquals("19125", customers.get(4893).getZIP());
	}

	@Test
	@DisplayName("Record 4894: Phone is 215-739-9158")
	void PhoneOfRecord4894() {
		assertEquals("215-739-9158", customers.get(4893).getPhone());
	}

	@Test
	@DisplayName("Record 4894: Fax is 215-739-3585")
	void FaxOfRecord4894() {
		assertEquals("215-739-3585", customers.get(4893).getFax());
	}

	@Test
	@DisplayName("Record 4894: Email is samual@kassner.com")
	void EmailOfRecord4894() {
		assertEquals("samual@kassner.com", customers.get(4893).getEmail());
	}

	@Test
	@DisplayName("Record 4894: Web is http://www.samualkassner.com")
	void WebOfRecord4894() {
		assertEquals("http://www.samualkassner.com", customers.get(4893).getWeb());
	}
}
