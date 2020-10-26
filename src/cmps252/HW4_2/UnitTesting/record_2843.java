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

@Tag("5")
class Record_2843 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2843: FirstName is Lucinda")
	void FirstNameOfRecord2843() {
		assertEquals("Lucinda", customers.get(2842).getFirstName());
	}

	@Test
	@DisplayName("Record 2843: LastName is Cholula")
	void LastNameOfRecord2843() {
		assertEquals("Cholula", customers.get(2842).getLastName());
	}

	@Test
	@DisplayName("Record 2843: Company is Roberts, Richard J Jr")
	void CompanyOfRecord2843() {
		assertEquals("Roberts, Richard J Jr", customers.get(2842).getCompany());
	}

	@Test
	@DisplayName("Record 2843: Address is 16 W 36th")
	void AddressOfRecord2843() {
		assertEquals("16 W 36th", customers.get(2842).getAddress());
	}

	@Test
	@DisplayName("Record 2843: City is New York")
	void CityOfRecord2843() {
		assertEquals("New York", customers.get(2842).getCity());
	}

	@Test
	@DisplayName("Record 2843: County is New York")
	void CountyOfRecord2843() {
		assertEquals("New York", customers.get(2842).getCounty());
	}

	@Test
	@DisplayName("Record 2843: State is NY")
	void StateOfRecord2843() {
		assertEquals("NY", customers.get(2842).getState());
	}

	@Test
	@DisplayName("Record 2843: ZIP is 10018")
	void ZIPOfRecord2843() {
		assertEquals("10018", customers.get(2842).getZIP());
	}

	@Test
	@DisplayName("Record 2843: Phone is 212-695-4996")
	void PhoneOfRecord2843() {
		assertEquals("212-695-4996", customers.get(2842).getPhone());
	}

	@Test
	@DisplayName("Record 2843: Fax is 212-695-0652")
	void FaxOfRecord2843() {
		assertEquals("212-695-0652", customers.get(2842).getFax());
	}

	@Test
	@DisplayName("Record 2843: Email is lucinda@cholula.com")
	void EmailOfRecord2843() {
		assertEquals("lucinda@cholula.com", customers.get(2842).getEmail());
	}

	@Test
	@DisplayName("Record 2843: Web is http://www.lucindacholula.com")
	void WebOfRecord2843() {
		assertEquals("http://www.lucindacholula.com", customers.get(2842).getWeb());
	}
}
