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
class Record_4575 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4575: FirstName is Kraig")
	void FirstNameOfRecord4575() {
		assertEquals("Kraig", customers.get(4574).getFirstName());
	}

	@Test
	@DisplayName("Record 4575: LastName is Kiefel")
	void LastNameOfRecord4575() {
		assertEquals("Kiefel", customers.get(4574).getLastName());
	}

	@Test
	@DisplayName("Record 4575: Company is Rittenhouse")
	void CompanyOfRecord4575() {
		assertEquals("Rittenhouse", customers.get(4574).getCompany());
	}

	@Test
	@DisplayName("Record 4575: Address is 8233 Queens Blvd")
	void AddressOfRecord4575() {
		assertEquals("8233 Queens Blvd", customers.get(4574).getAddress());
	}

	@Test
	@DisplayName("Record 4575: City is Elmhurst")
	void CityOfRecord4575() {
		assertEquals("Elmhurst", customers.get(4574).getCity());
	}

	@Test
	@DisplayName("Record 4575: County is Queens")
	void CountyOfRecord4575() {
		assertEquals("Queens", customers.get(4574).getCounty());
	}

	@Test
	@DisplayName("Record 4575: State is NY")
	void StateOfRecord4575() {
		assertEquals("NY", customers.get(4574).getState());
	}

	@Test
	@DisplayName("Record 4575: ZIP is 11373")
	void ZIPOfRecord4575() {
		assertEquals("11373", customers.get(4574).getZIP());
	}

	@Test
	@DisplayName("Record 4575: Phone is 718-426-4122")
	void PhoneOfRecord4575() {
		assertEquals("718-426-4122", customers.get(4574).getPhone());
	}

	@Test
	@DisplayName("Record 4575: Fax is 718-426-1678")
	void FaxOfRecord4575() {
		assertEquals("718-426-1678", customers.get(4574).getFax());
	}

	@Test
	@DisplayName("Record 4575: Email is kraig@kiefel.com")
	void EmailOfRecord4575() {
		assertEquals("kraig@kiefel.com", customers.get(4574).getEmail());
	}

	@Test
	@DisplayName("Record 4575: Web is http://www.kraigkiefel.com")
	void WebOfRecord4575() {
		assertEquals("http://www.kraigkiefel.com", customers.get(4574).getWeb());
	}
}
