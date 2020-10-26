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

@Tag("22")
class Record_3634 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3634: FirstName is Bonita")
	void FirstNameOfRecord3634() {
		assertEquals("Bonita", customers.get(3633).getFirstName());
	}

	@Test
	@DisplayName("Record 3634: LastName is Potocki")
	void LastNameOfRecord3634() {
		assertEquals("Potocki", customers.get(3633).getLastName());
	}

	@Test
	@DisplayName("Record 3634: Company is Lifetime Dock & Lumber Inc")
	void CompanyOfRecord3634() {
		assertEquals("Lifetime Dock & Lumber Inc", customers.get(3633).getCompany());
	}

	@Test
	@DisplayName("Record 3634: Address is 1220 Fairport Rd")
	void AddressOfRecord3634() {
		assertEquals("1220 Fairport Rd", customers.get(3633).getAddress());
	}

	@Test
	@DisplayName("Record 3634: City is Fairport")
	void CityOfRecord3634() {
		assertEquals("Fairport", customers.get(3633).getCity());
	}

	@Test
	@DisplayName("Record 3634: County is Monroe")
	void CountyOfRecord3634() {
		assertEquals("Monroe", customers.get(3633).getCounty());
	}

	@Test
	@DisplayName("Record 3634: State is NY")
	void StateOfRecord3634() {
		assertEquals("NY", customers.get(3633).getState());
	}

	@Test
	@DisplayName("Record 3634: ZIP is 14450")
	void ZIPOfRecord3634() {
		assertEquals("14450", customers.get(3633).getZIP());
	}

	@Test
	@DisplayName("Record 3634: Phone is 585-865-0365")
	void PhoneOfRecord3634() {
		assertEquals("585-865-0365", customers.get(3633).getPhone());
	}

	@Test
	@DisplayName("Record 3634: Fax is 585-865-6367")
	void FaxOfRecord3634() {
		assertEquals("585-865-6367", customers.get(3633).getFax());
	}

	@Test
	@DisplayName("Record 3634: Email is bonita@potocki.com")
	void EmailOfRecord3634() {
		assertEquals("bonita@potocki.com", customers.get(3633).getEmail());
	}

	@Test
	@DisplayName("Record 3634: Web is http://www.bonitapotocki.com")
	void WebOfRecord3634() {
		assertEquals("http://www.bonitapotocki.com", customers.get(3633).getWeb());
	}
}
