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

@Tag("38")
class Record_1838 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1838: FirstName is Lilian")
	void FirstNameOfRecord1838() {
		assertEquals("Lilian", customers.get(1837).getFirstName());
	}

	@Test
	@DisplayName("Record 1838: LastName is Ringley")
	void LastNameOfRecord1838() {
		assertEquals("Ringley", customers.get(1837).getLastName());
	}

	@Test
	@DisplayName("Record 1838: Company is Trinity Presbyterian Church")
	void CompanyOfRecord1838() {
		assertEquals("Trinity Presbyterian Church", customers.get(1837).getCompany());
	}

	@Test
	@DisplayName("Record 1838: Address is 15202 Transistor Ln")
	void AddressOfRecord1838() {
		assertEquals("15202 Transistor Ln", customers.get(1837).getAddress());
	}

	@Test
	@DisplayName("Record 1838: City is Huntington Beach")
	void CityOfRecord1838() {
		assertEquals("Huntington Beach", customers.get(1837).getCity());
	}

	@Test
	@DisplayName("Record 1838: County is Orange")
	void CountyOfRecord1838() {
		assertEquals("Orange", customers.get(1837).getCounty());
	}

	@Test
	@DisplayName("Record 1838: State is CA")
	void StateOfRecord1838() {
		assertEquals("CA", customers.get(1837).getState());
	}

	@Test
	@DisplayName("Record 1838: ZIP is 92649")
	void ZIPOfRecord1838() {
		assertEquals("92649", customers.get(1837).getZIP());
	}

	@Test
	@DisplayName("Record 1838: Phone is 714-894-5144")
	void PhoneOfRecord1838() {
		assertEquals("714-894-5144", customers.get(1837).getPhone());
	}

	@Test
	@DisplayName("Record 1838: Fax is 714-894-5534")
	void FaxOfRecord1838() {
		assertEquals("714-894-5534", customers.get(1837).getFax());
	}

	@Test
	@DisplayName("Record 1838: Email is lilian@ringley.com")
	void EmailOfRecord1838() {
		assertEquals("lilian@ringley.com", customers.get(1837).getEmail());
	}

	@Test
	@DisplayName("Record 1838: Web is http://www.lilianringley.com")
	void WebOfRecord1838() {
		assertEquals("http://www.lilianringley.com", customers.get(1837).getWeb());
	}
}
