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

@Tag("11")
class Record_4261 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4261: FirstName is Bennie")
	void FirstNameOfRecord4261() {
		assertEquals("Bennie", customers.get(4260).getFirstName());
	}

	@Test
	@DisplayName("Record 4261: LastName is Medyras")
	void LastNameOfRecord4261() {
		assertEquals("Medyras", customers.get(4260).getLastName());
	}

	@Test
	@DisplayName("Record 4261: Company is Stack Sales Corp")
	void CompanyOfRecord4261() {
		assertEquals("Stack Sales Corp", customers.get(4260).getCompany());
	}

	@Test
	@DisplayName("Record 4261: Address is 536 S High St")
	void AddressOfRecord4261() {
		assertEquals("536 S High St", customers.get(4260).getAddress());
	}

	@Test
	@DisplayName("Record 4261: City is Columbus")
	void CityOfRecord4261() {
		assertEquals("Columbus", customers.get(4260).getCity());
	}

	@Test
	@DisplayName("Record 4261: County is Franklin")
	void CountyOfRecord4261() {
		assertEquals("Franklin", customers.get(4260).getCounty());
	}

	@Test
	@DisplayName("Record 4261: State is OH")
	void StateOfRecord4261() {
		assertEquals("OH", customers.get(4260).getState());
	}

	@Test
	@DisplayName("Record 4261: ZIP is 43215")
	void ZIPOfRecord4261() {
		assertEquals("43215", customers.get(4260).getZIP());
	}

	@Test
	@DisplayName("Record 4261: Phone is 614-228-6681")
	void PhoneOfRecord4261() {
		assertEquals("614-228-6681", customers.get(4260).getPhone());
	}

	@Test
	@DisplayName("Record 4261: Fax is 614-228-3439")
	void FaxOfRecord4261() {
		assertEquals("614-228-3439", customers.get(4260).getFax());
	}

	@Test
	@DisplayName("Record 4261: Email is bennie@medyras.com")
	void EmailOfRecord4261() {
		assertEquals("bennie@medyras.com", customers.get(4260).getEmail());
	}

	@Test
	@DisplayName("Record 4261: Web is http://www.benniemedyras.com")
	void WebOfRecord4261() {
		assertEquals("http://www.benniemedyras.com", customers.get(4260).getWeb());
	}
}
