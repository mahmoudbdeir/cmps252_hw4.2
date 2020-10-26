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

@Tag("15")
class Record_600 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 600: FirstName is Andrea")
	void FirstNameOfRecord600() {
		assertEquals("Andrea", customers.get(599).getFirstName());
	}

	@Test
	@DisplayName("Record 600: LastName is Mcswiggan")
	void LastNameOfRecord600() {
		assertEquals("Mcswiggan", customers.get(599).getLastName());
	}

	@Test
	@DisplayName("Record 600: Company is Houston Villa Motor Hotel")
	void CompanyOfRecord600() {
		assertEquals("Houston Villa Motor Hotel", customers.get(599).getCompany());
	}

	@Test
	@DisplayName("Record 600: Address is 1419 Eastway Dr")
	void AddressOfRecord600() {
		assertEquals("1419 Eastway Dr", customers.get(599).getAddress());
	}

	@Test
	@DisplayName("Record 600: City is Charlotte")
	void CityOfRecord600() {
		assertEquals("Charlotte", customers.get(599).getCity());
	}

	@Test
	@DisplayName("Record 600: County is Mecklenburg")
	void CountyOfRecord600() {
		assertEquals("Mecklenburg", customers.get(599).getCounty());
	}

	@Test
	@DisplayName("Record 600: State is NC")
	void StateOfRecord600() {
		assertEquals("NC", customers.get(599).getState());
	}

	@Test
	@DisplayName("Record 600: ZIP is 28205")
	void ZIPOfRecord600() {
		assertEquals("28205", customers.get(599).getZIP());
	}

	@Test
	@DisplayName("Record 600: Phone is 704-567-0016")
	void PhoneOfRecord600() {
		assertEquals("704-567-0016", customers.get(599).getPhone());
	}

	@Test
	@DisplayName("Record 600: Fax is 704-567-8686")
	void FaxOfRecord600() {
		assertEquals("704-567-8686", customers.get(599).getFax());
	}

	@Test
	@DisplayName("Record 600: Email is andrea@mcswiggan.com")
	void EmailOfRecord600() {
		assertEquals("andrea@mcswiggan.com", customers.get(599).getEmail());
	}

	@Test
	@DisplayName("Record 600: Web is http://www.andreamcswiggan.com")
	void WebOfRecord600() {
		assertEquals("http://www.andreamcswiggan.com", customers.get(599).getWeb());
	}
}
