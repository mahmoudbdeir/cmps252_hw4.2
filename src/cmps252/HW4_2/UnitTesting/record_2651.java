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

@Tag("2")
class Record_2651 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2651: FirstName is Marcel")
	void FirstNameOfRecord2651() {
		assertEquals("Marcel", customers.get(2650).getFirstName());
	}

	@Test
	@DisplayName("Record 2651: LastName is Binker")
	void LastNameOfRecord2651() {
		assertEquals("Binker", customers.get(2650).getLastName());
	}

	@Test
	@DisplayName("Record 2651: Company is Willow Family Foods")
	void CompanyOfRecord2651() {
		assertEquals("Willow Family Foods", customers.get(2650).getCompany());
	}

	@Test
	@DisplayName("Record 2651: Address is Brunswick")
	void AddressOfRecord2651() {
		assertEquals("Brunswick", customers.get(2650).getAddress());
	}

	@Test
	@DisplayName("Record 2651: City is Brunswick")
	void CityOfRecord2651() {
		assertEquals("Brunswick", customers.get(2650).getCity());
	}

	@Test
	@DisplayName("Record 2651: County is Glynn")
	void CountyOfRecord2651() {
		assertEquals("Glynn", customers.get(2650).getCounty());
	}

	@Test
	@DisplayName("Record 2651: State is GA")
	void StateOfRecord2651() {
		assertEquals("GA", customers.get(2650).getState());
	}

	@Test
	@DisplayName("Record 2651: ZIP is 31520")
	void ZIPOfRecord2651() {
		assertEquals("31520", customers.get(2650).getZIP());
	}

	@Test
	@DisplayName("Record 2651: Phone is 912-262-6613")
	void PhoneOfRecord2651() {
		assertEquals("912-262-6613", customers.get(2650).getPhone());
	}

	@Test
	@DisplayName("Record 2651: Fax is 912-262-9471")
	void FaxOfRecord2651() {
		assertEquals("912-262-9471", customers.get(2650).getFax());
	}

	@Test
	@DisplayName("Record 2651: Email is marcel@binker.com")
	void EmailOfRecord2651() {
		assertEquals("marcel@binker.com", customers.get(2650).getEmail());
	}

	@Test
	@DisplayName("Record 2651: Web is http://www.marcelbinker.com")
	void WebOfRecord2651() {
		assertEquals("http://www.marcelbinker.com", customers.get(2650).getWeb());
	}
}
