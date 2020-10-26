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

@Tag("7")
class Record_108 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 108: FirstName is Mina")
	void FirstNameOfRecord108() {
		assertEquals("Mina", customers.get(107).getFirstName());
	}

	@Test
	@DisplayName("Record 108: LastName is Treat")
	void LastNameOfRecord108() {
		assertEquals("Treat", customers.get(107).getLastName());
	}

	@Test
	@DisplayName("Record 108: Company is Gregite, Craig L Md")
	void CompanyOfRecord108() {
		assertEquals("Gregite, Craig L Md", customers.get(107).getCompany());
	}

	@Test
	@DisplayName("Record 108: Address is 8299 21st Ave")
	void AddressOfRecord108() {
		assertEquals("8299 21st Ave", customers.get(107).getAddress());
	}

	@Test
	@DisplayName("Record 108: City is Sacramento")
	void CityOfRecord108() {
		assertEquals("Sacramento", customers.get(107).getCity());
	}

	@Test
	@DisplayName("Record 108: County is Sacramento")
	void CountyOfRecord108() {
		assertEquals("Sacramento", customers.get(107).getCounty());
	}

	@Test
	@DisplayName("Record 108: State is CA")
	void StateOfRecord108() {
		assertEquals("CA", customers.get(107).getState());
	}

	@Test
	@DisplayName("Record 108: ZIP is 95826")
	void ZIPOfRecord108() {
		assertEquals("95826", customers.get(107).getZIP());
	}

	@Test
	@DisplayName("Record 108: Phone is 916-452-7698")
	void PhoneOfRecord108() {
		assertEquals("916-452-7698", customers.get(107).getPhone());
	}

	@Test
	@DisplayName("Record 108: Fax is 916-452-1967")
	void FaxOfRecord108() {
		assertEquals("916-452-1967", customers.get(107).getFax());
	}

	@Test
	@DisplayName("Record 108: Email is mina@treat.com")
	void EmailOfRecord108() {
		assertEquals("mina@treat.com", customers.get(107).getEmail());
	}

	@Test
	@DisplayName("Record 108: Web is http://www.minatreat.com")
	void WebOfRecord108() {
		assertEquals("http://www.minatreat.com", customers.get(107).getWeb());
	}
}
