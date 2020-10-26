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

@Tag("16")
class Record_4187 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4187: FirstName is Kurt")
	void FirstNameOfRecord4187() {
		assertEquals("Kurt", customers.get(4186).getFirstName());
	}

	@Test
	@DisplayName("Record 4187: LastName is Medlen")
	void LastNameOfRecord4187() {
		assertEquals("Medlen", customers.get(4186).getLastName());
	}

	@Test
	@DisplayName("Record 4187: Company is Odle Mcguire & Shook Corp")
	void CompanyOfRecord4187() {
		assertEquals("Odle Mcguire & Shook Corp", customers.get(4186).getCompany());
	}

	@Test
	@DisplayName("Record 4187: Address is 100 Almeria Ave")
	void AddressOfRecord4187() {
		assertEquals("100 Almeria Ave", customers.get(4186).getAddress());
	}

	@Test
	@DisplayName("Record 4187: City is Miami")
	void CityOfRecord4187() {
		assertEquals("Miami", customers.get(4186).getCity());
	}

	@Test
	@DisplayName("Record 4187: County is Miami-Dade")
	void CountyOfRecord4187() {
		assertEquals("Miami-Dade", customers.get(4186).getCounty());
	}

	@Test
	@DisplayName("Record 4187: State is FL")
	void StateOfRecord4187() {
		assertEquals("FL", customers.get(4186).getState());
	}

	@Test
	@DisplayName("Record 4187: ZIP is 33134")
	void ZIPOfRecord4187() {
		assertEquals("33134", customers.get(4186).getZIP());
	}

	@Test
	@DisplayName("Record 4187: Phone is 305-441-5798")
	void PhoneOfRecord4187() {
		assertEquals("305-441-5798", customers.get(4186).getPhone());
	}

	@Test
	@DisplayName("Record 4187: Fax is 305-441-2015")
	void FaxOfRecord4187() {
		assertEquals("305-441-2015", customers.get(4186).getFax());
	}

	@Test
	@DisplayName("Record 4187: Email is kurt@medlen.com")
	void EmailOfRecord4187() {
		assertEquals("kurt@medlen.com", customers.get(4186).getEmail());
	}

	@Test
	@DisplayName("Record 4187: Web is http://www.kurtmedlen.com")
	void WebOfRecord4187() {
		assertEquals("http://www.kurtmedlen.com", customers.get(4186).getWeb());
	}
}
