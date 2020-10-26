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

@Tag("35")
class Record_136 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 136: FirstName is Hattie")
	void FirstNameOfRecord136() {
		assertEquals("Hattie", customers.get(135).getFirstName());
	}

	@Test
	@DisplayName("Record 136: LastName is Wasco")
	void LastNameOfRecord136() {
		assertEquals("Wasco", customers.get(135).getLastName());
	}

	@Test
	@DisplayName("Record 136: Company is Shoham, Charles Md")
	void CompanyOfRecord136() {
		assertEquals("Shoham, Charles Md", customers.get(135).getCompany());
	}

	@Test
	@DisplayName("Record 136: Address is 528 North St")
	void AddressOfRecord136() {
		assertEquals("528 North St", customers.get(135).getAddress());
	}

	@Test
	@DisplayName("Record 136: City is Stratford")
	void CityOfRecord136() {
		assertEquals("Stratford", customers.get(135).getCity());
	}

	@Test
	@DisplayName("Record 136: County is Marathon")
	void CountyOfRecord136() {
		assertEquals("Marathon", customers.get(135).getCounty());
	}

	@Test
	@DisplayName("Record 136: State is WI")
	void StateOfRecord136() {
		assertEquals("WI", customers.get(135).getState());
	}

	@Test
	@DisplayName("Record 136: ZIP is 54484")
	void ZIPOfRecord136() {
		assertEquals("54484", customers.get(135).getZIP());
	}

	@Test
	@DisplayName("Record 136: Phone is 715-687-6769")
	void PhoneOfRecord136() {
		assertEquals("715-687-6769", customers.get(135).getPhone());
	}

	@Test
	@DisplayName("Record 136: Fax is 715-687-6692")
	void FaxOfRecord136() {
		assertEquals("715-687-6692", customers.get(135).getFax());
	}

	@Test
	@DisplayName("Record 136: Email is hattie@wasco.com")
	void EmailOfRecord136() {
		assertEquals("hattie@wasco.com", customers.get(135).getEmail());
	}

	@Test
	@DisplayName("Record 136: Web is http://www.hattiewasco.com")
	void WebOfRecord136() {
		assertEquals("http://www.hattiewasco.com", customers.get(135).getWeb());
	}
}
