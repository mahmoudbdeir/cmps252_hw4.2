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
class Record_2851 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2851: FirstName is Karina")
	void FirstNameOfRecord2851() {
		assertEquals("Karina", customers.get(2850).getFirstName());
	}

	@Test
	@DisplayName("Record 2851: LastName is Deckers")
	void LastNameOfRecord2851() {
		assertEquals("Deckers", customers.get(2850).getLastName());
	}

	@Test
	@DisplayName("Record 2851: Company is Ron Self Motor Company")
	void CompanyOfRecord2851() {
		assertEquals("Ron Self Motor Company", customers.get(2850).getCompany());
	}

	@Test
	@DisplayName("Record 2851: Address is Rts 6 & 17 At Bradleys Co")
	void AddressOfRecord2851() {
		assertEquals("Rts 6 & 17 At Bradleys Co", customers.get(2850).getAddress());
	}

	@Test
	@DisplayName("Record 2851: City is Middletown")
	void CityOfRecord2851() {
		assertEquals("Middletown", customers.get(2850).getCity());
	}

	@Test
	@DisplayName("Record 2851: County is Orange")
	void CountyOfRecord2851() {
		assertEquals("Orange", customers.get(2850).getCounty());
	}

	@Test
	@DisplayName("Record 2851: State is NY")
	void StateOfRecord2851() {
		assertEquals("NY", customers.get(2850).getState());
	}

	@Test
	@DisplayName("Record 2851: ZIP is 10940")
	void ZIPOfRecord2851() {
		assertEquals("10940", customers.get(2850).getZIP());
	}

	@Test
	@DisplayName("Record 2851: Phone is 845-343-5059")
	void PhoneOfRecord2851() {
		assertEquals("845-343-5059", customers.get(2850).getPhone());
	}

	@Test
	@DisplayName("Record 2851: Fax is 845-343-3189")
	void FaxOfRecord2851() {
		assertEquals("845-343-3189", customers.get(2850).getFax());
	}

	@Test
	@DisplayName("Record 2851: Email is karina@deckers.com")
	void EmailOfRecord2851() {
		assertEquals("karina@deckers.com", customers.get(2850).getEmail());
	}

	@Test
	@DisplayName("Record 2851: Web is http://www.karinadeckers.com")
	void WebOfRecord2851() {
		assertEquals("http://www.karinadeckers.com", customers.get(2850).getWeb());
	}
}
