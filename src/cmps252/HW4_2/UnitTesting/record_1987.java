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

@Tag("42")
class Record_1987 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1987: FirstName is Keenan")
	void FirstNameOfRecord1987() {
		assertEquals("Keenan", customers.get(1986).getFirstName());
	}

	@Test
	@DisplayName("Record 1987: LastName is Stauble")
	void LastNameOfRecord1987() {
		assertEquals("Stauble", customers.get(1986).getLastName());
	}

	@Test
	@DisplayName("Record 1987: Company is Continental Kettle")
	void CompanyOfRecord1987() {
		assertEquals("Continental Kettle", customers.get(1986).getCompany());
	}

	@Test
	@DisplayName("Record 1987: Address is 600 Bear Tavern Rd")
	void AddressOfRecord1987() {
		assertEquals("600 Bear Tavern Rd", customers.get(1986).getAddress());
	}

	@Test
	@DisplayName("Record 1987: City is Trenton")
	void CityOfRecord1987() {
		assertEquals("Trenton", customers.get(1986).getCity());
	}

	@Test
	@DisplayName("Record 1987: County is Mercer")
	void CountyOfRecord1987() {
		assertEquals("Mercer", customers.get(1986).getCounty());
	}

	@Test
	@DisplayName("Record 1987: State is NJ")
	void StateOfRecord1987() {
		assertEquals("NJ", customers.get(1986).getState());
	}

	@Test
	@DisplayName("Record 1987: ZIP is 8628")
	void ZIPOfRecord1987() {
		assertEquals("8628", customers.get(1986).getZIP());
	}

	@Test
	@DisplayName("Record 1987: Phone is 609-530-4417")
	void PhoneOfRecord1987() {
		assertEquals("609-530-4417", customers.get(1986).getPhone());
	}

	@Test
	@DisplayName("Record 1987: Fax is 609-530-0878")
	void FaxOfRecord1987() {
		assertEquals("609-530-0878", customers.get(1986).getFax());
	}

	@Test
	@DisplayName("Record 1987: Email is keenan@stauble.com")
	void EmailOfRecord1987() {
		assertEquals("keenan@stauble.com", customers.get(1986).getEmail());
	}

	@Test
	@DisplayName("Record 1987: Web is http://www.keenanstauble.com")
	void WebOfRecord1987() {
		assertEquals("http://www.keenanstauble.com", customers.get(1986).getWeb());
	}
}
