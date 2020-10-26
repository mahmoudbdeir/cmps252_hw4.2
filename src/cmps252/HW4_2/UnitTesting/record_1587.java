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

@Tag("10")
class Record_1587 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1587: FirstName is Donald")
	void FirstNameOfRecord1587() {
		assertEquals("Donald", customers.get(1586).getFirstName());
	}

	@Test
	@DisplayName("Record 1587: LastName is Naugle")
	void LastNameOfRecord1587() {
		assertEquals("Naugle", customers.get(1586).getLastName());
	}

	@Test
	@DisplayName("Record 1587: Company is Coral Limousine Service Inc")
	void CompanyOfRecord1587() {
		assertEquals("Coral Limousine Service Inc", customers.get(1586).getCompany());
	}

	@Test
	@DisplayName("Record 1587: Address is 8 W 38th St")
	void AddressOfRecord1587() {
		assertEquals("8 W 38th St", customers.get(1586).getAddress());
	}

	@Test
	@DisplayName("Record 1587: City is New York")
	void CityOfRecord1587() {
		assertEquals("New York", customers.get(1586).getCity());
	}

	@Test
	@DisplayName("Record 1587: County is New York")
	void CountyOfRecord1587() {
		assertEquals("New York", customers.get(1586).getCounty());
	}

	@Test
	@DisplayName("Record 1587: State is NY")
	void StateOfRecord1587() {
		assertEquals("NY", customers.get(1586).getState());
	}

	@Test
	@DisplayName("Record 1587: ZIP is 10018")
	void ZIPOfRecord1587() {
		assertEquals("10018", customers.get(1586).getZIP());
	}

	@Test
	@DisplayName("Record 1587: Phone is 212-221-4429")
	void PhoneOfRecord1587() {
		assertEquals("212-221-4429", customers.get(1586).getPhone());
	}

	@Test
	@DisplayName("Record 1587: Fax is 212-221-8065")
	void FaxOfRecord1587() {
		assertEquals("212-221-8065", customers.get(1586).getFax());
	}

	@Test
	@DisplayName("Record 1587: Email is donald@naugle.com")
	void EmailOfRecord1587() {
		assertEquals("donald@naugle.com", customers.get(1586).getEmail());
	}

	@Test
	@DisplayName("Record 1587: Web is http://www.donaldnaugle.com")
	void WebOfRecord1587() {
		assertEquals("http://www.donaldnaugle.com", customers.get(1586).getWeb());
	}
}
