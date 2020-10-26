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
class Record_1663 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1663: FirstName is Adrianne")
	void FirstNameOfRecord1663() {
		assertEquals("Adrianne", customers.get(1662).getFirstName());
	}

	@Test
	@DisplayName("Record 1663: LastName is Mattlin")
	void LastNameOfRecord1663() {
		assertEquals("Mattlin", customers.get(1662).getLastName());
	}

	@Test
	@DisplayName("Record 1663: Company is Insurance Management Group Inc")
	void CompanyOfRecord1663() {
		assertEquals("Insurance Management Group Inc", customers.get(1662).getCompany());
	}

	@Test
	@DisplayName("Record 1663: Address is State Hwy  #-169")
	void AddressOfRecord1663() {
		assertEquals("State Hwy  #-169", customers.get(1662).getAddress());
	}

	@Test
	@DisplayName("Record 1663: City is Bayonne")
	void CityOfRecord1663() {
		assertEquals("Bayonne", customers.get(1662).getCity());
	}

	@Test
	@DisplayName("Record 1663: County is Hudson")
	void CountyOfRecord1663() {
		assertEquals("Hudson", customers.get(1662).getCounty());
	}

	@Test
	@DisplayName("Record 1663: State is NJ")
	void StateOfRecord1663() {
		assertEquals("NJ", customers.get(1662).getState());
	}

	@Test
	@DisplayName("Record 1663: ZIP is 7002")
	void ZIPOfRecord1663() {
		assertEquals("7002", customers.get(1662).getZIP());
	}

	@Test
	@DisplayName("Record 1663: Phone is 201-823-4586")
	void PhoneOfRecord1663() {
		assertEquals("201-823-4586", customers.get(1662).getPhone());
	}

	@Test
	@DisplayName("Record 1663: Fax is 201-823-1103")
	void FaxOfRecord1663() {
		assertEquals("201-823-1103", customers.get(1662).getFax());
	}

	@Test
	@DisplayName("Record 1663: Email is adrianne@mattlin.com")
	void EmailOfRecord1663() {
		assertEquals("adrianne@mattlin.com", customers.get(1662).getEmail());
	}

	@Test
	@DisplayName("Record 1663: Web is http://www.adriannemattlin.com")
	void WebOfRecord1663() {
		assertEquals("http://www.adriannemattlin.com", customers.get(1662).getWeb());
	}
}
