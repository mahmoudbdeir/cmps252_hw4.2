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

@Tag("30")
class Record_529 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 529: FirstName is Homer")
	void FirstNameOfRecord529() {
		assertEquals("Homer", customers.get(528).getFirstName());
	}

	@Test
	@DisplayName("Record 529: LastName is Croak")
	void LastNameOfRecord529() {
		assertEquals("Croak", customers.get(528).getLastName());
	}

	@Test
	@DisplayName("Record 529: Company is Security Enforcers")
	void CompanyOfRecord529() {
		assertEquals("Security Enforcers", customers.get(528).getCompany());
	}

	@Test
	@DisplayName("Record 529: Address is 3255 W Osborn Rd")
	void AddressOfRecord529() {
		assertEquals("3255 W Osborn Rd", customers.get(528).getAddress());
	}

	@Test
	@DisplayName("Record 529: City is Phoenix")
	void CityOfRecord529() {
		assertEquals("Phoenix", customers.get(528).getCity());
	}

	@Test
	@DisplayName("Record 529: County is Maricopa")
	void CountyOfRecord529() {
		assertEquals("Maricopa", customers.get(528).getCounty());
	}

	@Test
	@DisplayName("Record 529: State is AZ")
	void StateOfRecord529() {
		assertEquals("AZ", customers.get(528).getState());
	}

	@Test
	@DisplayName("Record 529: ZIP is 85017")
	void ZIPOfRecord529() {
		assertEquals("85017", customers.get(528).getZIP());
	}

	@Test
	@DisplayName("Record 529: Phone is 602-269-7796")
	void PhoneOfRecord529() {
		assertEquals("602-269-7796", customers.get(528).getPhone());
	}

	@Test
	@DisplayName("Record 529: Fax is 602-269-6256")
	void FaxOfRecord529() {
		assertEquals("602-269-6256", customers.get(528).getFax());
	}

	@Test
	@DisplayName("Record 529: Email is homer@croak.com")
	void EmailOfRecord529() {
		assertEquals("homer@croak.com", customers.get(528).getEmail());
	}

	@Test
	@DisplayName("Record 529: Web is http://www.homercroak.com")
	void WebOfRecord529() {
		assertEquals("http://www.homercroak.com", customers.get(528).getWeb());
	}
}
