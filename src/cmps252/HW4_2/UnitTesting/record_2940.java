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

@Tag("6")
class Record_2940 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2940: FirstName is Jodie")
	void FirstNameOfRecord2940() {
		assertEquals("Jodie", customers.get(2939).getFirstName());
	}

	@Test
	@DisplayName("Record 2940: LastName is Dyckman")
	void LastNameOfRecord2940() {
		assertEquals("Dyckman", customers.get(2939).getLastName());
	}

	@Test
	@DisplayName("Record 2940: Company is Clark, Ronald J Esq")
	void CompanyOfRecord2940() {
		assertEquals("Clark, Ronald J Esq", customers.get(2939).getCompany());
	}

	@Test
	@DisplayName("Record 2940: Address is 2354 Winter Woods Blvd")
	void AddressOfRecord2940() {
		assertEquals("2354 Winter Woods Blvd", customers.get(2939).getAddress());
	}

	@Test
	@DisplayName("Record 2940: City is Winter Park")
	void CityOfRecord2940() {
		assertEquals("Winter Park", customers.get(2939).getCity());
	}

	@Test
	@DisplayName("Record 2940: County is Orange")
	void CountyOfRecord2940() {
		assertEquals("Orange", customers.get(2939).getCounty());
	}

	@Test
	@DisplayName("Record 2940: State is FL")
	void StateOfRecord2940() {
		assertEquals("FL", customers.get(2939).getState());
	}

	@Test
	@DisplayName("Record 2940: ZIP is 32792")
	void ZIPOfRecord2940() {
		assertEquals("32792", customers.get(2939).getZIP());
	}

	@Test
	@DisplayName("Record 2940: Phone is 407-678-1673")
	void PhoneOfRecord2940() {
		assertEquals("407-678-1673", customers.get(2939).getPhone());
	}

	@Test
	@DisplayName("Record 2940: Fax is 407-678-9655")
	void FaxOfRecord2940() {
		assertEquals("407-678-9655", customers.get(2939).getFax());
	}

	@Test
	@DisplayName("Record 2940: Email is jodie@dyckman.com")
	void EmailOfRecord2940() {
		assertEquals("jodie@dyckman.com", customers.get(2939).getEmail());
	}

	@Test
	@DisplayName("Record 2940: Web is http://www.jodiedyckman.com")
	void WebOfRecord2940() {
		assertEquals("http://www.jodiedyckman.com", customers.get(2939).getWeb());
	}
}
