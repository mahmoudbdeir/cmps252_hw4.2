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

@Tag("19")
class Record_4306 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4306: FirstName is Krystal")
	void FirstNameOfRecord4306() {
		assertEquals("Krystal", customers.get(4305).getFirstName());
	}

	@Test
	@DisplayName("Record 4306: LastName is Apker")
	void LastNameOfRecord4306() {
		assertEquals("Apker", customers.get(4305).getLastName());
	}

	@Test
	@DisplayName("Record 4306: Company is Littlefield, Brad Esq")
	void CompanyOfRecord4306() {
		assertEquals("Littlefield, Brad Esq", customers.get(4305).getCompany());
	}

	@Test
	@DisplayName("Record 4306: Address is 111 E Kilbourn Ave")
	void AddressOfRecord4306() {
		assertEquals("111 E Kilbourn Ave", customers.get(4305).getAddress());
	}

	@Test
	@DisplayName("Record 4306: City is Milwaukee")
	void CityOfRecord4306() {
		assertEquals("Milwaukee", customers.get(4305).getCity());
	}

	@Test
	@DisplayName("Record 4306: County is Milwaukee")
	void CountyOfRecord4306() {
		assertEquals("Milwaukee", customers.get(4305).getCounty());
	}

	@Test
	@DisplayName("Record 4306: State is WI")
	void StateOfRecord4306() {
		assertEquals("WI", customers.get(4305).getState());
	}

	@Test
	@DisplayName("Record 4306: ZIP is 53202")
	void ZIPOfRecord4306() {
		assertEquals("53202", customers.get(4305).getZIP());
	}

	@Test
	@DisplayName("Record 4306: Phone is 414-291-1515")
	void PhoneOfRecord4306() {
		assertEquals("414-291-1515", customers.get(4305).getPhone());
	}

	@Test
	@DisplayName("Record 4306: Fax is 414-291-9113")
	void FaxOfRecord4306() {
		assertEquals("414-291-9113", customers.get(4305).getFax());
	}

	@Test
	@DisplayName("Record 4306: Email is krystal@apker.com")
	void EmailOfRecord4306() {
		assertEquals("krystal@apker.com", customers.get(4305).getEmail());
	}

	@Test
	@DisplayName("Record 4306: Web is http://www.krystalapker.com")
	void WebOfRecord4306() {
		assertEquals("http://www.krystalapker.com", customers.get(4305).getWeb());
	}
}
