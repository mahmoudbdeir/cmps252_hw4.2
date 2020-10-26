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

@Tag("41")
class Record_4013 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4013: FirstName is Rosario")
	void FirstNameOfRecord4013() {
		assertEquals("Rosario", customers.get(4012).getFirstName());
	}

	@Test
	@DisplayName("Record 4013: LastName is Fritchman")
	void LastNameOfRecord4013() {
		assertEquals("Fritchman", customers.get(4012).getLastName());
	}

	@Test
	@DisplayName("Record 4013: Company is Kupd 98 Fm")
	void CompanyOfRecord4013() {
		assertEquals("Kupd 98 Fm", customers.get(4012).getCompany());
	}

	@Test
	@DisplayName("Record 4013: Address is 555 Walnut St")
	void AddressOfRecord4013() {
		assertEquals("555 Walnut St", customers.get(4012).getAddress());
	}

	@Test
	@DisplayName("Record 4013: City is Abilene")
	void CityOfRecord4013() {
		assertEquals("Abilene", customers.get(4012).getCity());
	}

	@Test
	@DisplayName("Record 4013: County is Taylor")
	void CountyOfRecord4013() {
		assertEquals("Taylor", customers.get(4012).getCounty());
	}

	@Test
	@DisplayName("Record 4013: State is TX")
	void StateOfRecord4013() {
		assertEquals("TX", customers.get(4012).getState());
	}

	@Test
	@DisplayName("Record 4013: ZIP is 79601")
	void ZIPOfRecord4013() {
		assertEquals("79601", customers.get(4012).getZIP());
	}

	@Test
	@DisplayName("Record 4013: Phone is 325-676-3265")
	void PhoneOfRecord4013() {
		assertEquals("325-676-3265", customers.get(4012).getPhone());
	}

	@Test
	@DisplayName("Record 4013: Fax is 325-676-9009")
	void FaxOfRecord4013() {
		assertEquals("325-676-9009", customers.get(4012).getFax());
	}

	@Test
	@DisplayName("Record 4013: Email is rosario@fritchman.com")
	void EmailOfRecord4013() {
		assertEquals("rosario@fritchman.com", customers.get(4012).getEmail());
	}

	@Test
	@DisplayName("Record 4013: Web is http://www.rosariofritchman.com")
	void WebOfRecord4013() {
		assertEquals("http://www.rosariofritchman.com", customers.get(4012).getWeb());
	}
}
