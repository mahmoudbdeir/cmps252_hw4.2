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

@Tag("23")
class Record_2151 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2151: FirstName is Ray")
	void FirstNameOfRecord2151() {
		assertEquals("Ray", customers.get(2150).getFirstName());
	}

	@Test
	@DisplayName("Record 2151: LastName is Turnley")
	void LastNameOfRecord2151() {
		assertEquals("Turnley", customers.get(2150).getLastName());
	}

	@Test
	@DisplayName("Record 2151: Company is Kros, Frank J Esq")
	void CompanyOfRecord2151() {
		assertEquals("Kros, Frank J Esq", customers.get(2150).getCompany());
	}

	@Test
	@DisplayName("Record 2151: Address is 500 Renaissance Ctr")
	void AddressOfRecord2151() {
		assertEquals("500 Renaissance Ctr", customers.get(2150).getAddress());
	}

	@Test
	@DisplayName("Record 2151: City is Detroit")
	void CityOfRecord2151() {
		assertEquals("Detroit", customers.get(2150).getCity());
	}

	@Test
	@DisplayName("Record 2151: County is Wayne")
	void CountyOfRecord2151() {
		assertEquals("Wayne", customers.get(2150).getCounty());
	}

	@Test
	@DisplayName("Record 2151: State is MI")
	void StateOfRecord2151() {
		assertEquals("MI", customers.get(2150).getState());
	}

	@Test
	@DisplayName("Record 2151: ZIP is 48243")
	void ZIPOfRecord2151() {
		assertEquals("48243", customers.get(2150).getZIP());
	}

	@Test
	@DisplayName("Record 2151: Phone is 313-496-6783")
	void PhoneOfRecord2151() {
		assertEquals("313-496-6783", customers.get(2150).getPhone());
	}

	@Test
	@DisplayName("Record 2151: Fax is 313-496-3268")
	void FaxOfRecord2151() {
		assertEquals("313-496-3268", customers.get(2150).getFax());
	}

	@Test
	@DisplayName("Record 2151: Email is ray@turnley.com")
	void EmailOfRecord2151() {
		assertEquals("ray@turnley.com", customers.get(2150).getEmail());
	}

	@Test
	@DisplayName("Record 2151: Web is http://www.rayturnley.com")
	void WebOfRecord2151() {
		assertEquals("http://www.rayturnley.com", customers.get(2150).getWeb());
	}
}
