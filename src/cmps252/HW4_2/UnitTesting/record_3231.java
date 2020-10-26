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

@Tag("20")
class Record_3231 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3231: FirstName is Fred")
	void FirstNameOfRecord3231() {
		assertEquals("Fred", customers.get(3230).getFirstName());
	}

	@Test
	@DisplayName("Record 3231: LastName is Panganiban")
	void LastNameOfRecord3231() {
		assertEquals("Panganiban", customers.get(3230).getLastName());
	}

	@Test
	@DisplayName("Record 3231: Company is August Design")
	void CompanyOfRecord3231() {
		assertEquals("August Design", customers.get(3230).getCompany());
	}

	@Test
	@DisplayName("Record 3231: Address is 5333 White Ln  #-a")
	void AddressOfRecord3231() {
		assertEquals("5333 White Ln  #-a", customers.get(3230).getAddress());
	}

	@Test
	@DisplayName("Record 3231: City is Bakersfield")
	void CityOfRecord3231() {
		assertEquals("Bakersfield", customers.get(3230).getCity());
	}

	@Test
	@DisplayName("Record 3231: County is Kern")
	void CountyOfRecord3231() {
		assertEquals("Kern", customers.get(3230).getCounty());
	}

	@Test
	@DisplayName("Record 3231: State is CA")
	void StateOfRecord3231() {
		assertEquals("CA", customers.get(3230).getState());
	}

	@Test
	@DisplayName("Record 3231: ZIP is 93309")
	void ZIPOfRecord3231() {
		assertEquals("93309", customers.get(3230).getZIP());
	}

	@Test
	@DisplayName("Record 3231: Phone is 661-398-2035")
	void PhoneOfRecord3231() {
		assertEquals("661-398-2035", customers.get(3230).getPhone());
	}

	@Test
	@DisplayName("Record 3231: Fax is 661-398-6553")
	void FaxOfRecord3231() {
		assertEquals("661-398-6553", customers.get(3230).getFax());
	}

	@Test
	@DisplayName("Record 3231: Email is fred@panganiban.com")
	void EmailOfRecord3231() {
		assertEquals("fred@panganiban.com", customers.get(3230).getEmail());
	}

	@Test
	@DisplayName("Record 3231: Web is http://www.fredpanganiban.com")
	void WebOfRecord3231() {
		assertEquals("http://www.fredpanganiban.com", customers.get(3230).getWeb());
	}
}
