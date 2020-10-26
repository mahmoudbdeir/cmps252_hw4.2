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

@Tag("5")
class Record_4543 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4543: FirstName is Kory")
	void FirstNameOfRecord4543() {
		assertEquals("Kory", customers.get(4542).getFirstName());
	}

	@Test
	@DisplayName("Record 4543: LastName is Pius")
	void LastNameOfRecord4543() {
		assertEquals("Pius", customers.get(4542).getLastName());
	}

	@Test
	@DisplayName("Record 4543: Company is Glendale Truss Ind")
	void CompanyOfRecord4543() {
		assertEquals("Glendale Truss Ind", customers.get(4542).getCompany());
	}

	@Test
	@DisplayName("Record 4543: Address is 41 E 57th St")
	void AddressOfRecord4543() {
		assertEquals("41 E 57th St", customers.get(4542).getAddress());
	}

	@Test
	@DisplayName("Record 4543: City is New York")
	void CityOfRecord4543() {
		assertEquals("New York", customers.get(4542).getCity());
	}

	@Test
	@DisplayName("Record 4543: County is New York")
	void CountyOfRecord4543() {
		assertEquals("New York", customers.get(4542).getCounty());
	}

	@Test
	@DisplayName("Record 4543: State is NY")
	void StateOfRecord4543() {
		assertEquals("NY", customers.get(4542).getState());
	}

	@Test
	@DisplayName("Record 4543: ZIP is 10022")
	void ZIPOfRecord4543() {
		assertEquals("10022", customers.get(4542).getZIP());
	}

	@Test
	@DisplayName("Record 4543: Phone is 212-832-4532")
	void PhoneOfRecord4543() {
		assertEquals("212-832-4532", customers.get(4542).getPhone());
	}

	@Test
	@DisplayName("Record 4543: Fax is 212-832-4189")
	void FaxOfRecord4543() {
		assertEquals("212-832-4189", customers.get(4542).getFax());
	}

	@Test
	@DisplayName("Record 4543: Email is kory@pius.com")
	void EmailOfRecord4543() {
		assertEquals("kory@pius.com", customers.get(4542).getEmail());
	}

	@Test
	@DisplayName("Record 4543: Web is http://www.korypius.com")
	void WebOfRecord4543() {
		assertEquals("http://www.korypius.com", customers.get(4542).getWeb());
	}
}
