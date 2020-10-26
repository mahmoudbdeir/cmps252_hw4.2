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

@Tag("34")
class Record_4660 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4660: FirstName is Donte")
	void FirstNameOfRecord4660() {
		assertEquals("Donte", customers.get(4659).getFirstName());
	}

	@Test
	@DisplayName("Record 4660: LastName is Atwill")
	void LastNameOfRecord4660() {
		assertEquals("Atwill", customers.get(4659).getLastName());
	}

	@Test
	@DisplayName("Record 4660: Company is Ophym, Steven C Esq")
	void CompanyOfRecord4660() {
		assertEquals("Ophym, Steven C Esq", customers.get(4659).getCompany());
	}

	@Test
	@DisplayName("Record 4660: Address is 1050 Main St")
	void AddressOfRecord4660() {
		assertEquals("1050 Main St", customers.get(4659).getAddress());
	}

	@Test
	@DisplayName("Record 4660: City is East Greenwich")
	void CityOfRecord4660() {
		assertEquals("East Greenwich", customers.get(4659).getCity());
	}

	@Test
	@DisplayName("Record 4660: County is Kent")
	void CountyOfRecord4660() {
		assertEquals("Kent", customers.get(4659).getCounty());
	}

	@Test
	@DisplayName("Record 4660: State is RI")
	void StateOfRecord4660() {
		assertEquals("RI", customers.get(4659).getState());
	}

	@Test
	@DisplayName("Record 4660: ZIP is 2818")
	void ZIPOfRecord4660() {
		assertEquals("2818", customers.get(4659).getZIP());
	}

	@Test
	@DisplayName("Record 4660: Phone is 401-884-4660")
	void PhoneOfRecord4660() {
		assertEquals("401-884-4660", customers.get(4659).getPhone());
	}

	@Test
	@DisplayName("Record 4660: Fax is 401-884-4117")
	void FaxOfRecord4660() {
		assertEquals("401-884-4117", customers.get(4659).getFax());
	}

	@Test
	@DisplayName("Record 4660: Email is donte@atwill.com")
	void EmailOfRecord4660() {
		assertEquals("donte@atwill.com", customers.get(4659).getEmail());
	}

	@Test
	@DisplayName("Record 4660: Web is http://www.donteatwill.com")
	void WebOfRecord4660() {
		assertEquals("http://www.donteatwill.com", customers.get(4659).getWeb());
	}
}
