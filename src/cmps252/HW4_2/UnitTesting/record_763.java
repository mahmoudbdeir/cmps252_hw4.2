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

@Tag("19")
class Record_763 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 763: FirstName is Francis")
	void FirstNameOfRecord763() {
		assertEquals("Francis", customers.get(762).getFirstName());
	}

	@Test
	@DisplayName("Record 763: LastName is ysenbarth")
	void LastNameOfRecord763() {
		assertEquals("ysenbarth", customers.get(762).getLastName());
	}

	@Test
	@DisplayName("Record 763: Company is R R Leonard Co")
	void CompanyOfRecord763() {
		assertEquals("R R Leonard Co", customers.get(762).getCompany());
	}

	@Test
	@DisplayName("Record 763: Address is 2565 Cloverdale Ave  #-a")
	void AddressOfRecord763() {
		assertEquals("2565 Cloverdale Ave  #-a", customers.get(762).getAddress());
	}

	@Test
	@DisplayName("Record 763: City is Concord")
	void CityOfRecord763() {
		assertEquals("Concord", customers.get(762).getCity());
	}

	@Test
	@DisplayName("Record 763: County is Contra Costa")
	void CountyOfRecord763() {
		assertEquals("Contra Costa", customers.get(762).getCounty());
	}

	@Test
	@DisplayName("Record 763: State is CA")
	void StateOfRecord763() {
		assertEquals("CA", customers.get(762).getState());
	}

	@Test
	@DisplayName("Record 763: ZIP is 94518")
	void ZIPOfRecord763() {
		assertEquals("94518", customers.get(762).getZIP());
	}

	@Test
	@DisplayName("Record 763: Phone is 925-676-4099")
	void PhoneOfRecord763() {
		assertEquals("925-676-4099", customers.get(762).getPhone());
	}

	@Test
	@DisplayName("Record 763: Fax is 925-676-5926")
	void FaxOfRecord763() {
		assertEquals("925-676-5926", customers.get(762).getFax());
	}

	@Test
	@DisplayName("Record 763: Email is francis@ysenbarth.com")
	void EmailOfRecord763() {
		assertEquals("francis@ysenbarth.com", customers.get(762).getEmail());
	}

	@Test
	@DisplayName("Record 763: Web is http://www.francisysenbarth.com")
	void WebOfRecord763() {
		assertEquals("http://www.francisysenbarth.com", customers.get(762).getWeb());
	}
}
