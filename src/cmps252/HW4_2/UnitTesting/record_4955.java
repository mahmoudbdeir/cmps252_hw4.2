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

@Tag("49")
class Record_4955 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4955: FirstName is Germaine")
	void FirstNameOfRecord4955() {
		assertEquals("Germaine", customers.get(4954).getFirstName());
	}

	@Test
	@DisplayName("Record 4955: LastName is Robinsons")
	void LastNameOfRecord4955() {
		assertEquals("Robinsons", customers.get(4954).getLastName());
	}

	@Test
	@DisplayName("Record 4955: Company is Career Path Inc")
	void CompanyOfRecord4955() {
		assertEquals("Career Path Inc", customers.get(4954).getCompany());
	}

	@Test
	@DisplayName("Record 4955: Address is 13601 Preston Rd  #-701w")
	void AddressOfRecord4955() {
		assertEquals("13601 Preston Rd  #-701w", customers.get(4954).getAddress());
	}

	@Test
	@DisplayName("Record 4955: City is Dallas")
	void CityOfRecord4955() {
		assertEquals("Dallas", customers.get(4954).getCity());
	}

	@Test
	@DisplayName("Record 4955: County is Dallas")
	void CountyOfRecord4955() {
		assertEquals("Dallas", customers.get(4954).getCounty());
	}

	@Test
	@DisplayName("Record 4955: State is TX")
	void StateOfRecord4955() {
		assertEquals("TX", customers.get(4954).getState());
	}

	@Test
	@DisplayName("Record 4955: ZIP is 75240")
	void ZIPOfRecord4955() {
		assertEquals("75240", customers.get(4954).getZIP());
	}

	@Test
	@DisplayName("Record 4955: Phone is 214-788-6718")
	void PhoneOfRecord4955() {
		assertEquals("214-788-6718", customers.get(4954).getPhone());
	}

	@Test
	@DisplayName("Record 4955: Fax is 214-788-3754")
	void FaxOfRecord4955() {
		assertEquals("214-788-3754", customers.get(4954).getFax());
	}

	@Test
	@DisplayName("Record 4955: Email is germaine@robinsons.com")
	void EmailOfRecord4955() {
		assertEquals("germaine@robinsons.com", customers.get(4954).getEmail());
	}

	@Test
	@DisplayName("Record 4955: Web is http://www.germainerobinsons.com")
	void WebOfRecord4955() {
		assertEquals("http://www.germainerobinsons.com", customers.get(4954).getWeb());
	}
}
