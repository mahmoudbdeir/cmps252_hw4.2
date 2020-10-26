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

@Tag("15")
class Record_666 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 666: FirstName is Chrystal")
	void FirstNameOfRecord666() {
		assertEquals("Chrystal", customers.get(665).getFirstName());
	}

	@Test
	@DisplayName("Record 666: LastName is Halfacre")
	void LastNameOfRecord666() {
		assertEquals("Halfacre", customers.get(665).getLastName());
	}

	@Test
	@DisplayName("Record 666: Company is Kirbo, Thomas L Esq")
	void CompanyOfRecord666() {
		assertEquals("Kirbo, Thomas L Esq", customers.get(665).getCompany());
	}

	@Test
	@DisplayName("Record 666: Address is 650 N College Ave")
	void AddressOfRecord666() {
		assertEquals("650 N College Ave", customers.get(665).getAddress());
	}

	@Test
	@DisplayName("Record 666: City is Bloomington")
	void CityOfRecord666() {
		assertEquals("Bloomington", customers.get(665).getCity());
	}

	@Test
	@DisplayName("Record 666: County is Monroe")
	void CountyOfRecord666() {
		assertEquals("Monroe", customers.get(665).getCounty());
	}

	@Test
	@DisplayName("Record 666: State is IN")
	void StateOfRecord666() {
		assertEquals("IN", customers.get(665).getState());
	}

	@Test
	@DisplayName("Record 666: ZIP is 47404")
	void ZIPOfRecord666() {
		assertEquals("47404", customers.get(665).getZIP());
	}

	@Test
	@DisplayName("Record 666: Phone is 812-336-4111")
	void PhoneOfRecord666() {
		assertEquals("812-336-4111", customers.get(665).getPhone());
	}

	@Test
	@DisplayName("Record 666: Fax is 812-336-2682")
	void FaxOfRecord666() {
		assertEquals("812-336-2682", customers.get(665).getFax());
	}

	@Test
	@DisplayName("Record 666: Email is chrystal@halfacre.com")
	void EmailOfRecord666() {
		assertEquals("chrystal@halfacre.com", customers.get(665).getEmail());
	}

	@Test
	@DisplayName("Record 666: Web is http://www.chrystalhalfacre.com")
	void WebOfRecord666() {
		assertEquals("http://www.chrystalhalfacre.com", customers.get(665).getWeb());
	}
}
