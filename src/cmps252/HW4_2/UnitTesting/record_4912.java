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

@Tag("43")
class Record_4912 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4912: FirstName is Norbert")
	void FirstNameOfRecord4912() {
		assertEquals("Norbert", customers.get(4911).getFirstName());
	}

	@Test
	@DisplayName("Record 4912: LastName is Girad")
	void LastNameOfRecord4912() {
		assertEquals("Girad", customers.get(4911).getLastName());
	}

	@Test
	@DisplayName("Record 4912: Company is Sports & Specialists Cars Inc")
	void CompanyOfRecord4912() {
		assertEquals("Sports & Specialists Cars Inc", customers.get(4911).getCompany());
	}

	@Test
	@DisplayName("Record 4912: Address is 3865 Clover Valley Rd")
	void AddressOfRecord4912() {
		assertEquals("3865 Clover Valley Rd", customers.get(4911).getAddress());
	}

	@Test
	@DisplayName("Record 4912: City is Rocklin")
	void CityOfRecord4912() {
		assertEquals("Rocklin", customers.get(4911).getCity());
	}

	@Test
	@DisplayName("Record 4912: County is Placer")
	void CountyOfRecord4912() {
		assertEquals("Placer", customers.get(4911).getCounty());
	}

	@Test
	@DisplayName("Record 4912: State is CA")
	void StateOfRecord4912() {
		assertEquals("CA", customers.get(4911).getState());
	}

	@Test
	@DisplayName("Record 4912: ZIP is 95677")
	void ZIPOfRecord4912() {
		assertEquals("95677", customers.get(4911).getZIP());
	}

	@Test
	@DisplayName("Record 4912: Phone is 916-624-8245")
	void PhoneOfRecord4912() {
		assertEquals("916-624-8245", customers.get(4911).getPhone());
	}

	@Test
	@DisplayName("Record 4912: Fax is 916-624-1168")
	void FaxOfRecord4912() {
		assertEquals("916-624-1168", customers.get(4911).getFax());
	}

	@Test
	@DisplayName("Record 4912: Email is norbert@girad.com")
	void EmailOfRecord4912() {
		assertEquals("norbert@girad.com", customers.get(4911).getEmail());
	}

	@Test
	@DisplayName("Record 4912: Web is http://www.norbertgirad.com")
	void WebOfRecord4912() {
		assertEquals("http://www.norbertgirad.com", customers.get(4911).getWeb());
	}
}
