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
class Record_744 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 744: FirstName is Margie")
	void FirstNameOfRecord744() {
		assertEquals("Margie", customers.get(743).getFirstName());
	}

	@Test
	@DisplayName("Record 744: LastName is Scoma")
	void LastNameOfRecord744() {
		assertEquals("Scoma", customers.get(743).getLastName());
	}

	@Test
	@DisplayName("Record 744: Company is Sutton, Charles E Esq")
	void CompanyOfRecord744() {
		assertEquals("Sutton, Charles E Esq", customers.get(743).getCompany());
	}

	@Test
	@DisplayName("Record 744: Address is Rt 925n N")
	void AddressOfRecord744() {
		assertEquals("Rt 925n N", customers.get(743).getAddress());
	}

	@Test
	@DisplayName("Record 744: City is Waldorf")
	void CityOfRecord744() {
		assertEquals("Waldorf", customers.get(743).getCity());
	}

	@Test
	@DisplayName("Record 744: County is Charles")
	void CountyOfRecord744() {
		assertEquals("Charles", customers.get(743).getCounty());
	}

	@Test
	@DisplayName("Record 744: State is MD")
	void StateOfRecord744() {
		assertEquals("MD", customers.get(743).getState());
	}

	@Test
	@DisplayName("Record 744: ZIP is 20601")
	void ZIPOfRecord744() {
		assertEquals("20601", customers.get(743).getZIP());
	}

	@Test
	@DisplayName("Record 744: Phone is 301-645-5092")
	void PhoneOfRecord744() {
		assertEquals("301-645-5092", customers.get(743).getPhone());
	}

	@Test
	@DisplayName("Record 744: Fax is 301-645-0408")
	void FaxOfRecord744() {
		assertEquals("301-645-0408", customers.get(743).getFax());
	}

	@Test
	@DisplayName("Record 744: Email is margie@scoma.com")
	void EmailOfRecord744() {
		assertEquals("margie@scoma.com", customers.get(743).getEmail());
	}

	@Test
	@DisplayName("Record 744: Web is http://www.margiescoma.com")
	void WebOfRecord744() {
		assertEquals("http://www.margiescoma.com", customers.get(743).getWeb());
	}
}
