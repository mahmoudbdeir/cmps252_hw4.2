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

@Tag("2")
class Record_3850 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3850: FirstName is Andreas")
	void FirstNameOfRecord3850() {
		assertEquals("Andreas", customers.get(3849).getFirstName());
	}

	@Test
	@DisplayName("Record 3850: LastName is Brooms")
	void LastNameOfRecord3850() {
		assertEquals("Brooms", customers.get(3849).getLastName());
	}

	@Test
	@DisplayName("Record 3850: Company is Sauder, John D")
	void CompanyOfRecord3850() {
		assertEquals("Sauder, John D", customers.get(3849).getCompany());
	}

	@Test
	@DisplayName("Record 3850: Address is 1314 N 3rd St  #-100")
	void AddressOfRecord3850() {
		assertEquals("1314 N 3rd St  #-100", customers.get(3849).getAddress());
	}

	@Test
	@DisplayName("Record 3850: City is Phoenix")
	void CityOfRecord3850() {
		assertEquals("Phoenix", customers.get(3849).getCity());
	}

	@Test
	@DisplayName("Record 3850: County is Maricopa")
	void CountyOfRecord3850() {
		assertEquals("Maricopa", customers.get(3849).getCounty());
	}

	@Test
	@DisplayName("Record 3850: State is AZ")
	void StateOfRecord3850() {
		assertEquals("AZ", customers.get(3849).getState());
	}

	@Test
	@DisplayName("Record 3850: ZIP is 85004")
	void ZIPOfRecord3850() {
		assertEquals("85004", customers.get(3849).getZIP());
	}

	@Test
	@DisplayName("Record 3850: Phone is 602-257-3235")
	void PhoneOfRecord3850() {
		assertEquals("602-257-3235", customers.get(3849).getPhone());
	}

	@Test
	@DisplayName("Record 3850: Fax is 602-257-5418")
	void FaxOfRecord3850() {
		assertEquals("602-257-5418", customers.get(3849).getFax());
	}

	@Test
	@DisplayName("Record 3850: Email is andreas@brooms.com")
	void EmailOfRecord3850() {
		assertEquals("andreas@brooms.com", customers.get(3849).getEmail());
	}

	@Test
	@DisplayName("Record 3850: Web is http://www.andreasbrooms.com")
	void WebOfRecord3850() {
		assertEquals("http://www.andreasbrooms.com", customers.get(3849).getWeb());
	}
}
