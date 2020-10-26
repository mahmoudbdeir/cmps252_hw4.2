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

@Tag("28")
class Record_3575 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3575: FirstName is Eugenia")
	void FirstNameOfRecord3575() {
		assertEquals("Eugenia", customers.get(3574).getFirstName());
	}

	@Test
	@DisplayName("Record 3575: LastName is Dixon")
	void LastNameOfRecord3575() {
		assertEquals("Dixon", customers.get(3574).getLastName());
	}

	@Test
	@DisplayName("Record 3575: Company is Boland, Curtis A Cpa")
	void CompanyOfRecord3575() {
		assertEquals("Boland, Curtis A Cpa", customers.get(3574).getCompany());
	}

	@Test
	@DisplayName("Record 3575: Address is 3129 W 36th St")
	void AddressOfRecord3575() {
		assertEquals("3129 W 36th St", customers.get(3574).getAddress());
	}

	@Test
	@DisplayName("Record 3575: City is Chicago")
	void CityOfRecord3575() {
		assertEquals("Chicago", customers.get(3574).getCity());
	}

	@Test
	@DisplayName("Record 3575: County is Cook")
	void CountyOfRecord3575() {
		assertEquals("Cook", customers.get(3574).getCounty());
	}

	@Test
	@DisplayName("Record 3575: State is IL")
	void StateOfRecord3575() {
		assertEquals("IL", customers.get(3574).getState());
	}

	@Test
	@DisplayName("Record 3575: ZIP is 60632")
	void ZIPOfRecord3575() {
		assertEquals("60632", customers.get(3574).getZIP());
	}

	@Test
	@DisplayName("Record 3575: Phone is 773-890-1075")
	void PhoneOfRecord3575() {
		assertEquals("773-890-1075", customers.get(3574).getPhone());
	}

	@Test
	@DisplayName("Record 3575: Fax is 773-890-6133")
	void FaxOfRecord3575() {
		assertEquals("773-890-6133", customers.get(3574).getFax());
	}

	@Test
	@DisplayName("Record 3575: Email is eugenia@dixon.com")
	void EmailOfRecord3575() {
		assertEquals("eugenia@dixon.com", customers.get(3574).getEmail());
	}

	@Test
	@DisplayName("Record 3575: Web is http://www.eugeniadixon.com")
	void WebOfRecord3575() {
		assertEquals("http://www.eugeniadixon.com", customers.get(3574).getWeb());
	}
}
