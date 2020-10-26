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

@Tag("26")
class Record_3808 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3808: FirstName is Candida")
	void FirstNameOfRecord3808() {
		assertEquals("Candida", customers.get(3807).getFirstName());
	}

	@Test
	@DisplayName("Record 3808: LastName is Sogol")
	void LastNameOfRecord3808() {
		assertEquals("Sogol", customers.get(3807).getLastName());
	}

	@Test
	@DisplayName("Record 3808: Company is Buffalo Color Corporation")
	void CompanyOfRecord3808() {
		assertEquals("Buffalo Color Corporation", customers.get(3807).getCompany());
	}

	@Test
	@DisplayName("Record 3808: Address is 15002 Woodworth Rd")
	void AddressOfRecord3808() {
		assertEquals("15002 Woodworth Rd", customers.get(3807).getAddress());
	}

	@Test
	@DisplayName("Record 3808: City is Cleveland")
	void CityOfRecord3808() {
		assertEquals("Cleveland", customers.get(3807).getCity());
	}

	@Test
	@DisplayName("Record 3808: County is Cuyahoga")
	void CountyOfRecord3808() {
		assertEquals("Cuyahoga", customers.get(3807).getCounty());
	}

	@Test
	@DisplayName("Record 3808: State is OH")
	void StateOfRecord3808() {
		assertEquals("OH", customers.get(3807).getState());
	}

	@Test
	@DisplayName("Record 3808: ZIP is 44110")
	void ZIPOfRecord3808() {
		assertEquals("44110", customers.get(3807).getZIP());
	}

	@Test
	@DisplayName("Record 3808: Phone is 216-761-5582")
	void PhoneOfRecord3808() {
		assertEquals("216-761-5582", customers.get(3807).getPhone());
	}

	@Test
	@DisplayName("Record 3808: Fax is 216-761-5845")
	void FaxOfRecord3808() {
		assertEquals("216-761-5845", customers.get(3807).getFax());
	}

	@Test
	@DisplayName("Record 3808: Email is candida@sogol.com")
	void EmailOfRecord3808() {
		assertEquals("candida@sogol.com", customers.get(3807).getEmail());
	}

	@Test
	@DisplayName("Record 3808: Web is http://www.candidasogol.com")
	void WebOfRecord3808() {
		assertEquals("http://www.candidasogol.com", customers.get(3807).getWeb());
	}
}
