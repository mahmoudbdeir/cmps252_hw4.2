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
class Record_3526 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3526: FirstName is Edith")
	void FirstNameOfRecord3526() {
		assertEquals("Edith", customers.get(3525).getFirstName());
	}

	@Test
	@DisplayName("Record 3526: LastName is Riedle")
	void LastNameOfRecord3526() {
		assertEquals("Riedle", customers.get(3525).getLastName());
	}

	@Test
	@DisplayName("Record 3526: Company is Haygood, Charles B Jr")
	void CompanyOfRecord3526() {
		assertEquals("Haygood, Charles B Jr", customers.get(3525).getCompany());
	}

	@Test
	@DisplayName("Record 3526: Address is 416 E Central Blvd")
	void AddressOfRecord3526() {
		assertEquals("416 E Central Blvd", customers.get(3525).getAddress());
	}

	@Test
	@DisplayName("Record 3526: City is Palisades Park")
	void CityOfRecord3526() {
		assertEquals("Palisades Park", customers.get(3525).getCity());
	}

	@Test
	@DisplayName("Record 3526: County is Bergen")
	void CountyOfRecord3526() {
		assertEquals("Bergen", customers.get(3525).getCounty());
	}

	@Test
	@DisplayName("Record 3526: State is NJ")
	void StateOfRecord3526() {
		assertEquals("NJ", customers.get(3525).getState());
	}

	@Test
	@DisplayName("Record 3526: ZIP is 7650")
	void ZIPOfRecord3526() {
		assertEquals("7650", customers.get(3525).getZIP());
	}

	@Test
	@DisplayName("Record 3526: Phone is 201-947-4936")
	void PhoneOfRecord3526() {
		assertEquals("201-947-4936", customers.get(3525).getPhone());
	}

	@Test
	@DisplayName("Record 3526: Fax is 201-947-2774")
	void FaxOfRecord3526() {
		assertEquals("201-947-2774", customers.get(3525).getFax());
	}

	@Test
	@DisplayName("Record 3526: Email is edith@riedle.com")
	void EmailOfRecord3526() {
		assertEquals("edith@riedle.com", customers.get(3525).getEmail());
	}

	@Test
	@DisplayName("Record 3526: Web is http://www.edithriedle.com")
	void WebOfRecord3526() {
		assertEquals("http://www.edithriedle.com", customers.get(3525).getWeb());
	}
}
