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

@Tag("17")
class Record_3693 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3693: FirstName is Damion")
	void FirstNameOfRecord3693() {
		assertEquals("Damion", customers.get(3692).getFirstName());
	}

	@Test
	@DisplayName("Record 3693: LastName is Dagata")
	void LastNameOfRecord3693() {
		assertEquals("Dagata", customers.get(3692).getLastName());
	}

	@Test
	@DisplayName("Record 3693: Company is Hartlieb Steel Service Inc")
	void CompanyOfRecord3693() {
		assertEquals("Hartlieb Steel Service Inc", customers.get(3692).getCompany());
	}

	@Test
	@DisplayName("Record 3693: Address is 182 Hickory St")
	void AddressOfRecord3693() {
		assertEquals("182 Hickory St", customers.get(3692).getAddress());
	}

	@Test
	@DisplayName("Record 3693: City is Orange")
	void CityOfRecord3693() {
		assertEquals("Orange", customers.get(3692).getCity());
	}

	@Test
	@DisplayName("Record 3693: County is Essex")
	void CountyOfRecord3693() {
		assertEquals("Essex", customers.get(3692).getCounty());
	}

	@Test
	@DisplayName("Record 3693: State is NJ")
	void StateOfRecord3693() {
		assertEquals("NJ", customers.get(3692).getState());
	}

	@Test
	@DisplayName("Record 3693: ZIP is 7050")
	void ZIPOfRecord3693() {
		assertEquals("7050", customers.get(3692).getZIP());
	}

	@Test
	@DisplayName("Record 3693: Phone is 973-672-7522")
	void PhoneOfRecord3693() {
		assertEquals("973-672-7522", customers.get(3692).getPhone());
	}

	@Test
	@DisplayName("Record 3693: Fax is 973-672-2297")
	void FaxOfRecord3693() {
		assertEquals("973-672-2297", customers.get(3692).getFax());
	}

	@Test
	@DisplayName("Record 3693: Email is damion@dagata.com")
	void EmailOfRecord3693() {
		assertEquals("damion@dagata.com", customers.get(3692).getEmail());
	}

	@Test
	@DisplayName("Record 3693: Web is http://www.damiondagata.com")
	void WebOfRecord3693() {
		assertEquals("http://www.damiondagata.com", customers.get(3692).getWeb());
	}
}
