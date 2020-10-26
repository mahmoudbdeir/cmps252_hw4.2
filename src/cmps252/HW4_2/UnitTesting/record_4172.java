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

@Tag("45")
class Record_4172 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4172: FirstName is Mel")
	void FirstNameOfRecord4172() {
		assertEquals("Mel", customers.get(4171).getFirstName());
	}

	@Test
	@DisplayName("Record 4172: LastName is Pryer")
	void LastNameOfRecord4172() {
		assertEquals("Pryer", customers.get(4171).getLastName());
	}

	@Test
	@DisplayName("Record 4172: Company is Blackship Trading Co")
	void CompanyOfRecord4172() {
		assertEquals("Blackship Trading Co", customers.get(4171).getCompany());
	}

	@Test
	@DisplayName("Record 4172: Address is 91 Florida St")
	void AddressOfRecord4172() {
		assertEquals("91 Florida St", customers.get(4171).getAddress());
	}

	@Test
	@DisplayName("Record 4172: City is Farmingdale")
	void CityOfRecord4172() {
		assertEquals("Farmingdale", customers.get(4171).getCity());
	}

	@Test
	@DisplayName("Record 4172: County is Nassau")
	void CountyOfRecord4172() {
		assertEquals("Nassau", customers.get(4171).getCounty());
	}

	@Test
	@DisplayName("Record 4172: State is NY")
	void StateOfRecord4172() {
		assertEquals("NY", customers.get(4171).getState());
	}

	@Test
	@DisplayName("Record 4172: ZIP is 11735")
	void ZIPOfRecord4172() {
		assertEquals("11735", customers.get(4171).getZIP());
	}

	@Test
	@DisplayName("Record 4172: Phone is 516-694-8938")
	void PhoneOfRecord4172() {
		assertEquals("516-694-8938", customers.get(4171).getPhone());
	}

	@Test
	@DisplayName("Record 4172: Fax is 516-694-8281")
	void FaxOfRecord4172() {
		assertEquals("516-694-8281", customers.get(4171).getFax());
	}

	@Test
	@DisplayName("Record 4172: Email is mel@pryer.com")
	void EmailOfRecord4172() {
		assertEquals("mel@pryer.com", customers.get(4171).getEmail());
	}

	@Test
	@DisplayName("Record 4172: Web is http://www.melpryer.com")
	void WebOfRecord4172() {
		assertEquals("http://www.melpryer.com", customers.get(4171).getWeb());
	}
}
