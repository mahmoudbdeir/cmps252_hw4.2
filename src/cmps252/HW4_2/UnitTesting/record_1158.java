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

@Tag("4")
class Record_1158 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1158: FirstName is Mohammed")
	void FirstNameOfRecord1158() {
		assertEquals("Mohammed", customers.get(1157).getFirstName());
	}

	@Test
	@DisplayName("Record 1158: LastName is Rumberger")
	void LastNameOfRecord1158() {
		assertEquals("Rumberger", customers.get(1157).getLastName());
	}

	@Test
	@DisplayName("Record 1158: Company is Discount Drug Mart Inc")
	void CompanyOfRecord1158() {
		assertEquals("Discount Drug Mart Inc", customers.get(1157).getCompany());
	}

	@Test
	@DisplayName("Record 1158: Address is 2939 W Culver St")
	void AddressOfRecord1158() {
		assertEquals("2939 W Culver St", customers.get(1157).getAddress());
	}

	@Test
	@DisplayName("Record 1158: City is Phoenix")
	void CityOfRecord1158() {
		assertEquals("Phoenix", customers.get(1157).getCity());
	}

	@Test
	@DisplayName("Record 1158: County is Maricopa")
	void CountyOfRecord1158() {
		assertEquals("Maricopa", customers.get(1157).getCounty());
	}

	@Test
	@DisplayName("Record 1158: State is AZ")
	void StateOfRecord1158() {
		assertEquals("AZ", customers.get(1157).getState());
	}

	@Test
	@DisplayName("Record 1158: ZIP is 85009")
	void ZIPOfRecord1158() {
		assertEquals("85009", customers.get(1157).getZIP());
	}

	@Test
	@DisplayName("Record 1158: Phone is 602-233-1281")
	void PhoneOfRecord1158() {
		assertEquals("602-233-1281", customers.get(1157).getPhone());
	}

	@Test
	@DisplayName("Record 1158: Fax is 602-233-2837")
	void FaxOfRecord1158() {
		assertEquals("602-233-2837", customers.get(1157).getFax());
	}

	@Test
	@DisplayName("Record 1158: Email is mohammed@rumberger.com")
	void EmailOfRecord1158() {
		assertEquals("mohammed@rumberger.com", customers.get(1157).getEmail());
	}

	@Test
	@DisplayName("Record 1158: Web is http://www.mohammedrumberger.com")
	void WebOfRecord1158() {
		assertEquals("http://www.mohammedrumberger.com", customers.get(1157).getWeb());
	}
}
