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

@Tag("22")
class Record_2549 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2549: FirstName is Marcellus")
	void FirstNameOfRecord2549() {
		assertEquals("Marcellus", customers.get(2548).getFirstName());
	}

	@Test
	@DisplayName("Record 2549: LastName is Hembre")
	void LastNameOfRecord2549() {
		assertEquals("Hembre", customers.get(2548).getLastName());
	}

	@Test
	@DisplayName("Record 2549: Company is National Amputation Foundation")
	void CompanyOfRecord2549() {
		assertEquals("National Amputation Foundation", customers.get(2548).getCompany());
	}

	@Test
	@DisplayName("Record 2549: Address is 3012 Highway 74")
	void AddressOfRecord2549() {
		assertEquals("3012 Highway 74", customers.get(2548).getAddress());
	}

	@Test
	@DisplayName("Record 2549: City is Evergreen")
	void CityOfRecord2549() {
		assertEquals("Evergreen", customers.get(2548).getCity());
	}

	@Test
	@DisplayName("Record 2549: County is Jefferson")
	void CountyOfRecord2549() {
		assertEquals("Jefferson", customers.get(2548).getCounty());
	}

	@Test
	@DisplayName("Record 2549: State is CO")
	void StateOfRecord2549() {
		assertEquals("CO", customers.get(2548).getState());
	}

	@Test
	@DisplayName("Record 2549: ZIP is 80439")
	void ZIPOfRecord2549() {
		assertEquals("80439", customers.get(2548).getZIP());
	}

	@Test
	@DisplayName("Record 2549: Phone is 303-674-5235")
	void PhoneOfRecord2549() {
		assertEquals("303-674-5235", customers.get(2548).getPhone());
	}

	@Test
	@DisplayName("Record 2549: Fax is 303-674-8855")
	void FaxOfRecord2549() {
		assertEquals("303-674-8855", customers.get(2548).getFax());
	}

	@Test
	@DisplayName("Record 2549: Email is marcellus@hembre.com")
	void EmailOfRecord2549() {
		assertEquals("marcellus@hembre.com", customers.get(2548).getEmail());
	}

	@Test
	@DisplayName("Record 2549: Web is http://www.marcellushembre.com")
	void WebOfRecord2549() {
		assertEquals("http://www.marcellushembre.com", customers.get(2548).getWeb());
	}
}
