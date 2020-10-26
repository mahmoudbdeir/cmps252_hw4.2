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

@Tag("19")
class Record_2729 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2729: FirstName is Emil")
	void FirstNameOfRecord2729() {
		assertEquals("Emil", customers.get(2728).getFirstName());
	}

	@Test
	@DisplayName("Record 2729: LastName is Mastine")
	void LastNameOfRecord2729() {
		assertEquals("Mastine", customers.get(2728).getLastName());
	}

	@Test
	@DisplayName("Record 2729: Company is West Coast Splty Pnt & Body")
	void CompanyOfRecord2729() {
		assertEquals("West Coast Splty Pnt & Body", customers.get(2728).getCompany());
	}

	@Test
	@DisplayName("Record 2729: Address is 6034 Nashville Rd")
	void AddressOfRecord2729() {
		assertEquals("6034 Nashville Rd", customers.get(2728).getAddress());
	}

	@Test
	@DisplayName("Record 2729: City is Bowling Green")
	void CityOfRecord2729() {
		assertEquals("Bowling Green", customers.get(2728).getCity());
	}

	@Test
	@DisplayName("Record 2729: County is Warren")
	void CountyOfRecord2729() {
		assertEquals("Warren", customers.get(2728).getCounty());
	}

	@Test
	@DisplayName("Record 2729: State is KY")
	void StateOfRecord2729() {
		assertEquals("KY", customers.get(2728).getState());
	}

	@Test
	@DisplayName("Record 2729: ZIP is 42101")
	void ZIPOfRecord2729() {
		assertEquals("42101", customers.get(2728).getZIP());
	}

	@Test
	@DisplayName("Record 2729: Phone is 270-782-0740")
	void PhoneOfRecord2729() {
		assertEquals("270-782-0740", customers.get(2728).getPhone());
	}

	@Test
	@DisplayName("Record 2729: Fax is 270-782-5052")
	void FaxOfRecord2729() {
		assertEquals("270-782-5052", customers.get(2728).getFax());
	}

	@Test
	@DisplayName("Record 2729: Email is emil@mastine.com")
	void EmailOfRecord2729() {
		assertEquals("emil@mastine.com", customers.get(2728).getEmail());
	}

	@Test
	@DisplayName("Record 2729: Web is http://www.emilmastine.com")
	void WebOfRecord2729() {
		assertEquals("http://www.emilmastine.com", customers.get(2728).getWeb());
	}
}
