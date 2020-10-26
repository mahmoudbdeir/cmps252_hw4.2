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
class Record_2984 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2984: FirstName is Brenton")
	void FirstNameOfRecord2984() {
		assertEquals("Brenton", customers.get(2983).getFirstName());
	}

	@Test
	@DisplayName("Record 2984: LastName is Donathan")
	void LastNameOfRecord2984() {
		assertEquals("Donathan", customers.get(2983).getLastName());
	}

	@Test
	@DisplayName("Record 2984: Company is Meyers Corbox Co Inc")
	void CompanyOfRecord2984() {
		assertEquals("Meyers Corbox Co Inc", customers.get(2983).getCompany());
	}

	@Test
	@DisplayName("Record 2984: Address is 2235 S 170th St")
	void AddressOfRecord2984() {
		assertEquals("2235 S 170th St", customers.get(2983).getAddress());
	}

	@Test
	@DisplayName("Record 2984: City is New Berlin")
	void CityOfRecord2984() {
		assertEquals("New Berlin", customers.get(2983).getCity());
	}

	@Test
	@DisplayName("Record 2984: County is Waukesha")
	void CountyOfRecord2984() {
		assertEquals("Waukesha", customers.get(2983).getCounty());
	}

	@Test
	@DisplayName("Record 2984: State is WI")
	void StateOfRecord2984() {
		assertEquals("WI", customers.get(2983).getState());
	}

	@Test
	@DisplayName("Record 2984: ZIP is 53151")
	void ZIPOfRecord2984() {
		assertEquals("53151", customers.get(2983).getZIP());
	}

	@Test
	@DisplayName("Record 2984: Phone is 262-786-1197")
	void PhoneOfRecord2984() {
		assertEquals("262-786-1197", customers.get(2983).getPhone());
	}

	@Test
	@DisplayName("Record 2984: Fax is 262-786-6676")
	void FaxOfRecord2984() {
		assertEquals("262-786-6676", customers.get(2983).getFax());
	}

	@Test
	@DisplayName("Record 2984: Email is brenton@donathan.com")
	void EmailOfRecord2984() {
		assertEquals("brenton@donathan.com", customers.get(2983).getEmail());
	}

	@Test
	@DisplayName("Record 2984: Web is http://www.brentondonathan.com")
	void WebOfRecord2984() {
		assertEquals("http://www.brentondonathan.com", customers.get(2983).getWeb());
	}
}
