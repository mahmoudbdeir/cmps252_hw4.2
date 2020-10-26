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
class Record_4140 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4140: FirstName is Beverly")
	void FirstNameOfRecord4140() {
		assertEquals("Beverly", customers.get(4139).getFirstName());
	}

	@Test
	@DisplayName("Record 4140: LastName is Trelles")
	void LastNameOfRecord4140() {
		assertEquals("Trelles", customers.get(4139).getLastName());
	}

	@Test
	@DisplayName("Record 4140: Company is Advance Office Equip & Supl Co")
	void CompanyOfRecord4140() {
		assertEquals("Advance Office Equip & Supl Co", customers.get(4139).getCompany());
	}

	@Test
	@DisplayName("Record 4140: Address is 3302 N Greenfield Rd")
	void AddressOfRecord4140() {
		assertEquals("3302 N Greenfield Rd", customers.get(4139).getAddress());
	}

	@Test
	@DisplayName("Record 4140: City is Mesa")
	void CityOfRecord4140() {
		assertEquals("Mesa", customers.get(4139).getCity());
	}

	@Test
	@DisplayName("Record 4140: County is Maricopa")
	void CountyOfRecord4140() {
		assertEquals("Maricopa", customers.get(4139).getCounty());
	}

	@Test
	@DisplayName("Record 4140: State is AZ")
	void StateOfRecord4140() {
		assertEquals("AZ", customers.get(4139).getState());
	}

	@Test
	@DisplayName("Record 4140: ZIP is 85215")
	void ZIPOfRecord4140() {
		assertEquals("85215", customers.get(4139).getZIP());
	}

	@Test
	@DisplayName("Record 4140: Phone is 480-396-2075")
	void PhoneOfRecord4140() {
		assertEquals("480-396-2075", customers.get(4139).getPhone());
	}

	@Test
	@DisplayName("Record 4140: Fax is 480-396-5456")
	void FaxOfRecord4140() {
		assertEquals("480-396-5456", customers.get(4139).getFax());
	}

	@Test
	@DisplayName("Record 4140: Email is beverly@trelles.com")
	void EmailOfRecord4140() {
		assertEquals("beverly@trelles.com", customers.get(4139).getEmail());
	}

	@Test
	@DisplayName("Record 4140: Web is http://www.beverlytrelles.com")
	void WebOfRecord4140() {
		assertEquals("http://www.beverlytrelles.com", customers.get(4139).getWeb());
	}
}
