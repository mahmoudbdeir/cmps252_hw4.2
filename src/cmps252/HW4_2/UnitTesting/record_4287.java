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

@Tag("41")
class Record_4287 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4287: FirstName is Nona")
	void FirstNameOfRecord4287() {
		assertEquals("Nona", customers.get(4286).getFirstName());
	}

	@Test
	@DisplayName("Record 4287: LastName is Slaff")
	void LastNameOfRecord4287() {
		assertEquals("Slaff", customers.get(4286).getLastName());
	}

	@Test
	@DisplayName("Record 4287: Company is Center For Quality Leadership")
	void CompanyOfRecord4287() {
		assertEquals("Center For Quality Leadership", customers.get(4286).getCompany());
	}

	@Test
	@DisplayName("Record 4287: Address is 1650 Market St")
	void AddressOfRecord4287() {
		assertEquals("1650 Market St", customers.get(4286).getAddress());
	}

	@Test
	@DisplayName("Record 4287: City is Philadelphia")
	void CityOfRecord4287() {
		assertEquals("Philadelphia", customers.get(4286).getCity());
	}

	@Test
	@DisplayName("Record 4287: County is Philadelphia")
	void CountyOfRecord4287() {
		assertEquals("Philadelphia", customers.get(4286).getCounty());
	}

	@Test
	@DisplayName("Record 4287: State is PA")
	void StateOfRecord4287() {
		assertEquals("PA", customers.get(4286).getState());
	}

	@Test
	@DisplayName("Record 4287: ZIP is 19103")
	void ZIPOfRecord4287() {
		assertEquals("19103", customers.get(4286).getZIP());
	}

	@Test
	@DisplayName("Record 4287: Phone is 215-587-9863")
	void PhoneOfRecord4287() {
		assertEquals("215-587-9863", customers.get(4286).getPhone());
	}

	@Test
	@DisplayName("Record 4287: Fax is 215-587-4594")
	void FaxOfRecord4287() {
		assertEquals("215-587-4594", customers.get(4286).getFax());
	}

	@Test
	@DisplayName("Record 4287: Email is nona@slaff.com")
	void EmailOfRecord4287() {
		assertEquals("nona@slaff.com", customers.get(4286).getEmail());
	}

	@Test
	@DisplayName("Record 4287: Web is http://www.nonaslaff.com")
	void WebOfRecord4287() {
		assertEquals("http://www.nonaslaff.com", customers.get(4286).getWeb());
	}
}
