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

@Tag("12")
class Record_2978 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2978: FirstName is Diana")
	void FirstNameOfRecord2978() {
		assertEquals("Diana", customers.get(2977).getFirstName());
	}

	@Test
	@DisplayName("Record 2978: LastName is Delahay")
	void LastNameOfRecord2978() {
		assertEquals("Delahay", customers.get(2977).getLastName());
	}

	@Test
	@DisplayName("Record 2978: Company is Leather Best Trading Inc")
	void CompanyOfRecord2978() {
		assertEquals("Leather Best Trading Inc", customers.get(2977).getCompany());
	}

	@Test
	@DisplayName("Record 2978: Address is 2246 Jerrold Ave")
	void AddressOfRecord2978() {
		assertEquals("2246 Jerrold Ave", customers.get(2977).getAddress());
	}

	@Test
	@DisplayName("Record 2978: City is San Francisco")
	void CityOfRecord2978() {
		assertEquals("San Francisco", customers.get(2977).getCity());
	}

	@Test
	@DisplayName("Record 2978: County is San Francisco")
	void CountyOfRecord2978() {
		assertEquals("San Francisco", customers.get(2977).getCounty());
	}

	@Test
	@DisplayName("Record 2978: State is CA")
	void StateOfRecord2978() {
		assertEquals("CA", customers.get(2977).getState());
	}

	@Test
	@DisplayName("Record 2978: ZIP is 94124")
	void ZIPOfRecord2978() {
		assertEquals("94124", customers.get(2977).getZIP());
	}

	@Test
	@DisplayName("Record 2978: Phone is 415-285-2934")
	void PhoneOfRecord2978() {
		assertEquals("415-285-2934", customers.get(2977).getPhone());
	}

	@Test
	@DisplayName("Record 2978: Fax is 415-285-3512")
	void FaxOfRecord2978() {
		assertEquals("415-285-3512", customers.get(2977).getFax());
	}

	@Test
	@DisplayName("Record 2978: Email is diana@delahay.com")
	void EmailOfRecord2978() {
		assertEquals("diana@delahay.com", customers.get(2977).getEmail());
	}

	@Test
	@DisplayName("Record 2978: Web is http://www.dianadelahay.com")
	void WebOfRecord2978() {
		assertEquals("http://www.dianadelahay.com", customers.get(2977).getWeb());
	}
}
