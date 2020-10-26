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

@Tag("30")
class Record_212 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 212: FirstName is Lilly")
	void FirstNameOfRecord212() {
		assertEquals("Lilly", customers.get(211).getFirstName());
	}

	@Test
	@DisplayName("Record 212: LastName is Paciolla")
	void LastNameOfRecord212() {
		assertEquals("Paciolla", customers.get(211).getLastName());
	}

	@Test
	@DisplayName("Record 212: Company is Hamilton, Tom")
	void CompanyOfRecord212() {
		assertEquals("Hamilton, Tom", customers.get(211).getCompany());
	}

	@Test
	@DisplayName("Record 212: Address is 3303 Broadway")
	void AddressOfRecord212() {
		assertEquals("3303 Broadway", customers.get(211).getAddress());
	}

	@Test
	@DisplayName("Record 212: City is Fair Lawn")
	void CityOfRecord212() {
		assertEquals("Fair Lawn", customers.get(211).getCity());
	}

	@Test
	@DisplayName("Record 212: County is Bergen")
	void CountyOfRecord212() {
		assertEquals("Bergen", customers.get(211).getCounty());
	}

	@Test
	@DisplayName("Record 212: State is NJ")
	void StateOfRecord212() {
		assertEquals("NJ", customers.get(211).getState());
	}

	@Test
	@DisplayName("Record 212: ZIP is 7410")
	void ZIPOfRecord212() {
		assertEquals("7410", customers.get(211).getZIP());
	}

	@Test
	@DisplayName("Record 212: Phone is 201-791-4112")
	void PhoneOfRecord212() {
		assertEquals("201-791-4112", customers.get(211).getPhone());
	}

	@Test
	@DisplayName("Record 212: Fax is 201-791-8253")
	void FaxOfRecord212() {
		assertEquals("201-791-8253", customers.get(211).getFax());
	}

	@Test
	@DisplayName("Record 212: Email is lilly@paciolla.com")
	void EmailOfRecord212() {
		assertEquals("lilly@paciolla.com", customers.get(211).getEmail());
	}

	@Test
	@DisplayName("Record 212: Web is http://www.lillypaciolla.com")
	void WebOfRecord212() {
		assertEquals("http://www.lillypaciolla.com", customers.get(211).getWeb());
	}
}
