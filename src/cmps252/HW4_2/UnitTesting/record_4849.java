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

@Tag("6")
class Record_4849 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4849: FirstName is Brittany")
	void FirstNameOfRecord4849() {
		assertEquals("Brittany", customers.get(4848).getFirstName());
	}

	@Test
	@DisplayName("Record 4849: LastName is Lisi")
	void LastNameOfRecord4849() {
		assertEquals("Lisi", customers.get(4848).getLastName());
	}

	@Test
	@DisplayName("Record 4849: Company is Envirochem Inc")
	void CompanyOfRecord4849() {
		assertEquals("Envirochem Inc", customers.get(4848).getCompany());
	}

	@Test
	@DisplayName("Record 4849: Address is 245 Tank Farm Rd")
	void AddressOfRecord4849() {
		assertEquals("245 Tank Farm Rd", customers.get(4848).getAddress());
	}

	@Test
	@DisplayName("Record 4849: City is San Luis Obispo")
	void CityOfRecord4849() {
		assertEquals("San Luis Obispo", customers.get(4848).getCity());
	}

	@Test
	@DisplayName("Record 4849: County is San Luis Obispo")
	void CountyOfRecord4849() {
		assertEquals("San Luis Obispo", customers.get(4848).getCounty());
	}

	@Test
	@DisplayName("Record 4849: State is CA")
	void StateOfRecord4849() {
		assertEquals("CA", customers.get(4848).getState());
	}

	@Test
	@DisplayName("Record 4849: ZIP is 93401")
	void ZIPOfRecord4849() {
		assertEquals("93401", customers.get(4848).getZIP());
	}

	@Test
	@DisplayName("Record 4849: Phone is 805-543-4572")
	void PhoneOfRecord4849() {
		assertEquals("805-543-4572", customers.get(4848).getPhone());
	}

	@Test
	@DisplayName("Record 4849: Fax is 805-543-7021")
	void FaxOfRecord4849() {
		assertEquals("805-543-7021", customers.get(4848).getFax());
	}

	@Test
	@DisplayName("Record 4849: Email is brittany@lisi.com")
	void EmailOfRecord4849() {
		assertEquals("brittany@lisi.com", customers.get(4848).getEmail());
	}

	@Test
	@DisplayName("Record 4849: Web is http://www.brittanylisi.com")
	void WebOfRecord4849() {
		assertEquals("http://www.brittanylisi.com", customers.get(4848).getWeb());
	}
}
