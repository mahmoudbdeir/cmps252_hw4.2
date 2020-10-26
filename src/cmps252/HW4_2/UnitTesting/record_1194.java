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

@Tag("5")
class Record_1194 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1194: FirstName is Fausto")
	void FirstNameOfRecord1194() {
		assertEquals("Fausto", customers.get(1193).getFirstName());
	}

	@Test
	@DisplayName("Record 1194: LastName is Sherley")
	void LastNameOfRecord1194() {
		assertEquals("Sherley", customers.get(1193).getLastName());
	}

	@Test
	@DisplayName("Record 1194: Company is Com Cep Usa Corp")
	void CompanyOfRecord1194() {
		assertEquals("Com Cep Usa Corp", customers.get(1193).getCompany());
	}

	@Test
	@DisplayName("Record 1194: Address is 15730 S Figueroa St")
	void AddressOfRecord1194() {
		assertEquals("15730 S Figueroa St", customers.get(1193).getAddress());
	}

	@Test
	@DisplayName("Record 1194: City is Gardena")
	void CityOfRecord1194() {
		assertEquals("Gardena", customers.get(1193).getCity());
	}

	@Test
	@DisplayName("Record 1194: County is Los Angeles")
	void CountyOfRecord1194() {
		assertEquals("Los Angeles", customers.get(1193).getCounty());
	}

	@Test
	@DisplayName("Record 1194: State is CA")
	void StateOfRecord1194() {
		assertEquals("CA", customers.get(1193).getState());
	}

	@Test
	@DisplayName("Record 1194: ZIP is 90248")
	void ZIPOfRecord1194() {
		assertEquals("90248", customers.get(1193).getZIP());
	}

	@Test
	@DisplayName("Record 1194: Phone is 310-324-8138")
	void PhoneOfRecord1194() {
		assertEquals("310-324-8138", customers.get(1193).getPhone());
	}

	@Test
	@DisplayName("Record 1194: Fax is 310-324-9081")
	void FaxOfRecord1194() {
		assertEquals("310-324-9081", customers.get(1193).getFax());
	}

	@Test
	@DisplayName("Record 1194: Email is fausto@sherley.com")
	void EmailOfRecord1194() {
		assertEquals("fausto@sherley.com", customers.get(1193).getEmail());
	}

	@Test
	@DisplayName("Record 1194: Web is http://www.faustosherley.com")
	void WebOfRecord1194() {
		assertEquals("http://www.faustosherley.com", customers.get(1193).getWeb());
	}
}
