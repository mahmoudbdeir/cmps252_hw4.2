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

@Tag("12")
class Record_3974 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3974: FirstName is Justine")
	void FirstNameOfRecord3974() {
		assertEquals("Justine", customers.get(3973).getFirstName());
	}

	@Test
	@DisplayName("Record 3974: LastName is Newstrom")
	void LastNameOfRecord3974() {
		assertEquals("Newstrom", customers.get(3973).getLastName());
	}

	@Test
	@DisplayName("Record 3974: Company is Leader Times")
	void CompanyOfRecord3974() {
		assertEquals("Leader Times", customers.get(3973).getCompany());
	}

	@Test
	@DisplayName("Record 3974: Address is 961268 Waihona St")
	void AddressOfRecord3974() {
		assertEquals("961268 Waihona St", customers.get(3973).getAddress());
	}

	@Test
	@DisplayName("Record 3974: City is Pearl City")
	void CityOfRecord3974() {
		assertEquals("Pearl City", customers.get(3973).getCity());
	}

	@Test
	@DisplayName("Record 3974: County is Honolulu")
	void CountyOfRecord3974() {
		assertEquals("Honolulu", customers.get(3973).getCounty());
	}

	@Test
	@DisplayName("Record 3974: State is HI")
	void StateOfRecord3974() {
		assertEquals("HI", customers.get(3973).getState());
	}

	@Test
	@DisplayName("Record 3974: ZIP is 96782")
	void ZIPOfRecord3974() {
		assertEquals("96782", customers.get(3973).getZIP());
	}

	@Test
	@DisplayName("Record 3974: Phone is 808-456-3109")
	void PhoneOfRecord3974() {
		assertEquals("808-456-3109", customers.get(3973).getPhone());
	}

	@Test
	@DisplayName("Record 3974: Fax is 808-456-1779")
	void FaxOfRecord3974() {
		assertEquals("808-456-1779", customers.get(3973).getFax());
	}

	@Test
	@DisplayName("Record 3974: Email is justine@newstrom.com")
	void EmailOfRecord3974() {
		assertEquals("justine@newstrom.com", customers.get(3973).getEmail());
	}

	@Test
	@DisplayName("Record 3974: Web is http://www.justinenewstrom.com")
	void WebOfRecord3974() {
		assertEquals("http://www.justinenewstrom.com", customers.get(3973).getWeb());
	}
}
