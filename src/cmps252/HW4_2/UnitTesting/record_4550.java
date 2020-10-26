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

@Tag("17")
class Record_4550 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4550: FirstName is Toby")
	void FirstNameOfRecord4550() {
		assertEquals("Toby", customers.get(4549).getFirstName());
	}

	@Test
	@DisplayName("Record 4550: LastName is Pazderski")
	void LastNameOfRecord4550() {
		assertEquals("Pazderski", customers.get(4549).getLastName());
	}

	@Test
	@DisplayName("Record 4550: Company is Clas Insurance Services")
	void CompanyOfRecord4550() {
		assertEquals("Clas Insurance Services", customers.get(4549).getCompany());
	}

	@Test
	@DisplayName("Record 4550: Address is 1431 S Gage St")
	void AddressOfRecord4550() {
		assertEquals("1431 S Gage St", customers.get(4549).getAddress());
	}

	@Test
	@DisplayName("Record 4550: City is San Bernardino")
	void CityOfRecord4550() {
		assertEquals("San Bernardino", customers.get(4549).getCity());
	}

	@Test
	@DisplayName("Record 4550: County is San Bernardino")
	void CountyOfRecord4550() {
		assertEquals("San Bernardino", customers.get(4549).getCounty());
	}

	@Test
	@DisplayName("Record 4550: State is CA")
	void StateOfRecord4550() {
		assertEquals("CA", customers.get(4549).getState());
	}

	@Test
	@DisplayName("Record 4550: ZIP is 92408")
	void ZIPOfRecord4550() {
		assertEquals("92408", customers.get(4549).getZIP());
	}

	@Test
	@DisplayName("Record 4550: Phone is 909-796-3701")
	void PhoneOfRecord4550() {
		assertEquals("909-796-3701", customers.get(4549).getPhone());
	}

	@Test
	@DisplayName("Record 4550: Fax is 909-796-4464")
	void FaxOfRecord4550() {
		assertEquals("909-796-4464", customers.get(4549).getFax());
	}

	@Test
	@DisplayName("Record 4550: Email is toby@pazderski.com")
	void EmailOfRecord4550() {
		assertEquals("toby@pazderski.com", customers.get(4549).getEmail());
	}

	@Test
	@DisplayName("Record 4550: Web is http://www.tobypazderski.com")
	void WebOfRecord4550() {
		assertEquals("http://www.tobypazderski.com", customers.get(4549).getWeb());
	}
}
