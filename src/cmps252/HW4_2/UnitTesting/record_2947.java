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

@Tag("43")
class Record_2947 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2947: FirstName is Mickey")
	void FirstNameOfRecord2947() {
		assertEquals("Mickey", customers.get(2946).getFirstName());
	}

	@Test
	@DisplayName("Record 2947: LastName is Kellan")
	void LastNameOfRecord2947() {
		assertEquals("Kellan", customers.get(2946).getLastName());
	}

	@Test
	@DisplayName("Record 2947: Company is Sime Health")
	void CompanyOfRecord2947() {
		assertEquals("Sime Health", customers.get(2946).getCompany());
	}

	@Test
	@DisplayName("Record 2947: Address is 8204 N Lamar Blvd  #-816")
	void AddressOfRecord2947() {
		assertEquals("8204 N Lamar Blvd  #-816", customers.get(2946).getAddress());
	}

	@Test
	@DisplayName("Record 2947: City is Austin")
	void CityOfRecord2947() {
		assertEquals("Austin", customers.get(2946).getCity());
	}

	@Test
	@DisplayName("Record 2947: County is Travis")
	void CountyOfRecord2947() {
		assertEquals("Travis", customers.get(2946).getCounty());
	}

	@Test
	@DisplayName("Record 2947: State is TX")
	void StateOfRecord2947() {
		assertEquals("TX", customers.get(2946).getState());
	}

	@Test
	@DisplayName("Record 2947: ZIP is 78753")
	void ZIPOfRecord2947() {
		assertEquals("78753", customers.get(2946).getZIP());
	}

	@Test
	@DisplayName("Record 2947: Phone is 512-837-9366")
	void PhoneOfRecord2947() {
		assertEquals("512-837-9366", customers.get(2946).getPhone());
	}

	@Test
	@DisplayName("Record 2947: Fax is 512-837-8555")
	void FaxOfRecord2947() {
		assertEquals("512-837-8555", customers.get(2946).getFax());
	}

	@Test
	@DisplayName("Record 2947: Email is mickey@kellan.com")
	void EmailOfRecord2947() {
		assertEquals("mickey@kellan.com", customers.get(2946).getEmail());
	}

	@Test
	@DisplayName("Record 2947: Web is http://www.mickeykellan.com")
	void WebOfRecord2947() {
		assertEquals("http://www.mickeykellan.com", customers.get(2946).getWeb());
	}
}
