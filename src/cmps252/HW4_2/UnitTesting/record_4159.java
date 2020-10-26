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

@Tag("43")
class Record_4159 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4159: FirstName is Debora")
	void FirstNameOfRecord4159() {
		assertEquals("Debora", customers.get(4158).getFirstName());
	}

	@Test
	@DisplayName("Record 4159: LastName is Babich")
	void LastNameOfRecord4159() {
		assertEquals("Babich", customers.get(4158).getLastName());
	}

	@Test
	@DisplayName("Record 4159: Company is Integrated Systs & Tech")
	void CompanyOfRecord4159() {
		assertEquals("Integrated Systs & Tech", customers.get(4158).getCompany());
	}

	@Test
	@DisplayName("Record 4159: Address is 84 Waydell St")
	void AddressOfRecord4159() {
		assertEquals("84 Waydell St", customers.get(4158).getAddress());
	}

	@Test
	@DisplayName("Record 4159: City is Newark")
	void CityOfRecord4159() {
		assertEquals("Newark", customers.get(4158).getCity());
	}

	@Test
	@DisplayName("Record 4159: County is Essex")
	void CountyOfRecord4159() {
		assertEquals("Essex", customers.get(4158).getCounty());
	}

	@Test
	@DisplayName("Record 4159: State is NJ")
	void StateOfRecord4159() {
		assertEquals("NJ", customers.get(4158).getState());
	}

	@Test
	@DisplayName("Record 4159: ZIP is 7105")
	void ZIPOfRecord4159() {
		assertEquals("7105", customers.get(4158).getZIP());
	}

	@Test
	@DisplayName("Record 4159: Phone is 973-344-8754")
	void PhoneOfRecord4159() {
		assertEquals("973-344-8754", customers.get(4158).getPhone());
	}

	@Test
	@DisplayName("Record 4159: Fax is 973-344-8575")
	void FaxOfRecord4159() {
		assertEquals("973-344-8575", customers.get(4158).getFax());
	}

	@Test
	@DisplayName("Record 4159: Email is debora@babich.com")
	void EmailOfRecord4159() {
		assertEquals("debora@babich.com", customers.get(4158).getEmail());
	}

	@Test
	@DisplayName("Record 4159: Web is http://www.deborababich.com")
	void WebOfRecord4159() {
		assertEquals("http://www.deborababich.com", customers.get(4158).getWeb());
	}
}
