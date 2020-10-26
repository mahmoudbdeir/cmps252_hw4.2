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

@Tag("33")
class Record_4342 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4342: FirstName is Sammy")
	void FirstNameOfRecord4342() {
		assertEquals("Sammy", customers.get(4341).getFirstName());
	}

	@Test
	@DisplayName("Record 4342: LastName is Hammerschmidt")
	void LastNameOfRecord4342() {
		assertEquals("Hammerschmidt", customers.get(4341).getLastName());
	}

	@Test
	@DisplayName("Record 4342: Company is J Construction")
	void CompanyOfRecord4342() {
		assertEquals("J Construction", customers.get(4341).getCompany());
	}

	@Test
	@DisplayName("Record 4342: Address is 8626 Queens Blvd")
	void AddressOfRecord4342() {
		assertEquals("8626 Queens Blvd", customers.get(4341).getAddress());
	}

	@Test
	@DisplayName("Record 4342: City is Elmhurst")
	void CityOfRecord4342() {
		assertEquals("Elmhurst", customers.get(4341).getCity());
	}

	@Test
	@DisplayName("Record 4342: County is Queens")
	void CountyOfRecord4342() {
		assertEquals("Queens", customers.get(4341).getCounty());
	}

	@Test
	@DisplayName("Record 4342: State is NY")
	void StateOfRecord4342() {
		assertEquals("NY", customers.get(4341).getState());
	}

	@Test
	@DisplayName("Record 4342: ZIP is 11373")
	void ZIPOfRecord4342() {
		assertEquals("11373", customers.get(4341).getZIP());
	}

	@Test
	@DisplayName("Record 4342: Phone is 718-565-1486")
	void PhoneOfRecord4342() {
		assertEquals("718-565-1486", customers.get(4341).getPhone());
	}

	@Test
	@DisplayName("Record 4342: Fax is 718-565-7571")
	void FaxOfRecord4342() {
		assertEquals("718-565-7571", customers.get(4341).getFax());
	}

	@Test
	@DisplayName("Record 4342: Email is sammy@hammerschmidt.com")
	void EmailOfRecord4342() {
		assertEquals("sammy@hammerschmidt.com", customers.get(4341).getEmail());
	}

	@Test
	@DisplayName("Record 4342: Web is http://www.sammyhammerschmidt.com")
	void WebOfRecord4342() {
		assertEquals("http://www.sammyhammerschmidt.com", customers.get(4341).getWeb());
	}
}
