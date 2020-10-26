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

@Tag("30")
class Record_948 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 948: FirstName is Deana")
	void FirstNameOfRecord948() {
		assertEquals("Deana", customers.get(947).getFirstName());
	}

	@Test
	@DisplayName("Record 948: LastName is Carrozza")
	void LastNameOfRecord948() {
		assertEquals("Carrozza", customers.get(947).getLastName());
	}

	@Test
	@DisplayName("Record 948: Company is Vento, John S Esq")
	void CompanyOfRecord948() {
		assertEquals("Vento, John S Esq", customers.get(947).getCompany());
	}

	@Test
	@DisplayName("Record 948: Address is 5718 N Keystone Ave")
	void AddressOfRecord948() {
		assertEquals("5718 N Keystone Ave", customers.get(947).getAddress());
	}

	@Test
	@DisplayName("Record 948: City is Indianapolis")
	void CityOfRecord948() {
		assertEquals("Indianapolis", customers.get(947).getCity());
	}

	@Test
	@DisplayName("Record 948: County is Marion")
	void CountyOfRecord948() {
		assertEquals("Marion", customers.get(947).getCounty());
	}

	@Test
	@DisplayName("Record 948: State is IN")
	void StateOfRecord948() {
		assertEquals("IN", customers.get(947).getState());
	}

	@Test
	@DisplayName("Record 948: ZIP is 46220")
	void ZIPOfRecord948() {
		assertEquals("46220", customers.get(947).getZIP());
	}

	@Test
	@DisplayName("Record 948: Phone is 317-257-0908")
	void PhoneOfRecord948() {
		assertEquals("317-257-0908", customers.get(947).getPhone());
	}

	@Test
	@DisplayName("Record 948: Fax is 317-257-2462")
	void FaxOfRecord948() {
		assertEquals("317-257-2462", customers.get(947).getFax());
	}

	@Test
	@DisplayName("Record 948: Email is deana@carrozza.com")
	void EmailOfRecord948() {
		assertEquals("deana@carrozza.com", customers.get(947).getEmail());
	}

	@Test
	@DisplayName("Record 948: Web is http://www.deanacarrozza.com")
	void WebOfRecord948() {
		assertEquals("http://www.deanacarrozza.com", customers.get(947).getWeb());
	}
}
