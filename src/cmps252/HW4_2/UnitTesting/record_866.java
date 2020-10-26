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

@Tag("38")
class Record_866 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 866: FirstName is Faith")
	void FirstNameOfRecord866() {
		assertEquals("Faith", customers.get(865).getFirstName());
	}

	@Test
	@DisplayName("Record 866: LastName is Kloster")
	void LastNameOfRecord866() {
		assertEquals("Kloster", customers.get(865).getLastName());
	}

	@Test
	@DisplayName("Record 866: Company is Euro Alamo Management Inc")
	void CompanyOfRecord866() {
		assertEquals("Euro Alamo Management Inc", customers.get(865).getCompany());
	}

	@Test
	@DisplayName("Record 866: Address is 11450 Cherokee St  #-b1")
	void AddressOfRecord866() {
		assertEquals("11450 Cherokee St  #-b1", customers.get(865).getAddress());
	}

	@Test
	@DisplayName("Record 866: City is Denver")
	void CityOfRecord866() {
		assertEquals("Denver", customers.get(865).getCity());
	}

	@Test
	@DisplayName("Record 866: County is Adams")
	void CountyOfRecord866() {
		assertEquals("Adams", customers.get(865).getCounty());
	}

	@Test
	@DisplayName("Record 866: State is CO")
	void StateOfRecord866() {
		assertEquals("CO", customers.get(865).getState());
	}

	@Test
	@DisplayName("Record 866: ZIP is 80234")
	void ZIPOfRecord866() {
		assertEquals("80234", customers.get(865).getZIP());
	}

	@Test
	@DisplayName("Record 866: Phone is 303-450-9021")
	void PhoneOfRecord866() {
		assertEquals("303-450-9021", customers.get(865).getPhone());
	}

	@Test
	@DisplayName("Record 866: Fax is 303-450-9403")
	void FaxOfRecord866() {
		assertEquals("303-450-9403", customers.get(865).getFax());
	}

	@Test
	@DisplayName("Record 866: Email is faith@kloster.com")
	void EmailOfRecord866() {
		assertEquals("faith@kloster.com", customers.get(865).getEmail());
	}

	@Test
	@DisplayName("Record 866: Web is http://www.faithkloster.com")
	void WebOfRecord866() {
		assertEquals("http://www.faithkloster.com", customers.get(865).getWeb());
	}
}
