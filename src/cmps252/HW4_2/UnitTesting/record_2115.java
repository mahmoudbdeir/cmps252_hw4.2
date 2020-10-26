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
class Record_2115 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2115: FirstName is Winona")
	void FirstNameOfRecord2115() {
		assertEquals("Winona", customers.get(2114).getFirstName());
	}

	@Test
	@DisplayName("Record 2115: LastName is Miras")
	void LastNameOfRecord2115() {
		assertEquals("Miras", customers.get(2114).getLastName());
	}

	@Test
	@DisplayName("Record 2115: Company is Custom Box And Packaging Corp")
	void CompanyOfRecord2115() {
		assertEquals("Custom Box And Packaging Corp", customers.get(2114).getCompany());
	}

	@Test
	@DisplayName("Record 2115: Address is 70 Washington St")
	void AddressOfRecord2115() {
		assertEquals("70 Washington St", customers.get(2114).getAddress());
	}

	@Test
	@DisplayName("Record 2115: City is Brooklyn")
	void CityOfRecord2115() {
		assertEquals("Brooklyn", customers.get(2114).getCity());
	}

	@Test
	@DisplayName("Record 2115: County is Kings")
	void CountyOfRecord2115() {
		assertEquals("Kings", customers.get(2114).getCounty());
	}

	@Test
	@DisplayName("Record 2115: State is NY")
	void StateOfRecord2115() {
		assertEquals("NY", customers.get(2114).getState());
	}

	@Test
	@DisplayName("Record 2115: ZIP is 11201")
	void ZIPOfRecord2115() {
		assertEquals("11201", customers.get(2114).getZIP());
	}

	@Test
	@DisplayName("Record 2115: Phone is 718-554-1702")
	void PhoneOfRecord2115() {
		assertEquals("718-554-1702", customers.get(2114).getPhone());
	}

	@Test
	@DisplayName("Record 2115: Fax is 718-554-0502")
	void FaxOfRecord2115() {
		assertEquals("718-554-0502", customers.get(2114).getFax());
	}

	@Test
	@DisplayName("Record 2115: Email is winona@miras.com")
	void EmailOfRecord2115() {
		assertEquals("winona@miras.com", customers.get(2114).getEmail());
	}

	@Test
	@DisplayName("Record 2115: Web is http://www.winonamiras.com")
	void WebOfRecord2115() {
		assertEquals("http://www.winonamiras.com", customers.get(2114).getWeb());
	}
}
