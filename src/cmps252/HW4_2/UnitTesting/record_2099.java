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

@Tag("32")
class Record_2099 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2099: FirstName is Lesley")
	void FirstNameOfRecord2099() {
		assertEquals("Lesley", customers.get(2098).getFirstName());
	}

	@Test
	@DisplayName("Record 2099: LastName is Klostermann")
	void LastNameOfRecord2099() {
		assertEquals("Klostermann", customers.get(2098).getLastName());
	}

	@Test
	@DisplayName("Record 2099: Company is In Univ Purdue Univ Ft Wayne")
	void CompanyOfRecord2099() {
		assertEquals("In Univ Purdue Univ Ft Wayne", customers.get(2098).getCompany());
	}

	@Test
	@DisplayName("Record 2099: Address is 2444 Morris Ave")
	void AddressOfRecord2099() {
		assertEquals("2444 Morris Ave", customers.get(2098).getAddress());
	}

	@Test
	@DisplayName("Record 2099: City is Union")
	void CityOfRecord2099() {
		assertEquals("Union", customers.get(2098).getCity());
	}

	@Test
	@DisplayName("Record 2099: County is Union")
	void CountyOfRecord2099() {
		assertEquals("Union", customers.get(2098).getCounty());
	}

	@Test
	@DisplayName("Record 2099: State is NJ")
	void StateOfRecord2099() {
		assertEquals("NJ", customers.get(2098).getState());
	}

	@Test
	@DisplayName("Record 2099: ZIP is 7083")
	void ZIPOfRecord2099() {
		assertEquals("7083", customers.get(2098).getZIP());
	}

	@Test
	@DisplayName("Record 2099: Phone is 908-964-6343")
	void PhoneOfRecord2099() {
		assertEquals("908-964-6343", customers.get(2098).getPhone());
	}

	@Test
	@DisplayName("Record 2099: Fax is 908-964-9386")
	void FaxOfRecord2099() {
		assertEquals("908-964-9386", customers.get(2098).getFax());
	}

	@Test
	@DisplayName("Record 2099: Email is lesley@klostermann.com")
	void EmailOfRecord2099() {
		assertEquals("lesley@klostermann.com", customers.get(2098).getEmail());
	}

	@Test
	@DisplayName("Record 2099: Web is http://www.lesleyklostermann.com")
	void WebOfRecord2099() {
		assertEquals("http://www.lesleyklostermann.com", customers.get(2098).getWeb());
	}
}
