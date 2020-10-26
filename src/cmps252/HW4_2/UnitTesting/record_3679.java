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

@Tag("34")
class Record_3679 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3679: FirstName is Wyatt")
	void FirstNameOfRecord3679() {
		assertEquals("Wyatt", customers.get(3678).getFirstName());
	}

	@Test
	@DisplayName("Record 3679: LastName is Tribby")
	void LastNameOfRecord3679() {
		assertEquals("Tribby", customers.get(3678).getLastName());
	}

	@Test
	@DisplayName("Record 3679: Company is Complete Office Systems")
	void CompanyOfRecord3679() {
		assertEquals("Complete Office Systems", customers.get(3678).getCompany());
	}

	@Test
	@DisplayName("Record 3679: Address is 20625 Enterprise Ave")
	void AddressOfRecord3679() {
		assertEquals("20625 Enterprise Ave", customers.get(3678).getAddress());
	}

	@Test
	@DisplayName("Record 3679: City is Brookfield")
	void CityOfRecord3679() {
		assertEquals("Brookfield", customers.get(3678).getCity());
	}

	@Test
	@DisplayName("Record 3679: County is Waukesha")
	void CountyOfRecord3679() {
		assertEquals("Waukesha", customers.get(3678).getCounty());
	}

	@Test
	@DisplayName("Record 3679: State is WI")
	void StateOfRecord3679() {
		assertEquals("WI", customers.get(3678).getState());
	}

	@Test
	@DisplayName("Record 3679: ZIP is 53045")
	void ZIPOfRecord3679() {
		assertEquals("53045", customers.get(3678).getZIP());
	}

	@Test
	@DisplayName("Record 3679: Phone is 262-789-6934")
	void PhoneOfRecord3679() {
		assertEquals("262-789-6934", customers.get(3678).getPhone());
	}

	@Test
	@DisplayName("Record 3679: Fax is 262-789-4724")
	void FaxOfRecord3679() {
		assertEquals("262-789-4724", customers.get(3678).getFax());
	}

	@Test
	@DisplayName("Record 3679: Email is wyatt@tribby.com")
	void EmailOfRecord3679() {
		assertEquals("wyatt@tribby.com", customers.get(3678).getEmail());
	}

	@Test
	@DisplayName("Record 3679: Web is http://www.wyatttribby.com")
	void WebOfRecord3679() {
		assertEquals("http://www.wyatttribby.com", customers.get(3678).getWeb());
	}
}
