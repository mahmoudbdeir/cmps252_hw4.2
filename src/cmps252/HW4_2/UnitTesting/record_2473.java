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

@Tag("36")
class Record_2473 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2473: FirstName is Hosea")
	void FirstNameOfRecord2473() {
		assertEquals("Hosea", customers.get(2472).getFirstName());
	}

	@Test
	@DisplayName("Record 2473: LastName is Bowersock")
	void LastNameOfRecord2473() {
		assertEquals("Bowersock", customers.get(2472).getLastName());
	}

	@Test
	@DisplayName("Record 2473: Company is Burseth, Eric P Md")
	void CompanyOfRecord2473() {
		assertEquals("Burseth, Eric P Md", customers.get(2472).getCompany());
	}

	@Test
	@DisplayName("Record 2473: Address is 301 Littleton Rd")
	void AddressOfRecord2473() {
		assertEquals("301 Littleton Rd", customers.get(2472).getAddress());
	}

	@Test
	@DisplayName("Record 2473: City is Westford")
	void CityOfRecord2473() {
		assertEquals("Westford", customers.get(2472).getCity());
	}

	@Test
	@DisplayName("Record 2473: County is Middlesex")
	void CountyOfRecord2473() {
		assertEquals("Middlesex", customers.get(2472).getCounty());
	}

	@Test
	@DisplayName("Record 2473: State is MA")
	void StateOfRecord2473() {
		assertEquals("MA", customers.get(2472).getState());
	}

	@Test
	@DisplayName("Record 2473: ZIP is 1886")
	void ZIPOfRecord2473() {
		assertEquals("1886", customers.get(2472).getZIP());
	}

	@Test
	@DisplayName("Record 2473: Phone is 978-692-8567")
	void PhoneOfRecord2473() {
		assertEquals("978-692-8567", customers.get(2472).getPhone());
	}

	@Test
	@DisplayName("Record 2473: Fax is 978-692-4778")
	void FaxOfRecord2473() {
		assertEquals("978-692-4778", customers.get(2472).getFax());
	}

	@Test
	@DisplayName("Record 2473: Email is hosea@bowersock.com")
	void EmailOfRecord2473() {
		assertEquals("hosea@bowersock.com", customers.get(2472).getEmail());
	}

	@Test
	@DisplayName("Record 2473: Web is http://www.hoseabowersock.com")
	void WebOfRecord2473() {
		assertEquals("http://www.hoseabowersock.com", customers.get(2472).getWeb());
	}
}
