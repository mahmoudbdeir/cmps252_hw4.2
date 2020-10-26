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

@Tag("41")
class Record_4545 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4545: FirstName is Harvey")
	void FirstNameOfRecord4545() {
		assertEquals("Harvey", customers.get(4544).getFirstName());
	}

	@Test
	@DisplayName("Record 4545: LastName is Pressimone")
	void LastNameOfRecord4545() {
		assertEquals("Pressimone", customers.get(4544).getLastName());
	}

	@Test
	@DisplayName("Record 4545: Company is Janes, William Esq")
	void CompanyOfRecord4545() {
		assertEquals("Janes, William Esq", customers.get(4544).getCompany());
	}

	@Test
	@DisplayName("Record 4545: Address is 16 Flagg Pl")
	void AddressOfRecord4545() {
		assertEquals("16 Flagg Pl", customers.get(4544).getAddress());
	}

	@Test
	@DisplayName("Record 4545: City is Staten Island")
	void CityOfRecord4545() {
		assertEquals("Staten Island", customers.get(4544).getCity());
	}

	@Test
	@DisplayName("Record 4545: County is Richmond")
	void CountyOfRecord4545() {
		assertEquals("Richmond", customers.get(4544).getCounty());
	}

	@Test
	@DisplayName("Record 4545: State is NY")
	void StateOfRecord4545() {
		assertEquals("NY", customers.get(4544).getState());
	}

	@Test
	@DisplayName("Record 4545: ZIP is 10304")
	void ZIPOfRecord4545() {
		assertEquals("10304", customers.get(4544).getZIP());
	}

	@Test
	@DisplayName("Record 4545: Phone is 718-967-7094")
	void PhoneOfRecord4545() {
		assertEquals("718-967-7094", customers.get(4544).getPhone());
	}

	@Test
	@DisplayName("Record 4545: Fax is 718-967-3849")
	void FaxOfRecord4545() {
		assertEquals("718-967-3849", customers.get(4544).getFax());
	}

	@Test
	@DisplayName("Record 4545: Email is harvey@pressimone.com")
	void EmailOfRecord4545() {
		assertEquals("harvey@pressimone.com", customers.get(4544).getEmail());
	}

	@Test
	@DisplayName("Record 4545: Web is http://www.harveypressimone.com")
	void WebOfRecord4545() {
		assertEquals("http://www.harveypressimone.com", customers.get(4544).getWeb());
	}
}
