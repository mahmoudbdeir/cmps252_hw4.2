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

@Tag("14")
class Record_3732 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3732: FirstName is Blair")
	void FirstNameOfRecord3732() {
		assertEquals("Blair", customers.get(3731).getFirstName());
	}

	@Test
	@DisplayName("Record 3732: LastName is Coples")
	void LastNameOfRecord3732() {
		assertEquals("Coples", customers.get(3731).getLastName());
	}

	@Test
	@DisplayName("Record 3732: Company is Sunbelt Telecommunications Inc")
	void CompanyOfRecord3732() {
		assertEquals("Sunbelt Telecommunications Inc", customers.get(3731).getCompany());
	}

	@Test
	@DisplayName("Record 3732: Address is 131 S Bolmar St")
	void AddressOfRecord3732() {
		assertEquals("131 S Bolmar St", customers.get(3731).getAddress());
	}

	@Test
	@DisplayName("Record 3732: City is West Chester")
	void CityOfRecord3732() {
		assertEquals("West Chester", customers.get(3731).getCity());
	}

	@Test
	@DisplayName("Record 3732: County is Chester")
	void CountyOfRecord3732() {
		assertEquals("Chester", customers.get(3731).getCounty());
	}

	@Test
	@DisplayName("Record 3732: State is PA")
	void StateOfRecord3732() {
		assertEquals("PA", customers.get(3731).getState());
	}

	@Test
	@DisplayName("Record 3732: ZIP is 19382")
	void ZIPOfRecord3732() {
		assertEquals("19382", customers.get(3731).getZIP());
	}

	@Test
	@DisplayName("Record 3732: Phone is 610-696-3423")
	void PhoneOfRecord3732() {
		assertEquals("610-696-3423", customers.get(3731).getPhone());
	}

	@Test
	@DisplayName("Record 3732: Fax is 610-696-2808")
	void FaxOfRecord3732() {
		assertEquals("610-696-2808", customers.get(3731).getFax());
	}

	@Test
	@DisplayName("Record 3732: Email is blair@coples.com")
	void EmailOfRecord3732() {
		assertEquals("blair@coples.com", customers.get(3731).getEmail());
	}

	@Test
	@DisplayName("Record 3732: Web is http://www.blaircoples.com")
	void WebOfRecord3732() {
		assertEquals("http://www.blaircoples.com", customers.get(3731).getWeb());
	}
}
