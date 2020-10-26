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

@Tag("42")
class Record_645 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 645: FirstName is Stanford")
	void FirstNameOfRecord645() {
		assertEquals("Stanford", customers.get(644).getFirstName());
	}

	@Test
	@DisplayName("Record 645: LastName is Ostling")
	void LastNameOfRecord645() {
		assertEquals("Ostling", customers.get(644).getLastName());
	}

	@Test
	@DisplayName("Record 645: Company is Keppler, Peter Esq")
	void CompanyOfRecord645() {
		assertEquals("Keppler, Peter Esq", customers.get(644).getCompany());
	}

	@Test
	@DisplayName("Record 645: Address is 3 Hawk Ct")
	void AddressOfRecord645() {
		assertEquals("3 Hawk Ct", customers.get(644).getAddress());
	}

	@Test
	@DisplayName("Record 645: City is Bridgeport")
	void CityOfRecord645() {
		assertEquals("Bridgeport", customers.get(644).getCity());
	}

	@Test
	@DisplayName("Record 645: County is Gloucester")
	void CountyOfRecord645() {
		assertEquals("Gloucester", customers.get(644).getCounty());
	}

	@Test
	@DisplayName("Record 645: State is NJ")
	void StateOfRecord645() {
		assertEquals("NJ", customers.get(644).getState());
	}

	@Test
	@DisplayName("Record 645: ZIP is 8014")
	void ZIPOfRecord645() {
		assertEquals("8014", customers.get(644).getZIP());
	}

	@Test
	@DisplayName("Record 645: Phone is 856-467-9438")
	void PhoneOfRecord645() {
		assertEquals("856-467-9438", customers.get(644).getPhone());
	}

	@Test
	@DisplayName("Record 645: Fax is 856-467-5598")
	void FaxOfRecord645() {
		assertEquals("856-467-5598", customers.get(644).getFax());
	}

	@Test
	@DisplayName("Record 645: Email is stanford@ostling.com")
	void EmailOfRecord645() {
		assertEquals("stanford@ostling.com", customers.get(644).getEmail());
	}

	@Test
	@DisplayName("Record 645: Web is http://www.stanfordostling.com")
	void WebOfRecord645() {
		assertEquals("http://www.stanfordostling.com", customers.get(644).getWeb());
	}
}
