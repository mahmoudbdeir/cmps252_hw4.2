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

@Tag("17")
class Record_3303 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3303: FirstName is Michelle")
	void FirstNameOfRecord3303() {
		assertEquals("Michelle", customers.get(3302).getFirstName());
	}

	@Test
	@DisplayName("Record 3303: LastName is Denick")
	void LastNameOfRecord3303() {
		assertEquals("Denick", customers.get(3302).getLastName());
	}

	@Test
	@DisplayName("Record 3303: Company is J L Marcus Stores")
	void CompanyOfRecord3303() {
		assertEquals("J L Marcus Stores", customers.get(3302).getCompany());
	}

	@Test
	@DisplayName("Record 3303: Address is 1320 19th St Nw")
	void AddressOfRecord3303() {
		assertEquals("1320 19th St Nw", customers.get(3302).getAddress());
	}

	@Test
	@DisplayName("Record 3303: City is Washington")
	void CityOfRecord3303() {
		assertEquals("Washington", customers.get(3302).getCity());
	}

	@Test
	@DisplayName("Record 3303: County is District of Columbia")
	void CountyOfRecord3303() {
		assertEquals("District of Columbia", customers.get(3302).getCounty());
	}

	@Test
	@DisplayName("Record 3303: State is DC")
	void StateOfRecord3303() {
		assertEquals("DC", customers.get(3302).getState());
	}

	@Test
	@DisplayName("Record 3303: ZIP is 20036")
	void ZIPOfRecord3303() {
		assertEquals("20036", customers.get(3302).getZIP());
	}

	@Test
	@DisplayName("Record 3303: Phone is 202-833-4331")
	void PhoneOfRecord3303() {
		assertEquals("202-833-4331", customers.get(3302).getPhone());
	}

	@Test
	@DisplayName("Record 3303: Fax is 202-833-6421")
	void FaxOfRecord3303() {
		assertEquals("202-833-6421", customers.get(3302).getFax());
	}

	@Test
	@DisplayName("Record 3303: Email is michelle@denick.com")
	void EmailOfRecord3303() {
		assertEquals("michelle@denick.com", customers.get(3302).getEmail());
	}

	@Test
	@DisplayName("Record 3303: Web is http://www.michelledenick.com")
	void WebOfRecord3303() {
		assertEquals("http://www.michelledenick.com", customers.get(3302).getWeb());
	}
}
