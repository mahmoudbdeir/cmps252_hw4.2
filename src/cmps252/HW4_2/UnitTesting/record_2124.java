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
class Record_2124 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2124: FirstName is Araceli")
	void FirstNameOfRecord2124() {
		assertEquals("Araceli", customers.get(2123).getFirstName());
	}

	@Test
	@DisplayName("Record 2124: LastName is Mihal")
	void LastNameOfRecord2124() {
		assertEquals("Mihal", customers.get(2123).getLastName());
	}

	@Test
	@DisplayName("Record 2124: Company is Aggregate Inc")
	void CompanyOfRecord2124() {
		assertEquals("Aggregate Inc", customers.get(2123).getCompany());
	}

	@Test
	@DisplayName("Record 2124: Address is 400 W Camelback Rd  #-110")
	void AddressOfRecord2124() {
		assertEquals("400 W Camelback Rd  #-110", customers.get(2123).getAddress());
	}

	@Test
	@DisplayName("Record 2124: City is Phoenix")
	void CityOfRecord2124() {
		assertEquals("Phoenix", customers.get(2123).getCity());
	}

	@Test
	@DisplayName("Record 2124: County is Maricopa")
	void CountyOfRecord2124() {
		assertEquals("Maricopa", customers.get(2123).getCounty());
	}

	@Test
	@DisplayName("Record 2124: State is AZ")
	void StateOfRecord2124() {
		assertEquals("AZ", customers.get(2123).getState());
	}

	@Test
	@DisplayName("Record 2124: ZIP is 85013")
	void ZIPOfRecord2124() {
		assertEquals("85013", customers.get(2123).getZIP());
	}

	@Test
	@DisplayName("Record 2124: Phone is 602-241-1968")
	void PhoneOfRecord2124() {
		assertEquals("602-241-1968", customers.get(2123).getPhone());
	}

	@Test
	@DisplayName("Record 2124: Fax is 602-241-2303")
	void FaxOfRecord2124() {
		assertEquals("602-241-2303", customers.get(2123).getFax());
	}

	@Test
	@DisplayName("Record 2124: Email is araceli@mihal.com")
	void EmailOfRecord2124() {
		assertEquals("araceli@mihal.com", customers.get(2123).getEmail());
	}

	@Test
	@DisplayName("Record 2124: Web is http://www.aracelimihal.com")
	void WebOfRecord2124() {
		assertEquals("http://www.aracelimihal.com", customers.get(2123).getWeb());
	}
}
