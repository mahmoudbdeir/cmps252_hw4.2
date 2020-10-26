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

@Tag("38")
class Record_815 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 815: FirstName is Jody")
	void FirstNameOfRecord815() {
		assertEquals("Jody", customers.get(814).getFirstName());
	}

	@Test
	@DisplayName("Record 815: LastName is Boileau")
	void LastNameOfRecord815() {
		assertEquals("Boileau", customers.get(814).getLastName());
	}

	@Test
	@DisplayName("Record 815: Company is Melvin Law Md")
	void CompanyOfRecord815() {
		assertEquals("Melvin Law Md", customers.get(814).getCompany());
	}

	@Test
	@DisplayName("Record 815: Address is 10221 Slater Ave  #-213")
	void AddressOfRecord815() {
		assertEquals("10221 Slater Ave  #-213", customers.get(814).getAddress());
	}

	@Test
	@DisplayName("Record 815: City is Fountain Valley")
	void CityOfRecord815() {
		assertEquals("Fountain Valley", customers.get(814).getCity());
	}

	@Test
	@DisplayName("Record 815: County is Orange")
	void CountyOfRecord815() {
		assertEquals("Orange", customers.get(814).getCounty());
	}

	@Test
	@DisplayName("Record 815: State is CA")
	void StateOfRecord815() {
		assertEquals("CA", customers.get(814).getState());
	}

	@Test
	@DisplayName("Record 815: ZIP is 92708")
	void ZIPOfRecord815() {
		assertEquals("92708", customers.get(814).getZIP());
	}

	@Test
	@DisplayName("Record 815: Phone is 714-964-1493")
	void PhoneOfRecord815() {
		assertEquals("714-964-1493", customers.get(814).getPhone());
	}

	@Test
	@DisplayName("Record 815: Fax is 714-964-4663")
	void FaxOfRecord815() {
		assertEquals("714-964-4663", customers.get(814).getFax());
	}

	@Test
	@DisplayName("Record 815: Email is jody@boileau.com")
	void EmailOfRecord815() {
		assertEquals("jody@boileau.com", customers.get(814).getEmail());
	}

	@Test
	@DisplayName("Record 815: Web is http://www.jodyboileau.com")
	void WebOfRecord815() {
		assertEquals("http://www.jodyboileau.com", customers.get(814).getWeb());
	}
}
