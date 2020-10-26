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

@Tag("9")
class Record_3403 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3403: FirstName is Hilary")
	void FirstNameOfRecord3403() {
		assertEquals("Hilary", customers.get(3402).getFirstName());
	}

	@Test
	@DisplayName("Record 3403: LastName is Goffman")
	void LastNameOfRecord3403() {
		assertEquals("Goffman", customers.get(3402).getLastName());
	}

	@Test
	@DisplayName("Record 3403: Company is Ebner, Margaret E Esq")
	void CompanyOfRecord3403() {
		assertEquals("Ebner, Margaret E Esq", customers.get(3402).getCompany());
	}

	@Test
	@DisplayName("Record 3403: Address is 105 Morse Rd")
	void AddressOfRecord3403() {
		assertEquals("105 Morse Rd", customers.get(3402).getAddress());
	}

	@Test
	@DisplayName("Record 3403: City is Bennington")
	void CityOfRecord3403() {
		assertEquals("Bennington", customers.get(3402).getCity());
	}

	@Test
	@DisplayName("Record 3403: County is Bennington")
	void CountyOfRecord3403() {
		assertEquals("Bennington", customers.get(3402).getCounty());
	}

	@Test
	@DisplayName("Record 3403: State is VT")
	void StateOfRecord3403() {
		assertEquals("VT", customers.get(3402).getState());
	}

	@Test
	@DisplayName("Record 3403: ZIP is 5201")
	void ZIPOfRecord3403() {
		assertEquals("5201", customers.get(3402).getZIP());
	}

	@Test
	@DisplayName("Record 3403: Phone is 802-442-3314")
	void PhoneOfRecord3403() {
		assertEquals("802-442-3314", customers.get(3402).getPhone());
	}

	@Test
	@DisplayName("Record 3403: Fax is 802-442-7806")
	void FaxOfRecord3403() {
		assertEquals("802-442-7806", customers.get(3402).getFax());
	}

	@Test
	@DisplayName("Record 3403: Email is hilary@goffman.com")
	void EmailOfRecord3403() {
		assertEquals("hilary@goffman.com", customers.get(3402).getEmail());
	}

	@Test
	@DisplayName("Record 3403: Web is http://www.hilarygoffman.com")
	void WebOfRecord3403() {
		assertEquals("http://www.hilarygoffman.com", customers.get(3402).getWeb());
	}
}
