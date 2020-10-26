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

@Tag("10")
class Record_4699 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4699: FirstName is Antonio")
	void FirstNameOfRecord4699() {
		assertEquals("Antonio", customers.get(4698).getFirstName());
	}

	@Test
	@DisplayName("Record 4699: LastName is Buczek")
	void LastNameOfRecord4699() {
		assertEquals("Buczek", customers.get(4698).getLastName());
	}

	@Test
	@DisplayName("Record 4699: Company is Kbbt The Beat 970")
	void CompanyOfRecord4699() {
		assertEquals("Kbbt The Beat 970", customers.get(4698).getCompany());
	}

	@Test
	@DisplayName("Record 4699: Address is 767 Brooks St")
	void AddressOfRecord4699() {
		assertEquals("767 Brooks St", customers.get(4698).getAddress());
	}

	@Test
	@DisplayName("Record 4699: City is Ontario")
	void CityOfRecord4699() {
		assertEquals("Ontario", customers.get(4698).getCity());
	}

	@Test
	@DisplayName("Record 4699: County is San Bernardino")
	void CountyOfRecord4699() {
		assertEquals("San Bernardino", customers.get(4698).getCounty());
	}

	@Test
	@DisplayName("Record 4699: State is CA")
	void StateOfRecord4699() {
		assertEquals("CA", customers.get(4698).getState());
	}

	@Test
	@DisplayName("Record 4699: ZIP is 91762")
	void ZIPOfRecord4699() {
		assertEquals("91762", customers.get(4698).getZIP());
	}

	@Test
	@DisplayName("Record 4699: Phone is 909-333-2597")
	void PhoneOfRecord4699() {
		assertEquals("909-333-2597", customers.get(4698).getPhone());
	}

	@Test
	@DisplayName("Record 4699: Fax is 909-333-1026")
	void FaxOfRecord4699() {
		assertEquals("909-333-1026", customers.get(4698).getFax());
	}

	@Test
	@DisplayName("Record 4699: Email is antonio@buczek.com")
	void EmailOfRecord4699() {
		assertEquals("antonio@buczek.com", customers.get(4698).getEmail());
	}

	@Test
	@DisplayName("Record 4699: Web is http://www.antoniobuczek.com")
	void WebOfRecord4699() {
		assertEquals("http://www.antoniobuczek.com", customers.get(4698).getWeb());
	}
}
