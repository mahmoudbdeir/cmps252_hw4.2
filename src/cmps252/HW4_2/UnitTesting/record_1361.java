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

@Tag("23")
class Record_1361 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1361: FirstName is Dena")
	void FirstNameOfRecord1361() {
		assertEquals("Dena", customers.get(1360).getFirstName());
	}

	@Test
	@DisplayName("Record 1361: LastName is Bourland")
	void LastNameOfRecord1361() {
		assertEquals("Bourland", customers.get(1360).getLastName());
	}

	@Test
	@DisplayName("Record 1361: Company is Kyzar Corporation")
	void CompanyOfRecord1361() {
		assertEquals("Kyzar Corporation", customers.get(1360).getCompany());
	}

	@Test
	@DisplayName("Record 1361: Address is 317 Mount Vernon Ave")
	void AddressOfRecord1361() {
		assertEquals("317 Mount Vernon Ave", customers.get(1360).getAddress());
	}

	@Test
	@DisplayName("Record 1361: City is Bakersfield")
	void CityOfRecord1361() {
		assertEquals("Bakersfield", customers.get(1360).getCity());
	}

	@Test
	@DisplayName("Record 1361: County is Kern")
	void CountyOfRecord1361() {
		assertEquals("Kern", customers.get(1360).getCounty());
	}

	@Test
	@DisplayName("Record 1361: State is CA")
	void StateOfRecord1361() {
		assertEquals("CA", customers.get(1360).getState());
	}

	@Test
	@DisplayName("Record 1361: ZIP is 93307")
	void ZIPOfRecord1361() {
		assertEquals("93307", customers.get(1360).getZIP());
	}

	@Test
	@DisplayName("Record 1361: Phone is 661-324-0795")
	void PhoneOfRecord1361() {
		assertEquals("661-324-0795", customers.get(1360).getPhone());
	}

	@Test
	@DisplayName("Record 1361: Fax is 661-324-7342")
	void FaxOfRecord1361() {
		assertEquals("661-324-7342", customers.get(1360).getFax());
	}

	@Test
	@DisplayName("Record 1361: Email is dena@bourland.com")
	void EmailOfRecord1361() {
		assertEquals("dena@bourland.com", customers.get(1360).getEmail());
	}

	@Test
	@DisplayName("Record 1361: Web is http://www.denabourland.com")
	void WebOfRecord1361() {
		assertEquals("http://www.denabourland.com", customers.get(1360).getWeb());
	}
}
