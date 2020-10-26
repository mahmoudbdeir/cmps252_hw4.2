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
class Record_1966 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1966: FirstName is Odell")
	void FirstNameOfRecord1966() {
		assertEquals("Odell", customers.get(1965).getFirstName());
	}

	@Test
	@DisplayName("Record 1966: LastName is Brauch")
	void LastNameOfRecord1966() {
		assertEquals("Brauch", customers.get(1965).getLastName());
	}

	@Test
	@DisplayName("Record 1966: Company is Friedman, David Md")
	void CompanyOfRecord1966() {
		assertEquals("Friedman, David Md", customers.get(1965).getCompany());
	}

	@Test
	@DisplayName("Record 1966: Address is 1900 L St Nw  #-405")
	void AddressOfRecord1966() {
		assertEquals("1900 L St Nw  #-405", customers.get(1965).getAddress());
	}

	@Test
	@DisplayName("Record 1966: City is Washington")
	void CityOfRecord1966() {
		assertEquals("Washington", customers.get(1965).getCity());
	}

	@Test
	@DisplayName("Record 1966: County is District of Columbia")
	void CountyOfRecord1966() {
		assertEquals("District of Columbia", customers.get(1965).getCounty());
	}

	@Test
	@DisplayName("Record 1966: State is DC")
	void StateOfRecord1966() {
		assertEquals("DC", customers.get(1965).getState());
	}

	@Test
	@DisplayName("Record 1966: ZIP is 20036")
	void ZIPOfRecord1966() {
		assertEquals("20036", customers.get(1965).getZIP());
	}

	@Test
	@DisplayName("Record 1966: Phone is 202-466-7288")
	void PhoneOfRecord1966() {
		assertEquals("202-466-7288", customers.get(1965).getPhone());
	}

	@Test
	@DisplayName("Record 1966: Fax is 202-466-9465")
	void FaxOfRecord1966() {
		assertEquals("202-466-9465", customers.get(1965).getFax());
	}

	@Test
	@DisplayName("Record 1966: Email is odell@brauch.com")
	void EmailOfRecord1966() {
		assertEquals("odell@brauch.com", customers.get(1965).getEmail());
	}

	@Test
	@DisplayName("Record 1966: Web is http://www.odellbrauch.com")
	void WebOfRecord1966() {
		assertEquals("http://www.odellbrauch.com", customers.get(1965).getWeb());
	}
}
