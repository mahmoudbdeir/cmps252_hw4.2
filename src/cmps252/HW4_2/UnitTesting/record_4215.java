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

@Tag("39")
class Record_4215 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4215: FirstName is Ola")
	void FirstNameOfRecord4215() {
		assertEquals("Ola", customers.get(4214).getFirstName());
	}

	@Test
	@DisplayName("Record 4215: LastName is Kommer")
	void LastNameOfRecord4215() {
		assertEquals("Kommer", customers.get(4214).getLastName());
	}

	@Test
	@DisplayName("Record 4215: Company is Herbert The Boyer Co")
	void CompanyOfRecord4215() {
		assertEquals("Herbert The Boyer Co", customers.get(4214).getCompany());
	}

	@Test
	@DisplayName("Record 4215: Address is 2040 W Main St")
	void AddressOfRecord4215() {
		assertEquals("2040 W Main St", customers.get(4214).getAddress());
	}

	@Test
	@DisplayName("Record 4215: City is Rapid City")
	void CityOfRecord4215() {
		assertEquals("Rapid City", customers.get(4214).getCity());
	}

	@Test
	@DisplayName("Record 4215: County is Pennington")
	void CountyOfRecord4215() {
		assertEquals("Pennington", customers.get(4214).getCounty());
	}

	@Test
	@DisplayName("Record 4215: State is SD")
	void StateOfRecord4215() {
		assertEquals("SD", customers.get(4214).getState());
	}

	@Test
	@DisplayName("Record 4215: ZIP is 57702")
	void ZIPOfRecord4215() {
		assertEquals("57702", customers.get(4214).getZIP());
	}

	@Test
	@DisplayName("Record 4215: Phone is 605-342-9286")
	void PhoneOfRecord4215() {
		assertEquals("605-342-9286", customers.get(4214).getPhone());
	}

	@Test
	@DisplayName("Record 4215: Fax is 605-342-9157")
	void FaxOfRecord4215() {
		assertEquals("605-342-9157", customers.get(4214).getFax());
	}

	@Test
	@DisplayName("Record 4215: Email is ola@kommer.com")
	void EmailOfRecord4215() {
		assertEquals("ola@kommer.com", customers.get(4214).getEmail());
	}

	@Test
	@DisplayName("Record 4215: Web is http://www.olakommer.com")
	void WebOfRecord4215() {
		assertEquals("http://www.olakommer.com", customers.get(4214).getWeb());
	}
}
