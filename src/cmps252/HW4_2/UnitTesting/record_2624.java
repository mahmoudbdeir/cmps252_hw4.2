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

@Tag("36")
class Record_2624 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2624: FirstName is Pam")
	void FirstNameOfRecord2624() {
		assertEquals("Pam", customers.get(2623).getFirstName());
	}

	@Test
	@DisplayName("Record 2624: LastName is Mlynek")
	void LastNameOfRecord2624() {
		assertEquals("Mlynek", customers.get(2623).getLastName());
	}

	@Test
	@DisplayName("Record 2624: Company is Office World")
	void CompanyOfRecord2624() {
		assertEquals("Office World", customers.get(2623).getCompany());
	}

	@Test
	@DisplayName("Record 2624: Address is 7500 N Teutonia Ave")
	void AddressOfRecord2624() {
		assertEquals("7500 N Teutonia Ave", customers.get(2623).getAddress());
	}

	@Test
	@DisplayName("Record 2624: City is Milwaukee")
	void CityOfRecord2624() {
		assertEquals("Milwaukee", customers.get(2623).getCity());
	}

	@Test
	@DisplayName("Record 2624: County is Milwaukee")
	void CountyOfRecord2624() {
		assertEquals("Milwaukee", customers.get(2623).getCounty());
	}

	@Test
	@DisplayName("Record 2624: State is WI")
	void StateOfRecord2624() {
		assertEquals("WI", customers.get(2623).getState());
	}

	@Test
	@DisplayName("Record 2624: ZIP is 53209")
	void ZIPOfRecord2624() {
		assertEquals("53209", customers.get(2623).getZIP());
	}

	@Test
	@DisplayName("Record 2624: Phone is 414-228-4436")
	void PhoneOfRecord2624() {
		assertEquals("414-228-4436", customers.get(2623).getPhone());
	}

	@Test
	@DisplayName("Record 2624: Fax is 414-228-4265")
	void FaxOfRecord2624() {
		assertEquals("414-228-4265", customers.get(2623).getFax());
	}

	@Test
	@DisplayName("Record 2624: Email is pam@mlynek.com")
	void EmailOfRecord2624() {
		assertEquals("pam@mlynek.com", customers.get(2623).getEmail());
	}

	@Test
	@DisplayName("Record 2624: Web is http://www.pammlynek.com")
	void WebOfRecord2624() {
		assertEquals("http://www.pammlynek.com", customers.get(2623).getWeb());
	}
}
