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

@Tag("6")
class Record_4435 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4435: FirstName is Janelle")
	void FirstNameOfRecord4435() {
		assertEquals("Janelle", customers.get(4434).getFirstName());
	}

	@Test
	@DisplayName("Record 4435: LastName is Trump")
	void LastNameOfRecord4435() {
		assertEquals("Trump", customers.get(4434).getLastName());
	}

	@Test
	@DisplayName("Record 4435: Company is South Valley Circuits Inc")
	void CompanyOfRecord4435() {
		assertEquals("South Valley Circuits Inc", customers.get(4434).getCompany());
	}

	@Test
	@DisplayName("Record 4435: Address is 1310 N 2nd St")
	void AddressOfRecord4435() {
		assertEquals("1310 N 2nd St", customers.get(4434).getAddress());
	}

	@Test
	@DisplayName("Record 4435: City is Philadelphia")
	void CityOfRecord4435() {
		assertEquals("Philadelphia", customers.get(4434).getCity());
	}

	@Test
	@DisplayName("Record 4435: County is Philadelphia")
	void CountyOfRecord4435() {
		assertEquals("Philadelphia", customers.get(4434).getCounty());
	}

	@Test
	@DisplayName("Record 4435: State is PA")
	void StateOfRecord4435() {
		assertEquals("PA", customers.get(4434).getState());
	}

	@Test
	@DisplayName("Record 4435: ZIP is 19122")
	void ZIPOfRecord4435() {
		assertEquals("19122", customers.get(4434).getZIP());
	}

	@Test
	@DisplayName("Record 4435: Phone is 215-425-2471")
	void PhoneOfRecord4435() {
		assertEquals("215-425-2471", customers.get(4434).getPhone());
	}

	@Test
	@DisplayName("Record 4435: Fax is 215-425-2946")
	void FaxOfRecord4435() {
		assertEquals("215-425-2946", customers.get(4434).getFax());
	}

	@Test
	@DisplayName("Record 4435: Email is janelle@trump.com")
	void EmailOfRecord4435() {
		assertEquals("janelle@trump.com", customers.get(4434).getEmail());
	}

	@Test
	@DisplayName("Record 4435: Web is http://www.janelletrump.com")
	void WebOfRecord4435() {
		assertEquals("http://www.janelletrump.com", customers.get(4434).getWeb());
	}
}
