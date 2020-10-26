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

@Tag("12")
class Record_4816 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4816: FirstName is Cristobal")
	void FirstNameOfRecord4816() {
		assertEquals("Cristobal", customers.get(4815).getFirstName());
	}

	@Test
	@DisplayName("Record 4816: LastName is Brasier")
	void LastNameOfRecord4816() {
		assertEquals("Brasier", customers.get(4815).getLastName());
	}

	@Test
	@DisplayName("Record 4816: Company is Starlite Originals")
	void CompanyOfRecord4816() {
		assertEquals("Starlite Originals", customers.get(4815).getCompany());
	}

	@Test
	@DisplayName("Record 4816: Address is 101 Howard St")
	void AddressOfRecord4816() {
		assertEquals("101 Howard St", customers.get(4815).getAddress());
	}

	@Test
	@DisplayName("Record 4816: City is San Francisco")
	void CityOfRecord4816() {
		assertEquals("San Francisco", customers.get(4815).getCity());
	}

	@Test
	@DisplayName("Record 4816: County is San Francisco")
	void CountyOfRecord4816() {
		assertEquals("San Francisco", customers.get(4815).getCounty());
	}

	@Test
	@DisplayName("Record 4816: State is CA")
	void StateOfRecord4816() {
		assertEquals("CA", customers.get(4815).getState());
	}

	@Test
	@DisplayName("Record 4816: ZIP is 94105")
	void ZIPOfRecord4816() {
		assertEquals("94105", customers.get(4815).getZIP());
	}

	@Test
	@DisplayName("Record 4816: Phone is 415-904-7125")
	void PhoneOfRecord4816() {
		assertEquals("415-904-7125", customers.get(4815).getPhone());
	}

	@Test
	@DisplayName("Record 4816: Fax is 415-904-0269")
	void FaxOfRecord4816() {
		assertEquals("415-904-0269", customers.get(4815).getFax());
	}

	@Test
	@DisplayName("Record 4816: Email is cristobal@brasier.com")
	void EmailOfRecord4816() {
		assertEquals("cristobal@brasier.com", customers.get(4815).getEmail());
	}

	@Test
	@DisplayName("Record 4816: Web is http://www.cristobalbrasier.com")
	void WebOfRecord4816() {
		assertEquals("http://www.cristobalbrasier.com", customers.get(4815).getWeb());
	}
}
