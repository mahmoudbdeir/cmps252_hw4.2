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

@Tag("37")
class Record_2845 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2845: FirstName is Brain")
	void FirstNameOfRecord2845() {
		assertEquals("Brain", customers.get(2844).getFirstName());
	}

	@Test
	@DisplayName("Record 2845: LastName is Olien")
	void LastNameOfRecord2845() {
		assertEquals("Olien", customers.get(2844).getLastName());
	}

	@Test
	@DisplayName("Record 2845: Company is Salzman, Leo Esq")
	void CompanyOfRecord2845() {
		assertEquals("Salzman, Leo Esq", customers.get(2844).getCompany());
	}

	@Test
	@DisplayName("Record 2845: Address is 1045 Pepitone Ave")
	void AddressOfRecord2845() {
		assertEquals("1045 Pepitone Ave", customers.get(2844).getAddress());
	}

	@Test
	@DisplayName("Record 2845: City is San Jose")
	void CityOfRecord2845() {
		assertEquals("San Jose", customers.get(2844).getCity());
	}

	@Test
	@DisplayName("Record 2845: County is Santa Clara")
	void CountyOfRecord2845() {
		assertEquals("Santa Clara", customers.get(2844).getCounty());
	}

	@Test
	@DisplayName("Record 2845: State is CA")
	void StateOfRecord2845() {
		assertEquals("CA", customers.get(2844).getState());
	}

	@Test
	@DisplayName("Record 2845: ZIP is 95110")
	void ZIPOfRecord2845() {
		assertEquals("95110", customers.get(2844).getZIP());
	}

	@Test
	@DisplayName("Record 2845: Phone is 408-295-9049")
	void PhoneOfRecord2845() {
		assertEquals("408-295-9049", customers.get(2844).getPhone());
	}

	@Test
	@DisplayName("Record 2845: Fax is 408-295-3335")
	void FaxOfRecord2845() {
		assertEquals("408-295-3335", customers.get(2844).getFax());
	}

	@Test
	@DisplayName("Record 2845: Email is brain@olien.com")
	void EmailOfRecord2845() {
		assertEquals("brain@olien.com", customers.get(2844).getEmail());
	}

	@Test
	@DisplayName("Record 2845: Web is http://www.brainolien.com")
	void WebOfRecord2845() {
		assertEquals("http://www.brainolien.com", customers.get(2844).getWeb());
	}
}
