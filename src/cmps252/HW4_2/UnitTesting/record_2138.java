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
class Record_2138 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2138: FirstName is Glen")
	void FirstNameOfRecord2138() {
		assertEquals("Glen", customers.get(2137).getFirstName());
	}

	@Test
	@DisplayName("Record 2138: LastName is Mazariego")
	void LastNameOfRecord2138() {
		assertEquals("Mazariego", customers.get(2137).getLastName());
	}

	@Test
	@DisplayName("Record 2138: Company is Stephens M Mfg Inc")
	void CompanyOfRecord2138() {
		assertEquals("Stephens M Mfg Inc", customers.get(2137).getCompany());
	}

	@Test
	@DisplayName("Record 2138: Address is 500 W Congress St")
	void AddressOfRecord2138() {
		assertEquals("500 W Congress St", customers.get(2137).getAddress());
	}

	@Test
	@DisplayName("Record 2138: City is Lafayette")
	void CityOfRecord2138() {
		assertEquals("Lafayette", customers.get(2137).getCity());
	}

	@Test
	@DisplayName("Record 2138: County is Lafayette")
	void CountyOfRecord2138() {
		assertEquals("Lafayette", customers.get(2137).getCounty());
	}

	@Test
	@DisplayName("Record 2138: State is LA")
	void StateOfRecord2138() {
		assertEquals("LA", customers.get(2137).getState());
	}

	@Test
	@DisplayName("Record 2138: ZIP is 70501")
	void ZIPOfRecord2138() {
		assertEquals("70501", customers.get(2137).getZIP());
	}

	@Test
	@DisplayName("Record 2138: Phone is 337-235-3389")
	void PhoneOfRecord2138() {
		assertEquals("337-235-3389", customers.get(2137).getPhone());
	}

	@Test
	@DisplayName("Record 2138: Fax is 337-235-0613")
	void FaxOfRecord2138() {
		assertEquals("337-235-0613", customers.get(2137).getFax());
	}

	@Test
	@DisplayName("Record 2138: Email is glen@mazariego.com")
	void EmailOfRecord2138() {
		assertEquals("glen@mazariego.com", customers.get(2137).getEmail());
	}

	@Test
	@DisplayName("Record 2138: Web is http://www.glenmazariego.com")
	void WebOfRecord2138() {
		assertEquals("http://www.glenmazariego.com", customers.get(2137).getWeb());
	}
}
