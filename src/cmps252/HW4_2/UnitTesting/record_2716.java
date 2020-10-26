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

@Tag("20")
class Record_2716 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2716: FirstName is Roxanna")
	void FirstNameOfRecord2716() {
		assertEquals("Roxanna", customers.get(2715).getFirstName());
	}

	@Test
	@DisplayName("Record 2716: LastName is Laviero")
	void LastNameOfRecord2716() {
		assertEquals("Laviero", customers.get(2715).getLastName());
	}

	@Test
	@DisplayName("Record 2716: Company is Simplicity Tool Corp")
	void CompanyOfRecord2716() {
		assertEquals("Simplicity Tool Corp", customers.get(2715).getCompany());
	}

	@Test
	@DisplayName("Record 2716: Address is 506 Georgetown Rd")
	void AddressOfRecord2716() {
		assertEquals("506 Georgetown Rd", customers.get(2715).getAddress());
	}

	@Test
	@DisplayName("Record 2716: City is Wallingford")
	void CityOfRecord2716() {
		assertEquals("Wallingford", customers.get(2715).getCity());
	}

	@Test
	@DisplayName("Record 2716: County is Delaware")
	void CountyOfRecord2716() {
		assertEquals("Delaware", customers.get(2715).getCounty());
	}

	@Test
	@DisplayName("Record 2716: State is PA")
	void StateOfRecord2716() {
		assertEquals("PA", customers.get(2715).getState());
	}

	@Test
	@DisplayName("Record 2716: ZIP is 19086")
	void ZIPOfRecord2716() {
		assertEquals("19086", customers.get(2715).getZIP());
	}

	@Test
	@DisplayName("Record 2716: Phone is 610-338-7272")
	void PhoneOfRecord2716() {
		assertEquals("610-338-7272", customers.get(2715).getPhone());
	}

	@Test
	@DisplayName("Record 2716: Fax is 610-338-1322")
	void FaxOfRecord2716() {
		assertEquals("610-338-1322", customers.get(2715).getFax());
	}

	@Test
	@DisplayName("Record 2716: Email is roxanna@laviero.com")
	void EmailOfRecord2716() {
		assertEquals("roxanna@laviero.com", customers.get(2715).getEmail());
	}

	@Test
	@DisplayName("Record 2716: Web is http://www.roxannalaviero.com")
	void WebOfRecord2716() {
		assertEquals("http://www.roxannalaviero.com", customers.get(2715).getWeb());
	}
}
