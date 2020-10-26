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
class Record_1862 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1862: FirstName is Jerrod")
	void FirstNameOfRecord1862() {
		assertEquals("Jerrod", customers.get(1861).getFirstName());
	}

	@Test
	@DisplayName("Record 1862: LastName is Heydt")
	void LastNameOfRecord1862() {
		assertEquals("Heydt", customers.get(1861).getLastName());
	}

	@Test
	@DisplayName("Record 1862: Company is Dean Mead Spielvogel Goldman")
	void CompanyOfRecord1862() {
		assertEquals("Dean Mead Spielvogel Goldman", customers.get(1861).getCompany());
	}

	@Test
	@DisplayName("Record 1862: Address is 173 Water St")
	void AddressOfRecord1862() {
		assertEquals("173 Water St", customers.get(1861).getAddress());
	}

	@Test
	@DisplayName("Record 1862: City is Bridgeton")
	void CityOfRecord1862() {
		assertEquals("Bridgeton", customers.get(1861).getCity());
	}

	@Test
	@DisplayName("Record 1862: County is Cumberland")
	void CountyOfRecord1862() {
		assertEquals("Cumberland", customers.get(1861).getCounty());
	}

	@Test
	@DisplayName("Record 1862: State is NJ")
	void StateOfRecord1862() {
		assertEquals("NJ", customers.get(1861).getState());
	}

	@Test
	@DisplayName("Record 1862: ZIP is 8302")
	void ZIPOfRecord1862() {
		assertEquals("8302", customers.get(1861).getZIP());
	}

	@Test
	@DisplayName("Record 1862: Phone is 856-451-6636")
	void PhoneOfRecord1862() {
		assertEquals("856-451-6636", customers.get(1861).getPhone());
	}

	@Test
	@DisplayName("Record 1862: Fax is 856-451-1638")
	void FaxOfRecord1862() {
		assertEquals("856-451-1638", customers.get(1861).getFax());
	}

	@Test
	@DisplayName("Record 1862: Email is jerrod@heydt.com")
	void EmailOfRecord1862() {
		assertEquals("jerrod@heydt.com", customers.get(1861).getEmail());
	}

	@Test
	@DisplayName("Record 1862: Web is http://www.jerrodheydt.com")
	void WebOfRecord1862() {
		assertEquals("http://www.jerrodheydt.com", customers.get(1861).getWeb());
	}
}
