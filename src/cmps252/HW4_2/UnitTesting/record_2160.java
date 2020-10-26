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

@Tag("19")
class Record_2160 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2160: FirstName is Solomon")
	void FirstNameOfRecord2160() {
		assertEquals("Solomon", customers.get(2159).getFirstName());
	}

	@Test
	@DisplayName("Record 2160: LastName is Spaziani")
	void LastNameOfRecord2160() {
		assertEquals("Spaziani", customers.get(2159).getLastName());
	}

	@Test
	@DisplayName("Record 2160: Company is Gilmartin, Richard C Md")
	void CompanyOfRecord2160() {
		assertEquals("Gilmartin, Richard C Md", customers.get(2159).getCompany());
	}

	@Test
	@DisplayName("Record 2160: Address is 6060 Sw 18th St")
	void AddressOfRecord2160() {
		assertEquals("6060 Sw 18th St", customers.get(2159).getAddress());
	}

	@Test
	@DisplayName("Record 2160: City is Boca Raton")
	void CityOfRecord2160() {
		assertEquals("Boca Raton", customers.get(2159).getCity());
	}

	@Test
	@DisplayName("Record 2160: County is Palm Beach")
	void CountyOfRecord2160() {
		assertEquals("Palm Beach", customers.get(2159).getCounty());
	}

	@Test
	@DisplayName("Record 2160: State is FL")
	void StateOfRecord2160() {
		assertEquals("FL", customers.get(2159).getState());
	}

	@Test
	@DisplayName("Record 2160: ZIP is 33433")
	void ZIPOfRecord2160() {
		assertEquals("33433", customers.get(2159).getZIP());
	}

	@Test
	@DisplayName("Record 2160: Phone is 561-338-9770")
	void PhoneOfRecord2160() {
		assertEquals("561-338-9770", customers.get(2159).getPhone());
	}

	@Test
	@DisplayName("Record 2160: Fax is 561-338-1947")
	void FaxOfRecord2160() {
		assertEquals("561-338-1947", customers.get(2159).getFax());
	}

	@Test
	@DisplayName("Record 2160: Email is solomon@spaziani.com")
	void EmailOfRecord2160() {
		assertEquals("solomon@spaziani.com", customers.get(2159).getEmail());
	}

	@Test
	@DisplayName("Record 2160: Web is http://www.solomonspaziani.com")
	void WebOfRecord2160() {
		assertEquals("http://www.solomonspaziani.com", customers.get(2159).getWeb());
	}
}
