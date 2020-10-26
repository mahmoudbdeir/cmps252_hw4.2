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

@Tag("45")
class Record_3228 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3228: FirstName is Nicolas")
	void FirstNameOfRecord3228() {
		assertEquals("Nicolas", customers.get(3227).getFirstName());
	}

	@Test
	@DisplayName("Record 3228: LastName is Koziol")
	void LastNameOfRecord3228() {
		assertEquals("Koziol", customers.get(3227).getLastName());
	}

	@Test
	@DisplayName("Record 3228: Company is Wilson Trailer Company")
	void CompanyOfRecord3228() {
		assertEquals("Wilson Trailer Company", customers.get(3227).getCompany());
	}

	@Test
	@DisplayName("Record 3228: Address is 13 Meadow Ln")
	void AddressOfRecord3228() {
		assertEquals("13 Meadow Ln", customers.get(3227).getAddress());
	}

	@Test
	@DisplayName("Record 3228: City is Katonah")
	void CityOfRecord3228() {
		assertEquals("Katonah", customers.get(3227).getCity());
	}

	@Test
	@DisplayName("Record 3228: County is Westchester")
	void CountyOfRecord3228() {
		assertEquals("Westchester", customers.get(3227).getCounty());
	}

	@Test
	@DisplayName("Record 3228: State is NY")
	void StateOfRecord3228() {
		assertEquals("NY", customers.get(3227).getState());
	}

	@Test
	@DisplayName("Record 3228: ZIP is 10536")
	void ZIPOfRecord3228() {
		assertEquals("10536", customers.get(3227).getZIP());
	}

	@Test
	@DisplayName("Record 3228: Phone is 914-232-2742")
	void PhoneOfRecord3228() {
		assertEquals("914-232-2742", customers.get(3227).getPhone());
	}

	@Test
	@DisplayName("Record 3228: Fax is 914-232-8242")
	void FaxOfRecord3228() {
		assertEquals("914-232-8242", customers.get(3227).getFax());
	}

	@Test
	@DisplayName("Record 3228: Email is nicolas@koziol.com")
	void EmailOfRecord3228() {
		assertEquals("nicolas@koziol.com", customers.get(3227).getEmail());
	}

	@Test
	@DisplayName("Record 3228: Web is http://www.nicolaskoziol.com")
	void WebOfRecord3228() {
		assertEquals("http://www.nicolaskoziol.com", customers.get(3227).getWeb());
	}
}
