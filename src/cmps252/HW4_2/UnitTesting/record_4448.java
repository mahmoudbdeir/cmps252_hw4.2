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

@Tag("1")
class Record_4448 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4448: FirstName is Kelley")
	void FirstNameOfRecord4448() {
		assertEquals("Kelley", customers.get(4447).getFirstName());
	}

	@Test
	@DisplayName("Record 4448: LastName is Khosravi")
	void LastNameOfRecord4448() {
		assertEquals("Khosravi", customers.get(4447).getLastName());
	}

	@Test
	@DisplayName("Record 4448: Company is State Equipment Company")
	void CompanyOfRecord4448() {
		assertEquals("State Equipment Company", customers.get(4447).getCompany());
	}

	@Test
	@DisplayName("Record 4448: Address is 5 Baker Pl")
	void AddressOfRecord4448() {
		assertEquals("5 Baker Pl", customers.get(4447).getAddress());
	}

	@Test
	@DisplayName("Record 4448: City is Stamford")
	void CityOfRecord4448() {
		assertEquals("Stamford", customers.get(4447).getCity());
	}

	@Test
	@DisplayName("Record 4448: County is Fairfield")
	void CountyOfRecord4448() {
		assertEquals("Fairfield", customers.get(4447).getCounty());
	}

	@Test
	@DisplayName("Record 4448: State is CT")
	void StateOfRecord4448() {
		assertEquals("CT", customers.get(4447).getState());
	}

	@Test
	@DisplayName("Record 4448: ZIP is 6905")
	void ZIPOfRecord4448() {
		assertEquals("6905", customers.get(4447).getZIP());
	}

	@Test
	@DisplayName("Record 4448: Phone is 203-968-8054")
	void PhoneOfRecord4448() {
		assertEquals("203-968-8054", customers.get(4447).getPhone());
	}

	@Test
	@DisplayName("Record 4448: Fax is 203-968-5526")
	void FaxOfRecord4448() {
		assertEquals("203-968-5526", customers.get(4447).getFax());
	}

	@Test
	@DisplayName("Record 4448: Email is kelley@khosravi.com")
	void EmailOfRecord4448() {
		assertEquals("kelley@khosravi.com", customers.get(4447).getEmail());
	}

	@Test
	@DisplayName("Record 4448: Web is http://www.kelleykhosravi.com")
	void WebOfRecord4448() {
		assertEquals("http://www.kelleykhosravi.com", customers.get(4447).getWeb());
	}
}
