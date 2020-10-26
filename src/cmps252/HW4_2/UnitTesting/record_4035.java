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

@Tag("29")
class Record_4035 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4035: FirstName is Denise")
	void FirstNameOfRecord4035() {
		assertEquals("Denise", customers.get(4034).getFirstName());
	}

	@Test
	@DisplayName("Record 4035: LastName is Mosure")
	void LastNameOfRecord4035() {
		assertEquals("Mosure", customers.get(4034).getLastName());
	}

	@Test
	@DisplayName("Record 4035: Company is Ima, Jean Harvey Esq")
	void CompanyOfRecord4035() {
		assertEquals("Ima, Jean Harvey Esq", customers.get(4034).getCompany());
	}

	@Test
	@DisplayName("Record 4035: Address is 1939 W 11th St  #-f")
	void AddressOfRecord4035() {
		assertEquals("1939 W 11th St  #-f", customers.get(4034).getAddress());
	}

	@Test
	@DisplayName("Record 4035: City is Upland")
	void CityOfRecord4035() {
		assertEquals("Upland", customers.get(4034).getCity());
	}

	@Test
	@DisplayName("Record 4035: County is San Bernardino")
	void CountyOfRecord4035() {
		assertEquals("San Bernardino", customers.get(4034).getCounty());
	}

	@Test
	@DisplayName("Record 4035: State is CA")
	void StateOfRecord4035() {
		assertEquals("CA", customers.get(4034).getState());
	}

	@Test
	@DisplayName("Record 4035: ZIP is 91786")
	void ZIPOfRecord4035() {
		assertEquals("91786", customers.get(4034).getZIP());
	}

	@Test
	@DisplayName("Record 4035: Phone is 909-946-9111")
	void PhoneOfRecord4035() {
		assertEquals("909-946-9111", customers.get(4034).getPhone());
	}

	@Test
	@DisplayName("Record 4035: Fax is 909-946-8145")
	void FaxOfRecord4035() {
		assertEquals("909-946-8145", customers.get(4034).getFax());
	}

	@Test
	@DisplayName("Record 4035: Email is denise@mosure.com")
	void EmailOfRecord4035() {
		assertEquals("denise@mosure.com", customers.get(4034).getEmail());
	}

	@Test
	@DisplayName("Record 4035: Web is http://www.denisemosure.com")
	void WebOfRecord4035() {
		assertEquals("http://www.denisemosure.com", customers.get(4034).getWeb());
	}
}
