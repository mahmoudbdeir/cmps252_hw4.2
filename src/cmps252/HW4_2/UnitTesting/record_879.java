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

@Tag("13")
class Record_879 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 879: FirstName is Otha")
	void FirstNameOfRecord879() {
		assertEquals("Otha", customers.get(878).getFirstName());
	}

	@Test
	@DisplayName("Record 879: LastName is Simi")
	void LastNameOfRecord879() {
		assertEquals("Simi", customers.get(878).getLastName());
	}

	@Test
	@DisplayName("Record 879: Company is Russeelville Womens Clinic")
	void CompanyOfRecord879() {
		assertEquals("Russeelville Womens Clinic", customers.get(878).getCompany());
	}

	@Test
	@DisplayName("Record 879: Address is 877 N 8th St W")
	void AddressOfRecord879() {
		assertEquals("877 N 8th St W", customers.get(878).getAddress());
	}

	@Test
	@DisplayName("Record 879: City is Riverton")
	void CityOfRecord879() {
		assertEquals("Riverton", customers.get(878).getCity());
	}

	@Test
	@DisplayName("Record 879: County is Fremont")
	void CountyOfRecord879() {
		assertEquals("Fremont", customers.get(878).getCounty());
	}

	@Test
	@DisplayName("Record 879: State is WY")
	void StateOfRecord879() {
		assertEquals("WY", customers.get(878).getState());
	}

	@Test
	@DisplayName("Record 879: ZIP is 82501")
	void ZIPOfRecord879() {
		assertEquals("82501", customers.get(878).getZIP());
	}

	@Test
	@DisplayName("Record 879: Phone is 307-857-6233")
	void PhoneOfRecord879() {
		assertEquals("307-857-6233", customers.get(878).getPhone());
	}

	@Test
	@DisplayName("Record 879: Fax is 307-857-4038")
	void FaxOfRecord879() {
		assertEquals("307-857-4038", customers.get(878).getFax());
	}

	@Test
	@DisplayName("Record 879: Email is otha@simi.com")
	void EmailOfRecord879() {
		assertEquals("otha@simi.com", customers.get(878).getEmail());
	}

	@Test
	@DisplayName("Record 879: Web is http://www.othasimi.com")
	void WebOfRecord879() {
		assertEquals("http://www.othasimi.com", customers.get(878).getWeb());
	}
}
