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
class Record_4950 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4950: FirstName is Jonah")
	void FirstNameOfRecord4950() {
		assertEquals("Jonah", customers.get(4949).getFirstName());
	}

	@Test
	@DisplayName("Record 4950: LastName is Devins")
	void LastNameOfRecord4950() {
		assertEquals("Devins", customers.get(4949).getLastName());
	}

	@Test
	@DisplayName("Record 4950: Company is Hercher, David W Esq")
	void CompanyOfRecord4950() {
		assertEquals("Hercher, David W Esq", customers.get(4949).getCompany());
	}

	@Test
	@DisplayName("Record 4950: Address is 75 Aupuni St")
	void AddressOfRecord4950() {
		assertEquals("75 Aupuni St", customers.get(4949).getAddress());
	}

	@Test
	@DisplayName("Record 4950: City is Hilo")
	void CityOfRecord4950() {
		assertEquals("Hilo", customers.get(4949).getCity());
	}

	@Test
	@DisplayName("Record 4950: County is Hawaii")
	void CountyOfRecord4950() {
		assertEquals("Hawaii", customers.get(4949).getCounty());
	}

	@Test
	@DisplayName("Record 4950: State is HI")
	void StateOfRecord4950() {
		assertEquals("HI", customers.get(4949).getState());
	}

	@Test
	@DisplayName("Record 4950: ZIP is 96720")
	void ZIPOfRecord4950() {
		assertEquals("96720", customers.get(4949).getZIP());
	}

	@Test
	@DisplayName("Record 4950: Phone is 808-933-7554")
	void PhoneOfRecord4950() {
		assertEquals("808-933-7554", customers.get(4949).getPhone());
	}

	@Test
	@DisplayName("Record 4950: Fax is 808-933-2227")
	void FaxOfRecord4950() {
		assertEquals("808-933-2227", customers.get(4949).getFax());
	}

	@Test
	@DisplayName("Record 4950: Email is jonah@devins.com")
	void EmailOfRecord4950() {
		assertEquals("jonah@devins.com", customers.get(4949).getEmail());
	}

	@Test
	@DisplayName("Record 4950: Web is http://www.jonahdevins.com")
	void WebOfRecord4950() {
		assertEquals("http://www.jonahdevins.com", customers.get(4949).getWeb());
	}
}
