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

@Tag("2")
class Record_4693 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4693: FirstName is Quincy")
	void FirstNameOfRecord4693() {
		assertEquals("Quincy", customers.get(4692).getFirstName());
	}

	@Test
	@DisplayName("Record 4693: LastName is Blunt")
	void LastNameOfRecord4693() {
		assertEquals("Blunt", customers.get(4692).getLastName());
	}

	@Test
	@DisplayName("Record 4693: Company is Park Environmental Services")
	void CompanyOfRecord4693() {
		assertEquals("Park Environmental Services", customers.get(4692).getCompany());
	}

	@Test
	@DisplayName("Record 4693: Address is 100 Bliss Ave")
	void AddressOfRecord4693() {
		assertEquals("100 Bliss Ave", customers.get(4692).getAddress());
	}

	@Test
	@DisplayName("Record 4693: City is Pittsburg")
	void CityOfRecord4693() {
		assertEquals("Pittsburg", customers.get(4692).getCity());
	}

	@Test
	@DisplayName("Record 4693: County is Contra Costa")
	void CountyOfRecord4693() {
		assertEquals("Contra Costa", customers.get(4692).getCounty());
	}

	@Test
	@DisplayName("Record 4693: State is CA")
	void StateOfRecord4693() {
		assertEquals("CA", customers.get(4692).getState());
	}

	@Test
	@DisplayName("Record 4693: ZIP is 94565")
	void ZIPOfRecord4693() {
		assertEquals("94565", customers.get(4692).getZIP());
	}

	@Test
	@DisplayName("Record 4693: Phone is 925-432-2419")
	void PhoneOfRecord4693() {
		assertEquals("925-432-2419", customers.get(4692).getPhone());
	}

	@Test
	@DisplayName("Record 4693: Fax is 925-432-0381")
	void FaxOfRecord4693() {
		assertEquals("925-432-0381", customers.get(4692).getFax());
	}

	@Test
	@DisplayName("Record 4693: Email is quincy@blunt.com")
	void EmailOfRecord4693() {
		assertEquals("quincy@blunt.com", customers.get(4692).getEmail());
	}

	@Test
	@DisplayName("Record 4693: Web is http://www.quincyblunt.com")
	void WebOfRecord4693() {
		assertEquals("http://www.quincyblunt.com", customers.get(4692).getWeb());
	}
}
