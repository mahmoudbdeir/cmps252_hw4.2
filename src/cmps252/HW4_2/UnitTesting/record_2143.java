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

@Tag("49")
class Record_2143 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2143: FirstName is Aimee")
	void FirstNameOfRecord2143() {
		assertEquals("Aimee", customers.get(2142).getFirstName());
	}

	@Test
	@DisplayName("Record 2143: LastName is Hendrikson")
	void LastNameOfRecord2143() {
		assertEquals("Hendrikson", customers.get(2142).getLastName());
	}

	@Test
	@DisplayName("Record 2143: Company is Keenan Bros Trucking Inc")
	void CompanyOfRecord2143() {
		assertEquals("Keenan Bros Trucking Inc", customers.get(2142).getCompany());
	}

	@Test
	@DisplayName("Record 2143: Address is 272 Broadway")
	void AddressOfRecord2143() {
		assertEquals("272 Broadway", customers.get(2142).getAddress());
	}

	@Test
	@DisplayName("Record 2143: City is Amityville")
	void CityOfRecord2143() {
		assertEquals("Amityville", customers.get(2142).getCity());
	}

	@Test
	@DisplayName("Record 2143: County is Suffolk")
	void CountyOfRecord2143() {
		assertEquals("Suffolk", customers.get(2142).getCounty());
	}

	@Test
	@DisplayName("Record 2143: State is NY")
	void StateOfRecord2143() {
		assertEquals("NY", customers.get(2142).getState());
	}

	@Test
	@DisplayName("Record 2143: ZIP is 11701")
	void ZIPOfRecord2143() {
		assertEquals("11701", customers.get(2142).getZIP());
	}

	@Test
	@DisplayName("Record 2143: Phone is 631-789-0051")
	void PhoneOfRecord2143() {
		assertEquals("631-789-0051", customers.get(2142).getPhone());
	}

	@Test
	@DisplayName("Record 2143: Fax is 631-789-8564")
	void FaxOfRecord2143() {
		assertEquals("631-789-8564", customers.get(2142).getFax());
	}

	@Test
	@DisplayName("Record 2143: Email is aimee@hendrikson.com")
	void EmailOfRecord2143() {
		assertEquals("aimee@hendrikson.com", customers.get(2142).getEmail());
	}

	@Test
	@DisplayName("Record 2143: Web is http://www.aimeehendrikson.com")
	void WebOfRecord2143() {
		assertEquals("http://www.aimeehendrikson.com", customers.get(2142).getWeb());
	}
}
