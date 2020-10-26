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
class Record_637 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 637: FirstName is Rhonda")
	void FirstNameOfRecord637() {
		assertEquals("Rhonda", customers.get(636).getFirstName());
	}

	@Test
	@DisplayName("Record 637: LastName is Hurdle")
	void LastNameOfRecord637() {
		assertEquals("Hurdle", customers.get(636).getLastName());
	}

	@Test
	@DisplayName("Record 637: Company is Snow, Dawn M Esq")
	void CompanyOfRecord637() {
		assertEquals("Snow, Dawn M Esq", customers.get(636).getCompany());
	}

	@Test
	@DisplayName("Record 637: Address is 1606 Hinton St")
	void AddressOfRecord637() {
		assertEquals("1606 Hinton St", customers.get(636).getAddress());
	}

	@Test
	@DisplayName("Record 637: City is Dallas")
	void CityOfRecord637() {
		assertEquals("Dallas", customers.get(636).getCity());
	}

	@Test
	@DisplayName("Record 637: County is Dallas")
	void CountyOfRecord637() {
		assertEquals("Dallas", customers.get(636).getCounty());
	}

	@Test
	@DisplayName("Record 637: State is TX")
	void StateOfRecord637() {
		assertEquals("TX", customers.get(636).getState());
	}

	@Test
	@DisplayName("Record 637: ZIP is 75235")
	void ZIPOfRecord637() {
		assertEquals("75235", customers.get(636).getZIP());
	}

	@Test
	@DisplayName("Record 637: Phone is 214-631-5723")
	void PhoneOfRecord637() {
		assertEquals("214-631-5723", customers.get(636).getPhone());
	}

	@Test
	@DisplayName("Record 637: Fax is 214-631-9346")
	void FaxOfRecord637() {
		assertEquals("214-631-9346", customers.get(636).getFax());
	}

	@Test
	@DisplayName("Record 637: Email is rhonda@hurdle.com")
	void EmailOfRecord637() {
		assertEquals("rhonda@hurdle.com", customers.get(636).getEmail());
	}

	@Test
	@DisplayName("Record 637: Web is http://www.rhondahurdle.com")
	void WebOfRecord637() {
		assertEquals("http://www.rhondahurdle.com", customers.get(636).getWeb());
	}
}
