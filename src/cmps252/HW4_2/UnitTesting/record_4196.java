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

@Tag("25")
class Record_4196 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4196: FirstName is Francis")
	void FirstNameOfRecord4196() {
		assertEquals("Francis", customers.get(4195).getFirstName());
	}

	@Test
	@DisplayName("Record 4196: LastName is Krug")
	void LastNameOfRecord4196() {
		assertEquals("Krug", customers.get(4195).getLastName());
	}

	@Test
	@DisplayName("Record 4196: Company is Au Panier Dor")
	void CompanyOfRecord4196() {
		assertEquals("Au Panier Dor", customers.get(4195).getCompany());
	}

	@Test
	@DisplayName("Record 4196: Address is 95 W Main St")
	void AddressOfRecord4196() {
		assertEquals("95 W Main St", customers.get(4195).getAddress());
	}

	@Test
	@DisplayName("Record 4196: City is Benton Harbor")
	void CityOfRecord4196() {
		assertEquals("Benton Harbor", customers.get(4195).getCity());
	}

	@Test
	@DisplayName("Record 4196: County is Berrien")
	void CountyOfRecord4196() {
		assertEquals("Berrien", customers.get(4195).getCounty());
	}

	@Test
	@DisplayName("Record 4196: State is MI")
	void StateOfRecord4196() {
		assertEquals("MI", customers.get(4195).getState());
	}

	@Test
	@DisplayName("Record 4196: ZIP is 49022")
	void ZIPOfRecord4196() {
		assertEquals("49022", customers.get(4195).getZIP());
	}

	@Test
	@DisplayName("Record 4196: Phone is 269-927-4293")
	void PhoneOfRecord4196() {
		assertEquals("269-927-4293", customers.get(4195).getPhone());
	}

	@Test
	@DisplayName("Record 4196: Fax is 269-927-2268")
	void FaxOfRecord4196() {
		assertEquals("269-927-2268", customers.get(4195).getFax());
	}

	@Test
	@DisplayName("Record 4196: Email is francis@krug.com")
	void EmailOfRecord4196() {
		assertEquals("francis@krug.com", customers.get(4195).getEmail());
	}

	@Test
	@DisplayName("Record 4196: Web is http://www.franciskrug.com")
	void WebOfRecord4196() {
		assertEquals("http://www.franciskrug.com", customers.get(4195).getWeb());
	}
}
