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

@Tag("29")
class Record_2163 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2163: FirstName is Tristan")
	void FirstNameOfRecord2163() {
		assertEquals("Tristan", customers.get(2162).getFirstName());
	}

	@Test
	@DisplayName("Record 2163: LastName is Philabeam")
	void LastNameOfRecord2163() {
		assertEquals("Philabeam", customers.get(2162).getLastName());
	}

	@Test
	@DisplayName("Record 2163: Company is Portman, Eugene Esq")
	void CompanyOfRecord2163() {
		assertEquals("Portman, Eugene Esq", customers.get(2162).getCompany());
	}

	@Test
	@DisplayName("Record 2163: Address is 6505 11th Ave")
	void AddressOfRecord2163() {
		assertEquals("6505 11th Ave", customers.get(2162).getAddress());
	}

	@Test
	@DisplayName("Record 2163: City is Brooklyn")
	void CityOfRecord2163() {
		assertEquals("Brooklyn", customers.get(2162).getCity());
	}

	@Test
	@DisplayName("Record 2163: County is Kings")
	void CountyOfRecord2163() {
		assertEquals("Kings", customers.get(2162).getCounty());
	}

	@Test
	@DisplayName("Record 2163: State is NY")
	void StateOfRecord2163() {
		assertEquals("NY", customers.get(2162).getState());
	}

	@Test
	@DisplayName("Record 2163: ZIP is 11219")
	void ZIPOfRecord2163() {
		assertEquals("11219", customers.get(2162).getZIP());
	}

	@Test
	@DisplayName("Record 2163: Phone is 718-236-3992")
	void PhoneOfRecord2163() {
		assertEquals("718-236-3992", customers.get(2162).getPhone());
	}

	@Test
	@DisplayName("Record 2163: Fax is 718-236-2551")
	void FaxOfRecord2163() {
		assertEquals("718-236-2551", customers.get(2162).getFax());
	}

	@Test
	@DisplayName("Record 2163: Email is tristan@philabeam.com")
	void EmailOfRecord2163() {
		assertEquals("tristan@philabeam.com", customers.get(2162).getEmail());
	}

	@Test
	@DisplayName("Record 2163: Web is http://www.tristanphilabeam.com")
	void WebOfRecord2163() {
		assertEquals("http://www.tristanphilabeam.com", customers.get(2162).getWeb());
	}
}
