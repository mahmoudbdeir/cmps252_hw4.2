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
class Record_3459 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3459: FirstName is Rosalyn")
	void FirstNameOfRecord3459() {
		assertEquals("Rosalyn", customers.get(3458).getFirstName());
	}

	@Test
	@DisplayName("Record 3459: LastName is Cianfrani")
	void LastNameOfRecord3459() {
		assertEquals("Cianfrani", customers.get(3458).getLastName());
	}

	@Test
	@DisplayName("Record 3459: Company is Bancker & Kreul Sc")
	void CompanyOfRecord3459() {
		assertEquals("Bancker & Kreul Sc", customers.get(3458).getCompany());
	}

	@Test
	@DisplayName("Record 3459: Address is 1 Justice Sq")
	void AddressOfRecord3459() {
		assertEquals("1 Justice Sq", customers.get(3458).getAddress());
	}

	@Test
	@DisplayName("Record 3459: City is Rutland")
	void CityOfRecord3459() {
		assertEquals("Rutland", customers.get(3458).getCity());
	}

	@Test
	@DisplayName("Record 3459: County is Rutland")
	void CountyOfRecord3459() {
		assertEquals("Rutland", customers.get(3458).getCounty());
	}

	@Test
	@DisplayName("Record 3459: State is VT")
	void StateOfRecord3459() {
		assertEquals("VT", customers.get(3458).getState());
	}

	@Test
	@DisplayName("Record 3459: ZIP is 5701")
	void ZIPOfRecord3459() {
		assertEquals("5701", customers.get(3458).getZIP());
	}

	@Test
	@DisplayName("Record 3459: Phone is 802-775-7446")
	void PhoneOfRecord3459() {
		assertEquals("802-775-7446", customers.get(3458).getPhone());
	}

	@Test
	@DisplayName("Record 3459: Fax is 802-775-6082")
	void FaxOfRecord3459() {
		assertEquals("802-775-6082", customers.get(3458).getFax());
	}

	@Test
	@DisplayName("Record 3459: Email is rosalyn@cianfrani.com")
	void EmailOfRecord3459() {
		assertEquals("rosalyn@cianfrani.com", customers.get(3458).getEmail());
	}

	@Test
	@DisplayName("Record 3459: Web is http://www.rosalyncianfrani.com")
	void WebOfRecord3459() {
		assertEquals("http://www.rosalyncianfrani.com", customers.get(3458).getWeb());
	}
}
