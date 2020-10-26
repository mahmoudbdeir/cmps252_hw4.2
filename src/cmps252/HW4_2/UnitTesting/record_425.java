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

@Tag("48")
class Record_425 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 425: FirstName is Wilbur")
	void FirstNameOfRecord425() {
		assertEquals("Wilbur", customers.get(424).getFirstName());
	}

	@Test
	@DisplayName("Record 425: LastName is Botwinick")
	void LastNameOfRecord425() {
		assertEquals("Botwinick", customers.get(424).getLastName());
	}

	@Test
	@DisplayName("Record 425: Company is Vangorden Foundation Polinsky")
	void CompanyOfRecord425() {
		assertEquals("Vangorden Foundation Polinsky", customers.get(424).getCompany());
	}

	@Test
	@DisplayName("Record 425: Address is 325 Drum Point Rd")
	void AddressOfRecord425() {
		assertEquals("325 Drum Point Rd", customers.get(424).getAddress());
	}

	@Test
	@DisplayName("Record 425: City is Brick")
	void CityOfRecord425() {
		assertEquals("Brick", customers.get(424).getCity());
	}

	@Test
	@DisplayName("Record 425: County is Ocean")
	void CountyOfRecord425() {
		assertEquals("Ocean", customers.get(424).getCounty());
	}

	@Test
	@DisplayName("Record 425: State is NJ")
	void StateOfRecord425() {
		assertEquals("NJ", customers.get(424).getState());
	}

	@Test
	@DisplayName("Record 425: ZIP is 8723")
	void ZIPOfRecord425() {
		assertEquals("8723", customers.get(424).getZIP());
	}

	@Test
	@DisplayName("Record 425: Phone is 732-920-3852")
	void PhoneOfRecord425() {
		assertEquals("732-920-3852", customers.get(424).getPhone());
	}

	@Test
	@DisplayName("Record 425: Fax is 732-920-5509")
	void FaxOfRecord425() {
		assertEquals("732-920-5509", customers.get(424).getFax());
	}

	@Test
	@DisplayName("Record 425: Email is wilbur@botwinick.com")
	void EmailOfRecord425() {
		assertEquals("wilbur@botwinick.com", customers.get(424).getEmail());
	}

	@Test
	@DisplayName("Record 425: Web is http://www.wilburbotwinick.com")
	void WebOfRecord425() {
		assertEquals("http://www.wilburbotwinick.com", customers.get(424).getWeb());
	}
}
