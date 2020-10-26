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

@Tag("29")
class Record_1656 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1656: FirstName is Donovan")
	void FirstNameOfRecord1656() {
		assertEquals("Donovan", customers.get(1655).getFirstName());
	}

	@Test
	@DisplayName("Record 1656: LastName is Sharum")
	void LastNameOfRecord1656() {
		assertEquals("Sharum", customers.get(1655).getLastName());
	}

	@Test
	@DisplayName("Record 1656: Company is Beck, Aaron Cpa")
	void CompanyOfRecord1656() {
		assertEquals("Beck, Aaron Cpa", customers.get(1655).getCompany());
	}

	@Test
	@DisplayName("Record 1656: Address is 2730 Monterey St")
	void AddressOfRecord1656() {
		assertEquals("2730 Monterey St", customers.get(1655).getAddress());
	}

	@Test
	@DisplayName("Record 1656: City is Torrance")
	void CityOfRecord1656() {
		assertEquals("Torrance", customers.get(1655).getCity());
	}

	@Test
	@DisplayName("Record 1656: County is Los Angeles")
	void CountyOfRecord1656() {
		assertEquals("Los Angeles", customers.get(1655).getCounty());
	}

	@Test
	@DisplayName("Record 1656: State is CA")
	void StateOfRecord1656() {
		assertEquals("CA", customers.get(1655).getState());
	}

	@Test
	@DisplayName("Record 1656: ZIP is 90503")
	void ZIPOfRecord1656() {
		assertEquals("90503", customers.get(1655).getZIP());
	}

	@Test
	@DisplayName("Record 1656: Phone is 310-320-2641")
	void PhoneOfRecord1656() {
		assertEquals("310-320-2641", customers.get(1655).getPhone());
	}

	@Test
	@DisplayName("Record 1656: Fax is 310-320-3607")
	void FaxOfRecord1656() {
		assertEquals("310-320-3607", customers.get(1655).getFax());
	}

	@Test
	@DisplayName("Record 1656: Email is donovan@sharum.com")
	void EmailOfRecord1656() {
		assertEquals("donovan@sharum.com", customers.get(1655).getEmail());
	}

	@Test
	@DisplayName("Record 1656: Web is http://www.donovansharum.com")
	void WebOfRecord1656() {
		assertEquals("http://www.donovansharum.com", customers.get(1655).getWeb());
	}
}
