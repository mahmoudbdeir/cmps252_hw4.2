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
class Record_4468 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4468: FirstName is Cleo")
	void FirstNameOfRecord4468() {
		assertEquals("Cleo", customers.get(4467).getFirstName());
	}

	@Test
	@DisplayName("Record 4468: LastName is Schader")
	void LastNameOfRecord4468() {
		assertEquals("Schader", customers.get(4467).getLastName());
	}

	@Test
	@DisplayName("Record 4468: Company is Landsberg Kent H Co")
	void CompanyOfRecord4468() {
		assertEquals("Landsberg Kent H Co", customers.get(4467).getCompany());
	}

	@Test
	@DisplayName("Record 4468: Address is 10 Orms St")
	void AddressOfRecord4468() {
		assertEquals("10 Orms St", customers.get(4467).getAddress());
	}

	@Test
	@DisplayName("Record 4468: City is Providence")
	void CityOfRecord4468() {
		assertEquals("Providence", customers.get(4467).getCity());
	}

	@Test
	@DisplayName("Record 4468: County is Providence")
	void CountyOfRecord4468() {
		assertEquals("Providence", customers.get(4467).getCounty());
	}

	@Test
	@DisplayName("Record 4468: State is RI")
	void StateOfRecord4468() {
		assertEquals("RI", customers.get(4467).getState());
	}

	@Test
	@DisplayName("Record 4468: ZIP is 2904")
	void ZIPOfRecord4468() {
		assertEquals("2904", customers.get(4467).getZIP());
	}

	@Test
	@DisplayName("Record 4468: Phone is 401-421-0676")
	void PhoneOfRecord4468() {
		assertEquals("401-421-0676", customers.get(4467).getPhone());
	}

	@Test
	@DisplayName("Record 4468: Fax is 401-421-1262")
	void FaxOfRecord4468() {
		assertEquals("401-421-1262", customers.get(4467).getFax());
	}

	@Test
	@DisplayName("Record 4468: Email is cleo@schader.com")
	void EmailOfRecord4468() {
		assertEquals("cleo@schader.com", customers.get(4467).getEmail());
	}

	@Test
	@DisplayName("Record 4468: Web is http://www.cleoschader.com")
	void WebOfRecord4468() {
		assertEquals("http://www.cleoschader.com", customers.get(4467).getWeb());
	}
}
