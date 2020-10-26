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

@Tag("7")
class Record_2925 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2925: FirstName is Brady")
	void FirstNameOfRecord2925() {
		assertEquals("Brady", customers.get(2924).getFirstName());
	}

	@Test
	@DisplayName("Record 2925: LastName is Rubinstone")
	void LastNameOfRecord2925() {
		assertEquals("Rubinstone", customers.get(2924).getLastName());
	}

	@Test
	@DisplayName("Record 2925: Company is Multivision Video & Film")
	void CompanyOfRecord2925() {
		assertEquals("Multivision Video & Film", customers.get(2924).getCompany());
	}

	@Test
	@DisplayName("Record 2925: Address is 200 N Belvidere Ave")
	void AddressOfRecord2925() {
		assertEquals("200 N Belvidere Ave", customers.get(2924).getAddress());
	}

	@Test
	@DisplayName("Record 2925: City is York")
	void CityOfRecord2925() {
		assertEquals("York", customers.get(2924).getCity());
	}

	@Test
	@DisplayName("Record 2925: County is York")
	void CountyOfRecord2925() {
		assertEquals("York", customers.get(2924).getCounty());
	}

	@Test
	@DisplayName("Record 2925: State is PA")
	void StateOfRecord2925() {
		assertEquals("PA", customers.get(2924).getState());
	}

	@Test
	@DisplayName("Record 2925: ZIP is 17404")
	void ZIPOfRecord2925() {
		assertEquals("17404", customers.get(2924).getZIP());
	}

	@Test
	@DisplayName("Record 2925: Phone is 717-848-8265")
	void PhoneOfRecord2925() {
		assertEquals("717-848-8265", customers.get(2924).getPhone());
	}

	@Test
	@DisplayName("Record 2925: Fax is 717-848-0562")
	void FaxOfRecord2925() {
		assertEquals("717-848-0562", customers.get(2924).getFax());
	}

	@Test
	@DisplayName("Record 2925: Email is brady@rubinstone.com")
	void EmailOfRecord2925() {
		assertEquals("brady@rubinstone.com", customers.get(2924).getEmail());
	}

	@Test
	@DisplayName("Record 2925: Web is http://www.bradyrubinstone.com")
	void WebOfRecord2925() {
		assertEquals("http://www.bradyrubinstone.com", customers.get(2924).getWeb());
	}
}
