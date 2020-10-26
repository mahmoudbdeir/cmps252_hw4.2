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

@Tag("7")
class Record_688 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 688: FirstName is Juliet")
	void FirstNameOfRecord688() {
		assertEquals("Juliet", customers.get(687).getFirstName());
	}

	@Test
	@DisplayName("Record 688: LastName is Markie")
	void LastNameOfRecord688() {
		assertEquals("Markie", customers.get(687).getLastName());
	}

	@Test
	@DisplayName("Record 688: Company is Darin, Holly Quackenbush Esq")
	void CompanyOfRecord688() {
		assertEquals("Darin, Holly Quackenbush Esq", customers.get(687).getCompany());
	}

	@Test
	@DisplayName("Record 688: Address is 17216 Beach Blvd")
	void AddressOfRecord688() {
		assertEquals("17216 Beach Blvd", customers.get(687).getAddress());
	}

	@Test
	@DisplayName("Record 688: City is Huntington Beach")
	void CityOfRecord688() {
		assertEquals("Huntington Beach", customers.get(687).getCity());
	}

	@Test
	@DisplayName("Record 688: County is Orange")
	void CountyOfRecord688() {
		assertEquals("Orange", customers.get(687).getCounty());
	}

	@Test
	@DisplayName("Record 688: State is CA")
	void StateOfRecord688() {
		assertEquals("CA", customers.get(687).getState());
	}

	@Test
	@DisplayName("Record 688: ZIP is 92647")
	void ZIPOfRecord688() {
		assertEquals("92647", customers.get(687).getZIP());
	}

	@Test
	@DisplayName("Record 688: Phone is 714-841-3702")
	void PhoneOfRecord688() {
		assertEquals("714-841-3702", customers.get(687).getPhone());
	}

	@Test
	@DisplayName("Record 688: Fax is 714-841-0818")
	void FaxOfRecord688() {
		assertEquals("714-841-0818", customers.get(687).getFax());
	}

	@Test
	@DisplayName("Record 688: Email is juliet@markie.com")
	void EmailOfRecord688() {
		assertEquals("juliet@markie.com", customers.get(687).getEmail());
	}

	@Test
	@DisplayName("Record 688: Web is http://www.julietmarkie.com")
	void WebOfRecord688() {
		assertEquals("http://www.julietmarkie.com", customers.get(687).getWeb());
	}
}
