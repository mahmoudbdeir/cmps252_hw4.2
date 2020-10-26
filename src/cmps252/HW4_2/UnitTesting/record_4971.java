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

@Tag("23")
class Record_4971 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4971: FirstName is Weston")
	void FirstNameOfRecord4971() {
		assertEquals("Weston", customers.get(4970).getFirstName());
	}

	@Test
	@DisplayName("Record 4971: LastName is Pittinger")
	void LastNameOfRecord4971() {
		assertEquals("Pittinger", customers.get(4970).getLastName());
	}

	@Test
	@DisplayName("Record 4971: Company is Sigmet Corp")
	void CompanyOfRecord4971() {
		assertEquals("Sigmet Corp", customers.get(4970).getCompany());
	}

	@Test
	@DisplayName("Record 4971: Address is 575 Madison Ave")
	void AddressOfRecord4971() {
		assertEquals("575 Madison Ave", customers.get(4970).getAddress());
	}

	@Test
	@DisplayName("Record 4971: City is New York")
	void CityOfRecord4971() {
		assertEquals("New York", customers.get(4970).getCity());
	}

	@Test
	@DisplayName("Record 4971: County is New York")
	void CountyOfRecord4971() {
		assertEquals("New York", customers.get(4970).getCounty());
	}

	@Test
	@DisplayName("Record 4971: State is NY")
	void StateOfRecord4971() {
		assertEquals("NY", customers.get(4970).getState());
	}

	@Test
	@DisplayName("Record 4971: ZIP is 10022")
	void ZIPOfRecord4971() {
		assertEquals("10022", customers.get(4970).getZIP());
	}

	@Test
	@DisplayName("Record 4971: Phone is 212-605-3728")
	void PhoneOfRecord4971() {
		assertEquals("212-605-3728", customers.get(4970).getPhone());
	}

	@Test
	@DisplayName("Record 4971: Fax is 212-605-6809")
	void FaxOfRecord4971() {
		assertEquals("212-605-6809", customers.get(4970).getFax());
	}

	@Test
	@DisplayName("Record 4971: Email is weston@pittinger.com")
	void EmailOfRecord4971() {
		assertEquals("weston@pittinger.com", customers.get(4970).getEmail());
	}

	@Test
	@DisplayName("Record 4971: Web is http://www.westonpittinger.com")
	void WebOfRecord4971() {
		assertEquals("http://www.westonpittinger.com", customers.get(4970).getWeb());
	}
}
