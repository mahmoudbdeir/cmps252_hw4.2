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

@Tag("21")
class Record_4591 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4591: FirstName is Gregory")
	void FirstNameOfRecord4591() {
		assertEquals("Gregory", customers.get(4590).getFirstName());
	}

	@Test
	@DisplayName("Record 4591: LastName is Maharrey")
	void LastNameOfRecord4591() {
		assertEquals("Maharrey", customers.get(4590).getLastName());
	}

	@Test
	@DisplayName("Record 4591: Company is Graphics Gallery")
	void CompanyOfRecord4591() {
		assertEquals("Graphics Gallery", customers.get(4590).getCompany());
	}

	@Test
	@DisplayName("Record 4591: Address is 9900 Global Rd")
	void AddressOfRecord4591() {
		assertEquals("9900 Global Rd", customers.get(4590).getAddress());
	}

	@Test
	@DisplayName("Record 4591: City is Philadelphia")
	void CityOfRecord4591() {
		assertEquals("Philadelphia", customers.get(4590).getCity());
	}

	@Test
	@DisplayName("Record 4591: County is Philadelphia")
	void CountyOfRecord4591() {
		assertEquals("Philadelphia", customers.get(4590).getCounty());
	}

	@Test
	@DisplayName("Record 4591: State is PA")
	void StateOfRecord4591() {
		assertEquals("PA", customers.get(4590).getState());
	}

	@Test
	@DisplayName("Record 4591: ZIP is 19115")
	void ZIPOfRecord4591() {
		assertEquals("19115", customers.get(4590).getZIP());
	}

	@Test
	@DisplayName("Record 4591: Phone is 215-969-2486")
	void PhoneOfRecord4591() {
		assertEquals("215-969-2486", customers.get(4590).getPhone());
	}

	@Test
	@DisplayName("Record 4591: Fax is 215-969-3168")
	void FaxOfRecord4591() {
		assertEquals("215-969-3168", customers.get(4590).getFax());
	}

	@Test
	@DisplayName("Record 4591: Email is gregory@maharrey.com")
	void EmailOfRecord4591() {
		assertEquals("gregory@maharrey.com", customers.get(4590).getEmail());
	}

	@Test
	@DisplayName("Record 4591: Web is http://www.gregorymaharrey.com")
	void WebOfRecord4591() {
		assertEquals("http://www.gregorymaharrey.com", customers.get(4590).getWeb());
	}
}
