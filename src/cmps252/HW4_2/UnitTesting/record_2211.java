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

@Tag("35")
class Record_2211 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2211: FirstName is Terence")
	void FirstNameOfRecord2211() {
		assertEquals("Terence", customers.get(2210).getFirstName());
	}

	@Test
	@DisplayName("Record 2211: LastName is Rabago")
	void LastNameOfRecord2211() {
		assertEquals("Rabago", customers.get(2210).getLastName());
	}

	@Test
	@DisplayName("Record 2211: Company is Chinook Therapy Services")
	void CompanyOfRecord2211() {
		assertEquals("Chinook Therapy Services", customers.get(2210).getCompany());
	}

	@Test
	@DisplayName("Record 2211: Address is G3437 Miller Rd")
	void AddressOfRecord2211() {
		assertEquals("G3437 Miller Rd", customers.get(2210).getAddress());
	}

	@Test
	@DisplayName("Record 2211: City is Flint")
	void CityOfRecord2211() {
		assertEquals("Flint", customers.get(2210).getCity());
	}

	@Test
	@DisplayName("Record 2211: County is Genesee")
	void CountyOfRecord2211() {
		assertEquals("Genesee", customers.get(2210).getCounty());
	}

	@Test
	@DisplayName("Record 2211: State is MI")
	void StateOfRecord2211() {
		assertEquals("MI", customers.get(2210).getState());
	}

	@Test
	@DisplayName("Record 2211: ZIP is 48507")
	void ZIPOfRecord2211() {
		assertEquals("48507", customers.get(2210).getZIP());
	}

	@Test
	@DisplayName("Record 2211: Phone is 810-732-4484")
	void PhoneOfRecord2211() {
		assertEquals("810-732-4484", customers.get(2210).getPhone());
	}

	@Test
	@DisplayName("Record 2211: Fax is 810-732-0394")
	void FaxOfRecord2211() {
		assertEquals("810-732-0394", customers.get(2210).getFax());
	}

	@Test
	@DisplayName("Record 2211: Email is terence@rabago.com")
	void EmailOfRecord2211() {
		assertEquals("terence@rabago.com", customers.get(2210).getEmail());
	}

	@Test
	@DisplayName("Record 2211: Web is http://www.terencerabago.com")
	void WebOfRecord2211() {
		assertEquals("http://www.terencerabago.com", customers.get(2210).getWeb());
	}
}
