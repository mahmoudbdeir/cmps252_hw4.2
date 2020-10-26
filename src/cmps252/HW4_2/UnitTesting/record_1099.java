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

@Tag("38")
class Record_1099 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1099: FirstName is Clark")
	void FirstNameOfRecord1099() {
		assertEquals("Clark", customers.get(1098).getFirstName());
	}

	@Test
	@DisplayName("Record 1099: LastName is Machkovich")
	void LastNameOfRecord1099() {
		assertEquals("Machkovich", customers.get(1098).getLastName());
	}

	@Test
	@DisplayName("Record 1099: Company is Equal Tool Co")
	void CompanyOfRecord1099() {
		assertEquals("Equal Tool Co", customers.get(1098).getCompany());
	}

	@Test
	@DisplayName("Record 1099: Address is 241 Main St")
	void AddressOfRecord1099() {
		assertEquals("241 Main St", customers.get(1098).getAddress());
	}

	@Test
	@DisplayName("Record 1099: City is Hackensack")
	void CityOfRecord1099() {
		assertEquals("Hackensack", customers.get(1098).getCity());
	}

	@Test
	@DisplayName("Record 1099: County is Bergen")
	void CountyOfRecord1099() {
		assertEquals("Bergen", customers.get(1098).getCounty());
	}

	@Test
	@DisplayName("Record 1099: State is NJ")
	void StateOfRecord1099() {
		assertEquals("NJ", customers.get(1098).getState());
	}

	@Test
	@DisplayName("Record 1099: ZIP is 7601")
	void ZIPOfRecord1099() {
		assertEquals("7601", customers.get(1098).getZIP());
	}

	@Test
	@DisplayName("Record 1099: Phone is 201-487-9049")
	void PhoneOfRecord1099() {
		assertEquals("201-487-9049", customers.get(1098).getPhone());
	}

	@Test
	@DisplayName("Record 1099: Fax is 201-487-8957")
	void FaxOfRecord1099() {
		assertEquals("201-487-8957", customers.get(1098).getFax());
	}

	@Test
	@DisplayName("Record 1099: Email is clark@machkovich.com")
	void EmailOfRecord1099() {
		assertEquals("clark@machkovich.com", customers.get(1098).getEmail());
	}

	@Test
	@DisplayName("Record 1099: Web is http://www.clarkmachkovich.com")
	void WebOfRecord1099() {
		assertEquals("http://www.clarkmachkovich.com", customers.get(1098).getWeb());
	}
}
