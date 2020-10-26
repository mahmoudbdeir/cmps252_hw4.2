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

@Tag("27")
class Record_175 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 175: FirstName is Quentin")
	void FirstNameOfRecord175() {
		assertEquals("Quentin", customers.get(174).getFirstName());
	}

	@Test
	@DisplayName("Record 175: LastName is Petrouits")
	void LastNameOfRecord175() {
		assertEquals("Petrouits", customers.get(174).getLastName());
	}

	@Test
	@DisplayName("Record 175: Company is Architectural Digest")
	void CompanyOfRecord175() {
		assertEquals("Architectural Digest", customers.get(174).getCompany());
	}

	@Test
	@DisplayName("Record 175: Address is 60 N Front St")
	void AddressOfRecord175() {
		assertEquals("60 N Front St", customers.get(174).getAddress());
	}

	@Test
	@DisplayName("Record 175: City is Philadelphia")
	void CityOfRecord175() {
		assertEquals("Philadelphia", customers.get(174).getCity());
	}

	@Test
	@DisplayName("Record 175: County is Philadelphia")
	void CountyOfRecord175() {
		assertEquals("Philadelphia", customers.get(174).getCounty());
	}

	@Test
	@DisplayName("Record 175: State is PA")
	void StateOfRecord175() {
		assertEquals("PA", customers.get(174).getState());
	}

	@Test
	@DisplayName("Record 175: ZIP is 19106")
	void ZIPOfRecord175() {
		assertEquals("19106", customers.get(174).getZIP());
	}

	@Test
	@DisplayName("Record 175: Phone is 215-627-8998")
	void PhoneOfRecord175() {
		assertEquals("215-627-8998", customers.get(174).getPhone());
	}

	@Test
	@DisplayName("Record 175: Fax is 215-627-2965")
	void FaxOfRecord175() {
		assertEquals("215-627-2965", customers.get(174).getFax());
	}

	@Test
	@DisplayName("Record 175: Email is quentin@petrouits.com")
	void EmailOfRecord175() {
		assertEquals("quentin@petrouits.com", customers.get(174).getEmail());
	}

	@Test
	@DisplayName("Record 175: Web is http://www.quentinpetrouits.com")
	void WebOfRecord175() {
		assertEquals("http://www.quentinpetrouits.com", customers.get(174).getWeb());
	}
}
