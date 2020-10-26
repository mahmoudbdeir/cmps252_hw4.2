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

@Tag("31")
class Record_2642 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2642: FirstName is Justine")
	void FirstNameOfRecord2642() {
		assertEquals("Justine", customers.get(2641).getFirstName());
	}

	@Test
	@DisplayName("Record 2642: LastName is Nishida")
	void LastNameOfRecord2642() {
		assertEquals("Nishida", customers.get(2641).getLastName());
	}

	@Test
	@DisplayName("Record 2642: Company is Cook Mfg Co")
	void CompanyOfRecord2642() {
		assertEquals("Cook Mfg Co", customers.get(2641).getCompany());
	}

	@Test
	@DisplayName("Record 2642: Address is 1113 Story Vlg")
	void AddressOfRecord2642() {
		assertEquals("1113 Story Vlg", customers.get(2641).getAddress());
	}

	@Test
	@DisplayName("Record 2642: City is Irving")
	void CityOfRecord2642() {
		assertEquals("Irving", customers.get(2641).getCity());
	}

	@Test
	@DisplayName("Record 2642: County is Dallas")
	void CountyOfRecord2642() {
		assertEquals("Dallas", customers.get(2641).getCounty());
	}

	@Test
	@DisplayName("Record 2642: State is TX")
	void StateOfRecord2642() {
		assertEquals("TX", customers.get(2641).getState());
	}

	@Test
	@DisplayName("Record 2642: ZIP is 75062")
	void ZIPOfRecord2642() {
		assertEquals("75062", customers.get(2641).getZIP());
	}

	@Test
	@DisplayName("Record 2642: Phone is 972-257-4012")
	void PhoneOfRecord2642() {
		assertEquals("972-257-4012", customers.get(2641).getPhone());
	}

	@Test
	@DisplayName("Record 2642: Fax is 972-257-9255")
	void FaxOfRecord2642() {
		assertEquals("972-257-9255", customers.get(2641).getFax());
	}

	@Test
	@DisplayName("Record 2642: Email is justine@nishida.com")
	void EmailOfRecord2642() {
		assertEquals("justine@nishida.com", customers.get(2641).getEmail());
	}

	@Test
	@DisplayName("Record 2642: Web is http://www.justinenishida.com")
	void WebOfRecord2642() {
		assertEquals("http://www.justinenishida.com", customers.get(2641).getWeb());
	}
}
