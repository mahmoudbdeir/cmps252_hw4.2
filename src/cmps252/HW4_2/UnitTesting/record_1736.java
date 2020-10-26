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

@Tag("15")
class Record_1736 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1736: FirstName is Justine")
	void FirstNameOfRecord1736() {
		assertEquals("Justine", customers.get(1735).getFirstName());
	}

	@Test
	@DisplayName("Record 1736: LastName is Bukhari")
	void LastNameOfRecord1736() {
		assertEquals("Bukhari", customers.get(1735).getLastName());
	}

	@Test
	@DisplayName("Record 1736: Company is Gen Trd Mark Labelcraft Inc")
	void CompanyOfRecord1736() {
		assertEquals("Gen Trd Mark Labelcraft Inc", customers.get(1735).getCompany());
	}

	@Test
	@DisplayName("Record 1736: Address is 1050 Adrienne Dr")
	void AddressOfRecord1736() {
		assertEquals("1050 Adrienne Dr", customers.get(1735).getAddress());
	}

	@Test
	@DisplayName("Record 1736: City is Bellmore")
	void CityOfRecord1736() {
		assertEquals("Bellmore", customers.get(1735).getCity());
	}

	@Test
	@DisplayName("Record 1736: County is Nassau")
	void CountyOfRecord1736() {
		assertEquals("Nassau", customers.get(1735).getCounty());
	}

	@Test
	@DisplayName("Record 1736: State is NY")
	void StateOfRecord1736() {
		assertEquals("NY", customers.get(1735).getState());
	}

	@Test
	@DisplayName("Record 1736: ZIP is 11710")
	void ZIPOfRecord1736() {
		assertEquals("11710", customers.get(1735).getZIP());
	}

	@Test
	@DisplayName("Record 1736: Phone is 516-285-8064")
	void PhoneOfRecord1736() {
		assertEquals("516-285-8064", customers.get(1735).getPhone());
	}

	@Test
	@DisplayName("Record 1736: Fax is 516-285-9607")
	void FaxOfRecord1736() {
		assertEquals("516-285-9607", customers.get(1735).getFax());
	}

	@Test
	@DisplayName("Record 1736: Email is justine@bukhari.com")
	void EmailOfRecord1736() {
		assertEquals("justine@bukhari.com", customers.get(1735).getEmail());
	}

	@Test
	@DisplayName("Record 1736: Web is http://www.justinebukhari.com")
	void WebOfRecord1736() {
		assertEquals("http://www.justinebukhari.com", customers.get(1735).getWeb());
	}
}
