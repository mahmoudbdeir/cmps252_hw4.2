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

@Tag("49")
class Record_1353 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1353: FirstName is Hortencia")
	void FirstNameOfRecord1353() {
		assertEquals("Hortencia", customers.get(1352).getFirstName());
	}

	@Test
	@DisplayName("Record 1353: LastName is Stoffel")
	void LastNameOfRecord1353() {
		assertEquals("Stoffel", customers.get(1352).getLastName());
	}

	@Test
	@DisplayName("Record 1353: Company is Phillips Electric Motor Rewind")
	void CompanyOfRecord1353() {
		assertEquals("Phillips Electric Motor Rewind", customers.get(1352).getCompany());
	}

	@Test
	@DisplayName("Record 1353: Address is 5301 Germantown Ave")
	void AddressOfRecord1353() {
		assertEquals("5301 Germantown Ave", customers.get(1352).getAddress());
	}

	@Test
	@DisplayName("Record 1353: City is Philadelphia")
	void CityOfRecord1353() {
		assertEquals("Philadelphia", customers.get(1352).getCity());
	}

	@Test
	@DisplayName("Record 1353: County is Philadelphia")
	void CountyOfRecord1353() {
		assertEquals("Philadelphia", customers.get(1352).getCounty());
	}

	@Test
	@DisplayName("Record 1353: State is PA")
	void StateOfRecord1353() {
		assertEquals("PA", customers.get(1352).getState());
	}

	@Test
	@DisplayName("Record 1353: ZIP is 19144")
	void ZIPOfRecord1353() {
		assertEquals("19144", customers.get(1352).getZIP());
	}

	@Test
	@DisplayName("Record 1353: Phone is 215-438-1114")
	void PhoneOfRecord1353() {
		assertEquals("215-438-1114", customers.get(1352).getPhone());
	}

	@Test
	@DisplayName("Record 1353: Fax is 215-438-1693")
	void FaxOfRecord1353() {
		assertEquals("215-438-1693", customers.get(1352).getFax());
	}

	@Test
	@DisplayName("Record 1353: Email is hortencia@stoffel.com")
	void EmailOfRecord1353() {
		assertEquals("hortencia@stoffel.com", customers.get(1352).getEmail());
	}

	@Test
	@DisplayName("Record 1353: Web is http://www.hortenciastoffel.com")
	void WebOfRecord1353() {
		assertEquals("http://www.hortenciastoffel.com", customers.get(1352).getWeb());
	}
}
