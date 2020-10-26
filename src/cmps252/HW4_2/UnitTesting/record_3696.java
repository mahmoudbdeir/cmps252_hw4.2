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

@Tag("46")
class Record_3696 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3696: FirstName is Woodrow")
	void FirstNameOfRecord3696() {
		assertEquals("Woodrow", customers.get(3695).getFirstName());
	}

	@Test
	@DisplayName("Record 3696: LastName is Alicia")
	void LastNameOfRecord3696() {
		assertEquals("Alicia", customers.get(3695).getLastName());
	}

	@Test
	@DisplayName("Record 3696: Company is May W L Co Pac Applnc Parts")
	void CompanyOfRecord3696() {
		assertEquals("May W L Co Pac Applnc Parts", customers.get(3695).getCompany());
	}

	@Test
	@DisplayName("Record 3696: Address is 601 W 26th St")
	void AddressOfRecord3696() {
		assertEquals("601 W 26th St", customers.get(3695).getAddress());
	}

	@Test
	@DisplayName("Record 3696: City is New York")
	void CityOfRecord3696() {
		assertEquals("New York", customers.get(3695).getCity());
	}

	@Test
	@DisplayName("Record 3696: County is New York")
	void CountyOfRecord3696() {
		assertEquals("New York", customers.get(3695).getCounty());
	}

	@Test
	@DisplayName("Record 3696: State is NY")
	void StateOfRecord3696() {
		assertEquals("NY", customers.get(3695).getState());
	}

	@Test
	@DisplayName("Record 3696: ZIP is 10001")
	void ZIPOfRecord3696() {
		assertEquals("10001", customers.get(3695).getZIP());
	}

	@Test
	@DisplayName("Record 3696: Phone is 212-243-2569")
	void PhoneOfRecord3696() {
		assertEquals("212-243-2569", customers.get(3695).getPhone());
	}

	@Test
	@DisplayName("Record 3696: Fax is 212-243-2184")
	void FaxOfRecord3696() {
		assertEquals("212-243-2184", customers.get(3695).getFax());
	}

	@Test
	@DisplayName("Record 3696: Email is woodrow@alicia.com")
	void EmailOfRecord3696() {
		assertEquals("woodrow@alicia.com", customers.get(3695).getEmail());
	}

	@Test
	@DisplayName("Record 3696: Web is http://www.woodrowalicia.com")
	void WebOfRecord3696() {
		assertEquals("http://www.woodrowalicia.com", customers.get(3695).getWeb());
	}
}
