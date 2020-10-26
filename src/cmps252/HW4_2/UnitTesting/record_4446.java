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

@Tag("9")
class Record_4446 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4446: FirstName is Mabel")
	void FirstNameOfRecord4446() {
		assertEquals("Mabel", customers.get(4445).getFirstName());
	}

	@Test
	@DisplayName("Record 4446: LastName is Suprenant")
	void LastNameOfRecord4446() {
		assertEquals("Suprenant", customers.get(4445).getLastName());
	}

	@Test
	@DisplayName("Record 4446: Company is Deutsche Bank Capital Corp")
	void CompanyOfRecord4446() {
		assertEquals("Deutsche Bank Capital Corp", customers.get(4445).getCompany());
	}

	@Test
	@DisplayName("Record 4446: Address is 209 Overlook Dr")
	void AddressOfRecord4446() {
		assertEquals("209 Overlook Dr", customers.get(4445).getAddress());
	}

	@Test
	@DisplayName("Record 4446: City is Sussex")
	void CityOfRecord4446() {
		assertEquals("Sussex", customers.get(4445).getCity());
	}

	@Test
	@DisplayName("Record 4446: County is Sussex")
	void CountyOfRecord4446() {
		assertEquals("Sussex", customers.get(4445).getCounty());
	}

	@Test
	@DisplayName("Record 4446: State is NJ")
	void StateOfRecord4446() {
		assertEquals("NJ", customers.get(4445).getState());
	}

	@Test
	@DisplayName("Record 4446: ZIP is 7461")
	void ZIPOfRecord4446() {
		assertEquals("7461", customers.get(4445).getZIP());
	}

	@Test
	@DisplayName("Record 4446: Phone is 973-702-3016")
	void PhoneOfRecord4446() {
		assertEquals("973-702-3016", customers.get(4445).getPhone());
	}

	@Test
	@DisplayName("Record 4446: Fax is 973-702-2382")
	void FaxOfRecord4446() {
		assertEquals("973-702-2382", customers.get(4445).getFax());
	}

	@Test
	@DisplayName("Record 4446: Email is mabel@suprenant.com")
	void EmailOfRecord4446() {
		assertEquals("mabel@suprenant.com", customers.get(4445).getEmail());
	}

	@Test
	@DisplayName("Record 4446: Web is http://www.mabelsuprenant.com")
	void WebOfRecord4446() {
		assertEquals("http://www.mabelsuprenant.com", customers.get(4445).getWeb());
	}
}
