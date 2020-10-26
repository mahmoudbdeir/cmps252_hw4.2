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
class Record_252 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 252: FirstName is Dominick")
	void FirstNameOfRecord252() {
		assertEquals("Dominick", customers.get(251).getFirstName());
	}

	@Test
	@DisplayName("Record 252: LastName is Husbands")
	void LastNameOfRecord252() {
		assertEquals("Husbands", customers.get(251).getLastName());
	}

	@Test
	@DisplayName("Record 252: Company is B&b Trucking & Storage Co")
	void CompanyOfRecord252() {
		assertEquals("B&b Trucking & Storage Co", customers.get(251).getCompany());
	}

	@Test
	@DisplayName("Record 252: Address is 430 New Brooklyn Rd")
	void AddressOfRecord252() {
		assertEquals("430 New Brooklyn Rd", customers.get(251).getAddress());
	}

	@Test
	@DisplayName("Record 252: City is Williamstown")
	void CityOfRecord252() {
		assertEquals("Williamstown", customers.get(251).getCity());
	}

	@Test
	@DisplayName("Record 252: County is Gloucester")
	void CountyOfRecord252() {
		assertEquals("Gloucester", customers.get(251).getCounty());
	}

	@Test
	@DisplayName("Record 252: State is NJ")
	void StateOfRecord252() {
		assertEquals("NJ", customers.get(251).getState());
	}

	@Test
	@DisplayName("Record 252: ZIP is 8094")
	void ZIPOfRecord252() {
		assertEquals("8094", customers.get(251).getZIP());
	}

	@Test
	@DisplayName("Record 252: Phone is 856-629-5499")
	void PhoneOfRecord252() {
		assertEquals("856-629-5499", customers.get(251).getPhone());
	}

	@Test
	@DisplayName("Record 252: Fax is 856-629-3662")
	void FaxOfRecord252() {
		assertEquals("856-629-3662", customers.get(251).getFax());
	}

	@Test
	@DisplayName("Record 252: Email is dominick@husbands.com")
	void EmailOfRecord252() {
		assertEquals("dominick@husbands.com", customers.get(251).getEmail());
	}

	@Test
	@DisplayName("Record 252: Web is http://www.dominickhusbands.com")
	void WebOfRecord252() {
		assertEquals("http://www.dominickhusbands.com", customers.get(251).getWeb());
	}
}
