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

@Tag("9")
class Record_2727 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2727: FirstName is Cody")
	void FirstNameOfRecord2727() {
		assertEquals("Cody", customers.get(2726).getFirstName());
	}

	@Test
	@DisplayName("Record 2727: LastName is Woester")
	void LastNameOfRecord2727() {
		assertEquals("Woester", customers.get(2726).getLastName());
	}

	@Test
	@DisplayName("Record 2727: Company is Gni Group Inc")
	void CompanyOfRecord2727() {
		assertEquals("Gni Group Inc", customers.get(2726).getCompany());
	}

	@Test
	@DisplayName("Record 2727: Address is 189 Glen Cove Ave")
	void AddressOfRecord2727() {
		assertEquals("189 Glen Cove Ave", customers.get(2726).getAddress());
	}

	@Test
	@DisplayName("Record 2727: City is Sea Cliff")
	void CityOfRecord2727() {
		assertEquals("Sea Cliff", customers.get(2726).getCity());
	}

	@Test
	@DisplayName("Record 2727: County is Nassau")
	void CountyOfRecord2727() {
		assertEquals("Nassau", customers.get(2726).getCounty());
	}

	@Test
	@DisplayName("Record 2727: State is NY")
	void StateOfRecord2727() {
		assertEquals("NY", customers.get(2726).getState());
	}

	@Test
	@DisplayName("Record 2727: ZIP is 11579")
	void ZIPOfRecord2727() {
		assertEquals("11579", customers.get(2726).getZIP());
	}

	@Test
	@DisplayName("Record 2727: Phone is 516-676-6910")
	void PhoneOfRecord2727() {
		assertEquals("516-676-6910", customers.get(2726).getPhone());
	}

	@Test
	@DisplayName("Record 2727: Fax is 516-676-0883")
	void FaxOfRecord2727() {
		assertEquals("516-676-0883", customers.get(2726).getFax());
	}

	@Test
	@DisplayName("Record 2727: Email is cody@woester.com")
	void EmailOfRecord2727() {
		assertEquals("cody@woester.com", customers.get(2726).getEmail());
	}

	@Test
	@DisplayName("Record 2727: Web is http://www.codywoester.com")
	void WebOfRecord2727() {
		assertEquals("http://www.codywoester.com", customers.get(2726).getWeb());
	}
}
