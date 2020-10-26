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

@Tag("21")
class Record_2717 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2717: FirstName is Owen")
	void FirstNameOfRecord2717() {
		assertEquals("Owen", customers.get(2716).getFirstName());
	}

	@Test
	@DisplayName("Record 2717: LastName is Branan")
	void LastNameOfRecord2717() {
		assertEquals("Branan", customers.get(2716).getLastName());
	}

	@Test
	@DisplayName("Record 2717: Company is Sylvania Metl Detector & Coin")
	void CompanyOfRecord2717() {
		assertEquals("Sylvania Metl Detector & Coin", customers.get(2716).getCompany());
	}

	@Test
	@DisplayName("Record 2717: Address is 4280 Latham St")
	void AddressOfRecord2717() {
		assertEquals("4280 Latham St", customers.get(2716).getAddress());
	}

	@Test
	@DisplayName("Record 2717: City is Riverside")
	void CityOfRecord2717() {
		assertEquals("Riverside", customers.get(2716).getCity());
	}

	@Test
	@DisplayName("Record 2717: County is Riverside")
	void CountyOfRecord2717() {
		assertEquals("Riverside", customers.get(2716).getCounty());
	}

	@Test
	@DisplayName("Record 2717: State is CA")
	void StateOfRecord2717() {
		assertEquals("CA", customers.get(2716).getState());
	}

	@Test
	@DisplayName("Record 2717: ZIP is 92501")
	void ZIPOfRecord2717() {
		assertEquals("92501", customers.get(2716).getZIP());
	}

	@Test
	@DisplayName("Record 2717: Phone is 951-782-6074")
	void PhoneOfRecord2717() {
		assertEquals("951-782-6074", customers.get(2716).getPhone());
	}

	@Test
	@DisplayName("Record 2717: Fax is 951-782-6638")
	void FaxOfRecord2717() {
		assertEquals("951-782-6638", customers.get(2716).getFax());
	}

	@Test
	@DisplayName("Record 2717: Email is owen@branan.com")
	void EmailOfRecord2717() {
		assertEquals("owen@branan.com", customers.get(2716).getEmail());
	}

	@Test
	@DisplayName("Record 2717: Web is http://www.owenbranan.com")
	void WebOfRecord2717() {
		assertEquals("http://www.owenbranan.com", customers.get(2716).getWeb());
	}
}
