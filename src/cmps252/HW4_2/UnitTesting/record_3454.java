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

@Tag("41")
class Record_3454 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3454: FirstName is Lygh")
	void FirstNameOfRecord3454() {
		assertEquals("Lygh", customers.get(3453).getFirstName());
	}

	@Test
	@DisplayName("Record 3454: LastName is Brave")
	void LastNameOfRecord3454() {
		assertEquals("Brave", customers.get(3453).getLastName());
	}

	@Test
	@DisplayName("Record 3454: Company is Shybut, George T Md")
	void CompanyOfRecord3454() {
		assertEquals("Shybut, George T Md", customers.get(3453).getCompany());
	}

	@Test
	@DisplayName("Record 3454: Address is 607 Bedford St")
	void AddressOfRecord3454() {
		assertEquals("607 Bedford St", customers.get(3453).getAddress());
	}

	@Test
	@DisplayName("Record 3454: City is Stamford")
	void CityOfRecord3454() {
		assertEquals("Stamford", customers.get(3453).getCity());
	}

	@Test
	@DisplayName("Record 3454: County is Fairfield")
	void CountyOfRecord3454() {
		assertEquals("Fairfield", customers.get(3453).getCounty());
	}

	@Test
	@DisplayName("Record 3454: State is CT")
	void StateOfRecord3454() {
		assertEquals("CT", customers.get(3453).getState());
	}

	@Test
	@DisplayName("Record 3454: ZIP is 6901")
	void ZIPOfRecord3454() {
		assertEquals("6901", customers.get(3453).getZIP());
	}

	@Test
	@DisplayName("Record 3454: Phone is 203-324-2755")
	void PhoneOfRecord3454() {
		assertEquals("203-324-2755", customers.get(3453).getPhone());
	}

	@Test
	@DisplayName("Record 3454: Fax is 203-324-6626")
	void FaxOfRecord3454() {
		assertEquals("203-324-6626", customers.get(3453).getFax());
	}

	@Test
	@DisplayName("Record 3454: Email is lygh@brave.com")
	void EmailOfRecord3454() {
		assertEquals("lygh@brave.com", customers.get(3453).getEmail());
	}

	@Test
	@DisplayName("Record 3454: Web is http://www.lyghbrave.com")
	void WebOfRecord3454() {
		assertEquals("http://www.lyghbrave.com", customers.get(3453).getWeb());
	}
}
