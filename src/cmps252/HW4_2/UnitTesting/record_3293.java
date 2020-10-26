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

@Tag("13")
class Record_3293 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3293: FirstName is Andrea")
	void FirstNameOfRecord3293() {
		assertEquals("Andrea", customers.get(3292).getFirstName());
	}

	@Test
	@DisplayName("Record 3293: LastName is Aery")
	void LastNameOfRecord3293() {
		assertEquals("Aery", customers.get(3292).getLastName());
	}

	@Test
	@DisplayName("Record 3293: Company is Calpec Engineering Company")
	void CompanyOfRecord3293() {
		assertEquals("Calpec Engineering Company", customers.get(3292).getCompany());
	}

	@Test
	@DisplayName("Record 3293: Address is 35 E Wacker Dr  #-850")
	void AddressOfRecord3293() {
		assertEquals("35 E Wacker Dr  #-850", customers.get(3292).getAddress());
	}

	@Test
	@DisplayName("Record 3293: City is Chicago")
	void CityOfRecord3293() {
		assertEquals("Chicago", customers.get(3292).getCity());
	}

	@Test
	@DisplayName("Record 3293: County is Cook")
	void CountyOfRecord3293() {
		assertEquals("Cook", customers.get(3292).getCounty());
	}

	@Test
	@DisplayName("Record 3293: State is IL")
	void StateOfRecord3293() {
		assertEquals("IL", customers.get(3292).getState());
	}

	@Test
	@DisplayName("Record 3293: ZIP is 60601")
	void ZIPOfRecord3293() {
		assertEquals("60601", customers.get(3292).getZIP());
	}

	@Test
	@DisplayName("Record 3293: Phone is 312-263-5370")
	void PhoneOfRecord3293() {
		assertEquals("312-263-5370", customers.get(3292).getPhone());
	}

	@Test
	@DisplayName("Record 3293: Fax is 312-263-3151")
	void FaxOfRecord3293() {
		assertEquals("312-263-3151", customers.get(3292).getFax());
	}

	@Test
	@DisplayName("Record 3293: Email is andrea@aery.com")
	void EmailOfRecord3293() {
		assertEquals("andrea@aery.com", customers.get(3292).getEmail());
	}

	@Test
	@DisplayName("Record 3293: Web is http://www.andreaaery.com")
	void WebOfRecord3293() {
		assertEquals("http://www.andreaaery.com", customers.get(3292).getWeb());
	}
}
