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

@Tag("40")
class Record_714 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 714: FirstName is Len")
	void FirstNameOfRecord714() {
		assertEquals("Len", customers.get(713).getFirstName());
	}

	@Test
	@DisplayName("Record 714: LastName is Nydam")
	void LastNameOfRecord714() {
		assertEquals("Nydam", customers.get(713).getLastName());
	}

	@Test
	@DisplayName("Record 714: Company is Horn Seed Company Inc")
	void CompanyOfRecord714() {
		assertEquals("Horn Seed Company Inc", customers.get(713).getCompany());
	}

	@Test
	@DisplayName("Record 714: Address is 1507 E Franklin St")
	void AddressOfRecord714() {
		assertEquals("1507 E Franklin St", customers.get(713).getAddress());
	}

	@Test
	@DisplayName("Record 714: City is Chapel Hill")
	void CityOfRecord714() {
		assertEquals("Chapel Hill", customers.get(713).getCity());
	}

	@Test
	@DisplayName("Record 714: County is Orange")
	void CountyOfRecord714() {
		assertEquals("Orange", customers.get(713).getCounty());
	}

	@Test
	@DisplayName("Record 714: State is NC")
	void StateOfRecord714() {
		assertEquals("NC", customers.get(713).getState());
	}

	@Test
	@DisplayName("Record 714: ZIP is 27514")
	void ZIPOfRecord714() {
		assertEquals("27514", customers.get(713).getZIP());
	}

	@Test
	@DisplayName("Record 714: Phone is 919-942-9489")
	void PhoneOfRecord714() {
		assertEquals("919-942-9489", customers.get(713).getPhone());
	}

	@Test
	@DisplayName("Record 714: Fax is 919-942-1719")
	void FaxOfRecord714() {
		assertEquals("919-942-1719", customers.get(713).getFax());
	}

	@Test
	@DisplayName("Record 714: Email is len@nydam.com")
	void EmailOfRecord714() {
		assertEquals("len@nydam.com", customers.get(713).getEmail());
	}

	@Test
	@DisplayName("Record 714: Web is http://www.lennydam.com")
	void WebOfRecord714() {
		assertEquals("http://www.lennydam.com", customers.get(713).getWeb());
	}
}
