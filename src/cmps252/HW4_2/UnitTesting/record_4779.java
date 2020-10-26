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

@Tag("36")
class Record_4779 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4779: FirstName is Gena")
	void FirstNameOfRecord4779() {
		assertEquals("Gena", customers.get(4778).getFirstName());
	}

	@Test
	@DisplayName("Record 4779: LastName is Prins")
	void LastNameOfRecord4779() {
		assertEquals("Prins", customers.get(4778).getLastName());
	}

	@Test
	@DisplayName("Record 4779: Company is Willmann, Jay L")
	void CompanyOfRecord4779() {
		assertEquals("Willmann, Jay L", customers.get(4778).getCompany());
	}

	@Test
	@DisplayName("Record 4779: Address is 42 Longview Rd")
	void AddressOfRecord4779() {
		assertEquals("42 Longview Rd", customers.get(4778).getAddress());
	}

	@Test
	@DisplayName("Record 4779: City is Port Washington")
	void CityOfRecord4779() {
		assertEquals("Port Washington", customers.get(4778).getCity());
	}

	@Test
	@DisplayName("Record 4779: County is Nassau")
	void CountyOfRecord4779() {
		assertEquals("Nassau", customers.get(4778).getCounty());
	}

	@Test
	@DisplayName("Record 4779: State is NY")
	void StateOfRecord4779() {
		assertEquals("NY", customers.get(4778).getState());
	}

	@Test
	@DisplayName("Record 4779: ZIP is 11050")
	void ZIPOfRecord4779() {
		assertEquals("11050", customers.get(4778).getZIP());
	}

	@Test
	@DisplayName("Record 4779: Phone is 516-767-7089")
	void PhoneOfRecord4779() {
		assertEquals("516-767-7089", customers.get(4778).getPhone());
	}

	@Test
	@DisplayName("Record 4779: Fax is 516-767-3351")
	void FaxOfRecord4779() {
		assertEquals("516-767-3351", customers.get(4778).getFax());
	}

	@Test
	@DisplayName("Record 4779: Email is gena@prins.com")
	void EmailOfRecord4779() {
		assertEquals("gena@prins.com", customers.get(4778).getEmail());
	}

	@Test
	@DisplayName("Record 4779: Web is http://www.genaprins.com")
	void WebOfRecord4779() {
		assertEquals("http://www.genaprins.com", customers.get(4778).getWeb());
	}
}
