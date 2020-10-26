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

@Tag("43")
class Record_2354 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2354: FirstName is Adrienne")
	void FirstNameOfRecord2354() {
		assertEquals("Adrienne", customers.get(2353).getFirstName());
	}

	@Test
	@DisplayName("Record 2354: LastName is Fonda")
	void LastNameOfRecord2354() {
		assertEquals("Fonda", customers.get(2353).getLastName());
	}

	@Test
	@DisplayName("Record 2354: Company is Business Reader")
	void CompanyOfRecord2354() {
		assertEquals("Business Reader", customers.get(2353).getCompany());
	}

	@Test
	@DisplayName("Record 2354: Address is 731 N 14th St")
	void AddressOfRecord2354() {
		assertEquals("731 N 14th St", customers.get(2353).getAddress());
	}

	@Test
	@DisplayName("Record 2354: City is Leesburg")
	void CityOfRecord2354() {
		assertEquals("Leesburg", customers.get(2353).getCity());
	}

	@Test
	@DisplayName("Record 2354: County is Lake")
	void CountyOfRecord2354() {
		assertEquals("Lake", customers.get(2353).getCounty());
	}

	@Test
	@DisplayName("Record 2354: State is FL")
	void StateOfRecord2354() {
		assertEquals("FL", customers.get(2353).getState());
	}

	@Test
	@DisplayName("Record 2354: ZIP is 34748")
	void ZIPOfRecord2354() {
		assertEquals("34748", customers.get(2353).getZIP());
	}

	@Test
	@DisplayName("Record 2354: Phone is 352-326-8029")
	void PhoneOfRecord2354() {
		assertEquals("352-326-8029", customers.get(2353).getPhone());
	}

	@Test
	@DisplayName("Record 2354: Fax is 352-326-3884")
	void FaxOfRecord2354() {
		assertEquals("352-326-3884", customers.get(2353).getFax());
	}

	@Test
	@DisplayName("Record 2354: Email is adrienne@fonda.com")
	void EmailOfRecord2354() {
		assertEquals("adrienne@fonda.com", customers.get(2353).getEmail());
	}

	@Test
	@DisplayName("Record 2354: Web is http://www.adriennefonda.com")
	void WebOfRecord2354() {
		assertEquals("http://www.adriennefonda.com", customers.get(2353).getWeb());
	}
}
