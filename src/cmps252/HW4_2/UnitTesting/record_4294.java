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

@Tag("48")
class Record_4294 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4294: FirstName is Tillie")
	void FirstNameOfRecord4294() {
		assertEquals("Tillie", customers.get(4293).getFirstName());
	}

	@Test
	@DisplayName("Record 4294: LastName is Crenshaw")
	void LastNameOfRecord4294() {
		assertEquals("Crenshaw", customers.get(4293).getLastName());
	}

	@Test
	@DisplayName("Record 4294: Company is Orlite Applncs & Elec Miami")
	void CompanyOfRecord4294() {
		assertEquals("Orlite Applncs & Elec Miami", customers.get(4293).getCompany());
	}

	@Test
	@DisplayName("Record 4294: Address is 15a W Pine St")
	void AddressOfRecord4294() {
		assertEquals("15a W Pine St", customers.get(4293).getAddress());
	}

	@Test
	@DisplayName("Record 4294: City is Lodi")
	void CityOfRecord4294() {
		assertEquals("Lodi", customers.get(4293).getCity());
	}

	@Test
	@DisplayName("Record 4294: County is San Joaquin")
	void CountyOfRecord4294() {
		assertEquals("San Joaquin", customers.get(4293).getCounty());
	}

	@Test
	@DisplayName("Record 4294: State is CA")
	void StateOfRecord4294() {
		assertEquals("CA", customers.get(4293).getState());
	}

	@Test
	@DisplayName("Record 4294: ZIP is 95240")
	void ZIPOfRecord4294() {
		assertEquals("95240", customers.get(4293).getZIP());
	}

	@Test
	@DisplayName("Record 4294: Phone is 209-369-7492")
	void PhoneOfRecord4294() {
		assertEquals("209-369-7492", customers.get(4293).getPhone());
	}

	@Test
	@DisplayName("Record 4294: Fax is 209-369-2707")
	void FaxOfRecord4294() {
		assertEquals("209-369-2707", customers.get(4293).getFax());
	}

	@Test
	@DisplayName("Record 4294: Email is tillie@crenshaw.com")
	void EmailOfRecord4294() {
		assertEquals("tillie@crenshaw.com", customers.get(4293).getEmail());
	}

	@Test
	@DisplayName("Record 4294: Web is http://www.tilliecrenshaw.com")
	void WebOfRecord4294() {
		assertEquals("http://www.tilliecrenshaw.com", customers.get(4293).getWeb());
	}
}
