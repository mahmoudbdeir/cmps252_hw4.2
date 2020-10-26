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

@Tag("13")
class Record_353 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 353: FirstName is Chase")
	void FirstNameOfRecord353() {
		assertEquals("Chase", customers.get(352).getFirstName());
	}

	@Test
	@DisplayName("Record 353: LastName is Rosamond")
	void LastNameOfRecord353() {
		assertEquals("Rosamond", customers.get(352).getLastName());
	}

	@Test
	@DisplayName("Record 353: Company is Finesigns & Graphics")
	void CompanyOfRecord353() {
		assertEquals("Finesigns & Graphics", customers.get(352).getCompany());
	}

	@Test
	@DisplayName("Record 353: Address is 85 Hoffman Ln  #-f")
	void AddressOfRecord353() {
		assertEquals("85 Hoffman Ln  #-f", customers.get(352).getAddress());
	}

	@Test
	@DisplayName("Record 353: City is Hauppauge")
	void CityOfRecord353() {
		assertEquals("Hauppauge", customers.get(352).getCity());
	}

	@Test
	@DisplayName("Record 353: County is Suffolk")
	void CountyOfRecord353() {
		assertEquals("Suffolk", customers.get(352).getCounty());
	}

	@Test
	@DisplayName("Record 353: State is NY")
	void StateOfRecord353() {
		assertEquals("NY", customers.get(352).getState());
	}

	@Test
	@DisplayName("Record 353: ZIP is 11788")
	void ZIPOfRecord353() {
		assertEquals("11788", customers.get(352).getZIP());
	}

	@Test
	@DisplayName("Record 353: Phone is 631-436-2405")
	void PhoneOfRecord353() {
		assertEquals("631-436-2405", customers.get(352).getPhone());
	}

	@Test
	@DisplayName("Record 353: Fax is 631-436-7114")
	void FaxOfRecord353() {
		assertEquals("631-436-7114", customers.get(352).getFax());
	}

	@Test
	@DisplayName("Record 353: Email is chase@rosamond.com")
	void EmailOfRecord353() {
		assertEquals("chase@rosamond.com", customers.get(352).getEmail());
	}

	@Test
	@DisplayName("Record 353: Web is http://www.chaserosamond.com")
	void WebOfRecord353() {
		assertEquals("http://www.chaserosamond.com", customers.get(352).getWeb());
	}
}
