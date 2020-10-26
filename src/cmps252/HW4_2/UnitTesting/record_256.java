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

@Tag("35")
class Record_256 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 256: FirstName is Andreas")
	void FirstNameOfRecord256() {
		assertEquals("Andreas", customers.get(255).getFirstName());
	}

	@Test
	@DisplayName("Record 256: LastName is Fam")
	void LastNameOfRecord256() {
		assertEquals("Fam", customers.get(255).getLastName());
	}

	@Test
	@DisplayName("Record 256: Company is Express Printing")
	void CompanyOfRecord256() {
		assertEquals("Express Printing", customers.get(255).getCompany());
	}

	@Test
	@DisplayName("Record 256: Address is 1030 W Marina Dr")
	void AddressOfRecord256() {
		assertEquals("1030 W Marina Dr", customers.get(255).getAddress());
	}

	@Test
	@DisplayName("Record 256: City is Moses Lake")
	void CityOfRecord256() {
		assertEquals("Moses Lake", customers.get(255).getCity());
	}

	@Test
	@DisplayName("Record 256: County is Grant")
	void CountyOfRecord256() {
		assertEquals("Grant", customers.get(255).getCounty());
	}

	@Test
	@DisplayName("Record 256: State is WA")
	void StateOfRecord256() {
		assertEquals("WA", customers.get(255).getState());
	}

	@Test
	@DisplayName("Record 256: ZIP is 98837")
	void ZIPOfRecord256() {
		assertEquals("98837", customers.get(255).getZIP());
	}

	@Test
	@DisplayName("Record 256: Phone is 509-765-1021")
	void PhoneOfRecord256() {
		assertEquals("509-765-1021", customers.get(255).getPhone());
	}

	@Test
	@DisplayName("Record 256: Fax is 509-765-0279")
	void FaxOfRecord256() {
		assertEquals("509-765-0279", customers.get(255).getFax());
	}

	@Test
	@DisplayName("Record 256: Email is andreas@fam.com")
	void EmailOfRecord256() {
		assertEquals("andreas@fam.com", customers.get(255).getEmail());
	}

	@Test
	@DisplayName("Record 256: Web is http://www.andreasfam.com")
	void WebOfRecord256() {
		assertEquals("http://www.andreasfam.com", customers.get(255).getWeb());
	}
}
