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
class Record_4221 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4221: FirstName is Foster")
	void FirstNameOfRecord4221() {
		assertEquals("Foster", customers.get(4220).getFirstName());
	}

	@Test
	@DisplayName("Record 4221: LastName is Hasegawa")
	void LastNameOfRecord4221() {
		assertEquals("Hasegawa", customers.get(4220).getLastName());
	}

	@Test
	@DisplayName("Record 4221: Company is Miles, John C Esq")
	void CompanyOfRecord4221() {
		assertEquals("Miles, John C Esq", customers.get(4220).getCompany());
	}

	@Test
	@DisplayName("Record 4221: Address is 521 Lakehurst Rd")
	void AddressOfRecord4221() {
		assertEquals("521 Lakehurst Rd", customers.get(4220).getAddress());
	}

	@Test
	@DisplayName("Record 4221: City is Browns Mills")
	void CityOfRecord4221() {
		assertEquals("Browns Mills", customers.get(4220).getCity());
	}

	@Test
	@DisplayName("Record 4221: County is Burlington")
	void CountyOfRecord4221() {
		assertEquals("Burlington", customers.get(4220).getCounty());
	}

	@Test
	@DisplayName("Record 4221: State is NJ")
	void StateOfRecord4221() {
		assertEquals("NJ", customers.get(4220).getState());
	}

	@Test
	@DisplayName("Record 4221: ZIP is 8015")
	void ZIPOfRecord4221() {
		assertEquals("8015", customers.get(4220).getZIP());
	}

	@Test
	@DisplayName("Record 4221: Phone is 609-893-4428")
	void PhoneOfRecord4221() {
		assertEquals("609-893-4428", customers.get(4220).getPhone());
	}

	@Test
	@DisplayName("Record 4221: Fax is 609-893-9504")
	void FaxOfRecord4221() {
		assertEquals("609-893-9504", customers.get(4220).getFax());
	}

	@Test
	@DisplayName("Record 4221: Email is foster@hasegawa.com")
	void EmailOfRecord4221() {
		assertEquals("foster@hasegawa.com", customers.get(4220).getEmail());
	}

	@Test
	@DisplayName("Record 4221: Web is http://www.fosterhasegawa.com")
	void WebOfRecord4221() {
		assertEquals("http://www.fosterhasegawa.com", customers.get(4220).getWeb());
	}
}
