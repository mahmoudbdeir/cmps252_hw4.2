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

@Tag("3")
class Record_2304 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2304: FirstName is Alfred")
	void FirstNameOfRecord2304() {
		assertEquals("Alfred", customers.get(2303).getFirstName());
	}

	@Test
	@DisplayName("Record 2304: LastName is Toalson")
	void LastNameOfRecord2304() {
		assertEquals("Toalson", customers.get(2303).getLastName());
	}

	@Test
	@DisplayName("Record 2304: Company is Hart & Calley Pc")
	void CompanyOfRecord2304() {
		assertEquals("Hart & Calley Pc", customers.get(2303).getCompany());
	}

	@Test
	@DisplayName("Record 2304: Address is 102 Buster St")
	void AddressOfRecord2304() {
		assertEquals("102 Buster St", customers.get(2303).getAddress());
	}

	@Test
	@DisplayName("Record 2304: City is Youngsville")
	void CityOfRecord2304() {
		assertEquals("Youngsville", customers.get(2303).getCity());
	}

	@Test
	@DisplayName("Record 2304: County is Lafayette")
	void CountyOfRecord2304() {
		assertEquals("Lafayette", customers.get(2303).getCounty());
	}

	@Test
	@DisplayName("Record 2304: State is LA")
	void StateOfRecord2304() {
		assertEquals("LA", customers.get(2303).getState());
	}

	@Test
	@DisplayName("Record 2304: ZIP is 70592")
	void ZIPOfRecord2304() {
		assertEquals("70592", customers.get(2303).getZIP());
	}

	@Test
	@DisplayName("Record 2304: Phone is 337-828-4989")
	void PhoneOfRecord2304() {
		assertEquals("337-828-4989", customers.get(2303).getPhone());
	}

	@Test
	@DisplayName("Record 2304: Fax is 337-828-5762")
	void FaxOfRecord2304() {
		assertEquals("337-828-5762", customers.get(2303).getFax());
	}

	@Test
	@DisplayName("Record 2304: Email is alfred@toalson.com")
	void EmailOfRecord2304() {
		assertEquals("alfred@toalson.com", customers.get(2303).getEmail());
	}

	@Test
	@DisplayName("Record 2304: Web is http://www.alfredtoalson.com")
	void WebOfRecord2304() {
		assertEquals("http://www.alfredtoalson.com", customers.get(2303).getWeb());
	}
}
