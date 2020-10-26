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
class Record_1689 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1689: FirstName is Loren")
	void FirstNameOfRecord1689() {
		assertEquals("Loren", customers.get(1688).getFirstName());
	}

	@Test
	@DisplayName("Record 1689: LastName is Mackler")
	void LastNameOfRecord1689() {
		assertEquals("Mackler", customers.get(1688).getLastName());
	}

	@Test
	@DisplayName("Record 1689: Company is Food Of Our Own Design")
	void CompanyOfRecord1689() {
		assertEquals("Food Of Our Own Design", customers.get(1688).getCompany());
	}

	@Test
	@DisplayName("Record 1689: Address is 141 Stratford Ave")
	void AddressOfRecord1689() {
		assertEquals("141 Stratford Ave", customers.get(1688).getAddress());
	}

	@Test
	@DisplayName("Record 1689: City is Bridgeport")
	void CityOfRecord1689() {
		assertEquals("Bridgeport", customers.get(1688).getCity());
	}

	@Test
	@DisplayName("Record 1689: County is Fairfield")
	void CountyOfRecord1689() {
		assertEquals("Fairfield", customers.get(1688).getCounty());
	}

	@Test
	@DisplayName("Record 1689: State is CT")
	void StateOfRecord1689() {
		assertEquals("CT", customers.get(1688).getState());
	}

	@Test
	@DisplayName("Record 1689: ZIP is 6608")
	void ZIPOfRecord1689() {
		assertEquals("6608", customers.get(1688).getZIP());
	}

	@Test
	@DisplayName("Record 1689: Phone is 203-368-9414")
	void PhoneOfRecord1689() {
		assertEquals("203-368-9414", customers.get(1688).getPhone());
	}

	@Test
	@DisplayName("Record 1689: Fax is 203-368-8694")
	void FaxOfRecord1689() {
		assertEquals("203-368-8694", customers.get(1688).getFax());
	}

	@Test
	@DisplayName("Record 1689: Email is loren@mackler.com")
	void EmailOfRecord1689() {
		assertEquals("loren@mackler.com", customers.get(1688).getEmail());
	}

	@Test
	@DisplayName("Record 1689: Web is http://www.lorenmackler.com")
	void WebOfRecord1689() {
		assertEquals("http://www.lorenmackler.com", customers.get(1688).getWeb());
	}
}
