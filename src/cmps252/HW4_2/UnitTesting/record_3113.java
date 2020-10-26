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

@Tag("16")
class Record_3113 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3113: FirstName is Wayne")
	void FirstNameOfRecord3113() {
		assertEquals("Wayne", customers.get(3112).getFirstName());
	}

	@Test
	@DisplayName("Record 3113: LastName is Kurtulus")
	void LastNameOfRecord3113() {
		assertEquals("Kurtulus", customers.get(3112).getLastName());
	}

	@Test
	@DisplayName("Record 3113: Company is Bonner, Mark Esq")
	void CompanyOfRecord3113() {
		assertEquals("Bonner, Mark Esq", customers.get(3112).getCompany());
	}

	@Test
	@DisplayName("Record 3113: Address is 501 Centerville Rd")
	void AddressOfRecord3113() {
		assertEquals("501 Centerville Rd", customers.get(3112).getAddress());
	}

	@Test
	@DisplayName("Record 3113: City is Warwick")
	void CityOfRecord3113() {
		assertEquals("Warwick", customers.get(3112).getCity());
	}

	@Test
	@DisplayName("Record 3113: County is Kent")
	void CountyOfRecord3113() {
		assertEquals("Kent", customers.get(3112).getCounty());
	}

	@Test
	@DisplayName("Record 3113: State is RI")
	void StateOfRecord3113() {
		assertEquals("RI", customers.get(3112).getState());
	}

	@Test
	@DisplayName("Record 3113: ZIP is 2886")
	void ZIPOfRecord3113() {
		assertEquals("2886", customers.get(3112).getZIP());
	}

	@Test
	@DisplayName("Record 3113: Phone is 401-732-4009")
	void PhoneOfRecord3113() {
		assertEquals("401-732-4009", customers.get(3112).getPhone());
	}

	@Test
	@DisplayName("Record 3113: Fax is 401-732-3843")
	void FaxOfRecord3113() {
		assertEquals("401-732-3843", customers.get(3112).getFax());
	}

	@Test
	@DisplayName("Record 3113: Email is wayne@kurtulus.com")
	void EmailOfRecord3113() {
		assertEquals("wayne@kurtulus.com", customers.get(3112).getEmail());
	}

	@Test
	@DisplayName("Record 3113: Web is http://www.waynekurtulus.com")
	void WebOfRecord3113() {
		assertEquals("http://www.waynekurtulus.com", customers.get(3112).getWeb());
	}
}
