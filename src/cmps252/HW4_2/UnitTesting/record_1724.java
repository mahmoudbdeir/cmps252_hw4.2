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

@Tag("16")
class Record_1724 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1724: FirstName is Dawn")
	void FirstNameOfRecord1724() {
		assertEquals("Dawn", customers.get(1723).getFirstName());
	}

	@Test
	@DisplayName("Record 1724: LastName is Stuard")
	void LastNameOfRecord1724() {
		assertEquals("Stuard", customers.get(1723).getLastName());
	}

	@Test
	@DisplayName("Record 1724: Company is Housing Board")
	void CompanyOfRecord1724() {
		assertEquals("Housing Board", customers.get(1723).getCompany());
	}

	@Test
	@DisplayName("Record 1724: Address is 2 Public Sq")
	void AddressOfRecord1724() {
		assertEquals("2 Public Sq", customers.get(1723).getAddress());
	}

	@Test
	@DisplayName("Record 1724: City is Hagerstown")
	void CityOfRecord1724() {
		assertEquals("Hagerstown", customers.get(1723).getCity());
	}

	@Test
	@DisplayName("Record 1724: County is Washington")
	void CountyOfRecord1724() {
		assertEquals("Washington", customers.get(1723).getCounty());
	}

	@Test
	@DisplayName("Record 1724: State is MD")
	void StateOfRecord1724() {
		assertEquals("MD", customers.get(1723).getState());
	}

	@Test
	@DisplayName("Record 1724: ZIP is 21740")
	void ZIPOfRecord1724() {
		assertEquals("21740", customers.get(1723).getZIP());
	}

	@Test
	@DisplayName("Record 1724: Phone is 301-739-0191")
	void PhoneOfRecord1724() {
		assertEquals("301-739-0191", customers.get(1723).getPhone());
	}

	@Test
	@DisplayName("Record 1724: Fax is 301-739-6863")
	void FaxOfRecord1724() {
		assertEquals("301-739-6863", customers.get(1723).getFax());
	}

	@Test
	@DisplayName("Record 1724: Email is dawn@stuard.com")
	void EmailOfRecord1724() {
		assertEquals("dawn@stuard.com", customers.get(1723).getEmail());
	}

	@Test
	@DisplayName("Record 1724: Web is http://www.dawnstuard.com")
	void WebOfRecord1724() {
		assertEquals("http://www.dawnstuard.com", customers.get(1723).getWeb());
	}
}
