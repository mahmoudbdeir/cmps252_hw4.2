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
class Record_2478 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2478: FirstName is Sun")
	void FirstNameOfRecord2478() {
		assertEquals("Sun", customers.get(2477).getFirstName());
	}

	@Test
	@DisplayName("Record 2478: LastName is Bo")
	void LastNameOfRecord2478() {
		assertEquals("Bo", customers.get(2477).getLastName());
	}

	@Test
	@DisplayName("Record 2478: Company is C E Express")
	void CompanyOfRecord2478() {
		assertEquals("C E Express", customers.get(2477).getCompany());
	}

	@Test
	@DisplayName("Record 2478: Address is 7 Dewey St")
	void AddressOfRecord2478() {
		assertEquals("7 Dewey St", customers.get(2477).getAddress());
	}

	@Test
	@DisplayName("Record 2478: City is Worcester")
	void CityOfRecord2478() {
		assertEquals("Worcester", customers.get(2477).getCity());
	}

	@Test
	@DisplayName("Record 2478: County is Worcester")
	void CountyOfRecord2478() {
		assertEquals("Worcester", customers.get(2477).getCounty());
	}

	@Test
	@DisplayName("Record 2478: State is MA")
	void StateOfRecord2478() {
		assertEquals("MA", customers.get(2477).getState());
	}

	@Test
	@DisplayName("Record 2478: ZIP is 1609")
	void ZIPOfRecord2478() {
		assertEquals("1609", customers.get(2477).getZIP());
	}

	@Test
	@DisplayName("Record 2478: Phone is 508-756-6855")
	void PhoneOfRecord2478() {
		assertEquals("508-756-6855", customers.get(2477).getPhone());
	}

	@Test
	@DisplayName("Record 2478: Fax is 508-756-4173")
	void FaxOfRecord2478() {
		assertEquals("508-756-4173", customers.get(2477).getFax());
	}

	@Test
	@DisplayName("Record 2478: Email is sun@bo.com")
	void EmailOfRecord2478() {
		assertEquals("sun@bo.com", customers.get(2477).getEmail());
	}

	@Test
	@DisplayName("Record 2478: Web is http://www.sunbo.com")
	void WebOfRecord2478() {
		assertEquals("http://www.sunbo.com", customers.get(2477).getWeb());
	}
}
