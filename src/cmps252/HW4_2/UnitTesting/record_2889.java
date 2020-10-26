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

@Tag("6")
class Record_2889 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2889: FirstName is Aurora")
	void FirstNameOfRecord2889() {
		assertEquals("Aurora", customers.get(2888).getFirstName());
	}

	@Test
	@DisplayName("Record 2889: LastName is Gibney")
	void LastNameOfRecord2889() {
		assertEquals("Gibney", customers.get(2888).getLastName());
	}

	@Test
	@DisplayName("Record 2889: Company is Somers & Associates")
	void CompanyOfRecord2889() {
		assertEquals("Somers & Associates", customers.get(2888).getCompany());
	}

	@Test
	@DisplayName("Record 2889: Address is 616 Nw Englewood Rd")
	void AddressOfRecord2889() {
		assertEquals("616 Nw Englewood Rd", customers.get(2888).getAddress());
	}

	@Test
	@DisplayName("Record 2889: City is Kansas City")
	void CityOfRecord2889() {
		assertEquals("Kansas City", customers.get(2888).getCity());
	}

	@Test
	@DisplayName("Record 2889: County is Clay")
	void CountyOfRecord2889() {
		assertEquals("Clay", customers.get(2888).getCounty());
	}

	@Test
	@DisplayName("Record 2889: State is MO")
	void StateOfRecord2889() {
		assertEquals("MO", customers.get(2888).getState());
	}

	@Test
	@DisplayName("Record 2889: ZIP is 64118")
	void ZIPOfRecord2889() {
		assertEquals("64118", customers.get(2888).getZIP());
	}

	@Test
	@DisplayName("Record 2889: Phone is 816-455-6121")
	void PhoneOfRecord2889() {
		assertEquals("816-455-6121", customers.get(2888).getPhone());
	}

	@Test
	@DisplayName("Record 2889: Fax is 816-455-0489")
	void FaxOfRecord2889() {
		assertEquals("816-455-0489", customers.get(2888).getFax());
	}

	@Test
	@DisplayName("Record 2889: Email is aurora@gibney.com")
	void EmailOfRecord2889() {
		assertEquals("aurora@gibney.com", customers.get(2888).getEmail());
	}

	@Test
	@DisplayName("Record 2889: Web is http://www.auroragibney.com")
	void WebOfRecord2889() {
		assertEquals("http://www.auroragibney.com", customers.get(2888).getWeb());
	}
}
