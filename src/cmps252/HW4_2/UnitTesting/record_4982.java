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

@Tag("32")
class Record_4982 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4982: FirstName is Jeromy")
	void FirstNameOfRecord4982() {
		assertEquals("Jeromy", customers.get(4981).getFirstName());
	}

	@Test
	@DisplayName("Record 4982: LastName is Milster")
	void LastNameOfRecord4982() {
		assertEquals("Milster", customers.get(4981).getLastName());
	}

	@Test
	@DisplayName("Record 4982: Company is Joseph Charles Rubel Pa")
	void CompanyOfRecord4982() {
		assertEquals("Joseph Charles Rubel Pa", customers.get(4981).getCompany());
	}

	@Test
	@DisplayName("Record 4982: Address is 4004 Carlisle Blvd Ne  #-c")
	void AddressOfRecord4982() {
		assertEquals("4004 Carlisle Blvd Ne  #-c", customers.get(4981).getAddress());
	}

	@Test
	@DisplayName("Record 4982: City is Albuquerque")
	void CityOfRecord4982() {
		assertEquals("Albuquerque", customers.get(4981).getCity());
	}

	@Test
	@DisplayName("Record 4982: County is Bernalillo")
	void CountyOfRecord4982() {
		assertEquals("Bernalillo", customers.get(4981).getCounty());
	}

	@Test
	@DisplayName("Record 4982: State is NM")
	void StateOfRecord4982() {
		assertEquals("NM", customers.get(4981).getState());
	}

	@Test
	@DisplayName("Record 4982: ZIP is 87107")
	void ZIPOfRecord4982() {
		assertEquals("87107", customers.get(4981).getZIP());
	}

	@Test
	@DisplayName("Record 4982: Phone is 505-884-1129")
	void PhoneOfRecord4982() {
		assertEquals("505-884-1129", customers.get(4981).getPhone());
	}

	@Test
	@DisplayName("Record 4982: Fax is 505-884-4452")
	void FaxOfRecord4982() {
		assertEquals("505-884-4452", customers.get(4981).getFax());
	}

	@Test
	@DisplayName("Record 4982: Email is jeromy@milster.com")
	void EmailOfRecord4982() {
		assertEquals("jeromy@milster.com", customers.get(4981).getEmail());
	}

	@Test
	@DisplayName("Record 4982: Web is http://www.jeromymilster.com")
	void WebOfRecord4982() {
		assertEquals("http://www.jeromymilster.com", customers.get(4981).getWeb());
	}
}
