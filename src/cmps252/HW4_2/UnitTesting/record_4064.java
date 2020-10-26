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

@Tag("34")
class Record_4064 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4064: FirstName is Cassie")
	void FirstNameOfRecord4064() {
		assertEquals("Cassie", customers.get(4063).getFirstName());
	}

	@Test
	@DisplayName("Record 4064: LastName is Tanzosch")
	void LastNameOfRecord4064() {
		assertEquals("Tanzosch", customers.get(4063).getLastName());
	}

	@Test
	@DisplayName("Record 4064: Company is B & P Lamp Supply Inc")
	void CompanyOfRecord4064() {
		assertEquals("B & P Lamp Supply Inc", customers.get(4063).getCompany());
	}

	@Test
	@DisplayName("Record 4064: Address is 2919 University Ave")
	void AddressOfRecord4064() {
		assertEquals("2919 University Ave", customers.get(4063).getAddress());
	}

	@Test
	@DisplayName("Record 4064: City is Madison")
	void CityOfRecord4064() {
		assertEquals("Madison", customers.get(4063).getCity());
	}

	@Test
	@DisplayName("Record 4064: County is Dane")
	void CountyOfRecord4064() {
		assertEquals("Dane", customers.get(4063).getCounty());
	}

	@Test
	@DisplayName("Record 4064: State is WI")
	void StateOfRecord4064() {
		assertEquals("WI", customers.get(4063).getState());
	}

	@Test
	@DisplayName("Record 4064: ZIP is 53705")
	void ZIPOfRecord4064() {
		assertEquals("53705", customers.get(4063).getZIP());
	}

	@Test
	@DisplayName("Record 4064: Phone is 608-231-0343")
	void PhoneOfRecord4064() {
		assertEquals("608-231-0343", customers.get(4063).getPhone());
	}

	@Test
	@DisplayName("Record 4064: Fax is 608-231-8795")
	void FaxOfRecord4064() {
		assertEquals("608-231-8795", customers.get(4063).getFax());
	}

	@Test
	@DisplayName("Record 4064: Email is cassie@tanzosch.com")
	void EmailOfRecord4064() {
		assertEquals("cassie@tanzosch.com", customers.get(4063).getEmail());
	}

	@Test
	@DisplayName("Record 4064: Web is http://www.cassietanzosch.com")
	void WebOfRecord4064() {
		assertEquals("http://www.cassietanzosch.com", customers.get(4063).getWeb());
	}
}
