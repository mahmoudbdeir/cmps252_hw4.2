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

@Tag("41")
class Record_2854 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2854: FirstName is Roy")
	void FirstNameOfRecord2854() {
		assertEquals("Roy", customers.get(2853).getFirstName());
	}

	@Test
	@DisplayName("Record 2854: LastName is Tellado")
	void LastNameOfRecord2854() {
		assertEquals("Tellado", customers.get(2853).getLastName());
	}

	@Test
	@DisplayName("Record 2854: Company is Hallgren Co")
	void CompanyOfRecord2854() {
		assertEquals("Hallgren Co", customers.get(2853).getCompany());
	}

	@Test
	@DisplayName("Record 2854: Address is 2401 Columbia Pike")
	void AddressOfRecord2854() {
		assertEquals("2401 Columbia Pike", customers.get(2853).getAddress());
	}

	@Test
	@DisplayName("Record 2854: City is Arlington")
	void CityOfRecord2854() {
		assertEquals("Arlington", customers.get(2853).getCity());
	}

	@Test
	@DisplayName("Record 2854: County is Arlington")
	void CountyOfRecord2854() {
		assertEquals("Arlington", customers.get(2853).getCounty());
	}

	@Test
	@DisplayName("Record 2854: State is VA")
	void StateOfRecord2854() {
		assertEquals("VA", customers.get(2853).getState());
	}

	@Test
	@DisplayName("Record 2854: ZIP is 22204")
	void ZIPOfRecord2854() {
		assertEquals("22204", customers.get(2853).getZIP());
	}

	@Test
	@DisplayName("Record 2854: Phone is 703-685-4656")
	void PhoneOfRecord2854() {
		assertEquals("703-685-4656", customers.get(2853).getPhone());
	}

	@Test
	@DisplayName("Record 2854: Fax is 703-685-0966")
	void FaxOfRecord2854() {
		assertEquals("703-685-0966", customers.get(2853).getFax());
	}

	@Test
	@DisplayName("Record 2854: Email is roy@tellado.com")
	void EmailOfRecord2854() {
		assertEquals("roy@tellado.com", customers.get(2853).getEmail());
	}

	@Test
	@DisplayName("Record 2854: Web is http://www.roytellado.com")
	void WebOfRecord2854() {
		assertEquals("http://www.roytellado.com", customers.get(2853).getWeb());
	}
}
