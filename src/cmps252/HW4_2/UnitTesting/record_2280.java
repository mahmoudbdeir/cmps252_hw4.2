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

@Tag("39")
class Record_2280 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2280: FirstName is Ernestine")
	void FirstNameOfRecord2280() {
		assertEquals("Ernestine", customers.get(2279).getFirstName());
	}

	@Test
	@DisplayName("Record 2280: LastName is Lamacchia")
	void LastNameOfRecord2280() {
		assertEquals("Lamacchia", customers.get(2279).getLastName());
	}

	@Test
	@DisplayName("Record 2280: Company is Puritans Pride Factory Store")
	void CompanyOfRecord2280() {
		assertEquals("Puritans Pride Factory Store", customers.get(2279).getCompany());
	}

	@Test
	@DisplayName("Record 2280: Address is 1029 Youngstown Warren Rd")
	void AddressOfRecord2280() {
		assertEquals("1029 Youngstown Warren Rd", customers.get(2279).getAddress());
	}

	@Test
	@DisplayName("Record 2280: City is Niles")
	void CityOfRecord2280() {
		assertEquals("Niles", customers.get(2279).getCity());
	}

	@Test
	@DisplayName("Record 2280: County is Trumbull")
	void CountyOfRecord2280() {
		assertEquals("Trumbull", customers.get(2279).getCounty());
	}

	@Test
	@DisplayName("Record 2280: State is OH")
	void StateOfRecord2280() {
		assertEquals("OH", customers.get(2279).getState());
	}

	@Test
	@DisplayName("Record 2280: ZIP is 44446")
	void ZIPOfRecord2280() {
		assertEquals("44446", customers.get(2279).getZIP());
	}

	@Test
	@DisplayName("Record 2280: Phone is 330-652-4768")
	void PhoneOfRecord2280() {
		assertEquals("330-652-4768", customers.get(2279).getPhone());
	}

	@Test
	@DisplayName("Record 2280: Fax is 330-652-5751")
	void FaxOfRecord2280() {
		assertEquals("330-652-5751", customers.get(2279).getFax());
	}

	@Test
	@DisplayName("Record 2280: Email is ernestine@lamacchia.com")
	void EmailOfRecord2280() {
		assertEquals("ernestine@lamacchia.com", customers.get(2279).getEmail());
	}

	@Test
	@DisplayName("Record 2280: Web is http://www.ernestinelamacchia.com")
	void WebOfRecord2280() {
		assertEquals("http://www.ernestinelamacchia.com", customers.get(2279).getWeb());
	}
}
