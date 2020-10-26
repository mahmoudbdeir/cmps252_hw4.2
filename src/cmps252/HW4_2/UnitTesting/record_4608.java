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

@Tag("47")
class Record_4608 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4608: FirstName is Clement")
	void FirstNameOfRecord4608() {
		assertEquals("Clement", customers.get(4607).getFirstName());
	}

	@Test
	@DisplayName("Record 4608: LastName is Gazzara")
	void LastNameOfRecord4608() {
		assertEquals("Gazzara", customers.get(4607).getLastName());
	}

	@Test
	@DisplayName("Record 4608: Company is National Soft Drink Assn")
	void CompanyOfRecord4608() {
		assertEquals("National Soft Drink Assn", customers.get(4607).getCompany());
	}

	@Test
	@DisplayName("Record 4608: Address is 106 South St")
	void AddressOfRecord4608() {
		assertEquals("106 South St", customers.get(4607).getAddress());
	}

	@Test
	@DisplayName("Record 4608: City is Easton")
	void CityOfRecord4608() {
		assertEquals("Easton", customers.get(4607).getCity());
	}

	@Test
	@DisplayName("Record 4608: County is Talbot")
	void CountyOfRecord4608() {
		assertEquals("Talbot", customers.get(4607).getCounty());
	}

	@Test
	@DisplayName("Record 4608: State is MD")
	void StateOfRecord4608() {
		assertEquals("MD", customers.get(4607).getState());
	}

	@Test
	@DisplayName("Record 4608: ZIP is 21601")
	void ZIPOfRecord4608() {
		assertEquals("21601", customers.get(4607).getZIP());
	}

	@Test
	@DisplayName("Record 4608: Phone is 410-822-8388")
	void PhoneOfRecord4608() {
		assertEquals("410-822-8388", customers.get(4607).getPhone());
	}

	@Test
	@DisplayName("Record 4608: Fax is 410-822-9905")
	void FaxOfRecord4608() {
		assertEquals("410-822-9905", customers.get(4607).getFax());
	}

	@Test
	@DisplayName("Record 4608: Email is clement@gazzara.com")
	void EmailOfRecord4608() {
		assertEquals("clement@gazzara.com", customers.get(4607).getEmail());
	}

	@Test
	@DisplayName("Record 4608: Web is http://www.clementgazzara.com")
	void WebOfRecord4608() {
		assertEquals("http://www.clementgazzara.com", customers.get(4607).getWeb());
	}
}
