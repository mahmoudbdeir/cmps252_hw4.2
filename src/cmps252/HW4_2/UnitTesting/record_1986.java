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

@Tag("13")
class Record_1986 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1986: FirstName is Albert")
	void FirstNameOfRecord1986() {
		assertEquals("Albert", customers.get(1985).getFirstName());
	}

	@Test
	@DisplayName("Record 1986: LastName is Kubler")
	void LastNameOfRecord1986() {
		assertEquals("Kubler", customers.get(1985).getLastName());
	}

	@Test
	@DisplayName("Record 1986: Company is Anr Advertising Agency Inc")
	void CompanyOfRecord1986() {
		assertEquals("Anr Advertising Agency Inc", customers.get(1985).getCompany());
	}

	@Test
	@DisplayName("Record 1986: Address is 4030 Sports Arena Blvd")
	void AddressOfRecord1986() {
		assertEquals("4030 Sports Arena Blvd", customers.get(1985).getAddress());
	}

	@Test
	@DisplayName("Record 1986: City is San Diego")
	void CityOfRecord1986() {
		assertEquals("San Diego", customers.get(1985).getCity());
	}

	@Test
	@DisplayName("Record 1986: County is San Diego")
	void CountyOfRecord1986() {
		assertEquals("San Diego", customers.get(1985).getCounty());
	}

	@Test
	@DisplayName("Record 1986: State is CA")
	void StateOfRecord1986() {
		assertEquals("CA", customers.get(1985).getState());
	}

	@Test
	@DisplayName("Record 1986: ZIP is 92110")
	void ZIPOfRecord1986() {
		assertEquals("92110", customers.get(1985).getZIP());
	}

	@Test
	@DisplayName("Record 1986: Phone is 858-523-2798")
	void PhoneOfRecord1986() {
		assertEquals("858-523-2798", customers.get(1985).getPhone());
	}

	@Test
	@DisplayName("Record 1986: Fax is 858-523-0693")
	void FaxOfRecord1986() {
		assertEquals("858-523-0693", customers.get(1985).getFax());
	}

	@Test
	@DisplayName("Record 1986: Email is albert@kubler.com")
	void EmailOfRecord1986() {
		assertEquals("albert@kubler.com", customers.get(1985).getEmail());
	}

	@Test
	@DisplayName("Record 1986: Web is http://www.albertkubler.com")
	void WebOfRecord1986() {
		assertEquals("http://www.albertkubler.com", customers.get(1985).getWeb());
	}
}
