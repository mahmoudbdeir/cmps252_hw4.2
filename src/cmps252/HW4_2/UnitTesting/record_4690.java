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

@Tag("0")
class Record_4690 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4690: FirstName is Ramiro")
	void FirstNameOfRecord4690() {
		assertEquals("Ramiro", customers.get(4689).getFirstName());
	}

	@Test
	@DisplayName("Record 4690: LastName is Lavole")
	void LastNameOfRecord4690() {
		assertEquals("Lavole", customers.get(4689).getLastName());
	}

	@Test
	@DisplayName("Record 4690: Company is Keystone Lodge")
	void CompanyOfRecord4690() {
		assertEquals("Keystone Lodge", customers.get(4689).getCompany());
	}

	@Test
	@DisplayName("Record 4690: Address is 165 Smith St")
	void AddressOfRecord4690() {
		assertEquals("165 Smith St", customers.get(4689).getAddress());
	}

	@Test
	@DisplayName("Record 4690: City is Poughkeepsie")
	void CityOfRecord4690() {
		assertEquals("Poughkeepsie", customers.get(4689).getCity());
	}

	@Test
	@DisplayName("Record 4690: County is Dutchess")
	void CountyOfRecord4690() {
		assertEquals("Dutchess", customers.get(4689).getCounty());
	}

	@Test
	@DisplayName("Record 4690: State is NY")
	void StateOfRecord4690() {
		assertEquals("NY", customers.get(4689).getState());
	}

	@Test
	@DisplayName("Record 4690: ZIP is 12601")
	void ZIPOfRecord4690() {
		assertEquals("12601", customers.get(4689).getZIP());
	}

	@Test
	@DisplayName("Record 4690: Phone is 845-454-8374")
	void PhoneOfRecord4690() {
		assertEquals("845-454-8374", customers.get(4689).getPhone());
	}

	@Test
	@DisplayName("Record 4690: Fax is 845-454-8712")
	void FaxOfRecord4690() {
		assertEquals("845-454-8712", customers.get(4689).getFax());
	}

	@Test
	@DisplayName("Record 4690: Email is ramiro@lavole.com")
	void EmailOfRecord4690() {
		assertEquals("ramiro@lavole.com", customers.get(4689).getEmail());
	}

	@Test
	@DisplayName("Record 4690: Web is http://www.ramirolavole.com")
	void WebOfRecord4690() {
		assertEquals("http://www.ramirolavole.com", customers.get(4689).getWeb());
	}
}
