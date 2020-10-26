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
class Record_4086 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4086: FirstName is Jeanette")
	void FirstNameOfRecord4086() {
		assertEquals("Jeanette", customers.get(4085).getFirstName());
	}

	@Test
	@DisplayName("Record 4086: LastName is Koslow")
	void LastNameOfRecord4086() {
		assertEquals("Koslow", customers.get(4085).getLastName());
	}

	@Test
	@DisplayName("Record 4086: Company is Neville, John G Esq")
	void CompanyOfRecord4086() {
		assertEquals("Neville, John G Esq", customers.get(4085).getCompany());
	}

	@Test
	@DisplayName("Record 4086: Address is 6 Stanwix St")
	void AddressOfRecord4086() {
		assertEquals("6 Stanwix St", customers.get(4085).getAddress());
	}

	@Test
	@DisplayName("Record 4086: City is Brooklyn")
	void CityOfRecord4086() {
		assertEquals("Brooklyn", customers.get(4085).getCity());
	}

	@Test
	@DisplayName("Record 4086: County is Kings")
	void CountyOfRecord4086() {
		assertEquals("Kings", customers.get(4085).getCounty());
	}

	@Test
	@DisplayName("Record 4086: State is NY")
	void StateOfRecord4086() {
		assertEquals("NY", customers.get(4085).getState());
	}

	@Test
	@DisplayName("Record 4086: ZIP is 11206")
	void ZIPOfRecord4086() {
		assertEquals("11206", customers.get(4085).getZIP());
	}

	@Test
	@DisplayName("Record 4086: Phone is 718-452-6798")
	void PhoneOfRecord4086() {
		assertEquals("718-452-6798", customers.get(4085).getPhone());
	}

	@Test
	@DisplayName("Record 4086: Fax is 718-452-8343")
	void FaxOfRecord4086() {
		assertEquals("718-452-8343", customers.get(4085).getFax());
	}

	@Test
	@DisplayName("Record 4086: Email is jeanette@koslow.com")
	void EmailOfRecord4086() {
		assertEquals("jeanette@koslow.com", customers.get(4085).getEmail());
	}

	@Test
	@DisplayName("Record 4086: Web is http://www.jeanettekoslow.com")
	void WebOfRecord4086() {
		assertEquals("http://www.jeanettekoslow.com", customers.get(4085).getWeb());
	}
}
