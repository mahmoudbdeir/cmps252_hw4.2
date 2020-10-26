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

@Tag("44")
class Record_982 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 982: FirstName is Dane")
	void FirstNameOfRecord982() {
		assertEquals("Dane", customers.get(981).getFirstName());
	}

	@Test
	@DisplayName("Record 982: LastName is Mohlke")
	void LastNameOfRecord982() {
		assertEquals("Mohlke", customers.get(981).getLastName());
	}

	@Test
	@DisplayName("Record 982: Company is Jacobsen, Andrea C Esq")
	void CompanyOfRecord982() {
		assertEquals("Jacobsen, Andrea C Esq", customers.get(981).getCompany());
	}

	@Test
	@DisplayName("Record 982: Address is 3872 Main St")
	void AddressOfRecord982() {
		assertEquals("3872 Main St", customers.get(981).getAddress());
	}

	@Test
	@DisplayName("Record 982: City is Bridgeport")
	void CityOfRecord982() {
		assertEquals("Bridgeport", customers.get(981).getCity());
	}

	@Test
	@DisplayName("Record 982: County is Fairfield")
	void CountyOfRecord982() {
		assertEquals("Fairfield", customers.get(981).getCounty());
	}

	@Test
	@DisplayName("Record 982: State is CT")
	void StateOfRecord982() {
		assertEquals("CT", customers.get(981).getState());
	}

	@Test
	@DisplayName("Record 982: ZIP is 6606")
	void ZIPOfRecord982() {
		assertEquals("6606", customers.get(981).getZIP());
	}

	@Test
	@DisplayName("Record 982: Phone is 203-374-3799")
	void PhoneOfRecord982() {
		assertEquals("203-374-3799", customers.get(981).getPhone());
	}

	@Test
	@DisplayName("Record 982: Fax is 203-374-3549")
	void FaxOfRecord982() {
		assertEquals("203-374-3549", customers.get(981).getFax());
	}

	@Test
	@DisplayName("Record 982: Email is dane@mohlke.com")
	void EmailOfRecord982() {
		assertEquals("dane@mohlke.com", customers.get(981).getEmail());
	}

	@Test
	@DisplayName("Record 982: Web is http://www.danemohlke.com")
	void WebOfRecord982() {
		assertEquals("http://www.danemohlke.com", customers.get(981).getWeb());
	}
}
