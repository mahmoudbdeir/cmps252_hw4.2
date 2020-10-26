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

@Tag("10")
class Record_2942 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2942: FirstName is Brooks")
	void FirstNameOfRecord2942() {
		assertEquals("Brooks", customers.get(2941).getFirstName());
	}

	@Test
	@DisplayName("Record 2942: LastName is Fourre")
	void LastNameOfRecord2942() {
		assertEquals("Fourre", customers.get(2941).getLastName());
	}

	@Test
	@DisplayName("Record 2942: Company is Filter Fresh")
	void CompanyOfRecord2942() {
		assertEquals("Filter Fresh", customers.get(2941).getCompany());
	}

	@Test
	@DisplayName("Record 2942: Address is 14050 Firestone Blvd")
	void AddressOfRecord2942() {
		assertEquals("14050 Firestone Blvd", customers.get(2941).getAddress());
	}

	@Test
	@DisplayName("Record 2942: City is Santa Fe Springs")
	void CityOfRecord2942() {
		assertEquals("Santa Fe Springs", customers.get(2941).getCity());
	}

	@Test
	@DisplayName("Record 2942: County is Los Angeles")
	void CountyOfRecord2942() {
		assertEquals("Los Angeles", customers.get(2941).getCounty());
	}

	@Test
	@DisplayName("Record 2942: State is CA")
	void StateOfRecord2942() {
		assertEquals("CA", customers.get(2941).getState());
	}

	@Test
	@DisplayName("Record 2942: ZIP is 90670")
	void ZIPOfRecord2942() {
		assertEquals("90670", customers.get(2941).getZIP());
	}

	@Test
	@DisplayName("Record 2942: Phone is 562-404-0671")
	void PhoneOfRecord2942() {
		assertEquals("562-404-0671", customers.get(2941).getPhone());
	}

	@Test
	@DisplayName("Record 2942: Fax is 562-404-1904")
	void FaxOfRecord2942() {
		assertEquals("562-404-1904", customers.get(2941).getFax());
	}

	@Test
	@DisplayName("Record 2942: Email is brooks@fourre.com")
	void EmailOfRecord2942() {
		assertEquals("brooks@fourre.com", customers.get(2941).getEmail());
	}

	@Test
	@DisplayName("Record 2942: Web is http://www.brooksfourre.com")
	void WebOfRecord2942() {
		assertEquals("http://www.brooksfourre.com", customers.get(2941).getWeb());
	}
}
