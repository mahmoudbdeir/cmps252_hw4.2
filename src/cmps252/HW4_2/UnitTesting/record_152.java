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
class Record_152 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 152: FirstName is Genevieve")
	void FirstNameOfRecord152() {
		assertEquals("Genevieve", customers.get(151).getFirstName());
	}

	@Test
	@DisplayName("Record 152: LastName is Seebeam")
	void LastNameOfRecord152() {
		assertEquals("Seebeam", customers.get(151).getLastName());
	}

	@Test
	@DisplayName("Record 152: Company is Integrated Health Services")
	void CompanyOfRecord152() {
		assertEquals("Integrated Health Services", customers.get(151).getCompany());
	}

	@Test
	@DisplayName("Record 152: Address is 1111 W Main St")
	void AddressOfRecord152() {
		assertEquals("1111 W Main St", customers.get(151).getAddress());
	}

	@Test
	@DisplayName("Record 152: City is Charlottesville")
	void CityOfRecord152() {
		assertEquals("Charlottesville", customers.get(151).getCity());
	}

	@Test
	@DisplayName("Record 152: County is Charlottesville City")
	void CountyOfRecord152() {
		assertEquals("Charlottesville City", customers.get(151).getCounty());
	}

	@Test
	@DisplayName("Record 152: State is VA")
	void StateOfRecord152() {
		assertEquals("VA", customers.get(151).getState());
	}

	@Test
	@DisplayName("Record 152: ZIP is 22903")
	void ZIPOfRecord152() {
		assertEquals("22903", customers.get(151).getZIP());
	}

	@Test
	@DisplayName("Record 152: Phone is 434-977-0491")
	void PhoneOfRecord152() {
		assertEquals("434-977-0491", customers.get(151).getPhone());
	}

	@Test
	@DisplayName("Record 152: Fax is 434-977-4257")
	void FaxOfRecord152() {
		assertEquals("434-977-4257", customers.get(151).getFax());
	}

	@Test
	@DisplayName("Record 152: Email is genevieve@seebeam.com")
	void EmailOfRecord152() {
		assertEquals("genevieve@seebeam.com", customers.get(151).getEmail());
	}

	@Test
	@DisplayName("Record 152: Web is http://www.genevieveseebeam.com")
	void WebOfRecord152() {
		assertEquals("http://www.genevieveseebeam.com", customers.get(151).getWeb());
	}
}
