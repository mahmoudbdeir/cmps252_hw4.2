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

@Tag("4")
class Record_3272 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3272: FirstName is Jordan")
	void FirstNameOfRecord3272() {
		assertEquals("Jordan", customers.get(3271).getFirstName());
	}

	@Test
	@DisplayName("Record 3272: LastName is Kitchin")
	void LastNameOfRecord3272() {
		assertEquals("Kitchin", customers.get(3271).getLastName());
	}

	@Test
	@DisplayName("Record 3272: Company is Holiday Inn North")
	void CompanyOfRecord3272() {
		assertEquals("Holiday Inn North", customers.get(3271).getCompany());
	}

	@Test
	@DisplayName("Record 3272: Address is 120 Se 176th Pl")
	void AddressOfRecord3272() {
		assertEquals("120 Se 176th Pl", customers.get(3271).getAddress());
	}

	@Test
	@DisplayName("Record 3272: City is Portland")
	void CityOfRecord3272() {
		assertEquals("Portland", customers.get(3271).getCity());
	}

	@Test
	@DisplayName("Record 3272: County is Multnomah")
	void CountyOfRecord3272() {
		assertEquals("Multnomah", customers.get(3271).getCounty());
	}

	@Test
	@DisplayName("Record 3272: State is OR")
	void StateOfRecord3272() {
		assertEquals("OR", customers.get(3271).getState());
	}

	@Test
	@DisplayName("Record 3272: ZIP is 97233")
	void ZIPOfRecord3272() {
		assertEquals("97233", customers.get(3271).getZIP());
	}

	@Test
	@DisplayName("Record 3272: Phone is 503-256-8405")
	void PhoneOfRecord3272() {
		assertEquals("503-256-8405", customers.get(3271).getPhone());
	}

	@Test
	@DisplayName("Record 3272: Fax is 503-256-3481")
	void FaxOfRecord3272() {
		assertEquals("503-256-3481", customers.get(3271).getFax());
	}

	@Test
	@DisplayName("Record 3272: Email is jordan@kitchin.com")
	void EmailOfRecord3272() {
		assertEquals("jordan@kitchin.com", customers.get(3271).getEmail());
	}

	@Test
	@DisplayName("Record 3272: Web is http://www.jordankitchin.com")
	void WebOfRecord3272() {
		assertEquals("http://www.jordankitchin.com", customers.get(3271).getWeb());
	}
}
