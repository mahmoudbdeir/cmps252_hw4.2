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

@Tag("46")
class Record_1016 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1016: FirstName is Graham")
	void FirstNameOfRecord1016() {
		assertEquals("Graham", customers.get(1015).getFirstName());
	}

	@Test
	@DisplayName("Record 1016: LastName is Yockey")
	void LastNameOfRecord1016() {
		assertEquals("Yockey", customers.get(1015).getLastName());
	}

	@Test
	@DisplayName("Record 1016: Company is Gray & Palmer")
	void CompanyOfRecord1016() {
		assertEquals("Gray & Palmer", customers.get(1015).getCompany());
	}

	@Test
	@DisplayName("Record 1016: Address is 108 Adamsville Rd N")
	void AddressOfRecord1016() {
		assertEquals("108 Adamsville Rd N", customers.get(1015).getAddress());
	}

	@Test
	@DisplayName("Record 1016: City is Bridgewater")
	void CityOfRecord1016() {
		assertEquals("Bridgewater", customers.get(1015).getCity());
	}

	@Test
	@DisplayName("Record 1016: County is Somerset")
	void CountyOfRecord1016() {
		assertEquals("Somerset", customers.get(1015).getCounty());
	}

	@Test
	@DisplayName("Record 1016: State is NJ")
	void StateOfRecord1016() {
		assertEquals("NJ", customers.get(1015).getState());
	}

	@Test
	@DisplayName("Record 1016: ZIP is 8807")
	void ZIPOfRecord1016() {
		assertEquals("8807", customers.get(1015).getZIP());
	}

	@Test
	@DisplayName("Record 1016: Phone is 908-968-5804")
	void PhoneOfRecord1016() {
		assertEquals("908-968-5804", customers.get(1015).getPhone());
	}

	@Test
	@DisplayName("Record 1016: Fax is 908-968-5414")
	void FaxOfRecord1016() {
		assertEquals("908-968-5414", customers.get(1015).getFax());
	}

	@Test
	@DisplayName("Record 1016: Email is graham@yockey.com")
	void EmailOfRecord1016() {
		assertEquals("graham@yockey.com", customers.get(1015).getEmail());
	}

	@Test
	@DisplayName("Record 1016: Web is http://www.grahamyockey.com")
	void WebOfRecord1016() {
		assertEquals("http://www.grahamyockey.com", customers.get(1015).getWeb());
	}
}
