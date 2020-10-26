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

@Tag("44")
class Record_2809 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2809: FirstName is Nathanial")
	void FirstNameOfRecord2809() {
		assertEquals("Nathanial", customers.get(2808).getFirstName());
	}

	@Test
	@DisplayName("Record 2809: LastName is Kasee")
	void LastNameOfRecord2809() {
		assertEquals("Kasee", customers.get(2808).getLastName());
	}

	@Test
	@DisplayName("Record 2809: Company is Barber, Dewey W")
	void CompanyOfRecord2809() {
		assertEquals("Barber, Dewey W", customers.get(2808).getCompany());
	}

	@Test
	@DisplayName("Record 2809: Address is 3621 Veteran Ave")
	void AddressOfRecord2809() {
		assertEquals("3621 Veteran Ave", customers.get(2808).getAddress());
	}

	@Test
	@DisplayName("Record 2809: City is Los Angeles")
	void CityOfRecord2809() {
		assertEquals("Los Angeles", customers.get(2808).getCity());
	}

	@Test
	@DisplayName("Record 2809: County is Los Angeles")
	void CountyOfRecord2809() {
		assertEquals("Los Angeles", customers.get(2808).getCounty());
	}

	@Test
	@DisplayName("Record 2809: State is CA")
	void StateOfRecord2809() {
		assertEquals("CA", customers.get(2808).getState());
	}

	@Test
	@DisplayName("Record 2809: ZIP is 90034")
	void ZIPOfRecord2809() {
		assertEquals("90034", customers.get(2808).getZIP());
	}

	@Test
	@DisplayName("Record 2809: Phone is 310-733-2837")
	void PhoneOfRecord2809() {
		assertEquals("310-733-2837", customers.get(2808).getPhone());
	}

	@Test
	@DisplayName("Record 2809: Fax is 310-733-4377")
	void FaxOfRecord2809() {
		assertEquals("310-733-4377", customers.get(2808).getFax());
	}

	@Test
	@DisplayName("Record 2809: Email is nathanial@kasee.com")
	void EmailOfRecord2809() {
		assertEquals("nathanial@kasee.com", customers.get(2808).getEmail());
	}

	@Test
	@DisplayName("Record 2809: Web is http://www.nathanialkasee.com")
	void WebOfRecord2809() {
		assertEquals("http://www.nathanialkasee.com", customers.get(2808).getWeb());
	}
}
