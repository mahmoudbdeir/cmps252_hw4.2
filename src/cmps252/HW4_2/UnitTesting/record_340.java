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

@Tag("43")
class Record_340 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 340: FirstName is Shelby")
	void FirstNameOfRecord340() {
		assertEquals("Shelby", customers.get(339).getFirstName());
	}

	@Test
	@DisplayName("Record 340: LastName is Schoonhoven")
	void LastNameOfRecord340() {
		assertEquals("Schoonhoven", customers.get(339).getLastName());
	}

	@Test
	@DisplayName("Record 340: Company is Del Rio Auto Parts")
	void CompanyOfRecord340() {
		assertEquals("Del Rio Auto Parts", customers.get(339).getCompany());
	}

	@Test
	@DisplayName("Record 340: Address is 1029 Fuller St")
	void AddressOfRecord340() {
		assertEquals("1029 Fuller St", customers.get(339).getAddress());
	}

	@Test
	@DisplayName("Record 340: City is Santa Ana")
	void CityOfRecord340() {
		assertEquals("Santa Ana", customers.get(339).getCity());
	}

	@Test
	@DisplayName("Record 340: County is Orange")
	void CountyOfRecord340() {
		assertEquals("Orange", customers.get(339).getCounty());
	}

	@Test
	@DisplayName("Record 340: State is CA")
	void StateOfRecord340() {
		assertEquals("CA", customers.get(339).getState());
	}

	@Test
	@DisplayName("Record 340: ZIP is 92701")
	void ZIPOfRecord340() {
		assertEquals("92701", customers.get(339).getZIP());
	}

	@Test
	@DisplayName("Record 340: Phone is 714-543-3514")
	void PhoneOfRecord340() {
		assertEquals("714-543-3514", customers.get(339).getPhone());
	}

	@Test
	@DisplayName("Record 340: Fax is 714-543-4741")
	void FaxOfRecord340() {
		assertEquals("714-543-4741", customers.get(339).getFax());
	}

	@Test
	@DisplayName("Record 340: Email is shelby@schoonhoven.com")
	void EmailOfRecord340() {
		assertEquals("shelby@schoonhoven.com", customers.get(339).getEmail());
	}

	@Test
	@DisplayName("Record 340: Web is http://www.shelbyschoonhoven.com")
	void WebOfRecord340() {
		assertEquals("http://www.shelbyschoonhoven.com", customers.get(339).getWeb());
	}
}
