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

@Tag("18")
class Record_4364 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4364: FirstName is Reyna")
	void FirstNameOfRecord4364() {
		assertEquals("Reyna", customers.get(4363).getFirstName());
	}

	@Test
	@DisplayName("Record 4364: LastName is Pollara")
	void LastNameOfRecord4364() {
		assertEquals("Pollara", customers.get(4363).getLastName());
	}

	@Test
	@DisplayName("Record 4364: Company is Best Western Town House Motel")
	void CompanyOfRecord4364() {
		assertEquals("Best Western Town House Motel", customers.get(4363).getCompany());
	}

	@Test
	@DisplayName("Record 4364: Address is 85 Livingston Ave")
	void AddressOfRecord4364() {
		assertEquals("85 Livingston Ave", customers.get(4363).getAddress());
	}

	@Test
	@DisplayName("Record 4364: City is Roseland")
	void CityOfRecord4364() {
		assertEquals("Roseland", customers.get(4363).getCity());
	}

	@Test
	@DisplayName("Record 4364: County is Essex")
	void CountyOfRecord4364() {
		assertEquals("Essex", customers.get(4363).getCounty());
	}

	@Test
	@DisplayName("Record 4364: State is NJ")
	void StateOfRecord4364() {
		assertEquals("NJ", customers.get(4363).getState());
	}

	@Test
	@DisplayName("Record 4364: ZIP is 7068")
	void ZIPOfRecord4364() {
		assertEquals("7068", customers.get(4363).getZIP());
	}

	@Test
	@DisplayName("Record 4364: Phone is 973-992-8460")
	void PhoneOfRecord4364() {
		assertEquals("973-992-8460", customers.get(4363).getPhone());
	}

	@Test
	@DisplayName("Record 4364: Fax is 973-992-1531")
	void FaxOfRecord4364() {
		assertEquals("973-992-1531", customers.get(4363).getFax());
	}

	@Test
	@DisplayName("Record 4364: Email is reyna@pollara.com")
	void EmailOfRecord4364() {
		assertEquals("reyna@pollara.com", customers.get(4363).getEmail());
	}

	@Test
	@DisplayName("Record 4364: Web is http://www.reynapollara.com")
	void WebOfRecord4364() {
		assertEquals("http://www.reynapollara.com", customers.get(4363).getWeb());
	}
}
