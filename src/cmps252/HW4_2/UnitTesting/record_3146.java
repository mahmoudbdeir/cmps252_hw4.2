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

@Tag("35")
class Record_3146 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3146: FirstName is Keri")
	void FirstNameOfRecord3146() {
		assertEquals("Keri", customers.get(3145).getFirstName());
	}

	@Test
	@DisplayName("Record 3146: LastName is Kedia")
	void LastNameOfRecord3146() {
		assertEquals("Kedia", customers.get(3145).getLastName());
	}

	@Test
	@DisplayName("Record 3146: Company is Over The Rainbow Child Dev Ctr")
	void CompanyOfRecord3146() {
		assertEquals("Over The Rainbow Child Dev Ctr", customers.get(3145).getCompany());
	}

	@Test
	@DisplayName("Record 3146: Address is 8415 Davison Rd  #-a")
	void AddressOfRecord3146() {
		assertEquals("8415 Davison Rd  #-a", customers.get(3145).getAddress());
	}

	@Test
	@DisplayName("Record 3146: City is Davison")
	void CityOfRecord3146() {
		assertEquals("Davison", customers.get(3145).getCity());
	}

	@Test
	@DisplayName("Record 3146: County is Genesee")
	void CountyOfRecord3146() {
		assertEquals("Genesee", customers.get(3145).getCounty());
	}

	@Test
	@DisplayName("Record 3146: State is MI")
	void StateOfRecord3146() {
		assertEquals("MI", customers.get(3145).getState());
	}

	@Test
	@DisplayName("Record 3146: ZIP is 48423")
	void ZIPOfRecord3146() {
		assertEquals("48423", customers.get(3145).getZIP());
	}

	@Test
	@DisplayName("Record 3146: Phone is 810-653-7700")
	void PhoneOfRecord3146() {
		assertEquals("810-653-7700", customers.get(3145).getPhone());
	}

	@Test
	@DisplayName("Record 3146: Fax is 810-653-0868")
	void FaxOfRecord3146() {
		assertEquals("810-653-0868", customers.get(3145).getFax());
	}

	@Test
	@DisplayName("Record 3146: Email is keri@kedia.com")
	void EmailOfRecord3146() {
		assertEquals("keri@kedia.com", customers.get(3145).getEmail());
	}

	@Test
	@DisplayName("Record 3146: Web is http://www.kerikedia.com")
	void WebOfRecord3146() {
		assertEquals("http://www.kerikedia.com", customers.get(3145).getWeb());
	}
}
