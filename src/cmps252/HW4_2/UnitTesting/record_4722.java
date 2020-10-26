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

@Tag("40")
class Record_4722 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4722: FirstName is Malcom")
	void FirstNameOfRecord4722() {
		assertEquals("Malcom", customers.get(4721).getFirstName());
	}

	@Test
	@DisplayName("Record 4722: LastName is Vatalaro")
	void LastNameOfRecord4722() {
		assertEquals("Vatalaro", customers.get(4721).getLastName());
	}

	@Test
	@DisplayName("Record 4722: Company is Emmons Kropp Kryger Alexander")
	void CompanyOfRecord4722() {
		assertEquals("Emmons Kropp Kryger Alexander", customers.get(4721).getCompany());
	}

	@Test
	@DisplayName("Record 4722: Address is 15685 Los Gatos Blvd")
	void AddressOfRecord4722() {
		assertEquals("15685 Los Gatos Blvd", customers.get(4721).getAddress());
	}

	@Test
	@DisplayName("Record 4722: City is Los Gatos")
	void CityOfRecord4722() {
		assertEquals("Los Gatos", customers.get(4721).getCity());
	}

	@Test
	@DisplayName("Record 4722: County is Santa Clara")
	void CountyOfRecord4722() {
		assertEquals("Santa Clara", customers.get(4721).getCounty());
	}

	@Test
	@DisplayName("Record 4722: State is CA")
	void StateOfRecord4722() {
		assertEquals("CA", customers.get(4721).getState());
	}

	@Test
	@DisplayName("Record 4722: ZIP is 95032")
	void ZIPOfRecord4722() {
		assertEquals("95032", customers.get(4721).getZIP());
	}

	@Test
	@DisplayName("Record 4722: Phone is 408-977-0142")
	void PhoneOfRecord4722() {
		assertEquals("408-977-0142", customers.get(4721).getPhone());
	}

	@Test
	@DisplayName("Record 4722: Fax is 408-977-2649")
	void FaxOfRecord4722() {
		assertEquals("408-977-2649", customers.get(4721).getFax());
	}

	@Test
	@DisplayName("Record 4722: Email is malcom@vatalaro.com")
	void EmailOfRecord4722() {
		assertEquals("malcom@vatalaro.com", customers.get(4721).getEmail());
	}

	@Test
	@DisplayName("Record 4722: Web is http://www.malcomvatalaro.com")
	void WebOfRecord4722() {
		assertEquals("http://www.malcomvatalaro.com", customers.get(4721).getWeb());
	}
}
