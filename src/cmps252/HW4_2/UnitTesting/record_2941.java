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

@Tag("27")
class Record_2941 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2941: FirstName is Sammy")
	void FirstNameOfRecord2941() {
		assertEquals("Sammy", customers.get(2940).getFirstName());
	}

	@Test
	@DisplayName("Record 2941: LastName is Hootsell")
	void LastNameOfRecord2941() {
		assertEquals("Hootsell", customers.get(2940).getLastName());
	}

	@Test
	@DisplayName("Record 2941: Company is White Brothers Trucking Inc")
	void CompanyOfRecord2941() {
		assertEquals("White Brothers Trucking Inc", customers.get(2940).getCompany());
	}

	@Test
	@DisplayName("Record 2941: Address is 2622 Nottingham Way")
	void AddressOfRecord2941() {
		assertEquals("2622 Nottingham Way", customers.get(2940).getAddress());
	}

	@Test
	@DisplayName("Record 2941: City is Trenton")
	void CityOfRecord2941() {
		assertEquals("Trenton", customers.get(2940).getCity());
	}

	@Test
	@DisplayName("Record 2941: County is Mercer")
	void CountyOfRecord2941() {
		assertEquals("Mercer", customers.get(2940).getCounty());
	}

	@Test
	@DisplayName("Record 2941: State is NJ")
	void StateOfRecord2941() {
		assertEquals("NJ", customers.get(2940).getState());
	}

	@Test
	@DisplayName("Record 2941: ZIP is 8619")
	void ZIPOfRecord2941() {
		assertEquals("8619", customers.get(2940).getZIP());
	}

	@Test
	@DisplayName("Record 2941: Phone is 609-586-5621")
	void PhoneOfRecord2941() {
		assertEquals("609-586-5621", customers.get(2940).getPhone());
	}

	@Test
	@DisplayName("Record 2941: Fax is 609-586-7546")
	void FaxOfRecord2941() {
		assertEquals("609-586-7546", customers.get(2940).getFax());
	}

	@Test
	@DisplayName("Record 2941: Email is sammy@hootsell.com")
	void EmailOfRecord2941() {
		assertEquals("sammy@hootsell.com", customers.get(2940).getEmail());
	}

	@Test
	@DisplayName("Record 2941: Web is http://www.sammyhootsell.com")
	void WebOfRecord2941() {
		assertEquals("http://www.sammyhootsell.com", customers.get(2940).getWeb());
	}
}
