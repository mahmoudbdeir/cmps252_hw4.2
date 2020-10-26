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
class Record_424 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 424: FirstName is Samuel")
	void FirstNameOfRecord424() {
		assertEquals("Samuel", customers.get(423).getFirstName());
	}

	@Test
	@DisplayName("Record 424: LastName is Madyun")
	void LastNameOfRecord424() {
		assertEquals("Madyun", customers.get(423).getLastName());
	}

	@Test
	@DisplayName("Record 424: Company is Good News Carpet Cleaners")
	void CompanyOfRecord424() {
		assertEquals("Good News Carpet Cleaners", customers.get(423).getCompany());
	}

	@Test
	@DisplayName("Record 424: Address is 319 Wilson Ave")
	void AddressOfRecord424() {
		assertEquals("319 Wilson Ave", customers.get(423).getAddress());
	}

	@Test
	@DisplayName("Record 424: City is Newark")
	void CityOfRecord424() {
		assertEquals("Newark", customers.get(423).getCity());
	}

	@Test
	@DisplayName("Record 424: County is Essex")
	void CountyOfRecord424() {
		assertEquals("Essex", customers.get(423).getCounty());
	}

	@Test
	@DisplayName("Record 424: State is NJ")
	void StateOfRecord424() {
		assertEquals("NJ", customers.get(423).getState());
	}

	@Test
	@DisplayName("Record 424: ZIP is 7105")
	void ZIPOfRecord424() {
		assertEquals("7105", customers.get(423).getZIP());
	}

	@Test
	@DisplayName("Record 424: Phone is 973-465-0819")
	void PhoneOfRecord424() {
		assertEquals("973-465-0819", customers.get(423).getPhone());
	}

	@Test
	@DisplayName("Record 424: Fax is 973-465-0479")
	void FaxOfRecord424() {
		assertEquals("973-465-0479", customers.get(423).getFax());
	}

	@Test
	@DisplayName("Record 424: Email is samuel@madyun.com")
	void EmailOfRecord424() {
		assertEquals("samuel@madyun.com", customers.get(423).getEmail());
	}

	@Test
	@DisplayName("Record 424: Web is http://www.samuelmadyun.com")
	void WebOfRecord424() {
		assertEquals("http://www.samuelmadyun.com", customers.get(423).getWeb());
	}
}
