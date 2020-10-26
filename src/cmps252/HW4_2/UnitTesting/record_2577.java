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

@Tag("7")
class Record_2577 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2577: FirstName is Wiley")
	void FirstNameOfRecord2577() {
		assertEquals("Wiley", customers.get(2576).getFirstName());
	}

	@Test
	@DisplayName("Record 2577: LastName is Alltop")
	void LastNameOfRecord2577() {
		assertEquals("Alltop", customers.get(2576).getLastName());
	}

	@Test
	@DisplayName("Record 2577: Company is Donahue, Mark L Esq")
	void CompanyOfRecord2577() {
		assertEquals("Donahue, Mark L Esq", customers.get(2576).getCompany());
	}

	@Test
	@DisplayName("Record 2577: Address is 390 Middletown Blvd")
	void AddressOfRecord2577() {
		assertEquals("390 Middletown Blvd", customers.get(2576).getAddress());
	}

	@Test
	@DisplayName("Record 2577: City is Langhorne")
	void CityOfRecord2577() {
		assertEquals("Langhorne", customers.get(2576).getCity());
	}

	@Test
	@DisplayName("Record 2577: County is Bucks")
	void CountyOfRecord2577() {
		assertEquals("Bucks", customers.get(2576).getCounty());
	}

	@Test
	@DisplayName("Record 2577: State is PA")
	void StateOfRecord2577() {
		assertEquals("PA", customers.get(2576).getState());
	}

	@Test
	@DisplayName("Record 2577: ZIP is 19047")
	void ZIPOfRecord2577() {
		assertEquals("19047", customers.get(2576).getZIP());
	}

	@Test
	@DisplayName("Record 2577: Phone is 215-752-8853")
	void PhoneOfRecord2577() {
		assertEquals("215-752-8853", customers.get(2576).getPhone());
	}

	@Test
	@DisplayName("Record 2577: Fax is 215-752-6928")
	void FaxOfRecord2577() {
		assertEquals("215-752-6928", customers.get(2576).getFax());
	}

	@Test
	@DisplayName("Record 2577: Email is wiley@alltop.com")
	void EmailOfRecord2577() {
		assertEquals("wiley@alltop.com", customers.get(2576).getEmail());
	}

	@Test
	@DisplayName("Record 2577: Web is http://www.wileyalltop.com")
	void WebOfRecord2577() {
		assertEquals("http://www.wileyalltop.com", customers.get(2576).getWeb());
	}
}
