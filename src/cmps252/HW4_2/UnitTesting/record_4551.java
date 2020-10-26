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

@Tag("6")
class Record_4551 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4551: FirstName is Nick")
	void FirstNameOfRecord4551() {
		assertEquals("Nick", customers.get(4550).getFirstName());
	}

	@Test
	@DisplayName("Record 4551: LastName is Kuruvilla")
	void LastNameOfRecord4551() {
		assertEquals("Kuruvilla", customers.get(4550).getLastName());
	}

	@Test
	@DisplayName("Record 4551: Company is Strandt, Billie Jean Esq")
	void CompanyOfRecord4551() {
		assertEquals("Strandt, Billie Jean Esq", customers.get(4550).getCompany());
	}

	@Test
	@DisplayName("Record 4551: Address is 604 S San Marcos Rd")
	void AddressOfRecord4551() {
		assertEquals("604 S San Marcos Rd", customers.get(4550).getAddress());
	}

	@Test
	@DisplayName("Record 4551: City is Santa Barbara")
	void CityOfRecord4551() {
		assertEquals("Santa Barbara", customers.get(4550).getCity());
	}

	@Test
	@DisplayName("Record 4551: County is Santa Barbara")
	void CountyOfRecord4551() {
		assertEquals("Santa Barbara", customers.get(4550).getCounty());
	}

	@Test
	@DisplayName("Record 4551: State is CA")
	void StateOfRecord4551() {
		assertEquals("CA", customers.get(4550).getState());
	}

	@Test
	@DisplayName("Record 4551: ZIP is 93111")
	void ZIPOfRecord4551() {
		assertEquals("93111", customers.get(4550).getZIP());
	}

	@Test
	@DisplayName("Record 4551: Phone is 805-964-5190")
	void PhoneOfRecord4551() {
		assertEquals("805-964-5190", customers.get(4550).getPhone());
	}

	@Test
	@DisplayName("Record 4551: Fax is 805-964-6804")
	void FaxOfRecord4551() {
		assertEquals("805-964-6804", customers.get(4550).getFax());
	}

	@Test
	@DisplayName("Record 4551: Email is nick@kuruvilla.com")
	void EmailOfRecord4551() {
		assertEquals("nick@kuruvilla.com", customers.get(4550).getEmail());
	}

	@Test
	@DisplayName("Record 4551: Web is http://www.nickkuruvilla.com")
	void WebOfRecord4551() {
		assertEquals("http://www.nickkuruvilla.com", customers.get(4550).getWeb());
	}
}
