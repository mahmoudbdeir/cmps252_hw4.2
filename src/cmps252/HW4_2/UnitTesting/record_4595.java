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

@Tag("45")
class Record_4595 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4595: FirstName is Rubin")
	void FirstNameOfRecord4595() {
		assertEquals("Rubin", customers.get(4594).getFirstName());
	}

	@Test
	@DisplayName("Record 4595: LastName is Dettore")
	void LastNameOfRecord4595() {
		assertEquals("Dettore", customers.get(4594).getLastName());
	}

	@Test
	@DisplayName("Record 4595: Company is Ocs Management Corporation")
	void CompanyOfRecord4595() {
		assertEquals("Ocs Management Corporation", customers.get(4594).getCompany());
	}

	@Test
	@DisplayName("Record 4595: Address is 5125 Macarthur Blvd Nw  #-50")
	void AddressOfRecord4595() {
		assertEquals("5125 Macarthur Blvd Nw  #-50", customers.get(4594).getAddress());
	}

	@Test
	@DisplayName("Record 4595: City is Washington")
	void CityOfRecord4595() {
		assertEquals("Washington", customers.get(4594).getCity());
	}

	@Test
	@DisplayName("Record 4595: County is District of Columbia")
	void CountyOfRecord4595() {
		assertEquals("District of Columbia", customers.get(4594).getCounty());
	}

	@Test
	@DisplayName("Record 4595: State is DC")
	void StateOfRecord4595() {
		assertEquals("DC", customers.get(4594).getState());
	}

	@Test
	@DisplayName("Record 4595: ZIP is 20016")
	void ZIPOfRecord4595() {
		assertEquals("20016", customers.get(4594).getZIP());
	}

	@Test
	@DisplayName("Record 4595: Phone is 202-364-7030")
	void PhoneOfRecord4595() {
		assertEquals("202-364-7030", customers.get(4594).getPhone());
	}

	@Test
	@DisplayName("Record 4595: Fax is 202-364-2874")
	void FaxOfRecord4595() {
		assertEquals("202-364-2874", customers.get(4594).getFax());
	}

	@Test
	@DisplayName("Record 4595: Email is rubin@dettore.com")
	void EmailOfRecord4595() {
		assertEquals("rubin@dettore.com", customers.get(4594).getEmail());
	}

	@Test
	@DisplayName("Record 4595: Web is http://www.rubindettore.com")
	void WebOfRecord4595() {
		assertEquals("http://www.rubindettore.com", customers.get(4594).getWeb());
	}
}
