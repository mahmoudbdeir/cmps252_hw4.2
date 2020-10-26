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

@Tag("24")
class Record_4662 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4662: FirstName is Abe")
	void FirstNameOfRecord4662() {
		assertEquals("Abe", customers.get(4661).getFirstName());
	}

	@Test
	@DisplayName("Record 4662: LastName is Holterman")
	void LastNameOfRecord4662() {
		assertEquals("Holterman", customers.get(4661).getLastName());
	}

	@Test
	@DisplayName("Record 4662: Company is Lewis & Miller")
	void CompanyOfRecord4662() {
		assertEquals("Lewis & Miller", customers.get(4661).getCompany());
	}

	@Test
	@DisplayName("Record 4662: Address is 8320 Guilford Rd")
	void AddressOfRecord4662() {
		assertEquals("8320 Guilford Rd", customers.get(4661).getAddress());
	}

	@Test
	@DisplayName("Record 4662: City is Columbia")
	void CityOfRecord4662() {
		assertEquals("Columbia", customers.get(4661).getCity());
	}

	@Test
	@DisplayName("Record 4662: County is Howard")
	void CountyOfRecord4662() {
		assertEquals("Howard", customers.get(4661).getCounty());
	}

	@Test
	@DisplayName("Record 4662: State is MD")
	void StateOfRecord4662() {
		assertEquals("MD", customers.get(4661).getState());
	}

	@Test
	@DisplayName("Record 4662: ZIP is 21046")
	void ZIPOfRecord4662() {
		assertEquals("21046", customers.get(4661).getZIP());
	}

	@Test
	@DisplayName("Record 4662: Phone is 410-290-8533")
	void PhoneOfRecord4662() {
		assertEquals("410-290-8533", customers.get(4661).getPhone());
	}

	@Test
	@DisplayName("Record 4662: Fax is 410-290-2651")
	void FaxOfRecord4662() {
		assertEquals("410-290-2651", customers.get(4661).getFax());
	}

	@Test
	@DisplayName("Record 4662: Email is abe@holterman.com")
	void EmailOfRecord4662() {
		assertEquals("abe@holterman.com", customers.get(4661).getEmail());
	}

	@Test
	@DisplayName("Record 4662: Web is http://www.abeholterman.com")
	void WebOfRecord4662() {
		assertEquals("http://www.abeholterman.com", customers.get(4661).getWeb());
	}
}
