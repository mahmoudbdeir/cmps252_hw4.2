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

@Tag("49")
class Record_2712 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2712: FirstName is Jerrold")
	void FirstNameOfRecord2712() {
		assertEquals("Jerrold", customers.get(2711).getFirstName());
	}

	@Test
	@DisplayName("Record 2712: LastName is Bychner")
	void LastNameOfRecord2712() {
		assertEquals("Bychner", customers.get(2711).getLastName());
	}

	@Test
	@DisplayName("Record 2712: Company is Assembly Systems Inc")
	void CompanyOfRecord2712() {
		assertEquals("Assembly Systems Inc", customers.get(2711).getCompany());
	}

	@Test
	@DisplayName("Record 2712: Address is 4470 E Pacific Way")
	void AddressOfRecord2712() {
		assertEquals("4470 E Pacific Way", customers.get(2711).getAddress());
	}

	@Test
	@DisplayName("Record 2712: City is Los Angeles")
	void CityOfRecord2712() {
		assertEquals("Los Angeles", customers.get(2711).getCity());
	}

	@Test
	@DisplayName("Record 2712: County is Los Angeles")
	void CountyOfRecord2712() {
		assertEquals("Los Angeles", customers.get(2711).getCounty());
	}

	@Test
	@DisplayName("Record 2712: State is CA")
	void StateOfRecord2712() {
		assertEquals("CA", customers.get(2711).getState());
	}

	@Test
	@DisplayName("Record 2712: ZIP is 90023")
	void ZIPOfRecord2712() {
		assertEquals("90023", customers.get(2711).getZIP());
	}

	@Test
	@DisplayName("Record 2712: Phone is 323-263-9302")
	void PhoneOfRecord2712() {
		assertEquals("323-263-9302", customers.get(2711).getPhone());
	}

	@Test
	@DisplayName("Record 2712: Fax is 323-263-4248")
	void FaxOfRecord2712() {
		assertEquals("323-263-4248", customers.get(2711).getFax());
	}

	@Test
	@DisplayName("Record 2712: Email is jerrold@bychner.com")
	void EmailOfRecord2712() {
		assertEquals("jerrold@bychner.com", customers.get(2711).getEmail());
	}

	@Test
	@DisplayName("Record 2712: Web is http://www.jerroldbychner.com")
	void WebOfRecord2712() {
		assertEquals("http://www.jerroldbychner.com", customers.get(2711).getWeb());
	}
}
