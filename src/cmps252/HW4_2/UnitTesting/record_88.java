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

@Tag("21")
class Record_88 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 88: FirstName is Anita")
	void FirstNameOfRecord88() {
		assertEquals("Anita", customers.get(87).getFirstName());
	}

	@Test
	@DisplayName("Record 88: LastName is Lederer")
	void LastNameOfRecord88() {
		assertEquals("Lederer", customers.get(87).getLastName());
	}

	@Test
	@DisplayName("Record 88: Company is Ferguson Supply & Box Mfg Co")
	void CompanyOfRecord88() {
		assertEquals("Ferguson Supply & Box Mfg Co", customers.get(87).getCompany());
	}

	@Test
	@DisplayName("Record 88: Address is 4621 Teller Ave")
	void AddressOfRecord88() {
		assertEquals("4621 Teller Ave", customers.get(87).getAddress());
	}

	@Test
	@DisplayName("Record 88: City is Newport Beach")
	void CityOfRecord88() {
		assertEquals("Newport Beach", customers.get(87).getCity());
	}

	@Test
	@DisplayName("Record 88: County is Orange")
	void CountyOfRecord88() {
		assertEquals("Orange", customers.get(87).getCounty());
	}

	@Test
	@DisplayName("Record 88: State is CA")
	void StateOfRecord88() {
		assertEquals("CA", customers.get(87).getState());
	}

	@Test
	@DisplayName("Record 88: ZIP is 92660")
	void ZIPOfRecord88() {
		assertEquals("92660", customers.get(87).getZIP());
	}

	@Test
	@DisplayName("Record 88: Phone is 949-538-3279")
	void PhoneOfRecord88() {
		assertEquals("949-538-3279", customers.get(87).getPhone());
	}

	@Test
	@DisplayName("Record 88: Fax is 949-538-5455")
	void FaxOfRecord88() {
		assertEquals("949-538-5455", customers.get(87).getFax());
	}

	@Test
	@DisplayName("Record 88: Email is anita@lederer.com")
	void EmailOfRecord88() {
		assertEquals("anita@lederer.com", customers.get(87).getEmail());
	}

	@Test
	@DisplayName("Record 88: Web is http://www.anitalederer.com")
	void WebOfRecord88() {
		assertEquals("http://www.anitalederer.com", customers.get(87).getWeb());
	}
}
