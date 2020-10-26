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
class Record_1809 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1809: FirstName is Harley")
	void FirstNameOfRecord1809() {
		assertEquals("Harley", customers.get(1808).getFirstName());
	}

	@Test
	@DisplayName("Record 1809: LastName is Lemucchi")
	void LastNameOfRecord1809() {
		assertEquals("Lemucchi", customers.get(1808).getLastName());
	}

	@Test
	@DisplayName("Record 1809: Company is Olympic Pipe And Tube Corp")
	void CompanyOfRecord1809() {
		assertEquals("Olympic Pipe And Tube Corp", customers.get(1808).getCompany());
	}

	@Test
	@DisplayName("Record 1809: Address is 13889 Wellington Trce")
	void AddressOfRecord1809() {
		assertEquals("13889 Wellington Trce", customers.get(1808).getAddress());
	}

	@Test
	@DisplayName("Record 1809: City is West Palm Beach")
	void CityOfRecord1809() {
		assertEquals("West Palm Beach", customers.get(1808).getCity());
	}

	@Test
	@DisplayName("Record 1809: County is Palm Beach")
	void CountyOfRecord1809() {
		assertEquals("Palm Beach", customers.get(1808).getCounty());
	}

	@Test
	@DisplayName("Record 1809: State is FL")
	void StateOfRecord1809() {
		assertEquals("FL", customers.get(1808).getState());
	}

	@Test
	@DisplayName("Record 1809: ZIP is 33414")
	void ZIPOfRecord1809() {
		assertEquals("33414", customers.get(1808).getZIP());
	}

	@Test
	@DisplayName("Record 1809: Phone is 561-795-9699")
	void PhoneOfRecord1809() {
		assertEquals("561-795-9699", customers.get(1808).getPhone());
	}

	@Test
	@DisplayName("Record 1809: Fax is 561-795-9306")
	void FaxOfRecord1809() {
		assertEquals("561-795-9306", customers.get(1808).getFax());
	}

	@Test
	@DisplayName("Record 1809: Email is harley@lemucchi.com")
	void EmailOfRecord1809() {
		assertEquals("harley@lemucchi.com", customers.get(1808).getEmail());
	}

	@Test
	@DisplayName("Record 1809: Web is http://www.harleylemucchi.com")
	void WebOfRecord1809() {
		assertEquals("http://www.harleylemucchi.com", customers.get(1808).getWeb());
	}
}
