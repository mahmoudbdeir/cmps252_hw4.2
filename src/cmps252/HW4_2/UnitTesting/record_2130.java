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

@Tag("41")
class Record_2130 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2130: FirstName is Tia")
	void FirstNameOfRecord2130() {
		assertEquals("Tia", customers.get(2129).getFirstName());
	}

	@Test
	@DisplayName("Record 2130: LastName is Lebedeff")
	void LastNameOfRecord2130() {
		assertEquals("Lebedeff", customers.get(2129).getLastName());
	}

	@Test
	@DisplayName("Record 2130: Company is Air Shields Vickers")
	void CompanyOfRecord2130() {
		assertEquals("Air Shields Vickers", customers.get(2129).getCompany());
	}

	@Test
	@DisplayName("Record 2130: Address is 33 Hancock Ave")
	void AddressOfRecord2130() {
		assertEquals("33 Hancock Ave", customers.get(2129).getAddress());
	}

	@Test
	@DisplayName("Record 2130: City is Seaside Hyghts")
	void CityOfRecord2130() {
		assertEquals("Seaside Hyghts", customers.get(2129).getCity());
	}

	@Test
	@DisplayName("Record 2130: County is Ocean")
	void CountyOfRecord2130() {
		assertEquals("Ocean", customers.get(2129).getCounty());
	}

	@Test
	@DisplayName("Record 2130: State is NJ")
	void StateOfRecord2130() {
		assertEquals("NJ", customers.get(2129).getState());
	}

	@Test
	@DisplayName("Record 2130: ZIP is 8751")
	void ZIPOfRecord2130() {
		assertEquals("8751", customers.get(2129).getZIP());
	}

	@Test
	@DisplayName("Record 2130: Phone is 732-349-4417")
	void PhoneOfRecord2130() {
		assertEquals("732-349-4417", customers.get(2129).getPhone());
	}

	@Test
	@DisplayName("Record 2130: Fax is 732-349-6585")
	void FaxOfRecord2130() {
		assertEquals("732-349-6585", customers.get(2129).getFax());
	}

	@Test
	@DisplayName("Record 2130: Email is tia@lebedeff.com")
	void EmailOfRecord2130() {
		assertEquals("tia@lebedeff.com", customers.get(2129).getEmail());
	}

	@Test
	@DisplayName("Record 2130: Web is http://www.tialebedeff.com")
	void WebOfRecord2130() {
		assertEquals("http://www.tialebedeff.com", customers.get(2129).getWeb());
	}
}
