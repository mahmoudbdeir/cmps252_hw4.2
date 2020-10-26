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

@Tag("28")
class Record_4778 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4778: FirstName is Porfirio")
	void FirstNameOfRecord4778() {
		assertEquals("Porfirio", customers.get(4777).getFirstName());
	}

	@Test
	@DisplayName("Record 4778: LastName is Blomberg")
	void LastNameOfRecord4778() {
		assertEquals("Blomberg", customers.get(4777).getLastName());
	}

	@Test
	@DisplayName("Record 4778: Company is Vi Trac Construction")
	void CompanyOfRecord4778() {
		assertEquals("Vi Trac Construction", customers.get(4777).getCompany());
	}

	@Test
	@DisplayName("Record 4778: Address is 85 S Jefferson St")
	void AddressOfRecord4778() {
		assertEquals("85 S Jefferson St", customers.get(4777).getAddress());
	}

	@Test
	@DisplayName("Record 4778: City is Orange")
	void CityOfRecord4778() {
		assertEquals("Orange", customers.get(4777).getCity());
	}

	@Test
	@DisplayName("Record 4778: County is Essex")
	void CountyOfRecord4778() {
		assertEquals("Essex", customers.get(4777).getCounty());
	}

	@Test
	@DisplayName("Record 4778: State is NJ")
	void StateOfRecord4778() {
		assertEquals("NJ", customers.get(4777).getState());
	}

	@Test
	@DisplayName("Record 4778: ZIP is 7050")
	void ZIPOfRecord4778() {
		assertEquals("7050", customers.get(4777).getZIP());
	}

	@Test
	@DisplayName("Record 4778: Phone is 973-672-9595")
	void PhoneOfRecord4778() {
		assertEquals("973-672-9595", customers.get(4777).getPhone());
	}

	@Test
	@DisplayName("Record 4778: Fax is 973-672-3156")
	void FaxOfRecord4778() {
		assertEquals("973-672-3156", customers.get(4777).getFax());
	}

	@Test
	@DisplayName("Record 4778: Email is porfirio@blomberg.com")
	void EmailOfRecord4778() {
		assertEquals("porfirio@blomberg.com", customers.get(4777).getEmail());
	}

	@Test
	@DisplayName("Record 4778: Web is http://www.porfirioblomberg.com")
	void WebOfRecord4778() {
		assertEquals("http://www.porfirioblomberg.com", customers.get(4777).getWeb());
	}
}
