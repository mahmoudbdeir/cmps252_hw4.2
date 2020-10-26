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
class Record_4075 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4075: FirstName is Maynard")
	void FirstNameOfRecord4075() {
		assertEquals("Maynard", customers.get(4074).getFirstName());
	}

	@Test
	@DisplayName("Record 4075: LastName is Ozimek")
	void LastNameOfRecord4075() {
		assertEquals("Ozimek", customers.get(4074).getLastName());
	}

	@Test
	@DisplayName("Record 4075: Company is North Scottsdale Medical Ctr")
	void CompanyOfRecord4075() {
		assertEquals("North Scottsdale Medical Ctr", customers.get(4074).getCompany());
	}

	@Test
	@DisplayName("Record 4075: Address is 8 Auburn St")
	void AddressOfRecord4075() {
		assertEquals("8 Auburn St", customers.get(4074).getAddress());
	}

	@Test
	@DisplayName("Record 4075: City is Nashua")
	void CityOfRecord4075() {
		assertEquals("Nashua", customers.get(4074).getCity());
	}

	@Test
	@DisplayName("Record 4075: County is Hillsborough")
	void CountyOfRecord4075() {
		assertEquals("Hillsborough", customers.get(4074).getCounty());
	}

	@Test
	@DisplayName("Record 4075: State is NH")
	void StateOfRecord4075() {
		assertEquals("NH", customers.get(4074).getState());
	}

	@Test
	@DisplayName("Record 4075: ZIP is 3060")
	void ZIPOfRecord4075() {
		assertEquals("3060", customers.get(4074).getZIP());
	}

	@Test
	@DisplayName("Record 4075: Phone is 603-880-6940")
	void PhoneOfRecord4075() {
		assertEquals("603-880-6940", customers.get(4074).getPhone());
	}

	@Test
	@DisplayName("Record 4075: Fax is 603-880-6283")
	void FaxOfRecord4075() {
		assertEquals("603-880-6283", customers.get(4074).getFax());
	}

	@Test
	@DisplayName("Record 4075: Email is maynard@ozimek.com")
	void EmailOfRecord4075() {
		assertEquals("maynard@ozimek.com", customers.get(4074).getEmail());
	}

	@Test
	@DisplayName("Record 4075: Web is http://www.maynardozimek.com")
	void WebOfRecord4075() {
		assertEquals("http://www.maynardozimek.com", customers.get(4074).getWeb());
	}
}
