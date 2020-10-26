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

@Tag("45")
class Record_1999 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1999: FirstName is Rene")
	void FirstNameOfRecord1999() {
		assertEquals("Rene", customers.get(1998).getFirstName());
	}

	@Test
	@DisplayName("Record 1999: LastName is Linssen")
	void LastNameOfRecord1999() {
		assertEquals("Linssen", customers.get(1998).getLastName());
	}

	@Test
	@DisplayName("Record 1999: Company is Bliss, Robert Harms Esq")
	void CompanyOfRecord1999() {
		assertEquals("Bliss, Robert Harms Esq", customers.get(1998).getCompany());
	}

	@Test
	@DisplayName("Record 1999: Address is 1315 L St")
	void AddressOfRecord1999() {
		assertEquals("1315 L St", customers.get(1998).getAddress());
	}

	@Test
	@DisplayName("Record 1999: City is Bakersfield")
	void CityOfRecord1999() {
		assertEquals("Bakersfield", customers.get(1998).getCity());
	}

	@Test
	@DisplayName("Record 1999: County is Kern")
	void CountyOfRecord1999() {
		assertEquals("Kern", customers.get(1998).getCounty());
	}

	@Test
	@DisplayName("Record 1999: State is CA")
	void StateOfRecord1999() {
		assertEquals("CA", customers.get(1998).getState());
	}

	@Test
	@DisplayName("Record 1999: ZIP is 93301")
	void ZIPOfRecord1999() {
		assertEquals("93301", customers.get(1998).getZIP());
	}

	@Test
	@DisplayName("Record 1999: Phone is 661-631-4330")
	void PhoneOfRecord1999() {
		assertEquals("661-631-4330", customers.get(1998).getPhone());
	}

	@Test
	@DisplayName("Record 1999: Fax is 661-631-8511")
	void FaxOfRecord1999() {
		assertEquals("661-631-8511", customers.get(1998).getFax());
	}

	@Test
	@DisplayName("Record 1999: Email is rene@linssen.com")
	void EmailOfRecord1999() {
		assertEquals("rene@linssen.com", customers.get(1998).getEmail());
	}

	@Test
	@DisplayName("Record 1999: Web is http://www.renelinssen.com")
	void WebOfRecord1999() {
		assertEquals("http://www.renelinssen.com", customers.get(1998).getWeb());
	}
}
