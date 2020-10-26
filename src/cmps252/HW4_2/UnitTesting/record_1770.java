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

@Tag("5")
class Record_1770 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1770: FirstName is Abraham")
	void FirstNameOfRecord1770() {
		assertEquals("Abraham", customers.get(1769).getFirstName());
	}

	@Test
	@DisplayName("Record 1770: LastName is Arview")
	void LastNameOfRecord1770() {
		assertEquals("Arview", customers.get(1769).getLastName());
	}

	@Test
	@DisplayName("Record 1770: Company is French Baker Le")
	void CompanyOfRecord1770() {
		assertEquals("French Baker Le", customers.get(1769).getCompany());
	}

	@Test
	@DisplayName("Record 1770: Address is 4441 Nottingham Way")
	void AddressOfRecord1770() {
		assertEquals("4441 Nottingham Way", customers.get(1769).getAddress());
	}

	@Test
	@DisplayName("Record 1770: City is Trenton")
	void CityOfRecord1770() {
		assertEquals("Trenton", customers.get(1769).getCity());
	}

	@Test
	@DisplayName("Record 1770: County is Mercer")
	void CountyOfRecord1770() {
		assertEquals("Mercer", customers.get(1769).getCounty());
	}

	@Test
	@DisplayName("Record 1770: State is NJ")
	void StateOfRecord1770() {
		assertEquals("NJ", customers.get(1769).getState());
	}

	@Test
	@DisplayName("Record 1770: ZIP is 8690")
	void ZIPOfRecord1770() {
		assertEquals("8690", customers.get(1769).getZIP());
	}

	@Test
	@DisplayName("Record 1770: Phone is 609-890-4008")
	void PhoneOfRecord1770() {
		assertEquals("609-890-4008", customers.get(1769).getPhone());
	}

	@Test
	@DisplayName("Record 1770: Fax is 609-890-6446")
	void FaxOfRecord1770() {
		assertEquals("609-890-6446", customers.get(1769).getFax());
	}

	@Test
	@DisplayName("Record 1770: Email is abraham@arview.com")
	void EmailOfRecord1770() {
		assertEquals("abraham@arview.com", customers.get(1769).getEmail());
	}

	@Test
	@DisplayName("Record 1770: Web is http://www.abrahamarview.com")
	void WebOfRecord1770() {
		assertEquals("http://www.abrahamarview.com", customers.get(1769).getWeb());
	}
}
