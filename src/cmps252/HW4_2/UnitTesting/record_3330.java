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

@Tag("2")
class Record_3330 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3330: FirstName is Eunice")
	void FirstNameOfRecord3330() {
		assertEquals("Eunice", customers.get(3329).getFirstName());
	}

	@Test
	@DisplayName("Record 3330: LastName is Ocker")
	void LastNameOfRecord3330() {
		assertEquals("Ocker", customers.get(3329).getLastName());
	}

	@Test
	@DisplayName("Record 3330: Company is Accent Human Resource Spec")
	void CompanyOfRecord3330() {
		assertEquals("Accent Human Resource Spec", customers.get(3329).getCompany());
	}

	@Test
	@DisplayName("Record 3330: Address is 110 Stockton Ave")
	void AddressOfRecord3330() {
		assertEquals("110 Stockton Ave", customers.get(3329).getAddress());
	}

	@Test
	@DisplayName("Record 3330: City is San Jose")
	void CityOfRecord3330() {
		assertEquals("San Jose", customers.get(3329).getCity());
	}

	@Test
	@DisplayName("Record 3330: County is Santa Clara")
	void CountyOfRecord3330() {
		assertEquals("Santa Clara", customers.get(3329).getCounty());
	}

	@Test
	@DisplayName("Record 3330: State is CA")
	void StateOfRecord3330() {
		assertEquals("CA", customers.get(3329).getState());
	}

	@Test
	@DisplayName("Record 3330: ZIP is 95126")
	void ZIPOfRecord3330() {
		assertEquals("95126", customers.get(3329).getZIP());
	}

	@Test
	@DisplayName("Record 3330: Phone is 408-971-6768")
	void PhoneOfRecord3330() {
		assertEquals("408-971-6768", customers.get(3329).getPhone());
	}

	@Test
	@DisplayName("Record 3330: Fax is 408-971-4371")
	void FaxOfRecord3330() {
		assertEquals("408-971-4371", customers.get(3329).getFax());
	}

	@Test
	@DisplayName("Record 3330: Email is eunice@ocker.com")
	void EmailOfRecord3330() {
		assertEquals("eunice@ocker.com", customers.get(3329).getEmail());
	}

	@Test
	@DisplayName("Record 3330: Web is http://www.euniceocker.com")
	void WebOfRecord3330() {
		assertEquals("http://www.euniceocker.com", customers.get(3329).getWeb());
	}
}
