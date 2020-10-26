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

@Tag("8")
class Record_1604 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1604: FirstName is Leticia")
	void FirstNameOfRecord1604() {
		assertEquals("Leticia", customers.get(1603).getFirstName());
	}

	@Test
	@DisplayName("Record 1604: LastName is Wissman")
	void LastNameOfRecord1604() {
		assertEquals("Wissman", customers.get(1603).getLastName());
	}

	@Test
	@DisplayName("Record 1604: Company is Ridgefield Press")
	void CompanyOfRecord1604() {
		assertEquals("Ridgefield Press", customers.get(1603).getCompany());
	}

	@Test
	@DisplayName("Record 1604: Address is 560 W Milling St  #-f")
	void AddressOfRecord1604() {
		assertEquals("560 W Milling St  #-f", customers.get(1603).getAddress());
	}

	@Test
	@DisplayName("Record 1604: City is Lancaster")
	void CityOfRecord1604() {
		assertEquals("Lancaster", customers.get(1603).getCity());
	}

	@Test
	@DisplayName("Record 1604: County is Los Angeles")
	void CountyOfRecord1604() {
		assertEquals("Los Angeles", customers.get(1603).getCounty());
	}

	@Test
	@DisplayName("Record 1604: State is CA")
	void StateOfRecord1604() {
		assertEquals("CA", customers.get(1603).getState());
	}

	@Test
	@DisplayName("Record 1604: ZIP is 93534")
	void ZIPOfRecord1604() {
		assertEquals("93534", customers.get(1603).getZIP());
	}

	@Test
	@DisplayName("Record 1604: Phone is 661-940-0882")
	void PhoneOfRecord1604() {
		assertEquals("661-940-0882", customers.get(1603).getPhone());
	}

	@Test
	@DisplayName("Record 1604: Fax is 661-940-0002")
	void FaxOfRecord1604() {
		assertEquals("661-940-0002", customers.get(1603).getFax());
	}

	@Test
	@DisplayName("Record 1604: Email is leticia@wissman.com")
	void EmailOfRecord1604() {
		assertEquals("leticia@wissman.com", customers.get(1603).getEmail());
	}

	@Test
	@DisplayName("Record 1604: Web is http://www.leticiawissman.com")
	void WebOfRecord1604() {
		assertEquals("http://www.leticiawissman.com", customers.get(1603).getWeb());
	}
}
