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

@Tag("27")
class Record_449 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 449: FirstName is Ashlee")
	void FirstNameOfRecord449() {
		assertEquals("Ashlee", customers.get(448).getFirstName());
	}

	@Test
	@DisplayName("Record 449: LastName is Bargas")
	void LastNameOfRecord449() {
		assertEquals("Bargas", customers.get(448).getLastName());
	}

	@Test
	@DisplayName("Record 449: Company is Mission Research Corp")
	void CompanyOfRecord449() {
		assertEquals("Mission Research Corp", customers.get(448).getCompany());
	}

	@Test
	@DisplayName("Record 449: Address is 50 James St")
	void AddressOfRecord449() {
		assertEquals("50 James St", customers.get(448).getAddress());
	}

	@Test
	@DisplayName("Record 449: City is Somerville")
	void CityOfRecord449() {
		assertEquals("Somerville", customers.get(448).getCity());
	}

	@Test
	@DisplayName("Record 449: County is Somerset")
	void CountyOfRecord449() {
		assertEquals("Somerset", customers.get(448).getCounty());
	}

	@Test
	@DisplayName("Record 449: State is NJ")
	void StateOfRecord449() {
		assertEquals("NJ", customers.get(448).getState());
	}

	@Test
	@DisplayName("Record 449: ZIP is 8876")
	void ZIPOfRecord449() {
		assertEquals("8876", customers.get(448).getZIP());
	}

	@Test
	@DisplayName("Record 449: Phone is 908-526-9249")
	void PhoneOfRecord449() {
		assertEquals("908-526-9249", customers.get(448).getPhone());
	}

	@Test
	@DisplayName("Record 449: Fax is 908-526-6692")
	void FaxOfRecord449() {
		assertEquals("908-526-6692", customers.get(448).getFax());
	}

	@Test
	@DisplayName("Record 449: Email is ashlee@bargas.com")
	void EmailOfRecord449() {
		assertEquals("ashlee@bargas.com", customers.get(448).getEmail());
	}

	@Test
	@DisplayName("Record 449: Web is http://www.ashleebargas.com")
	void WebOfRecord449() {
		assertEquals("http://www.ashleebargas.com", customers.get(448).getWeb());
	}
}
