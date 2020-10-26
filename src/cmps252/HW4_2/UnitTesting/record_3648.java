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

@Tag("33")
class Record_3648 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3648: FirstName is Dawn")
	void FirstNameOfRecord3648() {
		assertEquals("Dawn", customers.get(3647).getFirstName());
	}

	@Test
	@DisplayName("Record 3648: LastName is Hean")
	void LastNameOfRecord3648() {
		assertEquals("Hean", customers.get(3647).getLastName());
	}

	@Test
	@DisplayName("Record 3648: Company is Robinson, Deborah J Esq")
	void CompanyOfRecord3648() {
		assertEquals("Robinson, Deborah J Esq", customers.get(3647).getCompany());
	}

	@Test
	@DisplayName("Record 3648: Address is 101 E Holly Ave")
	void AddressOfRecord3648() {
		assertEquals("101 E Holly Ave", customers.get(3647).getAddress());
	}

	@Test
	@DisplayName("Record 3648: City is Sterling")
	void CityOfRecord3648() {
		assertEquals("Sterling", customers.get(3647).getCity());
	}

	@Test
	@DisplayName("Record 3648: County is Loudoun")
	void CountyOfRecord3648() {
		assertEquals("Loudoun", customers.get(3647).getCounty());
	}

	@Test
	@DisplayName("Record 3648: State is VA")
	void StateOfRecord3648() {
		assertEquals("VA", customers.get(3647).getState());
	}

	@Test
	@DisplayName("Record 3648: ZIP is 20164")
	void ZIPOfRecord3648() {
		assertEquals("20164", customers.get(3647).getZIP());
	}

	@Test
	@DisplayName("Record 3648: Phone is 703-406-2589")
	void PhoneOfRecord3648() {
		assertEquals("703-406-2589", customers.get(3647).getPhone());
	}

	@Test
	@DisplayName("Record 3648: Fax is 703-406-6029")
	void FaxOfRecord3648() {
		assertEquals("703-406-6029", customers.get(3647).getFax());
	}

	@Test
	@DisplayName("Record 3648: Email is dawn@hean.com")
	void EmailOfRecord3648() {
		assertEquals("dawn@hean.com", customers.get(3647).getEmail());
	}

	@Test
	@DisplayName("Record 3648: Web is http://www.dawnhean.com")
	void WebOfRecord3648() {
		assertEquals("http://www.dawnhean.com", customers.get(3647).getWeb());
	}
}
