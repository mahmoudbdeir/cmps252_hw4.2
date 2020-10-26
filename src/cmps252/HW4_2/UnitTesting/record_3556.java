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

@Tag("10")
class Record_3556 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3556: FirstName is Paulette")
	void FirstNameOfRecord3556() {
		assertEquals("Paulette", customers.get(3555).getFirstName());
	}

	@Test
	@DisplayName("Record 3556: LastName is Jephson")
	void LastNameOfRecord3556() {
		assertEquals("Jephson", customers.get(3555).getLastName());
	}

	@Test
	@DisplayName("Record 3556: Company is Shapiro, Sander S Md")
	void CompanyOfRecord3556() {
		assertEquals("Shapiro, Sander S Md", customers.get(3555).getCompany());
	}

	@Test
	@DisplayName("Record 3556: Address is 5727 Sw Macadam Ave")
	void AddressOfRecord3556() {
		assertEquals("5727 Sw Macadam Ave", customers.get(3555).getAddress());
	}

	@Test
	@DisplayName("Record 3556: City is Portland")
	void CityOfRecord3556() {
		assertEquals("Portland", customers.get(3555).getCity());
	}

	@Test
	@DisplayName("Record 3556: County is Multnomah")
	void CountyOfRecord3556() {
		assertEquals("Multnomah", customers.get(3555).getCounty());
	}

	@Test
	@DisplayName("Record 3556: State is OR")
	void StateOfRecord3556() {
		assertEquals("OR", customers.get(3555).getState());
	}

	@Test
	@DisplayName("Record 3556: ZIP is 97201")
	void ZIPOfRecord3556() {
		assertEquals("97201", customers.get(3555).getZIP());
	}

	@Test
	@DisplayName("Record 3556: Phone is 503-222-0031")
	void PhoneOfRecord3556() {
		assertEquals("503-222-0031", customers.get(3555).getPhone());
	}

	@Test
	@DisplayName("Record 3556: Fax is 503-222-4779")
	void FaxOfRecord3556() {
		assertEquals("503-222-4779", customers.get(3555).getFax());
	}

	@Test
	@DisplayName("Record 3556: Email is paulette@jephson.com")
	void EmailOfRecord3556() {
		assertEquals("paulette@jephson.com", customers.get(3555).getEmail());
	}

	@Test
	@DisplayName("Record 3556: Web is http://www.paulettejephson.com")
	void WebOfRecord3556() {
		assertEquals("http://www.paulettejephson.com", customers.get(3555).getWeb());
	}
}
