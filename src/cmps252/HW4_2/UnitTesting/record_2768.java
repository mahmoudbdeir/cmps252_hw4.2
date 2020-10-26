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

@Tag("12")
class Record_2768 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2768: FirstName is Rosie")
	void FirstNameOfRecord2768() {
		assertEquals("Rosie", customers.get(2767).getFirstName());
	}

	@Test
	@DisplayName("Record 2768: LastName is Mones")
	void LastNameOfRecord2768() {
		assertEquals("Mones", customers.get(2767).getLastName());
	}

	@Test
	@DisplayName("Record 2768: Company is Desfor, Bruce D Esq")
	void CompanyOfRecord2768() {
		assertEquals("Desfor, Bruce D Esq", customers.get(2767).getCompany());
	}

	@Test
	@DisplayName("Record 2768: Address is 56 Main")
	void AddressOfRecord2768() {
		assertEquals("56 Main", customers.get(2767).getAddress());
	}

	@Test
	@DisplayName("Record 2768: City is Easton")
	void CityOfRecord2768() {
		assertEquals("Easton", customers.get(2767).getCity());
	}

	@Test
	@DisplayName("Record 2768: County is Bristol")
	void CountyOfRecord2768() {
		assertEquals("Bristol", customers.get(2767).getCounty());
	}

	@Test
	@DisplayName("Record 2768: State is MA")
	void StateOfRecord2768() {
		assertEquals("MA", customers.get(2767).getState());
	}

	@Test
	@DisplayName("Record 2768: ZIP is 2334")
	void ZIPOfRecord2768() {
		assertEquals("2334", customers.get(2767).getZIP());
	}

	@Test
	@DisplayName("Record 2768: Phone is 508-238-8726")
	void PhoneOfRecord2768() {
		assertEquals("508-238-8726", customers.get(2767).getPhone());
	}

	@Test
	@DisplayName("Record 2768: Fax is 508-238-5131")
	void FaxOfRecord2768() {
		assertEquals("508-238-5131", customers.get(2767).getFax());
	}

	@Test
	@DisplayName("Record 2768: Email is rosie@mones.com")
	void EmailOfRecord2768() {
		assertEquals("rosie@mones.com", customers.get(2767).getEmail());
	}

	@Test
	@DisplayName("Record 2768: Web is http://www.rosiemones.com")
	void WebOfRecord2768() {
		assertEquals("http://www.rosiemones.com", customers.get(2767).getWeb());
	}
}
