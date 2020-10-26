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

@Tag("20")
class Record_4794 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4794: FirstName is Hipolito")
	void FirstNameOfRecord4794() {
		assertEquals("Hipolito", customers.get(4793).getFirstName());
	}

	@Test
	@DisplayName("Record 4794: LastName is Kirschner")
	void LastNameOfRecord4794() {
		assertEquals("Kirschner", customers.get(4793).getLastName());
	}

	@Test
	@DisplayName("Record 4794: Company is Intrntl Exprss A Divsn Inexco")
	void CompanyOfRecord4794() {
		assertEquals("Intrntl Exprss A Divsn Inexco", customers.get(4793).getCompany());
	}

	@Test
	@DisplayName("Record 4794: Address is 36 S State St")
	void AddressOfRecord4794() {
		assertEquals("36 S State St", customers.get(4793).getAddress());
	}

	@Test
	@DisplayName("Record 4794: City is Chicago")
	void CityOfRecord4794() {
		assertEquals("Chicago", customers.get(4793).getCity());
	}

	@Test
	@DisplayName("Record 4794: County is Cook")
	void CountyOfRecord4794() {
		assertEquals("Cook", customers.get(4793).getCounty());
	}

	@Test
	@DisplayName("Record 4794: State is IL")
	void StateOfRecord4794() {
		assertEquals("IL", customers.get(4793).getState());
	}

	@Test
	@DisplayName("Record 4794: ZIP is 60603")
	void ZIPOfRecord4794() {
		assertEquals("60603", customers.get(4793).getZIP());
	}

	@Test
	@DisplayName("Record 4794: Phone is 312-236-8204")
	void PhoneOfRecord4794() {
		assertEquals("312-236-8204", customers.get(4793).getPhone());
	}

	@Test
	@DisplayName("Record 4794: Fax is 312-236-6084")
	void FaxOfRecord4794() {
		assertEquals("312-236-6084", customers.get(4793).getFax());
	}

	@Test
	@DisplayName("Record 4794: Email is hipolito@kirschner.com")
	void EmailOfRecord4794() {
		assertEquals("hipolito@kirschner.com", customers.get(4793).getEmail());
	}

	@Test
	@DisplayName("Record 4794: Web is http://www.hipolitokirschner.com")
	void WebOfRecord4794() {
		assertEquals("http://www.hipolitokirschner.com", customers.get(4793).getWeb());
	}
}
