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
class Record_3075 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3075: FirstName is Ira")
	void FirstNameOfRecord3075() {
		assertEquals("Ira", customers.get(3074).getFirstName());
	}

	@Test
	@DisplayName("Record 3075: LastName is Parmar")
	void LastNameOfRecord3075() {
		assertEquals("Parmar", customers.get(3074).getLastName());
	}

	@Test
	@DisplayName("Record 3075: Company is Sir Speedy Printing Centers")
	void CompanyOfRecord3075() {
		assertEquals("Sir Speedy Printing Centers", customers.get(3074).getCompany());
	}

	@Test
	@DisplayName("Record 3075: Address is 1530 Nabell Ave")
	void AddressOfRecord3075() {
		assertEquals("1530 Nabell Ave", customers.get(3074).getAddress());
	}

	@Test
	@DisplayName("Record 3075: City is Atlanta")
	void CityOfRecord3075() {
		assertEquals("Atlanta", customers.get(3074).getCity());
	}

	@Test
	@DisplayName("Record 3075: County is Fulton")
	void CountyOfRecord3075() {
		assertEquals("Fulton", customers.get(3074).getCounty());
	}

	@Test
	@DisplayName("Record 3075: State is GA")
	void StateOfRecord3075() {
		assertEquals("GA", customers.get(3074).getState());
	}

	@Test
	@DisplayName("Record 3075: ZIP is 30344")
	void ZIPOfRecord3075() {
		assertEquals("30344", customers.get(3074).getZIP());
	}

	@Test
	@DisplayName("Record 3075: Phone is 404-761-1954")
	void PhoneOfRecord3075() {
		assertEquals("404-761-1954", customers.get(3074).getPhone());
	}

	@Test
	@DisplayName("Record 3075: Fax is 404-761-7698")
	void FaxOfRecord3075() {
		assertEquals("404-761-7698", customers.get(3074).getFax());
	}

	@Test
	@DisplayName("Record 3075: Email is ira@parmar.com")
	void EmailOfRecord3075() {
		assertEquals("ira@parmar.com", customers.get(3074).getEmail());
	}

	@Test
	@DisplayName("Record 3075: Web is http://www.iraparmar.com")
	void WebOfRecord3075() {
		assertEquals("http://www.iraparmar.com", customers.get(3074).getWeb());
	}
}
