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

@Tag("14")
class Record_560 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 560: FirstName is Morton")
	void FirstNameOfRecord560() {
		assertEquals("Morton", customers.get(559).getFirstName());
	}

	@Test
	@DisplayName("Record 560: LastName is Naish")
	void LastNameOfRecord560() {
		assertEquals("Naish", customers.get(559).getLastName());
	}

	@Test
	@DisplayName("Record 560: Company is Apertus Technologies Inc")
	void CompanyOfRecord560() {
		assertEquals("Apertus Technologies Inc", customers.get(559).getCompany());
	}

	@Test
	@DisplayName("Record 560: Address is Rt 19s S")
	void AddressOfRecord560() {
		assertEquals("Rt 19s S", customers.get(559).getAddress());
	}

	@Test
	@DisplayName("Record 560: City is Clarksburg")
	void CityOfRecord560() {
		assertEquals("Clarksburg", customers.get(559).getCity());
	}

	@Test
	@DisplayName("Record 560: County is Harrison")
	void CountyOfRecord560() {
		assertEquals("Harrison", customers.get(559).getCounty());
	}

	@Test
	@DisplayName("Record 560: State is WV")
	void StateOfRecord560() {
		assertEquals("WV", customers.get(559).getState());
	}

	@Test
	@DisplayName("Record 560: ZIP is 26301")
	void ZIPOfRecord560() {
		assertEquals("26301", customers.get(559).getZIP());
	}

	@Test
	@DisplayName("Record 560: Phone is 304-622-5985")
	void PhoneOfRecord560() {
		assertEquals("304-622-5985", customers.get(559).getPhone());
	}

	@Test
	@DisplayName("Record 560: Fax is 304-622-8153")
	void FaxOfRecord560() {
		assertEquals("304-622-8153", customers.get(559).getFax());
	}

	@Test
	@DisplayName("Record 560: Email is morton@naish.com")
	void EmailOfRecord560() {
		assertEquals("morton@naish.com", customers.get(559).getEmail());
	}

	@Test
	@DisplayName("Record 560: Web is http://www.mortonnaish.com")
	void WebOfRecord560() {
		assertEquals("http://www.mortonnaish.com", customers.get(559).getWeb());
	}
}
