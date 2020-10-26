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

@Tag("17")
class Record_272 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 272: FirstName is Ariel")
	void FirstNameOfRecord272() {
		assertEquals("Ariel", customers.get(271).getFirstName());
	}

	@Test
	@DisplayName("Record 272: LastName is Arenos")
	void LastNameOfRecord272() {
		assertEquals("Arenos", customers.get(271).getLastName());
	}

	@Test
	@DisplayName("Record 272: Company is Holiday Inn")
	void CompanyOfRecord272() {
		assertEquals("Holiday Inn", customers.get(271).getCompany());
	}

	@Test
	@DisplayName("Record 272: Address is 209 S Wood Ave")
	void AddressOfRecord272() {
		assertEquals("209 S Wood Ave", customers.get(271).getAddress());
	}

	@Test
	@DisplayName("Record 272: City is Linden")
	void CityOfRecord272() {
		assertEquals("Linden", customers.get(271).getCity());
	}

	@Test
	@DisplayName("Record 272: County is Union")
	void CountyOfRecord272() {
		assertEquals("Union", customers.get(271).getCounty());
	}

	@Test
	@DisplayName("Record 272: State is NJ")
	void StateOfRecord272() {
		assertEquals("NJ", customers.get(271).getState());
	}

	@Test
	@DisplayName("Record 272: ZIP is 7036")
	void ZIPOfRecord272() {
		assertEquals("7036", customers.get(271).getZIP());
	}

	@Test
	@DisplayName("Record 272: Phone is 908-862-1676")
	void PhoneOfRecord272() {
		assertEquals("908-862-1676", customers.get(271).getPhone());
	}

	@Test
	@DisplayName("Record 272: Fax is 908-862-7634")
	void FaxOfRecord272() {
		assertEquals("908-862-7634", customers.get(271).getFax());
	}

	@Test
	@DisplayName("Record 272: Email is ariel@arenos.com")
	void EmailOfRecord272() {
		assertEquals("ariel@arenos.com", customers.get(271).getEmail());
	}

	@Test
	@DisplayName("Record 272: Web is http://www.arielarenos.com")
	void WebOfRecord272() {
		assertEquals("http://www.arielarenos.com", customers.get(271).getWeb());
	}
}
