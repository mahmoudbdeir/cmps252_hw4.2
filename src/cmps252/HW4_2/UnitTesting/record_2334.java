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

@Tag("16")
class Record_2334 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2334: FirstName is Lilly")
	void FirstNameOfRecord2334() {
		assertEquals("Lilly", customers.get(2333).getFirstName());
	}

	@Test
	@DisplayName("Record 2334: LastName is Cradduck")
	void LastNameOfRecord2334() {
		assertEquals("Cradduck", customers.get(2333).getLastName());
	}

	@Test
	@DisplayName("Record 2334: Company is Nor Cal Embroidery")
	void CompanyOfRecord2334() {
		assertEquals("Nor Cal Embroidery", customers.get(2333).getCompany());
	}

	@Test
	@DisplayName("Record 2334: Address is 3100 Camino Del Rio Ct")
	void AddressOfRecord2334() {
		assertEquals("3100 Camino Del Rio Ct", customers.get(2333).getAddress());
	}

	@Test
	@DisplayName("Record 2334: City is Bakersfield")
	void CityOfRecord2334() {
		assertEquals("Bakersfield", customers.get(2333).getCity());
	}

	@Test
	@DisplayName("Record 2334: County is Kern")
	void CountyOfRecord2334() {
		assertEquals("Kern", customers.get(2333).getCounty());
	}

	@Test
	@DisplayName("Record 2334: State is CA")
	void StateOfRecord2334() {
		assertEquals("CA", customers.get(2333).getState());
	}

	@Test
	@DisplayName("Record 2334: ZIP is 93308")
	void ZIPOfRecord2334() {
		assertEquals("93308", customers.get(2333).getZIP());
	}

	@Test
	@DisplayName("Record 2334: Phone is 661-631-9447")
	void PhoneOfRecord2334() {
		assertEquals("661-631-9447", customers.get(2333).getPhone());
	}

	@Test
	@DisplayName("Record 2334: Fax is 661-631-4353")
	void FaxOfRecord2334() {
		assertEquals("661-631-4353", customers.get(2333).getFax());
	}

	@Test
	@DisplayName("Record 2334: Email is lilly@cradduck.com")
	void EmailOfRecord2334() {
		assertEquals("lilly@cradduck.com", customers.get(2333).getEmail());
	}

	@Test
	@DisplayName("Record 2334: Web is http://www.lillycradduck.com")
	void WebOfRecord2334() {
		assertEquals("http://www.lillycradduck.com", customers.get(2333).getWeb());
	}
}
