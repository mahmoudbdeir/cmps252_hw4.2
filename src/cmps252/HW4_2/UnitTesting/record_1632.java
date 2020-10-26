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

@Tag("21")
class Record_1632 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1632: FirstName is Antoine")
	void FirstNameOfRecord1632() {
		assertEquals("Antoine", customers.get(1631).getFirstName());
	}

	@Test
	@DisplayName("Record 1632: LastName is Bowerman")
	void LastNameOfRecord1632() {
		assertEquals("Bowerman", customers.get(1631).getLastName());
	}

	@Test
	@DisplayName("Record 1632: Company is Fleming, Macklin Esq")
	void CompanyOfRecord1632() {
		assertEquals("Fleming, Macklin Esq", customers.get(1631).getCompany());
	}

	@Test
	@DisplayName("Record 1632: Address is 344 Whippany Rd")
	void AddressOfRecord1632() {
		assertEquals("344 Whippany Rd", customers.get(1631).getAddress());
	}

	@Test
	@DisplayName("Record 1632: City is Whippany")
	void CityOfRecord1632() {
		assertEquals("Whippany", customers.get(1631).getCity());
	}

	@Test
	@DisplayName("Record 1632: County is Morris")
	void CountyOfRecord1632() {
		assertEquals("Morris", customers.get(1631).getCounty());
	}

	@Test
	@DisplayName("Record 1632: State is NJ")
	void StateOfRecord1632() {
		assertEquals("NJ", customers.get(1631).getState());
	}

	@Test
	@DisplayName("Record 1632: ZIP is 7981")
	void ZIPOfRecord1632() {
		assertEquals("7981", customers.get(1631).getZIP());
	}

	@Test
	@DisplayName("Record 1632: Phone is 973-605-0003")
	void PhoneOfRecord1632() {
		assertEquals("973-605-0003", customers.get(1631).getPhone());
	}

	@Test
	@DisplayName("Record 1632: Fax is 973-605-3051")
	void FaxOfRecord1632() {
		assertEquals("973-605-3051", customers.get(1631).getFax());
	}

	@Test
	@DisplayName("Record 1632: Email is antoine@bowerman.com")
	void EmailOfRecord1632() {
		assertEquals("antoine@bowerman.com", customers.get(1631).getEmail());
	}

	@Test
	@DisplayName("Record 1632: Web is http://www.antoinebowerman.com")
	void WebOfRecord1632() {
		assertEquals("http://www.antoinebowerman.com", customers.get(1631).getWeb());
	}
}
