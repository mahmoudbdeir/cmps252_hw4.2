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
class Record_3342 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3342: FirstName is Gertrude")
	void FirstNameOfRecord3342() {
		assertEquals("Gertrude", customers.get(3341).getFirstName());
	}

	@Test
	@DisplayName("Record 3342: LastName is Heschke")
	void LastNameOfRecord3342() {
		assertEquals("Heschke", customers.get(3341).getLastName());
	}

	@Test
	@DisplayName("Record 3342: Company is Four M Manufacturing Group")
	void CompanyOfRecord3342() {
		assertEquals("Four M Manufacturing Group", customers.get(3341).getCompany());
	}

	@Test
	@DisplayName("Record 3342: Address is 7640 Gloria Ave")
	void AddressOfRecord3342() {
		assertEquals("7640 Gloria Ave", customers.get(3341).getAddress());
	}

	@Test
	@DisplayName("Record 3342: City is Van Nuys")
	void CityOfRecord3342() {
		assertEquals("Van Nuys", customers.get(3341).getCity());
	}

	@Test
	@DisplayName("Record 3342: County is Los Angeles")
	void CountyOfRecord3342() {
		assertEquals("Los Angeles", customers.get(3341).getCounty());
	}

	@Test
	@DisplayName("Record 3342: State is CA")
	void StateOfRecord3342() {
		assertEquals("CA", customers.get(3341).getState());
	}

	@Test
	@DisplayName("Record 3342: ZIP is 91406")
	void ZIPOfRecord3342() {
		assertEquals("91406", customers.get(3341).getZIP());
	}

	@Test
	@DisplayName("Record 3342: Phone is 818-787-7079")
	void PhoneOfRecord3342() {
		assertEquals("818-787-7079", customers.get(3341).getPhone());
	}

	@Test
	@DisplayName("Record 3342: Fax is 818-787-4687")
	void FaxOfRecord3342() {
		assertEquals("818-787-4687", customers.get(3341).getFax());
	}

	@Test
	@DisplayName("Record 3342: Email is gertrude@heschke.com")
	void EmailOfRecord3342() {
		assertEquals("gertrude@heschke.com", customers.get(3341).getEmail());
	}

	@Test
	@DisplayName("Record 3342: Web is http://www.gertrudeheschke.com")
	void WebOfRecord3342() {
		assertEquals("http://www.gertrudeheschke.com", customers.get(3341).getWeb());
	}
}
