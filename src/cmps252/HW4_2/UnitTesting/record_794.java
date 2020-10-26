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

@Tag("32")
class Record_794 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 794: FirstName is Chelsea")
	void FirstNameOfRecord794() {
		assertEquals("Chelsea", customers.get(793).getFirstName());
	}

	@Test
	@DisplayName("Record 794: LastName is Strevell")
	void LastNameOfRecord794() {
		assertEquals("Strevell", customers.get(793).getLastName());
	}

	@Test
	@DisplayName("Record 794: Company is Lamere, Phillip A Esq")
	void CompanyOfRecord794() {
		assertEquals("Lamere, Phillip A Esq", customers.get(793).getCompany());
	}

	@Test
	@DisplayName("Record 794: Address is 2715 Blake St")
	void AddressOfRecord794() {
		assertEquals("2715 Blake St", customers.get(793).getAddress());
	}

	@Test
	@DisplayName("Record 794: City is Denver")
	void CityOfRecord794() {
		assertEquals("Denver", customers.get(793).getCity());
	}

	@Test
	@DisplayName("Record 794: County is Denver")
	void CountyOfRecord794() {
		assertEquals("Denver", customers.get(793).getCounty());
	}

	@Test
	@DisplayName("Record 794: State is CO")
	void StateOfRecord794() {
		assertEquals("CO", customers.get(793).getState());
	}

	@Test
	@DisplayName("Record 794: ZIP is 80205")
	void ZIPOfRecord794() {
		assertEquals("80205", customers.get(793).getZIP());
	}

	@Test
	@DisplayName("Record 794: Phone is 303-297-5227")
	void PhoneOfRecord794() {
		assertEquals("303-297-5227", customers.get(793).getPhone());
	}

	@Test
	@DisplayName("Record 794: Fax is 303-297-2417")
	void FaxOfRecord794() {
		assertEquals("303-297-2417", customers.get(793).getFax());
	}

	@Test
	@DisplayName("Record 794: Email is chelsea@strevell.com")
	void EmailOfRecord794() {
		assertEquals("chelsea@strevell.com", customers.get(793).getEmail());
	}

	@Test
	@DisplayName("Record 794: Web is http://www.chelseastrevell.com")
	void WebOfRecord794() {
		assertEquals("http://www.chelseastrevell.com", customers.get(793).getWeb());
	}
}
