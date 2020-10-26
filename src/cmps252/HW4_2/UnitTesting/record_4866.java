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

@Tag("16")
class Record_4866 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4866: FirstName is Morgan")
	void FirstNameOfRecord4866() {
		assertEquals("Morgan", customers.get(4865).getFirstName());
	}

	@Test
	@DisplayName("Record 4866: LastName is Arslan")
	void LastNameOfRecord4866() {
		assertEquals("Arslan", customers.get(4865).getLastName());
	}

	@Test
	@DisplayName("Record 4866: Company is Gbm Industries Inc")
	void CompanyOfRecord4866() {
		assertEquals("Gbm Industries Inc", customers.get(4865).getCompany());
	}

	@Test
	@DisplayName("Record 4866: Address is 801 A Glenneyre Ave")
	void AddressOfRecord4866() {
		assertEquals("801 A Glenneyre Ave", customers.get(4865).getAddress());
	}

	@Test
	@DisplayName("Record 4866: City is Laguna Beach")
	void CityOfRecord4866() {
		assertEquals("Laguna Beach", customers.get(4865).getCity());
	}

	@Test
	@DisplayName("Record 4866: County is Orange")
	void CountyOfRecord4866() {
		assertEquals("Orange", customers.get(4865).getCounty());
	}

	@Test
	@DisplayName("Record 4866: State is CA")
	void StateOfRecord4866() {
		assertEquals("CA", customers.get(4865).getState());
	}

	@Test
	@DisplayName("Record 4866: ZIP is 92651")
	void ZIPOfRecord4866() {
		assertEquals("92651", customers.get(4865).getZIP());
	}

	@Test
	@DisplayName("Record 4866: Phone is 949-494-7925")
	void PhoneOfRecord4866() {
		assertEquals("949-494-7925", customers.get(4865).getPhone());
	}

	@Test
	@DisplayName("Record 4866: Fax is 949-494-9504")
	void FaxOfRecord4866() {
		assertEquals("949-494-9504", customers.get(4865).getFax());
	}

	@Test
	@DisplayName("Record 4866: Email is morgan@arslan.com")
	void EmailOfRecord4866() {
		assertEquals("morgan@arslan.com", customers.get(4865).getEmail());
	}

	@Test
	@DisplayName("Record 4866: Web is http://www.morganarslan.com")
	void WebOfRecord4866() {
		assertEquals("http://www.morganarslan.com", customers.get(4865).getWeb());
	}
}
