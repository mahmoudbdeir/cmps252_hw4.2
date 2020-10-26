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
class Record_455 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 455: FirstName is Adrian")
	void FirstNameOfRecord455() {
		assertEquals("Adrian", customers.get(454).getFirstName());
	}

	@Test
	@DisplayName("Record 455: LastName is Stick")
	void LastNameOfRecord455() {
		assertEquals("Stick", customers.get(454).getLastName());
	}

	@Test
	@DisplayName("Record 455: Company is Tri State Electrical Supl Inc")
	void CompanyOfRecord455() {
		assertEquals("Tri State Electrical Supl Inc", customers.get(454).getCompany());
	}

	@Test
	@DisplayName("Record 455: Address is 80 Bay St")
	void AddressOfRecord455() {
		assertEquals("80 Bay St", customers.get(454).getAddress());
	}

	@Test
	@DisplayName("Record 455: City is Staten Island")
	void CityOfRecord455() {
		assertEquals("Staten Island", customers.get(454).getCity());
	}

	@Test
	@DisplayName("Record 455: County is Richmond")
	void CountyOfRecord455() {
		assertEquals("Richmond", customers.get(454).getCounty());
	}

	@Test
	@DisplayName("Record 455: State is NY")
	void StateOfRecord455() {
		assertEquals("NY", customers.get(454).getState());
	}

	@Test
	@DisplayName("Record 455: ZIP is 10301")
	void ZIPOfRecord455() {
		assertEquals("10301", customers.get(454).getZIP());
	}

	@Test
	@DisplayName("Record 455: Phone is 718-727-3071")
	void PhoneOfRecord455() {
		assertEquals("718-727-3071", customers.get(454).getPhone());
	}

	@Test
	@DisplayName("Record 455: Fax is 718-727-3508")
	void FaxOfRecord455() {
		assertEquals("718-727-3508", customers.get(454).getFax());
	}

	@Test
	@DisplayName("Record 455: Email is adrian@stick.com")
	void EmailOfRecord455() {
		assertEquals("adrian@stick.com", customers.get(454).getEmail());
	}

	@Test
	@DisplayName("Record 455: Web is http://www.adrianstick.com")
	void WebOfRecord455() {
		assertEquals("http://www.adrianstick.com", customers.get(454).getWeb());
	}
}
