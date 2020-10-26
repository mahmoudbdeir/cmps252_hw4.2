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

@Tag("49")
class Record_3599 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3599: FirstName is Liz")
	void FirstNameOfRecord3599() {
		assertEquals("Liz", customers.get(3598).getFirstName());
	}

	@Test
	@DisplayName("Record 3599: LastName is Stojanovic")
	void LastNameOfRecord3599() {
		assertEquals("Stojanovic", customers.get(3598).getLastName());
	}

	@Test
	@DisplayName("Record 3599: Company is Volunteer Prgrms Actn The Fdrl")
	void CompanyOfRecord3599() {
		assertEquals("Volunteer Prgrms Actn The Fdrl", customers.get(3598).getCompany());
	}

	@Test
	@DisplayName("Record 3599: Address is Franklin Ave")
	void AddressOfRecord3599() {
		assertEquals("Franklin Ave", customers.get(3598).getAddress());
	}

	@Test
	@DisplayName("Record 3599: City is Millbrook")
	void CityOfRecord3599() {
		assertEquals("Millbrook", customers.get(3598).getCity());
	}

	@Test
	@DisplayName("Record 3599: County is Dutchess")
	void CountyOfRecord3599() {
		assertEquals("Dutchess", customers.get(3598).getCounty());
	}

	@Test
	@DisplayName("Record 3599: State is NY")
	void StateOfRecord3599() {
		assertEquals("NY", customers.get(3598).getState());
	}

	@Test
	@DisplayName("Record 3599: ZIP is 12545")
	void ZIPOfRecord3599() {
		assertEquals("12545", customers.get(3598).getZIP());
	}

	@Test
	@DisplayName("Record 3599: Phone is 845-677-4078")
	void PhoneOfRecord3599() {
		assertEquals("845-677-4078", customers.get(3598).getPhone());
	}

	@Test
	@DisplayName("Record 3599: Fax is 845-677-2403")
	void FaxOfRecord3599() {
		assertEquals("845-677-2403", customers.get(3598).getFax());
	}

	@Test
	@DisplayName("Record 3599: Email is liz@stojanovic.com")
	void EmailOfRecord3599() {
		assertEquals("liz@stojanovic.com", customers.get(3598).getEmail());
	}

	@Test
	@DisplayName("Record 3599: Web is http://www.lizstojanovic.com")
	void WebOfRecord3599() {
		assertEquals("http://www.lizstojanovic.com", customers.get(3598).getWeb());
	}
}
