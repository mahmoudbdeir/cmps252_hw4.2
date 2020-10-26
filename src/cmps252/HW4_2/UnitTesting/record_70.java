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

@Tag("22")
class Record_70 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 70: FirstName is Erna")
	void FirstNameOfRecord70() {
		assertEquals("Erna", customers.get(69).getFirstName());
	}

	@Test
	@DisplayName("Record 70: LastName is Phyfiher")
	void LastNameOfRecord70() {
		assertEquals("Phyfiher", customers.get(69).getLastName());
	}

	@Test
	@DisplayName("Record 70: Company is United Striping")
	void CompanyOfRecord70() {
		assertEquals("United Striping", customers.get(69).getCompany());
	}

	@Test
	@DisplayName("Record 70: Address is 4153 Marine Ave")
	void AddressOfRecord70() {
		assertEquals("4153 Marine Ave", customers.get(69).getAddress());
	}

	@Test
	@DisplayName("Record 70: City is Lawndale")
	void CityOfRecord70() {
		assertEquals("Lawndale", customers.get(69).getCity());
	}

	@Test
	@DisplayName("Record 70: County is Los Angeles")
	void CountyOfRecord70() {
		assertEquals("Los Angeles", customers.get(69).getCounty());
	}

	@Test
	@DisplayName("Record 70: State is CA")
	void StateOfRecord70() {
		assertEquals("CA", customers.get(69).getState());
	}

	@Test
	@DisplayName("Record 70: ZIP is 90260")
	void ZIPOfRecord70() {
		assertEquals("90260", customers.get(69).getZIP());
	}

	@Test
	@DisplayName("Record 70: Phone is 310-973-4054")
	void PhoneOfRecord70() {
		assertEquals("310-973-4054", customers.get(69).getPhone());
	}

	@Test
	@DisplayName("Record 70: Fax is 310-973-3522")
	void FaxOfRecord70() {
		assertEquals("310-973-3522", customers.get(69).getFax());
	}

	@Test
	@DisplayName("Record 70: Email is erna@phyfiher.com")
	void EmailOfRecord70() {
		assertEquals("erna@phyfiher.com", customers.get(69).getEmail());
	}

	@Test
	@DisplayName("Record 70: Web is http://www.ernaphyfiher.com")
	void WebOfRecord70() {
		assertEquals("http://www.ernaphyfiher.com", customers.get(69).getWeb());
	}
}
