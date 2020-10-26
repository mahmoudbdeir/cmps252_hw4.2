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

@Tag("34")
class Record_1962 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1962: FirstName is Rose")
	void FirstNameOfRecord1962() {
		assertEquals("Rose", customers.get(1961).getFirstName());
	}

	@Test
	@DisplayName("Record 1962: LastName is Klosinski")
	void LastNameOfRecord1962() {
		assertEquals("Klosinski", customers.get(1961).getLastName());
	}

	@Test
	@DisplayName("Record 1962: Company is Cooper, Gregory L Ms")
	void CompanyOfRecord1962() {
		assertEquals("Cooper, Gregory L Ms", customers.get(1961).getCompany());
	}

	@Test
	@DisplayName("Record 1962: Address is 55 Haul Rd")
	void AddressOfRecord1962() {
		assertEquals("55 Haul Rd", customers.get(1961).getAddress());
	}

	@Test
	@DisplayName("Record 1962: City is Wayne")
	void CityOfRecord1962() {
		assertEquals("Wayne", customers.get(1961).getCity());
	}

	@Test
	@DisplayName("Record 1962: County is Passaic")
	void CountyOfRecord1962() {
		assertEquals("Passaic", customers.get(1961).getCounty());
	}

	@Test
	@DisplayName("Record 1962: State is NJ")
	void StateOfRecord1962() {
		assertEquals("NJ", customers.get(1961).getState());
	}

	@Test
	@DisplayName("Record 1962: ZIP is 7470")
	void ZIPOfRecord1962() {
		assertEquals("7470", customers.get(1961).getZIP());
	}

	@Test
	@DisplayName("Record 1962: Phone is 973-831-7193")
	void PhoneOfRecord1962() {
		assertEquals("973-831-7193", customers.get(1961).getPhone());
	}

	@Test
	@DisplayName("Record 1962: Fax is 973-831-6588")
	void FaxOfRecord1962() {
		assertEquals("973-831-6588", customers.get(1961).getFax());
	}

	@Test
	@DisplayName("Record 1962: Email is rose@klosinski.com")
	void EmailOfRecord1962() {
		assertEquals("rose@klosinski.com", customers.get(1961).getEmail());
	}

	@Test
	@DisplayName("Record 1962: Web is http://www.roseklosinski.com")
	void WebOfRecord1962() {
		assertEquals("http://www.roseklosinski.com", customers.get(1961).getWeb());
	}
}
