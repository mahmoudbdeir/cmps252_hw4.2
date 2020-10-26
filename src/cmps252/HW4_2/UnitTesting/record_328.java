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

@Tag("9")
class Record_328 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 328: FirstName is Kelly")
	void FirstNameOfRecord328() {
		assertEquals("Kelly", customers.get(327).getFirstName());
	}

	@Test
	@DisplayName("Record 328: LastName is Dathe")
	void LastNameOfRecord328() {
		assertEquals("Dathe", customers.get(327).getLastName());
	}

	@Test
	@DisplayName("Record 328: Company is Loveall Construction Co")
	void CompanyOfRecord328() {
		assertEquals("Loveall Construction Co", customers.get(327).getCompany());
	}

	@Test
	@DisplayName("Record 328: Address is 414 Spring St")
	void AddressOfRecord328() {
		assertEquals("414 Spring St", customers.get(327).getAddress());
	}

	@Test
	@DisplayName("Record 328: City is Elizabeth")
	void CityOfRecord328() {
		assertEquals("Elizabeth", customers.get(327).getCity());
	}

	@Test
	@DisplayName("Record 328: County is Union")
	void CountyOfRecord328() {
		assertEquals("Union", customers.get(327).getCounty());
	}

	@Test
	@DisplayName("Record 328: State is NJ")
	void StateOfRecord328() {
		assertEquals("NJ", customers.get(327).getState());
	}

	@Test
	@DisplayName("Record 328: ZIP is 7201")
	void ZIPOfRecord328() {
		assertEquals("7201", customers.get(327).getZIP());
	}

	@Test
	@DisplayName("Record 328: Phone is 908-353-5943")
	void PhoneOfRecord328() {
		assertEquals("908-353-5943", customers.get(327).getPhone());
	}

	@Test
	@DisplayName("Record 328: Fax is 908-353-0652")
	void FaxOfRecord328() {
		assertEquals("908-353-0652", customers.get(327).getFax());
	}

	@Test
	@DisplayName("Record 328: Email is kelly@dathe.com")
	void EmailOfRecord328() {
		assertEquals("kelly@dathe.com", customers.get(327).getEmail());
	}

	@Test
	@DisplayName("Record 328: Web is http://www.kellydathe.com")
	void WebOfRecord328() {
		assertEquals("http://www.kellydathe.com", customers.get(327).getWeb());
	}
}
