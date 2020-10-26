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
class Record_3418 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3418: FirstName is Tracey")
	void FirstNameOfRecord3418() {
		assertEquals("Tracey", customers.get(3417).getFirstName());
	}

	@Test
	@DisplayName("Record 3418: LastName is Mongon")
	void LastNameOfRecord3418() {
		assertEquals("Mongon", customers.get(3417).getLastName());
	}

	@Test
	@DisplayName("Record 3418: Company is Sunday Breakfast Assn")
	void CompanyOfRecord3418() {
		assertEquals("Sunday Breakfast Assn", customers.get(3417).getCompany());
	}

	@Test
	@DisplayName("Record 3418: Address is 3003 N Central Ave  #-10324")
	void AddressOfRecord3418() {
		assertEquals("3003 N Central Ave  #-10324", customers.get(3417).getAddress());
	}

	@Test
	@DisplayName("Record 3418: City is Phoenix")
	void CityOfRecord3418() {
		assertEquals("Phoenix", customers.get(3417).getCity());
	}

	@Test
	@DisplayName("Record 3418: County is Maricopa")
	void CountyOfRecord3418() {
		assertEquals("Maricopa", customers.get(3417).getCounty());
	}

	@Test
	@DisplayName("Record 3418: State is AZ")
	void StateOfRecord3418() {
		assertEquals("AZ", customers.get(3417).getState());
	}

	@Test
	@DisplayName("Record 3418: ZIP is 85012")
	void ZIPOfRecord3418() {
		assertEquals("85012", customers.get(3417).getZIP());
	}

	@Test
	@DisplayName("Record 3418: Phone is 602-274-2313")
	void PhoneOfRecord3418() {
		assertEquals("602-274-2313", customers.get(3417).getPhone());
	}

	@Test
	@DisplayName("Record 3418: Fax is 602-274-7127")
	void FaxOfRecord3418() {
		assertEquals("602-274-7127", customers.get(3417).getFax());
	}

	@Test
	@DisplayName("Record 3418: Email is tracey@mongon.com")
	void EmailOfRecord3418() {
		assertEquals("tracey@mongon.com", customers.get(3417).getEmail());
	}

	@Test
	@DisplayName("Record 3418: Web is http://www.traceymongon.com")
	void WebOfRecord3418() {
		assertEquals("http://www.traceymongon.com", customers.get(3417).getWeb());
	}
}
