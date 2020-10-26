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

@Tag("32")
class Record_3107 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3107: FirstName is Romeo")
	void FirstNameOfRecord3107() {
		assertEquals("Romeo", customers.get(3106).getFirstName());
	}

	@Test
	@DisplayName("Record 3107: LastName is Shepperson")
	void LastNameOfRecord3107() {
		assertEquals("Shepperson", customers.get(3106).getLastName());
	}

	@Test
	@DisplayName("Record 3107: Company is Hatch & Kirk Inc")
	void CompanyOfRecord3107() {
		assertEquals("Hatch & Kirk Inc", customers.get(3106).getCompany());
	}

	@Test
	@DisplayName("Record 3107: Address is 2040 Market St")
	void AddressOfRecord3107() {
		assertEquals("2040 Market St", customers.get(3106).getAddress());
	}

	@Test
	@DisplayName("Record 3107: City is Philadelphia")
	void CityOfRecord3107() {
		assertEquals("Philadelphia", customers.get(3106).getCity());
	}

	@Test
	@DisplayName("Record 3107: County is Philadelphia")
	void CountyOfRecord3107() {
		assertEquals("Philadelphia", customers.get(3106).getCounty());
	}

	@Test
	@DisplayName("Record 3107: State is PA")
	void StateOfRecord3107() {
		assertEquals("PA", customers.get(3106).getState());
	}

	@Test
	@DisplayName("Record 3107: ZIP is 19103")
	void ZIPOfRecord3107() {
		assertEquals("19103", customers.get(3106).getZIP());
	}

	@Test
	@DisplayName("Record 3107: Phone is 215-864-2969")
	void PhoneOfRecord3107() {
		assertEquals("215-864-2969", customers.get(3106).getPhone());
	}

	@Test
	@DisplayName("Record 3107: Fax is 215-864-7943")
	void FaxOfRecord3107() {
		assertEquals("215-864-7943", customers.get(3106).getFax());
	}

	@Test
	@DisplayName("Record 3107: Email is romeo@shepperson.com")
	void EmailOfRecord3107() {
		assertEquals("romeo@shepperson.com", customers.get(3106).getEmail());
	}

	@Test
	@DisplayName("Record 3107: Web is http://www.romeoshepperson.com")
	void WebOfRecord3107() {
		assertEquals("http://www.romeoshepperson.com", customers.get(3106).getWeb());
	}
}
