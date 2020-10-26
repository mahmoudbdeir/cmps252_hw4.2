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

@Tag("47")
class Record_1737 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1737: FirstName is Tessie")
	void FirstNameOfRecord1737() {
		assertEquals("Tessie", customers.get(1736).getFirstName());
	}

	@Test
	@DisplayName("Record 1737: LastName is Olaughlin")
	void LastNameOfRecord1737() {
		assertEquals("Olaughlin", customers.get(1736).getLastName());
	}

	@Test
	@DisplayName("Record 1737: Company is Reardon, Walter L Jr")
	void CompanyOfRecord1737() {
		assertEquals("Reardon, Walter L Jr", customers.get(1736).getCompany());
	}

	@Test
	@DisplayName("Record 1737: Address is 3675 Hulmeville Rd")
	void AddressOfRecord1737() {
		assertEquals("3675 Hulmeville Rd", customers.get(1736).getAddress());
	}

	@Test
	@DisplayName("Record 1737: City is Bensalem")
	void CityOfRecord1737() {
		assertEquals("Bensalem", customers.get(1736).getCity());
	}

	@Test
	@DisplayName("Record 1737: County is Bucks")
	void CountyOfRecord1737() {
		assertEquals("Bucks", customers.get(1736).getCounty());
	}

	@Test
	@DisplayName("Record 1737: State is PA")
	void StateOfRecord1737() {
		assertEquals("PA", customers.get(1736).getState());
	}

	@Test
	@DisplayName("Record 1737: ZIP is 19020")
	void ZIPOfRecord1737() {
		assertEquals("19020", customers.get(1736).getZIP());
	}

	@Test
	@DisplayName("Record 1737: Phone is 215-638-3465")
	void PhoneOfRecord1737() {
		assertEquals("215-638-3465", customers.get(1736).getPhone());
	}

	@Test
	@DisplayName("Record 1737: Fax is 215-638-9762")
	void FaxOfRecord1737() {
		assertEquals("215-638-9762", customers.get(1736).getFax());
	}

	@Test
	@DisplayName("Record 1737: Email is tessie@olaughlin.com")
	void EmailOfRecord1737() {
		assertEquals("tessie@olaughlin.com", customers.get(1736).getEmail());
	}

	@Test
	@DisplayName("Record 1737: Web is http://www.tessieolaughlin.com")
	void WebOfRecord1737() {
		assertEquals("http://www.tessieolaughlin.com", customers.get(1736).getWeb());
	}
}
