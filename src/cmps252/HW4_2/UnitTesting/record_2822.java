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

@Tag("0")
class Record_2822 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2822: FirstName is Tommie")
	void FirstNameOfRecord2822() {
		assertEquals("Tommie", customers.get(2821).getFirstName());
	}

	@Test
	@DisplayName("Record 2822: LastName is Vanness")
	void LastNameOfRecord2822() {
		assertEquals("Vanness", customers.get(2821).getLastName());
	}

	@Test
	@DisplayName("Record 2822: Company is Ghersi, Raymond J")
	void CompanyOfRecord2822() {
		assertEquals("Ghersi, Raymond J", customers.get(2821).getCompany());
	}

	@Test
	@DisplayName("Record 2822: Address is 4726 A Park Rd")
	void AddressOfRecord2822() {
		assertEquals("4726 A Park Rd", customers.get(2821).getAddress());
	}

	@Test
	@DisplayName("Record 2822: City is Charlotte")
	void CityOfRecord2822() {
		assertEquals("Charlotte", customers.get(2821).getCity());
	}

	@Test
	@DisplayName("Record 2822: County is Mecklenburg")
	void CountyOfRecord2822() {
		assertEquals("Mecklenburg", customers.get(2821).getCounty());
	}

	@Test
	@DisplayName("Record 2822: State is NC")
	void StateOfRecord2822() {
		assertEquals("NC", customers.get(2821).getState());
	}

	@Test
	@DisplayName("Record 2822: ZIP is 28209")
	void ZIPOfRecord2822() {
		assertEquals("28209", customers.get(2821).getZIP());
	}

	@Test
	@DisplayName("Record 2822: Phone is 704-521-0441")
	void PhoneOfRecord2822() {
		assertEquals("704-521-0441", customers.get(2821).getPhone());
	}

	@Test
	@DisplayName("Record 2822: Fax is 704-521-1239")
	void FaxOfRecord2822() {
		assertEquals("704-521-1239", customers.get(2821).getFax());
	}

	@Test
	@DisplayName("Record 2822: Email is tommie@vanness.com")
	void EmailOfRecord2822() {
		assertEquals("tommie@vanness.com", customers.get(2821).getEmail());
	}

	@Test
	@DisplayName("Record 2822: Web is http://www.tommievanness.com")
	void WebOfRecord2822() {
		assertEquals("http://www.tommievanness.com", customers.get(2821).getWeb());
	}
}
