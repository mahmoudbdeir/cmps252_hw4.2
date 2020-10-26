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

@Tag("28")
class Record_983 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 983: FirstName is Delilah")
	void FirstNameOfRecord983() {
		assertEquals("Delilah", customers.get(982).getFirstName());
	}

	@Test
	@DisplayName("Record 983: LastName is Leonides")
	void LastNameOfRecord983() {
		assertEquals("Leonides", customers.get(982).getLastName());
	}

	@Test
	@DisplayName("Record 983: Company is Founders Title Co Placer Co")
	void CompanyOfRecord983() {
		assertEquals("Founders Title Co Placer Co", customers.get(982).getCompany());
	}

	@Test
	@DisplayName("Record 983: Address is 10190 Bannock St")
	void AddressOfRecord983() {
		assertEquals("10190 Bannock St", customers.get(982).getAddress());
	}

	@Test
	@DisplayName("Record 983: City is Denver")
	void CityOfRecord983() {
		assertEquals("Denver", customers.get(982).getCity());
	}

	@Test
	@DisplayName("Record 983: County is Adams")
	void CountyOfRecord983() {
		assertEquals("Adams", customers.get(982).getCounty());
	}

	@Test
	@DisplayName("Record 983: State is CO")
	void StateOfRecord983() {
		assertEquals("CO", customers.get(982).getState());
	}

	@Test
	@DisplayName("Record 983: ZIP is 80221")
	void ZIPOfRecord983() {
		assertEquals("80221", customers.get(982).getZIP());
	}

	@Test
	@DisplayName("Record 983: Phone is 303-452-6161")
	void PhoneOfRecord983() {
		assertEquals("303-452-6161", customers.get(982).getPhone());
	}

	@Test
	@DisplayName("Record 983: Fax is 303-452-6249")
	void FaxOfRecord983() {
		assertEquals("303-452-6249", customers.get(982).getFax());
	}

	@Test
	@DisplayName("Record 983: Email is delilah@leonides.com")
	void EmailOfRecord983() {
		assertEquals("delilah@leonides.com", customers.get(982).getEmail());
	}

	@Test
	@DisplayName("Record 983: Web is http://www.delilahleonides.com")
	void WebOfRecord983() {
		assertEquals("http://www.delilahleonides.com", customers.get(982).getWeb());
	}
}
