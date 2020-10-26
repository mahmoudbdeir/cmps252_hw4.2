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

@Tag("22")
class Record_4128 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4128: FirstName is Ariel")
	void FirstNameOfRecord4128() {
		assertEquals("Ariel", customers.get(4127).getFirstName());
	}

	@Test
	@DisplayName("Record 4128: LastName is Lefebvre")
	void LastNameOfRecord4128() {
		assertEquals("Lefebvre", customers.get(4127).getLastName());
	}

	@Test
	@DisplayName("Record 4128: Company is Ben Colbath")
	void CompanyOfRecord4128() {
		assertEquals("Ben Colbath", customers.get(4127).getCompany());
	}

	@Test
	@DisplayName("Record 4128: Address is 748 State Route 18")
	void AddressOfRecord4128() {
		assertEquals("748 State Route 18", customers.get(4127).getAddress());
	}

	@Test
	@DisplayName("Record 4128: City is East Brunswick")
	void CityOfRecord4128() {
		assertEquals("East Brunswick", customers.get(4127).getCity());
	}

	@Test
	@DisplayName("Record 4128: County is Middlesex")
	void CountyOfRecord4128() {
		assertEquals("Middlesex", customers.get(4127).getCounty());
	}

	@Test
	@DisplayName("Record 4128: State is NJ")
	void StateOfRecord4128() {
		assertEquals("NJ", customers.get(4127).getState());
	}

	@Test
	@DisplayName("Record 4128: ZIP is 8816")
	void ZIPOfRecord4128() {
		assertEquals("8816", customers.get(4127).getZIP());
	}

	@Test
	@DisplayName("Record 4128: Phone is 732-257-2846")
	void PhoneOfRecord4128() {
		assertEquals("732-257-2846", customers.get(4127).getPhone());
	}

	@Test
	@DisplayName("Record 4128: Fax is 732-257-7655")
	void FaxOfRecord4128() {
		assertEquals("732-257-7655", customers.get(4127).getFax());
	}

	@Test
	@DisplayName("Record 4128: Email is ariel@lefebvre.com")
	void EmailOfRecord4128() {
		assertEquals("ariel@lefebvre.com", customers.get(4127).getEmail());
	}

	@Test
	@DisplayName("Record 4128: Web is http://www.ariellefebvre.com")
	void WebOfRecord4128() {
		assertEquals("http://www.ariellefebvre.com", customers.get(4127).getWeb());
	}
}
