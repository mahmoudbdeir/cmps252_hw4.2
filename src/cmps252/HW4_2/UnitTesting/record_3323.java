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

@Tag("40")
class Record_3323 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3323: FirstName is Joe")
	void FirstNameOfRecord3323() {
		assertEquals("Joe", customers.get(3322).getFirstName());
	}

	@Test
	@DisplayName("Record 3323: LastName is Muszynski")
	void LastNameOfRecord3323() {
		assertEquals("Muszynski", customers.get(3322).getLastName());
	}

	@Test
	@DisplayName("Record 3323: Company is Drafto Corp")
	void CompanyOfRecord3323() {
		assertEquals("Drafto Corp", customers.get(3322).getCompany());
	}

	@Test
	@DisplayName("Record 3323: Address is 1999 Harrison St")
	void AddressOfRecord3323() {
		assertEquals("1999 Harrison St", customers.get(3322).getAddress());
	}

	@Test
	@DisplayName("Record 3323: City is Oakland")
	void CityOfRecord3323() {
		assertEquals("Oakland", customers.get(3322).getCity());
	}

	@Test
	@DisplayName("Record 3323: County is Alameda")
	void CountyOfRecord3323() {
		assertEquals("Alameda", customers.get(3322).getCounty());
	}

	@Test
	@DisplayName("Record 3323: State is CA")
	void StateOfRecord3323() {
		assertEquals("CA", customers.get(3322).getState());
	}

	@Test
	@DisplayName("Record 3323: ZIP is 94612")
	void ZIPOfRecord3323() {
		assertEquals("94612", customers.get(3322).getZIP());
	}

	@Test
	@DisplayName("Record 3323: Phone is 510-273-4713")
	void PhoneOfRecord3323() {
		assertEquals("510-273-4713", customers.get(3322).getPhone());
	}

	@Test
	@DisplayName("Record 3323: Fax is 510-273-3505")
	void FaxOfRecord3323() {
		assertEquals("510-273-3505", customers.get(3322).getFax());
	}

	@Test
	@DisplayName("Record 3323: Email is joe@muszynski.com")
	void EmailOfRecord3323() {
		assertEquals("joe@muszynski.com", customers.get(3322).getEmail());
	}

	@Test
	@DisplayName("Record 3323: Web is http://www.joemuszynski.com")
	void WebOfRecord3323() {
		assertEquals("http://www.joemuszynski.com", customers.get(3322).getWeb());
	}
}
