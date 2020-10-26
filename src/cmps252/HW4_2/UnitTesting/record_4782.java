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
class Record_4782 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4782: FirstName is Jasmine")
	void FirstNameOfRecord4782() {
		assertEquals("Jasmine", customers.get(4781).getFirstName());
	}

	@Test
	@DisplayName("Record 4782: LastName is Mieles")
	void LastNameOfRecord4782() {
		assertEquals("Mieles", customers.get(4781).getLastName());
	}

	@Test
	@DisplayName("Record 4782: Company is United States K Manufacturing")
	void CompanyOfRecord4782() {
		assertEquals("United States K Manufacturing", customers.get(4781).getCompany());
	}

	@Test
	@DisplayName("Record 4782: Address is 1236 Campville Rd")
	void AddressOfRecord4782() {
		assertEquals("1236 Campville Rd", customers.get(4781).getAddress());
	}

	@Test
	@DisplayName("Record 4782: City is Endicott")
	void CityOfRecord4782() {
		assertEquals("Endicott", customers.get(4781).getCity());
	}

	@Test
	@DisplayName("Record 4782: County is Broome")
	void CountyOfRecord4782() {
		assertEquals("Broome", customers.get(4781).getCounty());
	}

	@Test
	@DisplayName("Record 4782: State is NY")
	void StateOfRecord4782() {
		assertEquals("NY", customers.get(4781).getState());
	}

	@Test
	@DisplayName("Record 4782: ZIP is 13760")
	void ZIPOfRecord4782() {
		assertEquals("13760", customers.get(4781).getZIP());
	}

	@Test
	@DisplayName("Record 4782: Phone is 607-754-4385")
	void PhoneOfRecord4782() {
		assertEquals("607-754-4385", customers.get(4781).getPhone());
	}

	@Test
	@DisplayName("Record 4782: Fax is 607-754-2855")
	void FaxOfRecord4782() {
		assertEquals("607-754-2855", customers.get(4781).getFax());
	}

	@Test
	@DisplayName("Record 4782: Email is jasmine@mieles.com")
	void EmailOfRecord4782() {
		assertEquals("jasmine@mieles.com", customers.get(4781).getEmail());
	}

	@Test
	@DisplayName("Record 4782: Web is http://www.jasminemieles.com")
	void WebOfRecord4782() {
		assertEquals("http://www.jasminemieles.com", customers.get(4781).getWeb());
	}
}
